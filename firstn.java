public class firstn {
    public static void main(String[] args) {
       int n;
       int remainder = 1;
       int num = 3;

       System.out.println("First 100 prime numbers are:");
       System.out.println(2);

    for(int i =2 ; i<=10 ; )
    {
       for(int j =2; j <= Math.sqrt(num) ;j++)
        {
           if(num%j == 0)
           {
               remainder = 0;
               break;
           }
        }
        if(remainder != 0)
        {
            System.out.println(num);
            i++;
        }
            remainder = 1;
            num++;
        }
    }
}
