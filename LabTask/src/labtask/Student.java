package src.labtask;
import java.util.Scanner;

public class Student extends Human { //Inheritance (e.g class Student extends (class)Human)
    private float GPA; //Encapsulation (e.g private variable)
    int ID; //Polymorphism

    void setGPA(float g) { //Encapsulating a private variable should have a setter and a getter function.
        g = GPA;
    }
    float getGPA() {
        return GPA;
    }
    void readGPA() {
        System.out.println("Enter your GPA: ");
        GPA = scan.nextFloat();
    }

    @Override           //Polymorphism (& Abstraction)
    void greetings() {
    System.out.println("Welcome, " + name);
    } //(greetings() is both present in Human class and Student class)

    void getID() {
        System.out.println("Enter your student ID: ");
        ID = scan.nextInt();
    }

    void displayData() {
        System.out.println("==[Data]==");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + ID);
        System.out.println("GPA: " + GPA);
    }

}
