import java.util.Scanner;

public class add {
    static int myMethod(int x, int y){
        return x + y;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number:");
        int num2 = input.nextInt();
        //int num3 = num1 + num2;
        System.out.println("The sum is:" + myMethod(num1,num2));
    }
    
}
