import java.util.ArrayList;
import java.util.Collections;
//import java.util.stream.Collectors;
import java.util.Scanner;
//import java.util.regex.Pattern;

public class removeandsort {
    private static ArrayList<Integer> arr = new ArrayList<Integer>();
    private static ArrayList<Integer> arr2  = new ArrayList<Integer>();
    public static int newnum;
    //private static Pattern pattern;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //for First Array
        System.out.println("Enter the Number of elements for First Array");
        int count = input.nextInt();
        System.out.println("Enter the Numbers for the First Array:");
        for(int i = 0; i < count; i++){
            arr.add(input.nextInt());
        }
        //For Second Array
        System.out.println("Enter the Number of elements for Second Array");
        int cnt = input.nextInt();
        System.out.println("Enter the Numbers for the First Array:");
        for(int i = 0; i < cnt; i++){
            arr2.add(input.nextInt());
        }

        System.out.println("Current Item to be added is: "+arr2);
        System.out.println("Current Array it is going to be added to: "+arr);

        for(int i = 0; i < arr2.size(); i++){
            if(!arr.contains(arr2.get(i))){
                System.out.println("The Item is not present" + arr2.get(i));
                arr.add(arr2.get(i));
            }
            else{
                while(arr.contains(arr2.get(i))){
                    System.out.println("Duplicates are present");
                    arr.remove(arr2.get(i));
                }
            }
        }   
            Collections.sort(arr);
            System.out.println(arr);
            input.close();
    }
}
