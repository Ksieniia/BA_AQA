package HT1;

//Задание 1:
//Разработайте программу, которая будет выводить таблицу умножения введенного пользователем числа с клавиатуры.

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Integer userValue;
        Integer userValue1;
        Integer userValue2;
        Integer userValue3;
        Integer userValue4;
        Integer userValue5;
        Integer userValue6;
        Integer userValue7;
        Integer userValue8;
        Integer userValue9;
        Integer userValue10;

        System.out.print("Enter value: ");
        Scanner in = new Scanner(System.in);

        if (in.hasNextInt()) {
            userValue = in.nextInt();
            userValue1 = userValue*1;
            userValue2 = userValue*2;
            userValue3 = userValue*3;
            userValue4 = userValue*4;
            userValue5 = userValue*5;
            userValue6 = userValue*6;
            userValue7 = userValue*7;
            userValue8 = userValue*8;
            userValue9 = userValue*9;
            userValue10 = userValue*10;

            System.out.println(userValue + " * 1 = " + userValue1);
            System.out.println(userValue + " * 2 = " + userValue2);
            System.out.println(userValue + " * 3 = " + userValue3);
            System.out.println(userValue + " * 4 = " + userValue4);
            System.out.println(userValue + " * 5 = " + userValue5);
            System.out.println(userValue + " * 6 = " + userValue6);
            System.out.println(userValue + " * 7 = " + userValue7);
            System.out.println(userValue + " * 8 = " + userValue8);
            System.out.println(userValue + " * 9 = " + userValue9);
            System.out.println(userValue + " * 10 = " + userValue10);
        } else {
            System.out.println("Error");
        }

    }
}
