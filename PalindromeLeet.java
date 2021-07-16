import java.util.Scanner;

class PalindromeLeet {
    int reverse = 0;
    public boolean isPalindrome(int x) {
    int y = x;
     for(;x!=0;){

         int remain = x % 10;
         reverse =  reverse * 10 + remain;
         x = x/10;

     }

        if(y>=0 && y == reverse){

                return true;

        }else{

            return false;
        }
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       PalindromeLeet myObj = new PalindromeLeet();
       System.out.println(myObj.isPalindrome(num));
        
    }
}