package Loop;
import  java.util.Scanner;
public class A_To_Power_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 1;
        System.out.print("Enter base num : ");

        int n1 = sc.nextInt();

        System.out.print("Enter power num: ");
        int n2 = sc.nextInt();

        for(int i = 1; i<=n2; i++){
            ans *= n1;
        }
        System.out.println("The ans is: "+ans);
    }
}
