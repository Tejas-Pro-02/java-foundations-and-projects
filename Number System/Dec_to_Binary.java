package Number_System;
import java.util.Scanner;

public class Dec_to_Binary {
    public static void main(String[] args) {
        int[] arr = new int[8];
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Binary: 0");
            return;
        }

        while (num > 0 && i < 8) {
            arr[i] = num % 2;
            num = num / 2;
            i++;
        }

        System.out.print("Binary: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}
