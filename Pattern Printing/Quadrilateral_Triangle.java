package Pattern_Printing;

import java.util.Scanner;

public class Quadrilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n+1; i++) {
            for(int j = 1; j <= n+1-i; j++) {
                System.out.print(j+" ");
            }
            for(int j = 1; j<=i-1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
