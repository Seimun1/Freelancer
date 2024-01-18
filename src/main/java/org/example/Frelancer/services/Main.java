package org.example.Frelancer.services;

public class Main {
    public static void main(String[] args) {
        MonthsNumberCalc calculation = new MonthsNumberCalc();

        int numberOfMonths = calculation.calculation(10000, 3000, 20000);
        System.out.println("Months to be off = " + numberOfMonths);
    }
}