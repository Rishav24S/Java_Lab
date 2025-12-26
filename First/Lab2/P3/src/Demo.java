import java.util.Scanner;

// 1. The Box Class
class Box {
    // Data members
    double length;
    double width;
    double height;

    // Constructor to initialize the box dimensions
    Box(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    // Method to calculate and return volume
    double volume() {
        return length * width * height;
    }
}

// 2. The Application Class
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Phase
        System.out.println("Enter the dimensions of the box:");

        System.out.print("Enter Length: ");
        double l = scanner.nextDouble();

        System.out.print("Enter Width: ");
        double w = scanner.nextDouble();

        System.out.print("Enter Height: ");
        double h = scanner.nextDouble();

        // Object Creation
        Box myBox = new Box(l, w, h);

        // Processing and Output
        double vol = myBox.volume();
        System.out.println("-------------------------");
        System.out.println("The Volume of the Box is: " + vol);

        scanner.close();
    }
}
