import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);
         System.out.println("Введите число:");
         int n = in.nextInt();
         int count = 0;
         if (n==1)
         {
             n=3*n+1;
             count++;
         }
         while(n!=1)
         {
            if (n%2==1)
            {
                n=3*n+1;
            }
            else
            {
                n/=2;
            }
            count++;
         }

         System.out.printf("Кол-во шагов: %d",count);
    }
}

