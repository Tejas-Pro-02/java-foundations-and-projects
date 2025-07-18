package Conditional_Statement;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no:- ");
        int n = sc.nextInt();

        if(n%2 == 0) System.out.println("even no.");
        else System.out.println("Odd no.");

    }
}
