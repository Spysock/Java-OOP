import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CarEngineTest {
    private int count;
    private CarEngine car1 = new CarEngine();
    private CarEngine car2;
    private CarEngine car3;

    public CarEngineTest(){

    }

    @BeforeAll
    private static void setUp(){

    }

    @AfterEach
    private void count(){
        count ++;
        System.out.println("Current test being ran: Test #" + count);
    }

    @Test
    public void testDefaultConstructor(){
        System.out.println("Testing default constructor");
        assertEquals("Unknown", car1.getCompanyName());
        assertEquals(0, car1.getStroke());
        assertEquals(0, car1.getBoreSize());
        assertEquals(0, car1.getHorsePower());
        assertEquals(0, car1.getEngineDisplacement());
        assertEquals(0, car1.getNumCylinders());
        assertEquals(0, car1.getSpeed());
        assertEquals(0, car1.getTorque());

    }

    @Test
    public void testOverloadedConstructor(){
        System.out.println("Testing overloaded constructor");
        car2 = new CarEngine(null, -10, -50, -100, -100, -4);
        car3 = new CarEngine("Ford", 10, 50, 100, 100, 4);
        System.out.println("Testing negatives with overloaded constructor");
        assertEquals("Unknown", car2.getCompanyName());
        assertEquals(0, car2.getStroke());
        assertEquals(0, car2.getBoreSize());
        assertEquals(0, car2.getHorsePower());
        assertEquals(0, car2.getEngineDisplacement());
        assertEquals(0, car2.getNumCylinders());
        assertEquals(0, car2.getSpeed());
        assertEquals(0, car2.getTorque());
        System.out.println("Testing a perfect use case with overloaded constructor");
        assertEquals("Ford", car3.getCompanyName());
        assertEquals(10, car3.getTorque());
        assertEquals(50, car3.getSpeed());
        assertEquals(100,car3.getBoreSize());
        assertEquals(100,car3.getStroke());
        assertEquals(4,car3.getNumCylinders());

    }

    @Test
    public void testSetCompanyName(){
        car2 = new CarEngine(null, 50, 50, 50, 50, 8);
        car3 = new CarEngine("Ford", 50, 50, 50, 50, 50);
        System.out.print("Testing testSetCompanyName default constructor");
        assertEquals("Unknown", car1.getCompanyName());
        System.out.print("Testing testSetCompanyName overloaded constructor with null");
        assertEquals("Unknown", car2.getCompanyName());
        System.out.print("Testing testSetCompanyName overloaded constructor with a string");
        assertEquals("Ford", car3.getCompanyName());
    }

    @Test
    public void testSetNumCylinders(){
        car2 = new CarEngine("Ford", 50, 50, 50, 50, 9);
        car3 = new CarEngine("Ford", 50, 50, 50, 50, 6);
        System.out.print("Testing testSetNumCylinders default constructor");
        assertEquals(0, car1.getNumCylinders());
        System.out.print("Testing testSetNumCylinders overloaded constructor with greater than 8 (maximum)");
        assertEquals(8, car2.getNumCylinders());
        System.out.print("Testing testSetNumCylinders overloaded constructor with a under 8 and above 0");
        assertEquals(6, car3.getNumCylinders());
    }

    @Test
    public void testSetBoreSize(){
        car1.setBoreSize(50);
        car2 = new CarEngine();
        car2.setBoreSize(-15);
        car3 = new CarEngine();
        car3.setBoreSize(150);
        System.out.println("Testing a non-negative under maximum use case for boreSize");
        assertEquals(50, car1.getBoreSize());
        System.out.println("Testing a negative use case for boreSize");
        assertEquals(0, car2.getBoreSize());
        System.out.println("Testing an above maximum use case for boreSize");
        assertEquals(100, car3.getBoreSize());

    }

    @Test
    public void testSetEngineDisplacement(){
        car2 = new CarEngine("Ford", 50, 50, 80, -90, 1);
        car3 = new CarEngine("Ford", 50, 50, 80, 90, 1);
        System.out.println("Testing setEngineDisplacement with the default constructor");
        assertEquals(0, car1.getEngineDisplacement());
        System.out.println("Testing setEngineDisplacement with a negative value for one of the variables");
        assertEquals(0, car2.getEngineDisplacement());
        System.out.println("Testing setEngineDisplacement for a non negative, within the maximum use case");
        assertEquals(452.38934326171875, car3.getEngineDisplacement());

    }

    @Test
    public void testSetHorsePower(){
        car2 = new CarEngine("Ford", -100, 500, 80, -90, 1);
        car3 = new CarEngine("Ford", 100, 500, 80, 90, 1);
        car2.setHorsePower(true);
        car3.setHorsePower(true);
        System.out.println("Testing setHorsePower on default constructor");
        assertEquals(0, car1.getHorsePower());
        car1.setHorsePower(false);
        assertEquals(0, car1.getHorsePower());
        System.out.println("Testing setHorsePower on overloaded constructor with negatives");
        assertEquals(0, car2.getHorsePower());
        car2.setHorsePower(false);
        assertEquals(0, car2.getHorsePower());
        System.out.println("Testing setHorsePower on overloaded constructor with non-negatives, normal use case");
        assertEquals(30.159290313720703, car3.getHorsePower());
        car3.setHorsePower(false);
        assertEquals(9.520182609558105, car3.getHorsePower());

    }

}
