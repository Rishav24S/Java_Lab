import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ObjectCounter {
    // 1. Static variable to keep track of the count
    // 'static' means this variable belongs to the class, not individual objects
    static int count = 0;

    // 2. Constructor
    // This runs every time you create a new object (new ObjectCounter())
    public ObjectCounter() {
        count++; // Increment the shared counter
    }
}

public class numobj {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of objects to create: ");
        int n = Integer.parseInt(br.readLine());

        // 3. Loop to create the objects
        for (int i = 0; i < n; i++) {
            new ObjectCounter(); // Just creating the object updates the static count
        }

        // 4. Output the final count using the static variable
        System.out.println("No of objects = " + ObjectCounter.count);
    }
}
