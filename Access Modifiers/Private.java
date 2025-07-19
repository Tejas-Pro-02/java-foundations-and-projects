package Access_Modifiers;

public class Private {
    private String str = "I am Tejas";


    public static void main(String[] args) {
        Private obj1 = new Private();
        System.out.println("Calling this class content from same class: ");
        System.out.println(obj1.str);
        // Can not be print outside package, in child class and also outside in any random class

        // Private_2 obj2 = new Private_2();
        // System.out.println("\nCalling this class content from diff class: ");
        // System.out.println(obj2.str);

    }
}

class Private_2{

    Private obj = new Private();
    // String str = obj.str; --> Error will occur as str is private
}