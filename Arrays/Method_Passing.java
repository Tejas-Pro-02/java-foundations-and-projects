package Arrays;

public class Method_Passing {
    void Pass (int[] arr2){
        arr2[0] =3;
    }
    public static void main(String[] args) {
        Method_Passing obj  = new Method_Passing();
        int[] arr = {1,2,3,4,5};
        obj.Pass(arr);
        System.out.println(arr[0]);
    }
}
