package HT1;

//Задание 5
//Даны два трехзначных числа.
//Получите новое число присоединением второго числа справа к первому без последних цифр у каждого. Например, 123 и 456 Ответ: 1245


import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Float userValue;
        Float userValue2;
        float f1;
        int i1;
        float f2;
        int i2;

        System.out.println("Enter 1 value in format - xxx : ");
        Scanner in = new Scanner(System.in);
        userValue = in.nextFloat();
        f1 = userValue/10;
        i1 = (int)f1;
        String s1 = Integer.toString(i1);

        System.out.println("Enter 2 value in format - xxx : ");
        in = new Scanner(System.in);
        userValue2 = in.nextFloat();
        f2 = userValue2/10;
        i2 = (int)f2;
        String s2 = Integer.toString(i2);

        System.out.println("Collaborate value: " + s1 + s2);
    }

}
