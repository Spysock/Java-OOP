/**
 * A Heater models a simple space-heater. The operations provided by a Heater
 * object are:
 * 1. Increase and decrease the temperature setting by a set amount.
 * 2. Return the current temperature setting.
 * 3. Change the set amount by which the temperature is increased and lowered.
 * 
 * @author L.S. Marshall, SCE, Carleton University
 * (incomplete implementation for SYSC 2004 Lab 2)
 * @author Abody Majeed
 * @version 1.03 July 11, 2023
 */
public class Heater
{
    /** The temperature setting that the heater should maintain. */
    private int temperature;
    
    /** The temperature setting for a newly created heater. */
    private static final int INITIAL_TEMPERATURE = 15;
    
    /** 
     * The amount by which the temperature setting is raised/lowered when
     * warmer() and cooler() are invoked.
     */
     private int increment;
    
    /** 
     * The default amount by which the temperature setting is 
     * increased when warmer() is invoked and decreased when cooler()
     * is invoked.
     */
    private static final int DEFAULT_INCREMENT = 5;
    
    /**
     * Constructs a new Heater with an initial temperature setting of 15
     * degrees, and which increments and decrements the temperature
     * setting in increments of 5 degrees.
     */
    public Heater()
    {
        temperature = INITIAL_TEMPERATURE;
        increment = DEFAULT_INCREMENT;
    }
 
    /**
     * Write an appropriate comment here.
     */    
    public Heater(int minTemp, int maxTemp)
    {

    }

    /**
     * This method returns the current temperature of the heater
     *
     * Preconditions: None
     *
     * >>>heater1.temperature()
     * >>>15
     */    
    public int temperature()
    {
        return temperature;
    }
    
    /**
     * This method increases the heater by the designated increment variable
     *
     * Preconditions: None
     *
     * >>>heater1.warmer()
     * >>>heater1.temperature()
     * >>>20
     */
    public void warmer()
    {
        temperature += increment;
    }

    /**
     * This method decreases the heater by the designated increment variable
     *
     * Preconditions: None
     *
     * >>>heater1.cooler()
     * >>>heater1.temperature()
     * >>>10
     */    
    public void cooler()
    {
        temperature -= increment;
    }
    
    
    /**
     * This method takes a single integer parameter and changes the increment of the heater
     *
     * Preconditions:
     * Value must be positive
     *
     * >>>heater1.setIncrement(10)
     * >>>heater1.warmer()
     * >>>heater1.temperature()
     * >>>25
     * >>>heater1.cooler()
     * >>>heater1.temperature()
     * >>>15
     *
     * >>>heater1.setIncrement(-10)
     * >>>heater1.warmer()
     * >>>heater1.temperature()
     * >>>10
     * >>>heater1.cooler()
     * >>>heater1.temperature()
     * >>>15
     */    
    public void setIncrement(int newIncrement)
    {
        if (newIncrement > 0) {
            increment = newIncrement;
        }
    }
}
