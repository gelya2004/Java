import java.util.Scanner;

public class Main
{
    public static void func1()
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
                n /= 2;
            }

            count++;
        }

        System.out.printf("Кол-во шагов: %d",count);
    }
    public static void func2()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int n = in.nextInt();
        int summa = 0;
        for (int i = 0; i < n ; i++)
        {
            System.out.println("Введите число:");
            if (i%2==0)
            {
                summa+=in.nextInt();
            }
            else
            {
                summa-=in.nextInt();
            }
        }
        System.out.printf("Сумма ряда: %d",summa);
    }
    public static void main(String[] args)
    {
         func2();
    }
}

