import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class search {
    private static ArrayList<String> items = new ArrayList<String>();
    private static ArrayList<String> items2 = new ArrayList<String>();
    //private static ArrayList<String> items3 = new ArrayList<String>();
    private static Pattern pattern;
    private static Matcher matcher;
    public static String newitem;
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            items.add("Fridge");
            items.add("Oven");
            items.add("Vaccum");
            System.out.println("Enter the number of elements to be added:");
            int num = input.nextInt();

            System.out.print("Enter the Item: ");
            input.nextLine(); 
            for(int l = 0 ; l < num ; l++){
                newitem = input.nextLine();
                items2.add(newitem);
            }
            
            pattern = Pattern.compile(newitem, Pattern.CASE_INSENSITIVE);   

            for (int i =0 ; i<3; i++) {
                matcher = pattern.matcher(items.get(i));
            }

            System.out.println("Current Item to be added is: "+items2);
            System.out.println("Current Array it is going to be added to: "+items);

            // each new item to be added
            for(int i=0;i<items2.size();i++){
                // if new item does not exist already
                if(!items.contains(items2.get(i))){
                    System.out.println("Items not Present:"+ items2.get(i));
                    //items3.addAll(items);
                    // then add it
                    items.add(items2.get(i));
                }
                // If new item does exist already
                else{
                    // remove all duplicates till they existt
                    while(items.contains(items2.get(i))){ 
                        System.out.println("Duplicates are Present");
                        // remmove it
                        items.remove(items2.get(i));
                    }
                }
            }
            System.out.println(items);
            input.close();
    }
}
