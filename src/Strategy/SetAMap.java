package src.Strategy;

import src.Factorymethod.Juguete;
import src.singleton.MenuSigleton;

import java.util.HashMap;
import java.util.Map;

public class SetAMap implements Accion{
    @Override
    public void ejecutar() {
        Map<Long, Juguete> map = new HashMap<>();

        for (Juguete j : MenuSigleton.juguetes) {
            // Asignamos un valor constante (por ejemplo, 1) a cada clave en el Map
            map.put(j.getId(), j);
        }
        map.forEach((key, value) -> System.out.println(String.format("Key->%s Value->%s", key, value)));
    }
}
