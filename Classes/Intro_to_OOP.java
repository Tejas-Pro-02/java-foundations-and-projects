package Classes;

class Pokemon{
    String name = "Pikachu";
    int attack = 180;
    int defence = 150;

}

public class Intro_to_OOP {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        System.out.println(p1.name);
        System.out.println(p1.attack);
        System.out.println(p1.defence);
    }
}
