package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {

        int sumAllSales = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            sumAllSales = sumAllSales + sales[sale];
        }
        return sumAllSales;
    }

    public int averageSumSales(int[] sales) {

        int averageSumAllSales = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            averageSumAllSales = averageSumAllSales + sales[sale];
        }
        return averageSumAllSales / sales.length;
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

        int sumAllSales = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            sumAllSales = sumAllSales + sales[sale];
        }

        int averageSumAllSales = sumAllSales / sales.length;
        int month = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[sale] < averageSumAllSales) {
                month++;
            }
        }
        return month;
    }


    public int aboveTheAverageSumSales(int[] sales) {

        int sumAllSales = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            sumAllSales = sumAllSales + sales[sale];
        }

        int averageSumAllSales = sumAllSales / sales.length;
        int month = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[sale] > averageSumAllSales) {
                month++;
            }
        }
        return month;
    }
}