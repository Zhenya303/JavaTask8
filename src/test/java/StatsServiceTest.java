import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test

    public void shouldCalcSumSales() {
        StatsService service = new StatsService();
        int[] sales = {10, 20, 30};

        int expected = 60;
        int actual = service.getSumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {10, 20, 30};

        int expected = 20;
        int actual = service.getAverageSales(sales);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldCalcMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {10, 20, 30};

        int expected = 3;
        int actual = service.getMaxSales(sales);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldCalcMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {10, 20, 30};

        int expected = 1;
        int actual = service.getMinSales(sales);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldGetMonthOverAverage(){
        StatsService service = new StatsService();
        int[] sales = {1, 2, 6, 1, 5, 2, 4, 4, 3, 3};

        int expected = 4;
        int actual = service.getOverAverage(sales);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldGetMonthBelowAverage(){
        StatsService service = new StatsService();
        int[] sales = {1, 2, 6, 1, 5, 2, 4, 4, 3, 3};

        int expected = 4;
        int actual = service.getBelowAverage(sales);

        Assertions.assertEquals(expected,actual);
    }
}
