package Conditional_Statement;

public class Ternary_Operator {
    public static void main(String[] args) {
        int a = 2, b = 7;
        // (condition) ? value_if_true : value_if_false;
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);
    }
}
