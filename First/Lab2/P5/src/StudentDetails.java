import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    // Constructor to initialize student details
    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class StudentDetails {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // 1. Input the number of students
        System.out.print("Enter number of students (n): ");
        int n = sc.nextInt();

        // Create an array to hold Student objects
        Student[] students = new Student[n];

        // 2. Loop to input details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();

            // Consume the newline left-over
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            double cgpa = sc.nextDouble();

            // Store in the array
            students[i] = new Student(roll, name, cgpa);
        }

        // 3. Display details of all students
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        // 4. Find the student with the lowest CGPA
        // Initialize min with the first student's details
        double minCgpa = students[0].cgpa;
        String nameOfLowest = students[0].name;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < minCgpa) {
                minCgpa = students[i].cgpa;
                nameOfLowest = students[i].name;
            }
        }

        // 5. Output the result
        System.out.println("-----------------------");
        System.out.println("Student with the lowest CGPA is: " + nameOfLowest);

        sc.close();
    }
}
