public class attributes {
    int x = 5;
    int y = 7;
    int z = 3;
    int s;
    public int num1;
    public int num2;
    public int num3;
    public int num1;

public static void main(String[] args) {
    attributes myObj = new attributes();
    attributes myObj2 = new attributes();
    attributes myObj3 = new attributes();
    attributes myObj4 = new attributes();
    myObj4.s = myObj.x + myObj2.y + myObj3.z;
    System.out.println(myObj.x);
    System.out.println(myObj2.y);
    System.out.println(myObj3.z);
    System.out.println("The Sum is:" + myObj4.s);

    }
}