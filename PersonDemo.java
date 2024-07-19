/*CREATE A SIMPLE CLASS PERSON WITH PROPERTIES NAME AND AGE, AND A METHOD TO DISPLAY THE DETAILS
Requirement:
Create a class named Person.
The class should have two properties: name (String) and age (int).
Include a method displayDetails in the Person class that prints the name and age of the
person.
Instantiate an object of the Person class in the main method and call the displayDetails
method. */

import java.util.Scanner;

class Person {
    // Properties
    private String name;
    private int age;

    // Constructor to initialize properties
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name:");
		String name=sc.next();
		
		System.out.println("enter age:");
		int age=sc.nextInt();
		
        Person person = new Person(name, age);
        
        // Call the displayDetails method
        person.displayDetails();
    }
}