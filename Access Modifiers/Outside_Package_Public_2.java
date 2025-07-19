import Access_Modifiers.Public;

public class Outside_Package_Public_2 {
    public static void main(String[] args) {
        Public obj1 = new Public();
        System.out.println("Calling str from outside package");
        System.out.println(obj1.str);

        child1 obj2 = new child1();
        System.out.println("\nCalling str from outside package and from child class that present in diff(these package)");
        obj2.print_from_child_class();
    }
}

class child1 extends Public{
    void print_from_child_class() {
        child1 obj = new child1();
        System.out.println(obj.str);
    }
}
