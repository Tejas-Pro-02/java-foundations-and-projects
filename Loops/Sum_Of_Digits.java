package Loop;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a num: ");

        int num = sc.nextInt();

        while(num>0){
            sum += num%10;
            num /= 10;


        }
        System.out.println("The sum of no. is: "+sum);
    }
}
