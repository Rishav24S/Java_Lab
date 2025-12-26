import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class eveodd{
    public static void main(String args[]) throws IOException {
        // 1. Setup the reader to take input from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10]; // Array to hold the numbers
        int eve = 0;
        int odd = 0;

        System.out.println("Enter 10 numbers (press Enter after each one):");

        // 2. Loop to accept inputs
        for(int i = 0; i < 10; i++) {
            System.out.print("Number " + (i+1) + ":"); // Prompt the user

            // Read the line of text and convert it to an integer
            String input = br.readLine();
            arr[i] = Integer.parseInt(input);

            // 3. Check Even or Odd immediately (Efficiency)
            if(arr[i] % 2 == 0) {
                eve++;
            } else {
                odd++;
            }
        }

        // 4. Output the final counts
        System.out.println("----------------Result----------------");
        System.out.println("Count of Even numbers: " + eve);
        System.out.println("Count of Odd numbers:  " + odd);
    }
}