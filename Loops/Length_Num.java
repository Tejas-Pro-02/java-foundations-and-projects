package Loop;
import java.util.Scanner;
public class Length_Num {
    public static void main(String[] args) {
        System.out.print("Enter a num: ");
        int count = 0;
        System.out.print("Enter a num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num>0){
            num /= 10;
            count++;

        }
        System.out.println("The length of no. is: "+count);
    }
}
