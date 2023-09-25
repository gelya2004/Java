import java.util.*;

public class Main
{
    private static java.util.Arrays Arrays;

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
    public static void func3()
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Введите координаты клада:");
       int x_klad = in.nextInt(); //координаты клада
       int y_klad = in.nextInt();
       int x = 0; //текущие координаты
       int y = 0;
       int count = 0;
       List<Integer> steps = new ArrayList<>();
       List<String> directions = new ArrayList<>();
       String instruction = "";
       System.out.println("Введите указания карты:");
            do
            {
                instruction = in.next();
                if (!Objects.equals(instruction, "стоп"))
                {
                    directions.add(instruction);
                    steps.add(in.nextInt());
                }
            }
            while (!Objects.equals(instruction, "стоп"));

        for (int i = 0; i < directions.size(); i++)
        {
             if (x_klad == x && y_klad == y)
             {
                 break;
             }
             if (Objects.equals(directions.get(i), "север"))
             {
                 y+= steps.get(i);
             }
             else if (Objects.equals(directions.get(i), "восток"))
             {
                 x+= steps.get(i);
             }
             else if (Objects.equals(directions.get(i), "юг"))
             {
                 y-= steps.get(i);
             }
             else if (Objects.equals(directions.get(i), "запад"))
             {
                 x-= steps.get(i);
             }
             count++;
        }

        System.out.printf("Кол-во инструкций: %d",count);
    }
    public static int[] func4(Arrays Arrays)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество дорог: ");
        int roads = sc.nextInt();
        int tunnels;
        List<int[]> arrayRoads = new ArrayList<>();
        int[] minRoad = new int[roads];
        Arrays.fill(minRoad, Integer.MAX_VALUE);
        int numberRoad = 0;
        for (int i = 0; i < roads; i++)
        {
            System.out.printf("Введите количество туннелей и их высоту на %d-й дороге: ", (i+1));
            tunnels = sc.nextInt();
            arrayRoads.add(new int[tunnels]);
            for (int j = 0; j < tunnels; j++)
            {
                arrayRoads.get(i)[j] = sc.nextInt();
                if (arrayRoads.get(i)[j] < minRoad[i])
                {
                    minRoad[i] = arrayRoads.get(i)[j];
                }
            }
            if (minRoad[i] > minRoad[numberRoad])
            {
                numberRoad = i;
            }
        }
        return new int[] {numberRoad, minRoad[numberRoad]};
    }
    public static void main(String[] args)
    {
        func4(Arrays);
    }
}

