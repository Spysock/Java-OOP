import java.lang.Math;
public class CarEngine {
    private final static int CC_FROM_HP = 15;
    private final static int RADIANS_PER_SECOND = 5252;
    private float engineDisplacement;
    private float horsePower;
    private int numCylinders;
    private int stroke;
    private int boreSize;
    private int speed;
    private int torque;
    private String companyName;

    public CarEngine(){
        companyName = "Unknown";
        stroke = 0;
        engineDisplacement = 0;
        horsePower = 0;
        numCylinders = 0;
        boreSize = 0;
        speed = 0;
        torque = 0;
    }
    public CarEngine(String companyName, int torque, int speed, int boreSize, int stroke, int numCylinders){
        if (companyName == null) {
            this.companyName = "Unknown";
        }
        else{
            this.companyName = companyName;
        }
        if(torque > 0){
            this.torque = torque;
        }
        else{
            this.torque = 0;
        }
        if(speed > 0){
            this.speed = speed;
        }
       else{
           this.speed = 0;
        }

       if(boreSize > 0){
           if(boreSize > 100){
               this.boreSize = 100;
           }
           else{
               this.boreSize = boreSize;
           }
       }
       else{
           this.boreSize = 0;
       }

       if(stroke > 0){
           if(stroke > 100){
               this.stroke = 100;
           }
           else{
               this.stroke = stroke;
           }
       }

       else{
           this.stroke = 0;
       }
       if(numCylinders > 0){
           if(numCylinders > 8){
               this.numCylinders = 8;
           }
           else{
               this.numCylinders = numCylinders;
           }
       }
       else{
           this.numCylinders = 0;
       }
       engineDisplacement = calculateEngineDisplacement();
       setHorsePower(false);
    }

    private float calculateHorsePowerFromTorque(){
        return ((float)torque * ((float)speed/(float)RADIANS_PER_SECOND));

    }

    private float calculateEngineDisplacement(){
        return (float)(((Math.PI * Math.pow((boreSize/2),2)) * numCylinders * stroke)*0.001);

    }
    private float calculateHorsePowerFromDisplacement(){
        return (float)(engineDisplacement/CC_FROM_HP);
    }

    public void setCompanyName(String companyName) {
        if (companyName == null) {
            this.companyName = "Unknown";
        }
        else{
            this.companyName = companyName;
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setEngineDisplacement() {
        this.engineDisplacement = calculateEngineDisplacement();
    }

    public float getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setHorsePower(boolean source) {
        if(source == true){
            horsePower = calculateHorsePowerFromDisplacement();
        }
        else{
            horsePower = calculateHorsePowerFromTorque();
        }
    }

    public float getHorsePower() {
        return horsePower;
    }

    public void setTorque(int torque) {
        if(torque > 0){
            this.torque = torque;
        }
        else{
            this.torque = 0;
        }
    }

    public int getTorque() {
        return torque;
    }

    public void setBoreSize(int boreSize) {
        if(boreSize > 0){
            if(boreSize > 100){
                this.boreSize = 100;
            }
            else{
                this.boreSize = boreSize;
            }
        }
        else {
            this.boreSize = 0;
        }
    }

    public int getBoreSize() {
        return boreSize;
    }

    public void setStroke(int stroke) {
        if(stroke > 0){
            if(stroke > 100){
                this.stroke = 100;
            }
            else{
                this.stroke = stroke;
            }
        }
        else{
            this.stroke = 0;
        }
    }

    public int getStroke() {
        return stroke;
    }

    public void setSpeed(int speed) {
        if(speed > 0){
            this.speed = speed;
        }
        else{
            this.speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setNumCylinders(int numCylinders) {
        if(numCylinders > 0){
            if(numCylinders > 8){
                this.numCylinders = 8;
            }
            else{
                this.numCylinders = numCylinders;
            }
        }
        else{
            this.numCylinders = 0;
        }
    }

    public int getNumCylinders() {
        return numCylinders;
    }
}
