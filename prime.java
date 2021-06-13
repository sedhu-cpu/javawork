import java.util.Scanner;
import java.util.*;
public class prime {
    public static void main(String[] args) {
        int n = 3;
        int remainder = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number of prime numbers to be printed:");
        int num  = input.nextInt();
        if(num >= 1){
            System.out.println("The First "+num+" Prime Numbers are:");
            System.out.println(2);
        }
   for(int counter=2; counter<=num ;  ){

    for(int j = 2; j < n ;j++){

        if(n % j == 0){

            remainder = 0;
            break;
        }

        }
        if(remainder != 0){

            System.out.println(n);
            counter++;
        }
        remainder = 1;
        n++;
    }
}
}