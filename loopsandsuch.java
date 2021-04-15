public class loopsandsuch {
    public static void main(String[] args) {
        String calc = "a";
        switch(calc){
            case "+":
            int a = 5;
            int b = 4;
            int sum = a + b;
            System.out.println(sum);
            break;
            case "-":
            int c = 5;
            int d = 4;
            for(int i=0;i<=10;i++)
            {
                int sub  = c-d;
                System.out.println(sub);
                i++;
                //System.out.println(i);
            }
            break;
            case"*":
            int e = 5;
            int f = 4;
            int i = 0;
            while(i<5)
            {
                int mul = e*f;
                System.out.println(mul);
                i++;
            }
            break;
            case"/":
            int g = 5;
            int h = 4;
            int p = 0;
            do{
                int div = g/h;
                System.out.println(div);
                p++;
            }while(p<5);
            break;
            case"%":
            int j = 5;
            int k = 4;
            for(int u = 0;u<5;u++)
            {
                if(u==2)
                {
                    //break;
                    continue;
                }
                int rem = j%k;
                System.out.println(rem);
                System.out.println(u);
            }
            break;
            default:
            System.out.println("Give a different input!");
            break;

    }
    }
    
}
