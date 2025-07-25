package Arrays;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Give 5 inputs: ");
//        for(int i:arr){  //--> In a for-each loop, the variable i holds the value of the element, not the index. But using it as if it's an index (arr[i]} is wrong.
//            arr[i] = sc.nextInt();
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  // Correctly use index
        }

        for (int i : arr) {
            System.out.print(i + " ");  // i already holds the value
        }
    }
}
