package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {


    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {800, 1500, 1300, 1500, 1700, 2000, 1900, 2000, 700, 1400, 1400, 1800};


        long sumSales = service.sumSales(sales);   //Сумма продаж за месяц.
        System.out.println(sumSales);

        int averageSumSales = service.averageSumSales(sales);   //Средняя продажа за месяц.
        System.out.println(averageSumSales);

        int maxSumSales = service.maxSales(sales);   //Номер месяца с максимальной суммой продаж.
        System.out.println(maxSumSales);

        int minSumSales = service.minSales(sales);   //Номер месяца с минимальной суммой продаж.
        System.out.println(minSumSales);

        int belowTheAverage = service.belowTheAverageSumSales(sales);   //Кол-во месяцев с продажами ниже среднего.
        System.out.println(belowTheAverage);

        int aboveTheAverage = service.aboveTheAverageSumSales(sales);   //Кол-во месяцев с продажами выше среднего.
        System.out.println(aboveTheAverage);
    }

    @Test

    public void testSumSales() {

        StatsService service = new StatsService();

        int[] sales = {800, 1500, 1300, 1500, 1700, 2000, 1900, 2000, 700, 1400, 1400, 1800};
        int expected = 18000;
        int sumSales = service.sumSales(sales);

        Assertions.assertEquals(sumSales, expected);
    }

    @Test

    public void testAverageSumSales() {

        StatsService service = new StatsService();

        int[] sales = {800, 1500, 1300, 1500, 1700, 2000, 1900, 2000, 700, 1400, 1400, 1800};
        int expected = 1500;
        int averageSumSales = service.averageSumSales(sales);

        Assertions.assertEquals(averageSumSales, expected);
    }

    @Test

    public void testMaxSumSales() {

        StatsService service = new StatsService();

        int[] sales = {800, 1500, 1300, 1500, 1700, 2000, 1900, 2000, 700, 1400, 1400, 1800};
        int expected = 8;
        int maxSumSales = service.maxSales(sales);

        Assertions.assertEquals(maxSumSales, expected);
    }

    @Test

    public void testMinSumSales() {

        StatsService service = new StatsService();

        int[] sales = {800, 1500, 1300, 1500, 1700, 2000, 1900, 2000, 700, 1400, 1400, 1800};
        int expected = 9;
        int minSumSales = service.minSales(sales);

        Assertions.assertEquals(minSumSales, expected);
    }

    @Test

    public void testBelowTheAverageSumSales() {

        StatsService service = new StatsService();

        int[] sales = {800, 1500, 1300, 1500, 1700, 2000, 1900, 2000, 700, 1400, 1400, 1800};
        int expected = 5;
        int belowTheAverage = service.belowTheAverageSumSales(sales);

        Assertions.assertEquals(belowTheAverage, expected);
    }

    @Test

    public void testAboveTheAverageSumSales() {

        StatsService service = new StatsService();

        int[] sales = {800, 1500, 1300, 1500, 1700, 2000, 1900, 2000, 700, 1400, 1400, 1800};
        int expected = 5;
        int aboveTheAverage = service.aboveTheAverageSumSales(sales);

        Assertions.assertEquals(aboveTheAverage, expected);
    }
}
