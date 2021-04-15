import java.util.Scanner;

public class calculator {
    static int sum(int x, int y){
        return x + y;
    }
    static int sub(int x, int y){
        return x - y;
    }
    static int mul(int x, int y){
        return x * y;
    }
    static int div(int x, int y){
        return x / y;
    }
    static int rem(int x, int y){
        return x % y;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char dec;
        do{
        System.out.println("Enter the First Number:");
        int num1 = input.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = input.nextInt();
        System.out.println("Enter an Operation(+,-,*,/,%) or something else to exit:");
        char op = input.next().charAt(0);
        switch(op){
            case '+':
            //System.out.println(sum(num1, num2));
            System.out.println("The sum is: " + sum(num1, num2));
            break;
            case '-':
            //System.out.println(sub(num1, num2));
            System.out.println("The subtraction is: " + sub(num1, num2));
            break;
            case '*':
            //System.out.println(mul(num1, num2));
            System.out.println("The product is: " + mul(num1, num2));
            break;
            case '/':
            //System.out.println(div(num1, num2));
            System.out.println("The division yields: " + div(num1, num2));
            break;
            case '%':
            //System.out.println(rem(num1, num2));
            System.out.println("The remainder is: " + rem(num1, num2));
            break;
            default:
            System.out.println("You have exited the Calculator");
            break;
        }
        System.out.println("Do you wish to Continue?(Y/N)");
        dec = input.next().charAt(0);
    }while(dec == 'Y' || dec == 'y');

    }
    
}
