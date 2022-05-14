package dl;
import java.util.Scanner;
public class ThreeMeth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; //sum
        while(true){
            int value = sc.nextInt();
            if(value ==0){
                sum = sum+value;
                break;
            }
            sum = sum+value;
        }
        System.out.println(sum);
    }}
