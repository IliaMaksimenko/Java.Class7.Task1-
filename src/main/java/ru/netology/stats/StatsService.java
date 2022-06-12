package ru.netology.stats;

import static java.lang.Long.sum;

public class StatsService {

    public int sumSales(int[] sales) {

        int sumAllSales = 0;

        for (int i : sales) {
            sumAllSales += i;
        }
        return sumAllSales;
    }

    public int averageSumSales(int[] sales) {

        int sum = sumSales(sales);

        return sum / sales.length;
    }


    public int maxSales(int[] sales) {

        int maxSumSales = 0;
        int month = 0;
        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[sale] >= maxSumSales) {
                maxSumSales = sales[sale];
                month = sale;
            }
        }
        return month + 1;
    }


    public int minSales(int[] sales) {

        int minSumSales = sales[0];
        int month = 0;
        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[sale] < minSumSales) {
                minSumSales = sales[sale];
                month = sale;
            }
        }
        return month + 1;
    }


    public int belowTheAverageSumSales(int[] sales) {

        int average = averageSumSales(sales);
        int month = 0;

        for (int i : sales) {
            if (i < average) {
                month++;
            }
        }
        return month;
    }


    public int aboveTheAverageSumSales(int[] sales) {

        int average = averageSumSales(sales);
        int month = 0;

        for (int i : sales) {
            if (i > average) {
                month++;
            }
        }
        return month;
    }
}