package Pattern_Printing;

import java.util.Scanner;

public class Quadrilateral_1_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if((i+j)%2 == 0) System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
