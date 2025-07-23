package Number_System;
import java.util.Scanner;

public class Twos_Complement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, rem, copy;
        int[] a = new int[8];

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        copy = n;

        if (n < 0)
            n = -n;

        while (n > 0 && i < 8) {
            rem = n % 2;
            a[i] = rem;
            n /= 2;
            i++;
        }

        System.out.print("Binary conversion of given num is: ");
        if (copy >= 0) {
            for (int j = 7; j >= 0; j--)
                System.out.print(a[j]);

            System.out.println();
        } else {
            a[7] = 1;
            for (int j = 7; j >= 0; j--)
                System.out.print(a[j]);

            System.out.println();
        }

        System.out.print("Ones Complement: ");
        if (copy >= 0) {
            for (int j = 7; j >= 0; j--)
                System.out.print(a[j]);

            System.out.println();
        } else {
            for (int j = 6; j >= 0; j--) {
                if(a[j]== 0) a[j]=1;
                else a[j] = 0;
            }
            for (int j = 7; j >= 0; j--)
                System.out.print(a[j]);

            System.out.println();
        }

        System.out.print("Twos Complement: ");
        if (copy >= 0) {
            for (int j = 7; j >= 0; j--)
                System.out.print(a[j]);

            System.out.println();
        } else {
            int carry = 1;
            for (int j = 0; j < 8; j++) {
                int sum = a[j] + carry;
                a[j] = sum % 2;
                carry = sum / 2;
            }
            for (int j = 7; j >= 0; j--)
                System.out.print(a[j]);

            System.out.println();
        }

        sc.close();
    }
}
