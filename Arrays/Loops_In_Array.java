package Arrays;
class Print{
    String[] name = {"Aman", "Harsh", "Tejas"};
    void printf(){
        for(int i = 0; i<3; i++){
            System.out.println(name[i]);
        }
    }
}

public class Loops_In_Array {
    public static void main(String[] args) {
        Print obj = new Print();
        obj.printf();
    }
}
