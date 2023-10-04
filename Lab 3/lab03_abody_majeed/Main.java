// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Temperature test
        System.out.println("temperature method test");
        Heater heater1 = new Heater();
        System.out.println("Heater temperature: " + heater1.temperature());

        //Warmer method test
        System.out.println("\nwarmer method test");
        heater1.warmer();
        System.out.println("Heater has been made warmer");
        System.out.println("Heater temperature: " + heater1.temperature());

        //Cooler method test
        System.out.println("\ncooler method test");
        heater1.cooler();
        System.out.println("Heater has been made cooler");
        System.out.println("Heater temperature: " + heater1.temperature());

        //setIncrement method Test
        System.out.println("\nsetIncrement method test");
        heater1.setIncrement(10);
        System.out.println("Heater incrementation has changed");
        heater1.warmer();
        System.out.println("Heater has been made warmer");
        System.out.println("Heater Temperature: " + heater1.temperature());
        heater1.cooler();
        System.out.println("Heater has been made cooler");
        System.out.println("Heater Temperature: " + heater1.temperature());

        System.out.println("\nsetIncrement method test part 2");
        heater1.setIncrement(-10);
        System.out.println("Heater incrementation has changed");
        heater1.warmer();
        System.out.println("Heater has been made warmer");
        System.out.println("Heater Temperature: " + heater1.temperature());
        heater1.cooler();
        System.out.println("Heater has been made cooler");
        System.out.println("Heater Temperature: " + heater1.temperature());
    }
}