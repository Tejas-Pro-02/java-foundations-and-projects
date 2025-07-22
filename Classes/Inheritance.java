package Classes;


class Car {
    int acc;
    int gear;

    void start() {
        System.out.println("Car started.");
    }


}

class Bmw extends Car { // Single level
    String brand = "BMW";
    Bmw() {
        acc = 200;
        gear = 5;
    }
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
    void displaySpecs() {
        System.out.println("Acceleration: " + acc + " km/h");
        System.out.println("Gears: " + gear);
    }
}

class BmwMSeries extends Bmw { // Multi level
    String model = "M4 Competition";

    void displayModel() {
        System.out.println("Model: " + model);
    }
}
class Mercedes extends Car{ // Hierarchical
    Mercedes(){
        acc = 180;
        gear =5;
    }
    String brand = "Mercedes";
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
    void displaySpecs() {
        System.out.println("Acceleration: " + acc + " km/h");
        System.out.println("Gears: " + gear);
    }

}
public class Inheritance {
    public static void main(String[] args) {
        BmwMSeries myCar1 = new BmwMSeries();

        myCar1.start();
        myCar1.displaySpecs();
        myCar1.displayBrand();
        myCar1.displayModel();

        Mercedes myCar2 = new Mercedes();
        System.out.println();
        myCar2.start();
        myCar2.displaySpecs();
        myCar2.displayBrand();


    }
}
