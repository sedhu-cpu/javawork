import java.util.Scanner;

public class addtrycatch {
    int x;
    int y;
    int z;
    public static void main(String[] args) {
        try{
        Scanner input = new Scanner(System.in);
        addtrycatch myObj1 = new addtrycatch();
        addtrycatch myObj2 = new addtrycatch();
        addtrycatch myObj3 = new addtrycatch();
        System.out.println("Enter The First Number:");
        myObj1.x = input.nextInt();
        System.out.println("Enter The Second Number:");
        myObj2.y = input.nextInt();

        myObj3.z= myObj1.x + myObj2.y;
        System.out.println(+ myObj3.z +" is the sum of the two numbers!");
        } catch(Exception e){
            System.out.println("Enter a Valid Number!");
        }
    }
}
