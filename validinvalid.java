import java.util.Scanner;

public class validinvalid {
 public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Month:");
        int month = input.nextInt();
        System.out.println("Enter a Day:");
        int day = input.nextInt();
        System.out.println("Enter a year:");
        int year = input.nextInt();
        if(month < 1 || month > 12){
            System.out.println("Invalid");
        }else if(day < 1 || day > 31){
            System.out.println("Invalid");
        }else if(year < 1900 || year > 2015){
            System.out.println("Invalid");
        }else{
            System.out.println("Valid");
            day = day - 1;
        }
        System.out.println("The date would be:"+ day +"-"+ month +"-"+year);
    }   
}
