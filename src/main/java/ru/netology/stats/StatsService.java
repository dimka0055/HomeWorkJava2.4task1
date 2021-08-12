package ru.netology.stats;

public class StatsService {

    public long calcSumAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            long newSum = sum + sale;
            sum = newSum;
        }
        return sum;
    }

    public long calcAverageSalesPerMonth(long[] sales) {
        return calcSumAllSales(sales) / sales.length;
    }

    public long calcMonthWithMaxSales(long[] sales) {
        int maxSales = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxSales]) {
                maxSales = month;
            }
            month = month + 1;
        }
        return maxSales + 1;
    }

    public long calcMonthWithMinSales(long[] sales) {
        int minSales = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minSales]) {
                minSales = month;
            }
            month = month + 1;
        }
        return minSales + 1;
    }

    public long calcNumberMonthWithUnderAvSales(long[] sales) {
        long avSalesPerMonth = calcAverageSalesPerMonth(sales);
        long monthCount = 0;
        for (long sale : sales) {
            if (sale < avSalesPerMonth) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public long calcNumberMonthWithOverAvSales(long[] sales) {
        long avSalesPerMonth1 = calcAverageSalesPerMonth(sales);
        long monthCount = 0;
        for (long sale : sales) {
            if (sale > avSalesPerMonth1) {
                monthCount++;
            }
        }
        return monthCount;
    }
}