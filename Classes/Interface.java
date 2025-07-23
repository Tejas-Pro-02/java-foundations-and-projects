package Classes;
interface Animal{
    void sound();
}
interface Food{
    void food();
}
class Pig implements Animal,Food{
    public void sound() {
        System.out.println("Wewe");
    }
    public void food(){
        System.out.println("Carrot");
    }
}
public class Interface {
    public static void main(String[] args) {
        Pig obj = new Pig();
        obj.sound();
        obj.food();
    }
}
