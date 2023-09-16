package src.main;
import src.singleton.MenuSigleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MenuSigleton menu = MenuSigleton.getInstancia();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.menu();
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            if (opcion.equals("5")) {
                break;
            }

            menu.ejecutar(opcion);

        }


    }



}
