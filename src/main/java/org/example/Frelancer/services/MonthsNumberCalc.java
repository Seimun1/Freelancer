package org.example.Frelancer.services;

public class MonthsNumberCalc {
    public int calculation(int income, int expenses, int threshold) {
        int numberOfMonths = 0; //количество свободных месяцев
        int currentSum = 0; //начальная сумма на счету

        for (int i = 1; i <= 12; i++) {
            // Если сумма на счету меньше threshold, то фрилансер работает, деньги увеличиваются на income
            // и уменьшаются на expense.
            if (currentSum < threshold) {
                currentSum = currentSum + income - expenses;
            } else {
                numberOfMonths = numberOfMonths + 1;
                //Если сумма на счету больше threshold, то фрилансер не работает, количество месяцев увеличивается на 1,
                // из суммы на счету вычитаются expenses и сумма уменьшается в 3 раза - траты на отдых
                currentSum = (currentSum - expenses) / 3;
            }
        }

        return numberOfMonths;
    }
}