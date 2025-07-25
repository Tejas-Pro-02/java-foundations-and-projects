package Arrays;

public class Shallow_Copy_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr_2 = arr;
        arr_2[0]= 8;
        for(int i:arr)
            System.out.print(i+" ");

        System.out.println();

        for(int i:arr_2)
            System.out.print(i+" ");

    }
}
