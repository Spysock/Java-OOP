import java.util.Scanner;
public class Faculty extends Person {
    private boolean contractType;
    private String departmentName;
    private boolean regType;

    public void userInput(){
        Scanner attribute = new Scanner(System.in);
        System.out.println("\nEnter your first name: ");
        firstName = attribute.nextLine();
        System.out.print("Enter your last name: ");
        lastName = attribute.nextLine();
        System.out.println("Enter your age: ");
        age = attribute.nextInt();
        System.out.println("Enter true for Faculty or false for Student: ");
        personType = attribute.nextBoolean();
        attribute.nextLine();
        System.out.println("Enter your Department name: ");
        departmentName = attribute.nextLine();
        System.out.println("Enter true for FULL TIME or false for Contract Instructor: ");
        contractType = attribute.nextBoolean();
//        System.out.println("Enter true for FULL TIME or false for PART TIME student: ");
//        boolean regType = attribute.nextBoolean();
//        this.regType = regType;
    }

    public void printInfo(){
        System.out.println("Welcome to SYSC2004 LAB 04");
        System.out.println("Apparently you are a faculty!");
        System.out.println("Faculty name is: " + firstName + " " + lastName);
        System.out.println("Faculty is " + age + " years old");
        System.out.println("Faculty is in " + departmentName);
        System.out.println("Faculty is a " + contractType);
    }
    public Faculty(String firstName, String lastName,String departmentName, boolean contractType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.contractType = contractType;
    }
    public Faculty(){
        firstName = "FacultyFirst";
        lastName = "FacultyLast";
        departmentName = "DefaultDepartment";
        personType = false;
        contractType = true;
        regType = true;
    }
}
