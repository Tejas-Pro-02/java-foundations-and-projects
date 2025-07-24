package Arrays;

public class TwoD_Array {
    public static void main(String[] args) {
        int [][] arr = {{2,4,5},{5,6,8},{6,3,5}};
//        arr[0] --> Array
        for(int i =0; i< 3; i++){
            for(int j =0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
