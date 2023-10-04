import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaintJob basement1 = new PaintJob();
        Scanner scanAll = new Scanner(System.in);
        System.out.println("Enter the project's title: ");
        String projectName = scanAll.nextLine();
        basement1.setProjectName(projectName);
        System.out.println("Enter your budget: ");
        float budget = scanAll.nextFloat();
        basement1.setBudget(budget);
        scanAll.nextLine();
        System.out.println("Enter wall height (feet): ");
        float height = scanAll.nextFloat();
        basement1.setHeight(height);
        scanAll.nextLine();
        System.out.println("Enter your width (feet): ");
        float width = scanAll.nextFloat();
        basement1.setWidth(width);
        scanAll.nextLine();
        System.out.println("Enter your length (feet): ");
        float length = scanAll.nextFloat();
        basement1.setLength(length);
        scanAll.nextLine();
        System.out.println("Enter the price of a can of paint: ");
        float canPrice = scanAll.nextFloat();
        basement1.setCanPrice(canPrice);
        scanAll.nextLine();
        scanAll.close();
        System.out.println("********************************");
        System.out.println("Project name: " + basement1.getProjectName());
        System.out.println("Wall area: " + basement1.getArea() + " ft^2");
        System.out.println("********************************");
        float paintCost1 = basement1.paintCost(1);
        System.out.println("Amount of paint needed: " + basement1.getPaintNeeded() + " L");
        System.out.println("Number of paint cans needed: " + basement1.getNumCans() + " cans");
        System.out.println("The price of 1 coat(s) of paint: " + basement1.getCoatCost() + "$");
        System.out.println("The amount of money left from the budget after 1 coat(s): " + (paintCost1) + "$");
        System.out.println("********************************");
        float paintCost2 = basement1.paintCost(2);
        System.out.println("Amount of paint needed: " + basement1.getPaintNeeded() + " L");
        System.out.println("Number of paint cans needed: " + basement1.getNumCans() + " cans");
        System.out.println("The price of 1 coat(s) of paint: " + basement1.getCoatCost() + "$");
        System.out.println("The amount of money left from the budget after 1 coat(s): " + (paintCost2) + "$");
        System.out.println("********************************");
        float paintCost3 = basement1.paintCost(3);
        System.out.println("Amount of paint needed: " + basement1.getPaintNeeded() + " L");
        System.out.println("Number of paint cans needed: " + basement1.getNumCans() + " cans");
        System.out.println("The price of 1 coat(s) of paint: " + basement1.getCoatCost() + "$");
        System.out.println("The amount of money left from the budget after 1 coat(s): " + (paintCost3) + "$");
        System.out.println("********************************");
    }
}