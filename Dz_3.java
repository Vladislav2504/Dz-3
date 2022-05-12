import java.sql.SQLOutput;
import java.util.Scanner;

public class Dz_3 {
    public static void main(String[] args) {
        // 1. Написать программу для вывода названия поры года по номеру месяца.
        // С использование switch.case.

        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        switch (num) {
            case 12, 1, 2:
                System.out.println("Пора года - зима.");
                break;

            case 3, 4, 5:
                System.out.println("Пора года - весна.");
                break;

            case 6, 7, 8:
                System.out.println("Пора года - лето.");
                break;

            case 9, 10, 11:
                System.out.println("Пора года - осень.");
                break; }


        // 2. Написать программу для вывода названия поры года по номеру месяца.
        // С использование if-else-if.

        int num;
        Scanner scanner=new Scanner (System.in);
        num = scanner.nextInt();

        if ((num >= 3) && (num <= 5)) {
            System.out.println("Пора года - весна.");
        }
        if ((num>=6) && (num<=8)) {
            System.out.println("Пора года - лето.");
        }
        if ((num>=9) && (num<=11)) {
            System.out.println("Пора года - осень.");
        }
        if ((num>=1) && (num<=2)) {
            System.out.println("Пора года - зима.");
        }
        if ((num>=12) && (num<=12))
            System.out.println("Пора года - зима.");


        // 3. Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.

        int num;
        Scanner scanner=new Scanner (System.in);
        num= scanner.nextInt();
        if (num%2==0)
            System.out.println("Четное.");
        else
            System.out.println("Нечетное.");


        // 4. Для введенного числа t (температура на улице) вывести

        int t = 7;

        {
            if (t > -5)
                System.out.println("Тепло.");

        }
        {
            if (-5 >= t - 20)
                System.out.println("Нормально.");
        }
        {
            if (-20>=t)
                System.out.println("Холодно");
        }

        // 5. По введенному номеру определить цвет радуги.

        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Красный");
                break;

            case 2:
                System.out.println("Оранжевый");
                break;

            case 3:
                System.out.println("Желтый");
                break;

            case 4:
                System.out.println("Зеленый");
                break;

            case 5:
                System.out.println("Голубой");
                break;

            case 6:
                System.out.println("Синий");
                break;

            case 7:
                System.out.println("Фиолетовый");
                break;
        }
        // Циклы

        // 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.

        for (int a=0; a<100; a++)
            if (a%2==1)
                System.out.println(a);

        // 2. Необходимо вывести на экран числа от 5 до 1.

        for (int a=5; a>=1; a--)
            System.out.println(a);

        // 3. Напишите программу где пользователь выводит любое целое положительное число.
        // А программа суммирует все числа от 1 до введенного пользователем числа.

        // int a;
        //        System.out.println("Введите любое положительное число");
        //        Scanner scanner=new Scanner(System.in);
        //        a= scanner.nextInt();

        // Пропустил.

        // 4. Необходима, чтоб программа выводила на экран вот такую последовательность:
        // 7 14 21 28 35 42 49 ... 98

        for (int a = 7; a<98; a++)
            if (a%7==0)
                System.out.println(a);

        // 5. Выведите 10 первых чисел последовательности 0, -5, -10, -15..

        for (int a =0; a>-50; a--)
            if (a%5==0)
                System.out.println(a);

        // 6. Составьте программу, выводящую на экран квадраты чисел от 10 до  20 включительно.

        // for (int i = 10; i<20; i++)

        // Пропустил.

















        }


    }



