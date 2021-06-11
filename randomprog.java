import java.util.Scanner;
import java.util.*;
public class randomprog {
    public static void main(String[] args) {
        int counter;
        Random num = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Number of times you want the number to be printed:");
        int time = input.nextInt();

        System.out.println("The Random Number are:");
        for(counter = 0; counter<time; counter++){
            System.out.println(num.nextInt(500));
        }

    }
}
