package src.Strategy;

import src.Factorymethod.Juguete;
import src.singleton.MenuSigleton;

import java.awt.*;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class EliminarPorColor implements Accion{
    @Override
    public void ejecutar() {
        Set<String> colores = MenuSigleton.juguetes.stream()
                .map(Juguete::getColor)
                .collect(Collectors.toSet());

        System.out.println("Colores disponibles:");
        colores.forEach(System.out::println);

        // Solicitar al usuario que elija un color a eliminar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elija un color para eliminar juguetes: ");
        String color = scanner.nextLine();

        // Filtrar el set de juguetes para eliminar juguetes del color elegido
        MenuSigleton.juguetes = MenuSigleton.juguetes.stream()
                .filter(jueguete -> !jueguete.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toSet());
        // Actualizar Id
        MenuSigleton.actualizarIdJuguete();
    }
}
