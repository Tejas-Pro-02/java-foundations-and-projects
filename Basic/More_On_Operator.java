package Basic;

public class More_On_Operator {
    public static void main(String[] args) {
        int a =2, b = 3;

        boolean x = true, y = false;

        // 1. Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println("!y: " + (!y));


        // 2. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b = " + (a & b)); // 10 & 11 = 10
        System.out.println("a | b = " + (a | b)); // 10 | 11 = 11
        System.out.println("a ^ b = " + (a ^ b));  // 10 ^ 11 = 01
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));

        // 3. Unary Operator
        System.out.println("\nUnary Operators:");
        int c = +a; 
        int d = -a;
        System.out.println("Assign +a in c i.e: "+c);
        System.out.println("Assign -a in d i.e: "+d);

        System.out.println("++a = " + (++a)); // pre-increment
        System.out.println("a++ = " + (a++)); // post-increment
        System.out.println("After post-increment, a = " + a);
        System.out.println("--b = " + (--b)); // pre-decrement
        System.out.println("b-- = " + (b--)); // post-decrement
        System.out.println("After post-decrement, b = " + b);



    }
}
