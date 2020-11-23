package study;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Main {

    public static void main(String[] args) {
        InputArray input = new InputArray();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of arrays: ");
        input.n = in.nextDouble();
        input.a = new double[(int) input.n];
        double i;
        for (i = 0; i < input.n; i++) {
            System.out.println("Enter your random number: [" + i + " ] =");
            input.a[(int) i] = in.nextDouble();
        }
        while (i >= input.n) {
            System.out.println("Total sum of your number is: " + DoubleStream.of(input.a).sum());
            break;
        }
    }
}


