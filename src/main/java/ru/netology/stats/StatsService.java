
package ru.netology.stats;

public class StatsService {
    public int getSumSales(int[] sales) {
        int sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public int getAverageSales(int[] sales) {
        int averageSales = 0;

        for (int i = 0; i < sales.length; i++) {
            averageSales = averageSales + sales[i];
        }
        return averageSales / sales.length;
    }


    public int getMaxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth])
                maxMonth = i;
        }
        return maxMonth + 1;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth])
                minMonth = i;
        }
        return minMonth + 1;
    }

    public int getOverAverage(int[] sales) {
        int averageSales = getAverageSales(sales);
        int monthOverAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales)
                monthOverAverage++;
        }
        return monthOverAverage;
    }

    public int getBelowAverage(int[] sales) {
        int averageSales = getAverageSales(sales);
        int monthBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales)
                monthBelowAverage++;
        }
        return monthBelowAverage;
    }
}




