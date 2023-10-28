package src.Strategy;

import src.Factorymethod.Juguete;
import src.Factorymethod.JugueteCarrito;
import src.Factorymethod.JuguetePeluche;
import src.singleton.MenuSigleton;

import java.util.Comparator;
import java.util.Scanner;

public class CarritoPeluche implements Accion{

    @Override
    public void ejecutar() {

        if(MenuSigleton.juguetes.size() == 0){
            System.out.println("No se han creado juguetes.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        String opcion = "";
        while (!opcion.equals("3")){
            System.out.println("1. Imprimir peluche");
            System.out.println("2. Imprimir carrito");
            System.out.println("3. Menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            if(opcion.equals("1")){
                imprimirPeluche();
            } else if (opcion.equals("2")) {
                 imprimirCarrito();
            } else if (opcion.equals("3")) {
                break;
            } else {
                System.out.println("Opción incorrecta");
            }
            System.out.println();
        }
    }

    public void imprimirCarrito() {
        System.out.println("Lista de carritos:");
        MenuSigleton.juguetes.stream().filter(c-> c instanceof JugueteCarrito)
                .sorted(Comparator.comparing(Juguete::getId).reversed())
                .forEach(System.out::println);
    }

    public void imprimirPeluche() {
        System.out.println("Lista de peluches:");
        MenuSigleton.juguetes.stream().filter(c-> c instanceof JuguetePeluche)
                .sorted(Comparator.comparing(Juguete::getId).reversed())
                .forEach(System.out::println);
    }
}
