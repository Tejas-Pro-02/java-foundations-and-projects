package Access_Modifiers;

public class Default {
     String str = "I am Tejas";


    public static void main(String[] args) {
        Default obj1 = new Default();
        System.out.println("Calling this class content from same class: ");

        System.out.println(obj1.str);

        Default_2 obj2 = new Default_2();
        System.out.println("\nCalling this class content from diff class: ");
        System.out.println(obj2.str);
        //  Can not be print outside package and also can't be print in child class
    }
}

class Default_2{

    Public obj = new Public();
    String str = obj.str;
}
