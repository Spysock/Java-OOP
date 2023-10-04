import java.util.ArrayList;
public class Main {
    public static void printEngineDetails(ArrayList<CarEngine> list1){
        for(int i =0; i < list1.size(); i++){
            System.out.println(list1.get(i).getCompanyName());
            System.out.println(list1.get(i).getEngineDisplacement());
            System.out.println(list1.get(i).getNumCylinders());
            System.out.println(list1.get(i).getHorsePower());
        }

    }
    public static void main(String[] args){
        ArrayList<CarEngine> carEngineList = new ArrayList<CarEngine>();
        CarEngine car1 = new CarEngine();
        CarEngine car2 = new CarEngine("Ford", 50, 50, 50, 50, 50);
        CarEngine car3 = new CarEngine("Toyota", 500, 150, 70, 80, 8);
        CarEngine car4 = new CarEngine("Hyundai", 150, 500, 30, 90, 6);
        CarEngine car5 = new CarEngine("Porsche", 235, 325, 100, 10, 4);
        carEngineList.add(car1);
        carEngineList.add(car2);
        carEngineList.add(car3);
        carEngineList.add(car4);
        carEngineList.add(car5);
        printEngineDetails(carEngineList);


    }
}
