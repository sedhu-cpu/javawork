import java.util.Scanner;

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
        for(counter = 0; counter<=num; counter++){
                int cnt = 0;
                
            for(int j = 2;j<= num; j++){

                if(num % j == 0){
                    cnt++;
                    break;
                }
            }
            if(cnt ==0 && num != 1){
                System.out.println(num + " ");
            }
        }
    }
}
