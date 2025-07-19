import Access_Modifiers.Protected;

public class Outside_Package_Protected_3 {
    public static void main(String[] args) {
        Protected obj1 = new Protected();
        System.out.println("Calling str from outside package");
        // System.out.println(obj1.str); --> Error will come str has protected

        child2 obj2 = new child2();
        System.out.println("\nCalling str from outside package and from child class that present in diff(these package)");
        obj2.print_from_child_class();
    }
}

class child2 extends Protected{
    void print_from_child_class() {
        child2 obj = new child2();
        System.out.println(obj.str);
    }
}
