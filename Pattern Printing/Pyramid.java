package Pattern_Printing;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        int n = sc.nextInt();  // number of rows

        for(int i = 1; i <= n; i++) {
            for(int nsp = 1; nsp <= n-i; nsp++) {
                System.out.print("  ");
            }
            for(int nst = 1; nst <=2*i-1; nst++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
