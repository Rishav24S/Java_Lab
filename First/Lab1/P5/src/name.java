import java.util.Scanner;
public class name {
    static void main() {
        String Fname,Lname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name:");
        Fname = sc.nextLine();
        System.out.println("Enter your Last Name:");
        Lname = sc.nextLine();
        System.out.println(Lname+" "+Fname);
    }
}
