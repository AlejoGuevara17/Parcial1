package src.Factorymethod;

import java.util.Scanner;

public class CreadorPeluche implements CreadorJuguete{


    @Override
    public Juguete crear() {
        Scanner scanner = new Scanner(System.in);
        Juguete juguete = null;

        System.out.println("Creando peluche");
        System.out.print("Material exterior: ");
        String materiarExterior = scanner.nextLine();
        System.out.print("Relleno: ");
        String relleno = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();

        juguete = JuguetePeluche.builder()
                .materialexterior(materiarExterior).color(color)
                .relleno(relleno)
                .build();

        return juguete;
    }
}
