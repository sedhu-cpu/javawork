import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

class romantonum {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int num = map.get(s.charAt(s.length()-1));
        //System.out.println(num);
        //System.out.println(s.length());
            
        for(int i = s.length()-2; i>=0 ;i--){

            //System.out.println(i);
            //System.out.println(s.length());
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                
                //System.out.println(num);
                //System.out.println(s.charAt(i));
                num = num  - map.get(s.charAt(i));
                
            }else{
                
                num = num + map.get(s.charAt(i));
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A Roman Numeral:");
        String rum = input.nextLine();
        romantonum myObj = new romantonum();
        System.out.print("The Number is:");
        System.out.print(" "+ myObj.romanToInt(rum));
        input.close();
    }
}