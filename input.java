import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //here "input" can be anything
        Scanner input = new Scanner(System.in);
        //Enter A string
        System.out.println("Enter a String: ");
        String line = input.nextLine();
        //Enter a Number
        System.out.println("Enter a Number: ");
        int Number = input.nextInt();
        //Both the inputs from above are compiled and given as output below
        if(Number>=18)
        {
            System.out.println("Welcome :" + " " + line + Number);
        }else{
            System.out.println("You are not Welcome :" + " " + line + Number);
        }
        
    }
}
