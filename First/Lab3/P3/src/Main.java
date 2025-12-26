import java.util.Scanner;

class Account {
    // Data members
    int acc_no;
    double balance;

    // Static scanner to be shared across objects to prevent stream issues
    static Scanner sc = new Scanner(System.in);

    // Method to take input for Account details
    void input() {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
        // Consume the leftover newline character
        sc.nextLine();
    }

    // Method to display Account details
    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    // Extra data members
    String name;
    String aadhar_no;

    // Method to take input for Person (Overrides/Extends logic)
    // Note: We create a custom input method to gather Person specific data
    // and call the parent input() for account data.

    void input() {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();

        // Call the superclass input method to get account details
        super.input();
    }
    // Overriding the disp() method
    void disp() {
        System.out.println("--- Details ---");
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        // Call the superclass disp method to print account details
        super.disp();
        System.out.println("----------------");
    }
}

public class Main {
    static void main() {
        // Create an array of 3 Person objects
        Person[] p = new Person[3];

        System.out.println("=== ENTER DETAILS FOR 3 PERSONS ===");

        // Loop to allocate memory and take input
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            p[i] = new Person(); // Instantiate the object
            p[i].input();        // Call input method
        }

        System.out.println("\n=== DISPLAYING DETAILS ===");

        // Loop to display output
        for (int i = 0; i < 3; i++) {
            p[i].disp();         // Call overridden display method
        }
    }
}