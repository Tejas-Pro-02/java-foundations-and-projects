package Loop;

import java.util.Scanner;

public class Reverse_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        System.out.print("Enter a num: ");

        int num = sc.nextInt();

        while(num>0){
            int ld = num%10;
            ans = (ans*10) +ld;
            num /= 10;


        }
        System.out.println("The reverse of given no. is: "+ans);
    }
}
