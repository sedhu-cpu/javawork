import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int counter, num, item , array[], first, middle, last;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        num = input.nextInt();

        array = new int[num];

        System.out.println("Enter the "+num+" elements");
        for(counter = 0 ; counter< num ; counter++){
        array[counter] = input.nextInt();
        }

        System.out.println("The Numbers in the array are:");

         for(counter = 0; counter < num ; counter++){
             System.out.print(array[counter]+ " ");
         }
         System.out.println();

         System.out.println("The Sorted array is:");

         Arrays.sort(array);
         
         for(counter = 0; counter < num ; counter++){
             System.out.print(array[counter]+" ");
         }
         System.out.println();

         System.out.println("Enter the search value:");
         item = input.nextInt();
         first = 0;
         last = num -1;
         middle =(first +last)/2;

         while(first<=last){
             if(array[middle] < item)
             first = middle + 1;
             else if(array[middle] == item){
                 System.out.println(item +" was found at location " + middle + ".");
                 break;
             }
             else {
                 last = middle - 1;
             }
             if(first > last){
                 System.out.println(item+" was not found!");
             }
         }
    }
}
