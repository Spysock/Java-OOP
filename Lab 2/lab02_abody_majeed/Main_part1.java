// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Rect carTop  = new Rect();
        carTop.makeVisible();
        carTop.changeSize(210, 100);
        carTop.moveHorizontal(-250);
        carTop.moveVertical(-70);

        Square passengerWindow = new Square();
        passengerWindow.makeVisible();
        passengerWindow.changeSize(60);
        passengerWindow.changeColor("blue");
        passengerWindow.moveHorizontal(-235);
        passengerWindow.moveVertical(-60);

        Square driverWindow = new Square();
        driverWindow.makeVisible();
        driverWindow.changeSize(60);
        driverWindow.changeColor("blue");
        driverWindow.moveHorizontal(-125);
        driverWindow.moveVertical(-60);

        Person driver = new Person();
        driver.makeVisible();
        driver.moveVertical(-90);
        driver.moveHorizontal(-65);
        driver.changeSize(95, 45);

        Rect carBody = new Rect();
        carBody.makeVisible();
        carBody.changeSize(280, 100);
        carBody.moveHorizontal(-250);
        carBody.moveVertical(0);

        Circle passengerWheel = new Circle();
        passengerWheel.makeVisible();
        passengerWheel.changeColor("black");
        passengerWheel.changeSize(85);
        passengerWheel.moveHorizontal(-140);
        passengerWheel.moveVertical(95);

        Circle driverWheel = new Circle();
        driverWheel.makeVisible();
        driverWheel.changeColor("black");
        driverWheel.changeSize(85);
        driverWheel.moveHorizontal(10);
        driverWheel.moveVertical(95);

        Triangle carLight = new Triangle();
        carLight.makeVisible();
        carLight.changeColor("yellow");
        carLight.moveHorizontal(-40);
        carLight.moveVertical(180);
        carLight.changeSize(50,50);

//        int increase = 50;
//        while(increase < 200){
//            increase += 10;
//            carLight.changeSize(increase, increase);
//        }
//
//        while(increase > 50){
//            increase -= 10;
//            carLight.changeSize(increase, increase);
//        }

    }
}