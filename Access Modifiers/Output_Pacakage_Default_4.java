import Access_Modifiers.Default;

public class Output_Pacakage_Default_4 {
    public static void main(String[] args) {
        Default obj1 = new Default();
        System.out.println("Calling str from outside package");
        // System.out.println(obj1.str); --> Error will come str is default

        child3 obj2 = new child3();
        System.out.println("\nCalling str from outside package and from child class that present in diff(these package)");
        obj2.print_from_child_class();
    }
}

class child3 extends Default{
    void print_from_child_class() {
        child3 obj = new child3();
        // System.out.println(obj.str);  --> Error will come str is default
    }
}

