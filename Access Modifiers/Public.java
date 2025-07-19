package Access_Modifiers;


public class Public {
    public String str = "I am Tejas";


    public static void main(String[] args) {
        Public obj1 = new Public();
        System.out.println("Calling this class content from same class: ");

        System.out.println(obj1.str);

        Public_2 obj2 = new Public_2();
        System.out.println("\nCalling this class content from diff class: ");
        System.out.println(obj2.str);
    //   Can be also print outside package and in child class
    }
}

class Public_2{

    Public obj = new Public();
    String str = obj.str;
}
