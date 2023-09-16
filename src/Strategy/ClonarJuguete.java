package src.Strategy;

import src.Factorymethod.Juguete;
import src.Factorymethod.JugueteCarrito;
import src.singleton.MenuSigleton;

import java.util.Scanner;

public class ClonarJuguete implements Accion{
    @Override
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        Registro registro = new Registro();

        int id = 0;
        if(MenuSigleton.juguetes.size() == 0){
            System.out.println("No se han creado juguetes.");
            return;
        }
        while (true){
            try {
                System.out.println("Selecione con el id el juguete a clonar");
                registro.ejecutar();
                id = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("El id debe ser un número");
            }
            scanner.nextLine(); //Limpiamos el buffer
        }



        if(id > 0 && id <= MenuSigleton.juguetes.size()){
            System.out.print("Cuantos clones quiere del objeto? ");
            int cantidadClon = scanner.nextInt();

            for (int i = 0; i < cantidadClon; i++){
                Juguete juguete = MenuSigleton.juguetes.get(id-1);
                MenuSigleton.addJuguete(juguete.clone());

            }
            MenuSigleton.actualizarIdJuguete(); //Actualizamos el id de todos lo juguetes
            System.out.println("Juguete clonado " + cantidadClon + " veces");
        }else {
            System.out.println("Id no existente");
        }


    }
}
