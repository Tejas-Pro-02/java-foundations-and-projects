package Arrays;
class Sum {
    int[] arr;

    Sum(int[] arr) {
        this.arr = arr;
    }

    void display() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println(sum);
    }
}
public class Sum_Of_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Sum obj = new Sum(arr);
        obj.display();

    }
}
