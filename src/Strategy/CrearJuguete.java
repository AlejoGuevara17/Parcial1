package src.Strategy;

import src.Factorymethod.*;
import src.singleton.MenuSigleton;

import java.util.Scanner;

public class CrearJuguete implements Accion{

    public CrearJuguete(){
    }
    @Override
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        Juguete juguete = null;

        String opcion = "";
        while (!opcion.equals("3")){
            System.out.println("1. Juguete peluche");
            System.out.println("2. Juguete carrito");
            System.out.println("3. Menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();
            if(opcion.equals("1")){
                CreadorJuguete creadorJuguete = new CreadorPeluche();
                juguete = creadorJuguete.crear();
                MenuSigleton.addJuguete(juguete);

            } else if (opcion.equals("2")) {
                CreadorJuguete creadorJuguete = new CreadorCarrito();
                juguete = creadorJuguete.crear();
                MenuSigleton.addJuguete(juguete);
            }
            System.out.println();

        }

        MenuSigleton.actualizarIdJuguete(); //Actualizamos el id de todos lo juguetes
    }
}
