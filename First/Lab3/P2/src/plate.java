import java.util.Scanner;

class Plate {
    double length;
    double width;

    Plate() {
        this.length = 0;
        this.width = 0;
    }

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
    }
    void printDim(){
        System.out.println("Plate     \t" + length + "\t" + width + "\t-\t-");
    }
}

class Box extends Plate {
    double height;

    Box() {
        super(); // Calls the Plate default constructor
        this.height = 0;
    }

    Box(double length, double width, double height) {
        super(length, width); // Passes length and width to Plate constructor
        this.height = height;
    }
    void printDim(){
        System.out.println("Box       \t" + length + "\t" + width + "\t" + height + "\t-");
    }
}

class WoodBox extends Box {
    double thick;

    WoodBox() {
        super(); // Calls the Box default constructor
        this.thick = 0;
    }

    WoodBox(double length, double width, double height, double thick) {
        super(length, width, height); // Passes dimensions to Box constructor
        this.thick = thick;
    }

    @Override
    void printDim() {
        System.out.println("WoodBox   \t" + length + "\t" + width + "\t" + height + "\t" + thick);
    }
}
class Demo{
    static void main() {
        double length, width, height, thick;
        System.out.println("Enter the dimensions: (Length Width Height Thickness)");
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
        height = sc.nextDouble();
        thick = sc.nextDouble();
        Plate plate = new Plate(length, width);
        Box box = new Box(length, width, height);
        WoodBox woodbox = new WoodBox(length, width, height, thick);
        plate.printDim();
        box.printDim();
        woodbox.printDim();
    }
}