/**
 * The test class CounterTest.
 *
 * @Abody Majeed  (your name)
 * @versoion 1.0 (a version number or a date)
 *
 * Question 6 explanation, while we can create c1 as a RollOverCounter it's going to be converted into type Counter and then,
 * it's deriving all of it's methods from Counter instead of RollOverCounter, since the method doesn't exist you run into an error.
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class CounterTest {
    private RollOverCounter c1;
    private LimitedCounter c2;
	
    /**
     * Default constructor for test class CounterTest
     */
    public CounterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    protected void setUp()
    {
        c1 = new RollOverCounter(1, 10);
        c2= new LimitedCounter(1, 10);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    protected void tearDown()
    {
    }
    
    /**
     * Tests the original (lab 9) RollOverCounter methods.
     */
    @Test
    public void testAllRollOverCounterMethods()
    {    
        /* Verify that the counter is in the correct initial state. */
        assertEquals(1, c1.minimumCount());
        assertEquals(10, c1.maximumCount());
        assertEquals(1, c1.count());        
        
        assertTrue(c1.isAtMinimum());
        assertFalse(c1.isAtMaximum());
  
        /* Count 1 -> 2 */
        
        c1.countUp();
        assertEquals(2, c1.count());
        assertFalse(c1.isAtMinimum());
        
        /* Count 3, 4, ...9, 10 */
        for (int i = 1; i < 9; i++) {
            c1.countUp();
        }
        assertTrue(c1.isAtMaximum());
        
        /* Count 10 -> 1 */
        c1.countUp();
        assertEquals(1, c1.count());
        
        /* Verify that reset works. */
        c1.countUp();
        c1.countUp();
        c1.reset();
        assertEquals(1, c1.count());
    }

    @Test
    public void testAllLimitedCounterMethods(){
        /* Verify that the counter is in the correct initial state. */
        assertEquals(1, c2.minimumCount());
        assertEquals(10, c2.maximumCount());
        assertEquals(1, c2.count());

        assertTrue(c2.isAtMinimum());
        assertFalse(c2.isAtMaximum());

        /* Count 1 -> 2 */

        c2.countUp();
        assertEquals(2, c2.count());
        assertFalse(c2.isAtMinimum());

        /* Count 3, 4, ...9, 10 */
        for (int i = 1; i < 9; i++) {
            c2.countUp();
        }
        assertTrue(c2.isAtMaximum());

        /* Count 10 -> 10 */
        c2.countUp();
        assertEquals(10, c2.count());

        /* Verify that reset works. */
        c2.countUp();
        c2.countUp();
        c2.reset();
        assertEquals(1, c2.count());

    }
    @Test
    public void testNewRollOverCounterMethods(){
        /* Verify that the counter is in the correct initial state. */
        assertEquals(1, c1.minimumCount());
        assertEquals(10, c1.maximumCount());
        assertEquals(1, c1.count());

        c1.setToMaximum();

        assertFalse(c1.isAtMinimum());
        assertTrue(c1.isAtMaximum());

        /* Count 10 -> 9 */

        c1.countDown();
        assertEquals(9, c1.count());
        assertFalse(c1.isAtMaximum());

        /* Count 8,7,....,2,1 */
        for (int i = 1; i < 9; i++) {
            c1.countDown();
        }
        assertTrue(c1.isAtMinimum());

        /* Count 1 -> 10 */
        c1.countDown();
        assertEquals(10, c1.count());

        /* Verify that reset works. */
        c1.countDown();
        c1.countDown();
        c1.reset();
        assertEquals(1, c1.count());

    }
    @Test
    public void testNewLimitedCounterMethods(){
        /* Verify that the counter is in the correct initial state. */
        assertEquals(1, c2.minimumCount());
        assertEquals(10, c2.maximumCount());
        assertEquals(1, c2.count());

        c2.setToMaximum();

        assertFalse(c2.isAtMinimum());
        assertTrue(c2.isAtMaximum());

        /* Count 10 -> 9 */

        c2.countDown();
        assertEquals(9, c2.count());
        assertFalse(c2.isAtMaximum());

        /* Count 8,7,....,2,1 */
        for (int i = 1; i < 9; i++) {
            c2.countDown();
        }
        assertTrue(c2.isAtMinimum());

        /* Count 1 -> 1 */
        c2.countDown();
        assertEquals(1, c2.count());

        /* Verify that reset works. */
        c2.countDown();
        c2.countDown();
        c2.reset();
        assertEquals(1, c2.count());

    }
}
