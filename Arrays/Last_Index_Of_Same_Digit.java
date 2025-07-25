package Arrays;

public class Last_Index_Of_Same_Digit {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,4,43,435,6,57,67,4,4,4,5,6};
        int li =-1;
        for(int i=0; i<arr.length;i++ ){
            if(arr[i]== 4) li=i;
        }
        System.out.println(li);
    }

}
