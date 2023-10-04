import java.util.Scanner;
//Author: Abody Majeed
//Date: 7/14/2023
//Student Number: 101227372
public class PaintJob {
    public int numCans;
    public float coatCost, paintNeeded;
    private String projectName;
    private float height, width, length, area, budget, canPrice;
    private final float LITER_COVERS_SQUARE_FEET;

    public PaintJob(){
        /*
        This is the default constructor for PaintJob, it takes no inputs and it sets all attributes to 0 or NULL.

        Preconditions: None

        >>>PaintJob wall1 = new PaintJob()
         */

        numCans = 0;
        coatCost = 0;
        paintNeeded = 0;
        projectName = "NULL";
        height = 0;
        width = 0;
        length = 0;
        area = 0;
        budget = 0;
        canPrice = 0;
        LITER_COVERS_SQUARE_FEET = 100;
    }
    public PaintJob(String projectName, float height, float width, float length){
        /*
        This is an overloaded verison of the constructor which takes 4 parameters from user input, 1 String and 3 floats.
        This will then calculate the area and set the rest of the variables to 0 or NULL.

        Preconditions: None

        >>>PaintJob wall1 = new PaintJob("Basement Wall", 10, 2, 10)
         */


        this.projectName = projectName;
        this.height = height;
        this.width = width;
        this.length = length;

        area = 2 *((height * width) + (height * length));

        numCans = 0;
        coatCost = 0;
        paintNeeded = 0;
        budget = 0;
        canPrice = 0;
        LITER_COVERS_SQUARE_FEET = 100;
    }

    public void setProjectName(String projectName) {
        /*
        This is a setter method which sets the name of the project, it takes 1 input and returns nothing

        Preconditions: None

        >>>PaintJob wall1 = new PaintJob()
        >>>wall1.setProjectName("hi")
        >>>wall1.getProjectName()
        >>hi
         */
        this.projectName = projectName;
    }

    public void setBudget(float budget){
        /*
        This is a setter method that takes 1 input and returns nothing.
        it sets the budget variable.

        Preconditions: None
        >>>PaintJob wall1 = new PaintJob()
        >>>wall1.setBudget(185)
        >>>wall1.getBudget()
        >>185
         */

        this.budget = budget;
    }

    public void setHeight(float height){
        /*
        This is a setter method which sets the height, it takes no inputs and returns nothing.
        This will automatically update the area.

        Preconditions: None

        >>>PaintJob wall1 = new PaintJob()
        >>>wall1.setHeight()
        >>wall1.getHeight()
        5.0
         */

        this.height = height;
        area = 2 *((this.height * width) + (this.height * length));
    }

    public void setLength(float length){
        /*
        This is a setter method which sets the length, it takes no inputs and returns nothing.
        This will automatically update the area.

        Preconditions: None

        >>>PaintJob wall1 = new PaintJob()
        >>>wall1.setLength()
        >>> wall1.getLength()
        >>5.0
         */
        this.length = length;
        area = 2 * ((height * width)+ (height * this.length));

    }
    public void setWidth(float width){
        /*
        This is a setter method which sets the width, it takes no inputs and returns nothing.
        This will automatically update the area.

        Preconditions: None

        >>>PaintJob wall1 = new PaintJob()
        >>>wall1.setWidth()
        >>> wall1.getWidth()
        >>5.0
         */
        this.width = width;
        area = 2 *((height * this.width) + (height * length));

    }

    public void setCanPrice(float canPrice){
        /*
        This is a setter method that takes no inputs and returns nothing, it sets the price of a can of paint.
        This automatically sets the paint cost.

        Preconditions: None
        >>>PaintJob wall1 = new PaintJob()
        >>> wall1.getCanPrice()
        >>10
         */
        this.canPrice = canPrice;

    }

    public float paintCost(int numCoats){
        /*
        This is a setter method which sets the price of given number coat of paint, it takes 1 integer which is the number of coats and
        returns the cost of the paint with in relation to the budget.

        Preconditions: None

        >>>PaintJob wall1 = new PaintJob("Basement", 10.3, 6.7, 11.5)
        >>> wall1.setBudget()
        >>Enter your budget:
        185
        >>> float test = wall1.paintCost(1)
        >>> System.out.println(test)
        >>>134.5


         */
        paintNeeded = (area * numCoats)/ LITER_COVERS_SQUARE_FEET;
        numCans = (int)(Math.ceil(paintNeeded / 3.7));
        coatCost = numCans * canPrice;

        return budget - coatCost;
    }

    public float getArea(){
        /*
        This is a getter method that gets the area of the wall, it takes no inputs and returns a float

        Preconditions: None

        >>>PaintJob wall1 = new PaintJob("Basement", 10.3, 6.7, 11.5)
        >>> wall1.getArea()
        >> 374.92
         */
        return area;
    }

    public float getPaintNeeded(){
        /*
        This is a getter method that gets the paint needed, it takes inputs and returns a float

        Preconditions: None

        >>> PaintJob wall1 = new PaintJob("Basement", 10.3, 6.7, 11.5)
        >>> wall1.setBudget()
        >>Enter your budget:
        185
        >>> float test = wall1.paintCost(1)
        >>> wall1.getPaintNeeded()
        >>> 3
         */
        return paintNeeded;
    }
    public int getNumCans(){
        /*
        This is a getter method that returns an integer and takes no inputs

        Preconditions: None

        >>> PaintJob wall1 = new PaintJob("Basement", 10.3, 6.7, 11.5)
        >>> wall1.setBudget()
        >>Enter your budget:
        185
        >>> float test = wall1.paintCost(1)
        >>> wall1.getNumCans()
        >>> 2
         */
        return numCans;
    }

    public float getCoatCost(){
        /*
        This is a getter method that gets the price of a coat of paint, it takes no inputs and returns a float

        Preconditions: None

        >>> PaintJob wall1 = new PaintJob("Basement", 10.3, 6.7, 11.5)
        >>> wall1.setBudget()
        >>Enter your budget:
        185
        >>> float test = wall1.paintCost(1)
        >>> wall1.getCoatCost()
        >>> 50.5
         */
        return coatCost;
    }

    public String getProjectName(){
        /*
        This is a getter method that takes no inputs, gets the name of the project and returns it

        Preconditions: None

        >>>PaintJob wall1 = new PaintJob()
        >>>wall1.getCanPrice()
        >>0
         */
        return projectName;
    }


}
