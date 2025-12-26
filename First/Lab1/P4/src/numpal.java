import java.util.Scanner;
public class numpal {
    static void main() {
        int num,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        int n,d=0;
        n = num;
        while(n>0){
            d = n%10;
            rev = 10*rev + d;
            n=n/10;
        }
        if(rev==num){
            System.out.println("The number is a Palindrome.");
        }else{
            System.out.println("The number is not a Palindrome.");
        }
    }
}
