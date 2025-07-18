package Conditional_Statement;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:- ");
        int age = sc.nextInt();

        if(age < 18) System.out.println("Entry is not allowed age is low");
        else if (age >=18 && age <=40) System.out.println("Entry is allowed");
        else System.out.println("Entry is not allowed age is high ");
    }
}
