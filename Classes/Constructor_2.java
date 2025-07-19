package Classes;
class Algebra{
    int a;
    int b;
    Algebra(int x, int y){
        System.out.println("\nConstructor is called");
        a = x;
        b = y;

    }

    int sum(){
        return a+b;

    }

    int sub(){
        return a-b;
    }

    int mul(){
        return a*b;
    }
}
public class Constructor_2 {
    public static void main(String[] args) {

        Algebra obj1 = new Algebra(5,5);
        System.out.println("Ans for obj 1: ");
        System.out.println(obj1.sum());
        System.out.println(obj1.sub());
        System.out.println(obj1.mul());


        Algebra obj2 = new Algebra(8,5);
        System.out.println("Ans for obj 2: ");
        System.out.println(obj2.sum());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());
    }
}

