import java.util.Scanner;
public class Student extends Person {
    private boolean regType;
    private boolean studentType;
    private double GPA;
    private String departmentName;

    public void userInput() {
        Scanner attributes = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        firstName = attributes.nextLine();
        System.out.print("Enter your last name: ");
        lastName = attributes.nextLine();
        System.out.println("Enter your age: ");
        age = attributes.nextInt();
        System.out.println("Enter true for Faculty or false for Student: ");
        personType = attributes.nextBoolean();
        attributes.nextLine();
        System.out.println("Enter your Department name: ");
        departmentName = attributes.nextLine();
        System.out.println("Enter your GPA: ");
        GPA = attributes.nextDouble();
        System.out.println("Enter true for Undergraduate or false for graduate student: ");
        studentType = attributes.nextBoolean();
        System.out.println("Enter true for FULL TIME or false for PART TIME student: ");
        regType = attributes.nextBoolean();
    }
    public void printInfo(){
        String s_Type;
        String r_Type;
        if (studentType == true) {
            s_Type = "undergraduate";
        }
        else{
            s_Type = "graduate";
        }
        if (regType == true){
            r_Type = "full time";
        }
        else{
            r_Type = "part time";
        }

        System.out.println("Welcome to SYSC2004 Lab 04");
        System.out.println("Apparently you are a student!");
        System.out.println("Student name is: " + firstName + " " + lastName);
        System.out.println("Student is " + age + " years old");
        System.out.println("Student is in  a " + departmentName + " and their GPA is : " + GPA);
        System.out.println("Student is a " + r_Type + " " + s_Type + " student\n" );
        //System.out.println("\nProcess finished with exit code 0");
    }
    public Student(String firstName, String lastName, String departmentName, double GPA, boolean studentType, boolean regType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.GPA = GPA;
        this.studentType = studentType;
        this.regType = regType;
    }
    public Student(){
        firstName = "StudentFirst";
        lastName = "StudentLast";
        departmentName = "DefaultDep";
        GPA = 4.0;
        personType = false;
        studentType = true;
        regType = true;
    }
}