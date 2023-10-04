import java.util.Scanner;
public abstract class Person {
    protected boolean personType;
    protected int age;
    protected String lastName;
    protected String firstName;

    public Person(){
        firstName = "DefaultFirst";
        lastName = "DefaultLast";
        age = 0;
        personType = false;
    }

    public abstract void userInput();
    public void printInfo(){
        String p_type;
        if(personType == false){
            p_type = "student";
        }
        else{
            p_type = "faculty";
        }
        System.out.println("Welcome to SYSC2004 Lab 04");
        System.out.println("Apparently you are a person!");
        System.out.println("Your name is: " + firstName + " " + lastName);
        System.out.println("You are " + age + " years old");
        System.out.println("You are a " + p_type + "\n");
        //System.out.println("\nProcess finished with exit code 0");
    }
}
