import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeaterTest {
    private static Heater heater;

    private static int counter;

    public HeaterTest(){

    }

    @BeforeAll
    private static void setUp(){
        heater = null;
        counter = 0;

    }

    @AfterEach
    private void summary(){
        counter += 1;
        System.out.println("Number of tests ran " + counter);

    }

    @AfterAll
    private static void tearDown(){
        System.out.println("All tests are done");

    }

    @Test
    public void test_DefaultConstructor(){
        Heater heater_test = new Heater();
        heater = heater_test;
        assertEquals(15, heater.temperature());
    }

    @Test
    public void test_OverloadedConstructor(){
        Heater heater_test = new Heater(0, 30);
        heater = heater_test;
        assertEquals(0, heater.getMin());
        assertEquals(30, heater.getMax());
        assertEquals(15, heater.temperature());
        assertEquals(5, heater.getIncrement());
    }

    @Test
    public void test_OverloadedConstructor_MinIsLargerThanMax(){
        Heater heater_test = new Heater(30, 0);
        heater = heater_test;
        assertEquals(0, heater.getMin());
        assertEquals(30, heater.getMax());
        assertEquals(15, heater.temperature());
        assertEquals(5, heater.getIncrement());
    }

    @Test
    public void test_Warmer(){
        Heater heater_test = new Heater();
        heater = heater_test;
        heater.warmer();
        assertEquals(20, heater.temperature());
    }

    @Test
    public void test_setIncrement_CallWarmerThenCooler(){
        Heater heater_test = new Heater();
        heater = heater_test;
        heater.setIncrement(4);
        heater.warmer();
        assertEquals(19, heater.temperature());
        heater.cooler();
        assertEquals(15, heater.temperature());
    }

    @Test
    public void test_setIncrement_ZeroAndNegativeIncrement(){
        Heater heater_test = new Heater();
        heater = heater_test;
        heater.setIncrement(0);
        assertEquals(5, heater.getIncrement());
        heater.setIncrement(-5);
        assertEquals(5, heater.getIncrement());
    }

    @Test
    public void test_Max_WarmerAndCoolerToLimits(){
        Heater heater_test = new Heater(0, 30);
        heater = heater_test;
        heater.setIncrement(30);
        heater.warmer();
        assertEquals(30, heater.temperature());

    }

    @Test
    public void test_Min_WarmerAndCoolerToLimits(){
        Heater heater_test = new Heater(0, 30);
        heater = heater_test;
        heater.setIncrement(30);
        heater.cooler();
        assertEquals(0, heater.temperature());
    }
}
