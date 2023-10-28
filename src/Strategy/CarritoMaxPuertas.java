package src.Strategy;

import src.Factorymethod.Juguete;
import src.Factorymethod.JugueteCarrito;
import src.Factorymethod.JuguetePeluche;
import src.singleton.MenuSigleton;

import java.util.Comparator;
import java.util.Optional;

public class CarritoMaxPuertas implements Accion{
    @Override
    public void ejecutar() {
        Optional<Integer> max = MenuSigleton.juguetes.stream()
                .filter(c -> c instanceof JugueteCarrito)
                .map(c -> ((JugueteCarrito) c).getNumeropuertas())
                .max(Integer::compareTo);

        max.ifPresentOrElse(
                maxPuertasValor -> {
                    MenuSigleton.juguetes.stream()
                            .filter(c -> c instanceof JugueteCarrito)
                            .filter(c -> ((JugueteCarrito) c).getNumeropuertas() == maxPuertasValor)
                            .forEach(carrito -> System.out.println(carrito));
                },
                () -> System.out.println("No hay carritos en el set.")
        );
    }
}
