import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positive");
        } if (a<0) {
            System.out.println("Negative");     
        }
        if(a==0){
            System.out.println("Zero");
        }
    }
}
