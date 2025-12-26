import java.util.Scanner;

class Rectangle {
    // Data members
    double length;
    double breadth;

    // 1. Default Constructor: Initializes values to zero
    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    // 2. Parameterized Constructor: Initializes values based on user input
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area
    double calculateArea() {
        return length * breadth;
    }

    // Method to display dimensions and area
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + calculateArea());
    }
}

public class Demo {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        // Case A: Using Default Constructor
        System.out.println("--- Object 1 (Default Constructor) ---");
        Rectangle rect1 = new Rectangle();
        rect1.display();
        System.out.println();

        // Case B: Using Parameterized Constructor with User Input
        System.out.println("--- Object 2 (Parameterized Constructor) ---");
        System.out.print("Enter the value of length: ");
        double inputLength = scanner.nextDouble();

        System.out.print("Enter the value of breadth: ");
        double inputBreadth = scanner.nextDouble();

        // Creating object with user values
        Rectangle rect2 = new Rectangle(inputLength, inputBreadth);
        rect2.display();

        scanner.close();
    }
}