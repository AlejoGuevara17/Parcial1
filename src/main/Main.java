package src.main;
import src.singleton.MenuSigleton;

import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MenuSigleton menu = MenuSigleton.getInstancia();

        Scanner scanner = new Scanner(System.in);

        String opcion = "";
        while (!opcion.equals("9")) {
            menu.menu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine();

            menu.ejecutar(opcion);

        }
    }
}
