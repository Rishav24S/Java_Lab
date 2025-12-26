import java.util.Scanner;

class Rectangle {
    // Data members
    double length;
    double breadth;
    double area;
    double perimeter;

    // Constructor to initialize length and breadth (satisfies requirement 2)
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Default constructor (useful if we want to use the read() method later)
    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    // Method to read the values of length and breadth
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mention length and breadth:");
        System.out.print("Length: ");
        this.length = sc.nextDouble();
        System.out.print("Breadth: ");
        this.breadth = sc.nextDouble();
    }

    // Method to calculate area and perimeter
    void calculate() {
        this.area = this.length * this.breadth;
        this.perimeter = 2 * (this.length + this.breadth);
    }

    // Method to display the result
    void display() {
        System.out.println("Area of Rectangle: " + this.area);
        System.out.println("Perimeter of rectangle: " + this.perimeter);
    }

    static void main() {
        // Approach 1: Using the read() method for input
        Rectangle rect1 = new Rectangle();
        rect1.read();
        rect1.calculate();
        rect1.display();
    }
}