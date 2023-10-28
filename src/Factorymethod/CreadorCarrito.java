package src.Factorymethod;

import java.util.Scanner;

public class CreadorCarrito implements CreadorJuguete{


    @Override
    public Juguete crear() {
        Scanner scanner = new Scanner(System.in);
        Juguete juguete = null;
        int puertas = 0;

        System.out.println("Creando carrito");
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        while (puertas <= 0){
            //puertas = 0;
            try {
                System.out.print("Número puertas: ");
                puertas = scanner.nextInt();
                if(puertas > 0){
                    break;
                }
                System.out.println("El número debe ser mayor que 0");
            }catch (Exception e){
                System.out.println("El número de puertas debe ser un número ");

            }
            scanner.nextLine(); //Limpiamos el buffer

        }
        juguete = JugueteCarrito.builder()
                .color(color)
                .marca(marca)
                .numeropuertas(puertas)
                .build();
        return juguete;
    }
}
