package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldcalculateSumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcSumAllSales(sales);
        long expected = 180;
        assertEquals(expected, actual, "Тest calcSumAllSales - failed");
    }

    @Test
    void shouldcalculateAverageSalePerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcAverageSalesPerMonth(sales);
        long expected = 15;
        assertEquals(expected, actual, "Тest calcAverageSalesPerMonth - failed");
    }

    @Test
    void shouldcalculateNumerOfMonthWithMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcMonthWithMaxSales(sales);
        long expected = 8;
        assertEquals(expected, actual, "Тest calcMonthWithMaxSales - failed");
    }

    @Test
    void shouldcalculatenumerOfMonthWithMinSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcMonthWithMinSales(sales);
        long expected = 9;
        assertEquals(expected, actual, "Тest calcMonthWithMinSales - failed");
    }

    @Test
    void shouldcalculateNumberOfMonthesWithUnderAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcNumberMonthWithUnderAvSales(sales);
        long expected = 5;
        assertEquals(expected, actual, "Тest calcNumberMonthWithUnderAvSales - failed");
    }

    @Test
    void shouldcalculateNumberOfMonthesWithOverAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calcNumberMonthWithOverAvSales(sales);
        long expected = 5;
        assertEquals(expected, actual, "Тest calculateNumberOfMonthesWithOverAverageSale - failed");
    }
}