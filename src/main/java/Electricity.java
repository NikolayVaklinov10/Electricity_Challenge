package main.java;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Electricity {

    public static void main(String[] args) {


        System.out.println("Enter how many electricity values you want to use to calculate the average");

        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();
        int count = 0;
        for (double j = 0; j < number; j++) {
            count++;
        }

        double[] arr = new double[count];

        System.out.println("\nEnter values now\n");
        for (double i = 0; i < number; i++) {
            System.out.println("Enter a value " + (i + 1) + ":");
            arr[(int) i] = scanner.nextDouble();
        }

        DoubleStream streamOfNumbers = Arrays.stream(arr);
        OptionalDouble averageOfNumbers = streamOfNumbers.distinct().average();

        System.out.println("\nAverage of values: " + averageOfNumbers);


    }
}
