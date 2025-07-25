package Arrays;
class Max {
    int[] arr;

    Max(int[] arr) {
        this.arr = arr;
    }

    void display() {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (ans<arr[i]) ans = arr[i];
        }
        System.out.println(ans);
    }
}
public class Max_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Max obj = new Max(arr);
        obj.display();

    }
}
