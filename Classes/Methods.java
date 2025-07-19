package Classes;
class Shapes{
    int rectangle(int a, int b){
        return a*b;
    }

    double circle(int r){
        return 3.14*r*r;
    }
}

public class Methods {
    public static void main(String[] args) {
        Shapes area = new Shapes();
        System.out.println("Area of Rectangle is: "+ area.rectangle(7,8));

        System.out.println("Area of Circle is: "+ area.circle(5));

    }
}
