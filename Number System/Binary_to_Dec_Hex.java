package Number_System;

import java.util.Scanner;

public class Binary_to_Dec_Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        int pow = 1;
        int ans = 0;
        while(num>0){
            int rem = num%10;
            ans = ans + rem*pow;
            pow = pow*2;
            num /=10;
        }
        System.out.println("Decimal: "+ans);
        System.out.printf("Hexadecimal: %X\n", ans);
    }
}
