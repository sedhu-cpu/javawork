import java.util.Scanner;

public class problems {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
         num = input.nextInt();

        if(num % 2 == 0)
            System.out.println(+ num + " is an even number.");
        else 
            System.out.println(+ num + " is an odd number.");
    }
    
}
