package study;

import java.util.Scanner;

public class Calculator {
    private double add(double a, double b) {
        return a + b;
    }

    private double sub(double a, double b) {
        return a - b;
    }

    private double mul(double a, double b) {
        return a * b;
    }

    private double div(double a, double b) {
        return a / b;
    }

    public double calulate() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] values = input.split(" ");
        double cur = Double.parseDouble(values[0]);
        for (int i = 1; i < values.length; i += 2) {
            if (values[i].equals("+"))
                cur = add(cur, Double.parseDouble(values[i + 1]));
            else if (values[i].equals("-"))
                cur = sub(cur, Double.parseDouble(values[i + 1]));
            else if (values[i].equals("*"))
                cur = mul(cur, Double.parseDouble(values[i + 1]));
            else if (values[i].equals("/"))
                cur = div(cur, Double.parseDouble(values[i + 1]));
        }
        return cur;
    }
}
