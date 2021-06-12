import java.util.Scanner;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        int counter;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number of prime numbers to be printed:");
        int num  = input.nextInt();
        if(num > 1){
            System.out.println("The First "+num+" Prime Numbers are:");
            System.out.println(2);
        }
   for(counter=2;counter<=num;counter++){

    for(int j = 2; ;j++){

        if(num % j == 1){

            System.out.println(num+" ");
            break;

        }else if(num % j == 0){
            j++;
            continue;
        }
    }
   }
}
}