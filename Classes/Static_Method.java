package Classes;

public class Static_Method {
    static void welcome() {
        System.out.println("Hello");
    }
    static int sum(int a, int b){
        return a + b;
    }


    public static void main(String[] args) {
        welcome();
        int ans = sum(5,5);
        System.out.println("Sum is: "+ans);
    }
}
