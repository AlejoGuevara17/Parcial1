package src.Strategy;

import src.singleton.MenuSigleton;

import java.util.Scanner;

public class EliminarJuguete implements Accion{
    @Override
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        Registro registro = new Registro();

        int id = 0;
        if(MenuSigleton.juguetes.size() == 0){
            System.out.println("No se han creado juguetes.");
            return;
        }
        while (id <= 0){
            try {
                System.out.println("Selecione con el id, el juguete a eliminar");
                registro.ejecutar();
                id = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("El id debe ser un número");
            }
            scanner.nextLine(); //Limpiamos el buffer
        }



        if(id > 0 && id <= MenuSigleton.juguetes.size()){
            MenuSigleton.juguetes.remove(MenuSigleton.obtenerJuguetePorId(id));
            System.out.println("Juguete eliminado ");
            MenuSigleton.actualizarIdJuguete(); //Actualizamos el id de todos lo juguetes
        }else {
            System.out.println("Id no existente");
        }
    }
}
