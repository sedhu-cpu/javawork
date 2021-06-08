import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int counter, num, item, array[];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The number of elements:");
        num = input.nextInt();
        
        array = new int[num];

        System.out.println("Enter the " + num + " elements");
        for(counter = 0;counter < num; counter++){
            array[counter]=input.nextInt();
        }

        System.out.println("Enter the Number to be searched:");
        item = input.nextInt();

        for(counter = 0; counter < num ; counter++){
            if(array[counter] == item){
                System.out.println("The Number "+item+" was found at "+counter);
                break;
            } 
        }
        if(counter == num){
            System.out.println(+item+" was not found in the array.");
        }

    }
}
