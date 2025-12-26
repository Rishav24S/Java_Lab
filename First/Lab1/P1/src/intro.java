import java.util.Scanner;
public class intro {
    void main() {
        String name, section, branch;
        int roll;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter Roll:");
        roll = sc.nextInt();
        System.out.println("Enter Section:");
        sc.nextLine();
        section = sc.nextLine();
        System.out.println("Enter Branch:");
        branch = sc.nextLine();
        System.out.println(name + "\n" + roll + "\n" + section + "\n" + branch);
    }
}
