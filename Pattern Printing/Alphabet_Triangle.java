package Pattern_Printing;
import java.util.Scanner;

public class Alphabet_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a input: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                System.out.print((char)(j+64) +" ");
            }
            System.out.print("\n");
        }
    }
}
