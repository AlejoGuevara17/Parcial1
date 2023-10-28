package src.singleton;

import src.Factorymethod.*;
import src.Strategy.*;

import java.util.*;

public class MenuSigleton {

    private static MenuSigleton instancia = null;
    private Map<String, Accion> opciones;
    public static Set<Juguete> juguetes = new HashSet<>();

    private MenuSigleton(){
        opciones = new HashMap<>();
        opciones.put("1", new CrearJuguete());
        opciones.put("2", new ClonarJuguete());
        opciones.put("3", new EliminarJuguete());
        opciones.put("4", new Registro());
        opciones.put("5", new CarritoPeluche());
        opciones.put("6", new CarritoMaxPuertas());
        opciones.put("7", new SetAMap());
        opciones.put("8", new EliminarPorColor());
    }

    public static MenuSigleton getInstancia() {
        if(instancia == null){
            instancia = new MenuSigleton();
        }
        return instancia;
    }

    public void menu(){
        System.out.println("Menú Principal");
        System.out.println("1. Crear");
        System.out.println("2. Clonar");
        System.out.println("3. Eliminar");
        System.out.println("4. Ver juguetes actuales");
        System.out.println("5. Imprimir carritos o peluches");
        System.out.println("6. Imprimir carrito con mayor número de puertas");
        System.out.println("7. Set a Map");
        System.out.println("8. Eliminar Juguetes por color");
        System.out.println("9. Salir");
    }
    public void ejecutar(String opcion) {
        Accion accion = opciones.get(opcion);
        System.out.println();

        if (accion != null) {
            accion.ejecutar();
        }else if(opcion.equals("9")){
            System.out.println("Hasta pronto!");
        }else {
            System.out.println("Opción no válida.");
        }
    }

    public static void addJuguete(Juguete juguete){
        juguetes.add(juguete);
    }
    public static void actualizarIdJuguete(){
        int i = 1;
        for (Juguete j: juguetes){
            j.setId(i);
            i++;
        }
    }
    public static Juguete obtenerJuguetePorId(int id){
        for (Juguete j: juguetes){
            if(j.getId() == id){
                return j;
            }
        }
        return null;
    }


}
