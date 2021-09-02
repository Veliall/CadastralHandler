package ru.netology;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LandLot[] lots = new LandLot[]{
                new LandLot("Area", 12, 30, 500_000),
                new LandLot("Area2", 8, 10, 500_000),
                new LandLot("Area31", 5, 70, 500_000)};

        CadastralHandler handler = new CadastralHandler();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предлагаемую вами цену за квадратный метр: ");
        int input = Integer.parseInt(scanner.nextLine());

        Arrays.stream(lots).forEach(o -> System.out.println(o.getId() + " " + handler.validate(input, o)));
    }
}
