import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n = 3;
        int flag = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number of prime numbers to be printed:");
        int num  = input.nextInt();
        if(num >= 1){
            System.out.println("The First "+num+" Prime Numbers are:");
            System.out.println(2);
        }
   for(int counter=2; counter<=num ;  )
   {
    for(int j = 2; j < n ;j++)
    {
        if(n % j == 0){

            flag = 0;
            break;
        }

    }
        if(flag != 0)
        {
            System.out.println(n+" ");
            counter++;
        }
        flag = 1;
        n++;
    }
}
}