package Access_Modifiers;

public class Protected {
    protected String str = "I am Tejas";


    public static void main(String[] args) {
        Public obj1 = new Public();
        System.out.println("Calling this class content from same class: ");

        System.out.println(obj1.str);

        Public_2 obj2 = new Public_2();
        System.out.println("\nCalling this class content from diff class: ");
        System.out.println(obj2.str);
        //   Can not be print outside package can be printed in child class
    }
}

class Protected_2{

    Public obj = new Public();
    String str = obj.str;
}
