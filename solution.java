import java.util.Scanner;

class Solution {
    int reverse = 0;
    public boolean isPalindrome(int x) {
     for(;x!=0;){

         int remain = x % 10;
         reverse =  reverse * 10 + remain;
         x = x/10;
         
     }
        System.out.println(reverse);

        if(x == reverse){

            return true;

        }else{

            return false;
        }
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num = input.nextInt();
       Solution myObj = new Solution();
       System.out.println(myObj.isPalindrome(num));
        
    }
}