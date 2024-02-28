package src.labtask;
import java.util.Scanner;

public abstract class Human { //Abstraction
    Scanner scan = new Scanner(System.in);
    String name;
    int age;
    int ID;


    void getName() {
        System.out.println("Enter your name: ");
        name = scan.next();
    }
    void getAge() {
        System.out.println("Enter your age: ");
        age = scan.nextInt();
    }
    void getID() {
        System.out.println("Enter your national ID: ");
        ID = scan.nextInt();
    }
    void displayData() {
        System.out.println("==[Data]==");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("National ID: " + ID);
    }

    abstract void greetings(); //Abstraction

}
