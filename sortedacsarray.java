import java.util.Scanner;
import java.util.Arrays;
import java.lang.reflect.Method;
class sortedascarray{
    public int[] removeDuplicates(int[] nums){
    if(nums.length == 0){
            System.out.println("No Removal Operation can be performed");
        }
        int k = 0;
        for(int i = 0; i < nums.length ; i++){
                if(nums[i] == nums[k]){
                    continue;
            }
                k++;
                nums[k] = nums[i];
        }
        return nums; //define proper return type to make code work
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of Elements:");
        int counter = input.nextInt();
        int [] x = new int[counter];
        System.out.println("Enter the Arrays");
        for(int i = 0 ; i < counter; i++){
            x[i] = input.nextInt();
        }
        sortedascarray Myobj = new sortedascarray();
        System.out.println(""+ Myobj.removeDuplicates(x));

    }
}