class Overload {

    // 1. Method to subtract two integers
    public void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtracting two integers (" + a + " - " + b + "): " + result);
    }

    // 2. Method to subtract three integers
    public void subtract(int a, int b, int c) {
        int result = a - b - c;
        System.out.println("Subtracting three integers (" + a + " - " + b + " - " + c + "): " + result);
    }

    // 3. Method to subtract two doubles
    public void subtract(double a, double b) {
        double result = a - b;
        System.out.println("Subtracting two doubles (" + a + " - " + b + "): " + result);
    }
}

// Driver Class
public class Demo {
    public static void main(String[] args) {
        // Create the object of the Overload class
        Overload obj = new Overload();

        System.out.println("--- Method Overloading Results ---");

        // Input: Calling the first method (2 integers)
        obj.subtract(20, 5);

        // Input: Calling the second method (3 integers)
        obj.subtract(50, 10, 5);

        // Input: Calling the third method (2 doubles)
        obj.subtract(15.5, 5.2);
    }
}