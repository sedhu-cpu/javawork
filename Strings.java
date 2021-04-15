public class Strings {
    public static void main(String[] args) {
        int myNumber = 7;
        String text = "Hello";
        String blank = " ";
        String name = "Sudhanshu";

        String greeting  = text + blank + name + myNumber;
        System.out.println(greeting);
        System.out.println("Hello"+ " " + "Sudhanshu" + "7"); //concatenation happens here
        System.out.println("The Interger is: " + myNumber);
    }
    
}
