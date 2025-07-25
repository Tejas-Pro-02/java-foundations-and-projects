package Arrays;
// Linear Search for first non-repeated element
class ElementAtIndex {
    int[] arr;

    ElementAtIndex(int[] arr) {
        this.arr = arr;
    }

    void display(int target) {
        boolean flag = false;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                flag = true;
                index = i;
                break;
            }
        }

        if (flag)
            System.out.println(target + " is at index " + index);
        else
            System.out.println("Target not found in array");
    }
}

public class Elemnet_At_Which_Index {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        ElementAtIndex obj = new ElementAtIndex(arr);
        obj.display(20);
    }
}

