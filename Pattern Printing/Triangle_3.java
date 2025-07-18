package Pattern_Printing;

import java.util.Scanner;

public class Triangle_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n+1; i++) {
            for(int j = 1; j <= n+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
