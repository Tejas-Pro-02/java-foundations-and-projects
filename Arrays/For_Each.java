package Arrays;

public class For_Each {
    int[] arr = {1, 2, 3, 4, 5};
    int[][] arr2 = {{1, 2, 3}, {2, 3}, {3, 4, 5}};

    public static void main(String[] args) {
        For_Each obj = new For_Each();

        for (int i : obj.arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int[] row : obj.arr2) { // --> For 2D array syntax is diff because  for(int i: obj.arr2) — this is incorrect because obj.arr2 is a 2D array (int[][]), so each element is actually a 1D array (int[]), not an int.
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
