package HT1;

/*
Задание 6:
        Создайте калькулятор, который выполняет, базовые арифметические операции:
        - умножение;
        - деление;
        - сложение;
        - вычитание;
        - остаток от деления ;
        - нахождение модуля числа.
        Позьзователь вводит операцию о перанды
*/

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        float userValue1;
        int s;
        float userValue2;
        float resume;
        int rem;
        float rem2;
        float rem3;

        System.out.print("Enter 1 value: ");
        Scanner in = new Scanner(System.in);
        userValue1 = in.nextFloat();
        System.out.println("Chose operation: 1 - *; \n 2 - / \n 3 - + \n 4 - - \n 5 - remainder of the division \n 6 - module");
        in = new Scanner(System.in);
        s = in.nextInt();
        System.out.print("Enter 2 value: ");
        in = new Scanner(System.in);
        userValue2 = in.nextFloat();

        switch (s){
            case 1: resume = userValue1 * userValue2;
            System.out.println(userValue1 + " * " + userValue2 + " = " + resume);
            break;

            case 2: resume = userValue1 / userValue2;
            System.out.println(userValue1 + " / " + userValue2 + " = " + resume);
            break;

            case 3: resume = userValue1 + userValue2;
            System.out.println(userValue1 + " + " + userValue2 + " = " + resume);
            break;

            case 4: resume = userValue1 - userValue2;
            System.out.println(userValue1 + " - " + userValue2 + " = " + resume);
            break;

            case 5: resume = userValue1 / userValue2;
                rem = (int)resume;
                rem2 = rem * userValue2;
                rem3 = userValue1 - rem2;
            System.out.println("remainder of the division" + userValue1 + " / " + userValue2 + " = " + rem3);
            break;

            case 6: System.out.println("Module of " + userValue1 + " = "+ Math.abs(userValue1));
                    System.out.println("Module of " + userValue2 + " = "+ Math.abs(userValue2));
            break;

        }

    }

}
