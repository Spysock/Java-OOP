public class Car {
    private static Rect carTop;
    private static Square passengerWindow;
    private static Square driverWindow;
    private static Person driver;
    private static Rect carBody;
    private static Circle passengerWheel;
    private static Circle driverWheel;
    private static Triangle carLight;


    public int getCarLightSize(){

        //50 because the triangle is a 50x50
        return 50;
    }
    public static void setCarTop(){
        carTop  = new Rect();
        carTop.makeVisible();
        carTop.changeSize(210, 100);
        carTop.moveHorizontal(-250);
        carTop.moveVertical(-70);

    }

    public static void setPassengerWindow(){
        passengerWindow = new Square();
        passengerWindow.makeVisible();
        passengerWindow.changeSize(60);
        passengerWindow.changeColor("blue");
        passengerWindow.moveHorizontal(-235);
        passengerWindow.moveVertical(-60);

    }

    public static void setDriverWindow(){
        driverWindow = new Square();
        driverWindow.makeVisible();
        driverWindow.changeSize(60);
        driverWindow.changeColor("blue");
        driverWindow.moveHorizontal(-125);
        driverWindow.moveVertical(-60);

    }

    public static void setDriver(){
        driver = new Person();
        driver.makeVisible();
        driver.moveVertical(-90);
        driver.moveHorizontal(-65);
        driver.changeSize(95, 45);

    }

    public static void setCarBody(){
        carBody = new Rect();
        carBody.makeVisible();
        carBody.changeSize(280, 100);
        carBody.moveHorizontal(-250);
        carBody.moveVertical(0);

    }

    public static void setPassengerWheel(){
        passengerWheel = new Circle();
        passengerWheel.makeVisible();
        passengerWheel.changeColor("black");
        passengerWheel.changeSize(85);
        passengerWheel.moveHorizontal(-140);
        passengerWheel.moveVertical(95);

    }

    public static void setDriverWheel(){
        driverWheel = new Circle();
        driverWheel.makeVisible();
        driverWheel.changeColor("black");
        driverWheel.changeSize(85);
        driverWheel.moveHorizontal(10);
        driverWheel.moveVertical(95);
    }

    public static void setCarLight(){
        carLight = new Triangle();
        carLight.makeVisible();
        carLight.changeColor("yellow");
        carLight.moveHorizontal(-40);
        carLight.moveVertical(180);
        carLight.changeSize(50,50);
    }

    public static void draw() {
        setCarTop();
        setPassengerWindow();
        setDriverWindow();
        setDriver();
        setCarBody();
        setPassengerWheel();
        setDriverWheel();
        setCarLight();
    }

    public void highBeam(int maxLight){
        int minLight = getCarLightSize();
        int increase = (maxLight - minLight)/5;
        for(int i =minLight + increase; i <= maxLight; i += increase){
            carLight.changeSize(i,i);
        }
        for(int i = maxLight - increase; i >= 40; i -= increase){
            carLight.changeSize(i,i);
        }


    }
}
