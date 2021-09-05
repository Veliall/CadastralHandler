package ru.netology;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LandLot[] lots = new LandLot[]{
                new LandLot(100L, 12, 30, 500_000),
                new LandLot(2000L, 8, 10, 500_000),
                new LandLot(300L, 5, 70, 500_000)};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предлагаемую вами цену за квадратный метр: ");
        int input = Integer.parseInt(scanner.nextLine());

        Arrays.stream(lots)
                .map(o -> o + ((long) input * o.getLength() * o.getWidth() >= o.getRecommendedPrice()
                        ? " честная" : " нечестная"))
                .forEach(System.out::println);
    }
}
