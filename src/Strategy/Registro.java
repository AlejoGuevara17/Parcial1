package src.Strategy;

import src.Factorymethod.Juguete;
import src.singleton.MenuSigleton;

public class Registro implements Accion{

    @Override
    public void ejecutar() {
        if(MenuSigleton.juguetes.size() == 0){
            System.out.println("No se han creado juguetes.");
            return;
        }
        for(Juguete j: MenuSigleton.juguetes){
            System.out.println(j);
        }
    }
}
