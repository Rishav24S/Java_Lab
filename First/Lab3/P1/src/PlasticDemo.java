import java.util.Scanner;

class Sheet {
    double length;
    double width;
    int rate = 40;

    Sheet(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateCost() {
        return rate * length * width;
    }
}

class Box extends Sheet {
    double height;
    int rate = 60;

    Box(double length, double width, double height) {
        super(length, width); // Reusing parent constructor
        this.height = height;
    }

    // Overriding the method for Box logic
    @Override
    public double calculateCost() {
        return rate * length * width * height;
    }
}

public class PlasticDemo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Option:");
        System.out.println("1. Sheet Only");
        System.out.println("2. Box Only");
        System.out.println("3. Both ");
        int ch = sc.nextInt();

        double length, width, height;

        // Common inputs for all cases
        System.out.print("Enter Length: ");
        length = sc.nextDouble();
        System.out.print("Enter Width: ");
        width = sc.nextDouble();

        if (ch == 1) {
            // Case 1: Just the Sheet
            Sheet s = new Sheet(length, width);
            System.out.println("Cost of Sheet: " + s.calculateCost());

        } else if (ch == 2) {
            // Case 2: Just the Box
            System.out.print("Enter Height: ");
            height = sc.nextDouble();

            Box b = new Box(length, width, height);
            System.out.println("Cost of Box: " + b.calculateCost());

        } else if (ch == 3) {
            // Case 3: Both (Reuse length and width!)
            System.out.print("Enter Height: ");
            height = sc.nextDouble();

            // Create two separate objects
            Sheet s = new Sheet(length, width);
            Box b = new Box(length, width, height);

            double sheetCost = s.calculateCost();
            double boxCost = b.calculateCost();

            System.out.println("----------------------------");
            System.out.println("Cost of Sheet: " + sheetCost);
            System.out.println("Cost of Box:   " + boxCost);
            System.out.println("Total Cost:    " + (sheetCost + boxCost));
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}