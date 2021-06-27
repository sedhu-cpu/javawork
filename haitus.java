import java.util.Scanner;

public class haitus {
    static void myMethod(String line){
        System.out.println("the line is "+ line);
    }
    public static void main(String[] args) {
     System.out.println("Enter the string");
     Scanner input = new Scanner(System.in);
     String line = input.nextLine(); 
     myMethod(line);  
    }
    
}
