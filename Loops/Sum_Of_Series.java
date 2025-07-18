package Loop;

import java.util.Scanner;

public class Sum_Of_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        System.out.print("Enter a num till which you want sum: ");

        int n = sc.nextInt();

        for(int i = 0; i<=n; i++){
            ans += i;
        }
        System.out.println("The sum of nos. till n is is: "+ans);
    }
}
