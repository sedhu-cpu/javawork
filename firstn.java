public class firstn {
    public static void main(String[] args) {
       int n =3;
       int remainder = 1;
       //int num = 3;

       System.out.println("First 100 prime numbers are:");
       System.out.println(2);

    for(int i =2 ; i<=100 ; )
    {
       for(int j =2; j < n ;j++)
        {
           if(n%j == 0)
           {
               remainder = 0;
               break;
           }
        }
        if(remainder != 0)
        {
            System.out.println(n);
            i++;
        }
            remainder = 1;
            n++;
        }
    }
}
