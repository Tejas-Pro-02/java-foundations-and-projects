package Loop;

import java.util.Scanner;

public class Factorial_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 1;
        System.out.print("Enter a num to obtain it's factorial: ");

        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            ans *= i;
        }
        System.out.println("The factorial n is is: "+ans);
    }
}
