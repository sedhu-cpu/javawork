import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class search2 {
    private static ArrayList<String> items = new ArrayList<String>();
    private static Pattern pattern;
    private static Matcher matcher;
    public static String newitem;
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            items.add("Fridge");
            items.add("Oven");
            items.add("Vaccum");

            System.out.println("Enter the Item");
            newitem = input.nextLine();
            
            pattern = Pattern.compile(newitem, Pattern.CASE_INSENSITIVE);   

            for (int i =0 ; i<3; i++) {
                matcher = pattern.matcher(items.get(i));
            }

            System.out.println("Current Item to be added is: "+newitem);
            System.out.println("Current Array it is going to be added to: "+items);


            if(!items.contains(newitem)){

                items.add(newitem);

            }else{
                while (items.contains(newitem)) {
                    
                    System.out.println("Duplicate is present");
                    items.remove(items.indexOf(newitem));
                }
            }
            System.out.println(items);
            input.close();
    }
}