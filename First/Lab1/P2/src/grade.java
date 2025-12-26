import java.util.Scanner;
public class grade {
    public static void main(){
        int mark;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        mark = sc.nextInt();
        if(90<mark && mark<=100){
            System.out.println("Grade is: O");
        }
        else if(80<mark && mark<=90){
            System.out.println("Grade is: E");
        }
        else if(70<mark && mark<=80){
            System.out.println("Grade is: A");
        }
        else if(60<mark && mark<=70){
            System.out.println("Grade is: B");
        }
        else if(50<mark && mark<=60){
            System.out.println("Grade is: C");
        }
        else if(40<mark && mark<=50){
            System.out.println("Grade is: D");
        }
        else{
            System.out.println("Grade is: F");
        }
    }
}
