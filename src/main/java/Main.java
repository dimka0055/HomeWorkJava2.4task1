import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sumAllSales = service.calcSumAllSales(sales);
        System.out.println("Сумма всех продаж - " + sumAllSales);

        long averageSalesPerMonth = service.calcAverageSalesPerMonth(sales);
        System.out.println("Средняя сумма продаж в месяц - " + averageSalesPerMonth);

        long monthWithMaxSales = service.calcMonthWithMaxSales(sales);
        System.out.println("Номер месяца, в котором был пик продаж - " + monthWithMaxSales);

        long monthWithMinSales = service.calcMonthWithMinSales(sales);
        System.out.println("Номер месяца, в котором был минимум продаж - " + monthWithMinSales);

        long numberMonthWithUnderAvSales = service.calcNumberMonthWithUnderAvSales(sales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего - " + numberMonthWithUnderAvSales);

        long numberMonthWithOverAvSales = service.calcNumberMonthWithOverAvSales(sales);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего - " + numberMonthWithOverAvSales);

    }
}



