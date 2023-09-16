package src.singleton;

import src.Factorymethod.Juguete;
import src.Strategy.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuSigleton {

    private static MenuSigleton instancia = null;
    private Map<String, Accion> opciones;
    public static List<Juguete> juguetes = new ArrayList<>();

    private MenuSigleton(){
        opciones = new HashMap<>();
        opciones.put("1", new CrearJuguete());
        opciones.put("2", new ClonarJuguete());
        opciones.put("3", new EliminarJuguete());
        opciones.put("4", new Registro());
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
        System.out.println("5. Salir");
    }
    public void ejecutar(String opcion) {
        Accion accion = opciones.get(opcion);
        System.out.println();

        if (accion != null) {
            accion.ejecutar();
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public static void addJuguete(Juguete juguete){
        juguetes.add(juguete);
    }
    public static void actualizarIdJuguete(){
        for (int i = 0; i < juguetes.size(); i++){
            juguetes.get(i).setId(i+1);
        }
    }


}
