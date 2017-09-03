package Test;

import java.math.BigInteger;
import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {

        Integer integerValue;
        String stringValue;
            Scanner in = new Scanner(System.in); // инициализация сканера.

            while (true) {
                in = new Scanner(System.in);
                System.out.println("Value = ");
                if (in.hasNextInt()) {   // in.hasNextInt() - выполняет проверку того, что ввели и выполняет услвоие в скобках.
                    integerValue = in.nextInt();
                    System.out.println("Integer Value: " + integerValue);
                } else if (in.hasNextLine()) {
                    stringValue = in.nextLine();
                    System.out.println("String Value: " + stringValue);
                }
            }




        /*
        System.out.println("User Age = ");
        if (in.hasNextInt()) {   // in.hasNextInt() - выполняет проверку того, что ввели и выполняет услвоие в скобках.
            integerValue = in.nextInt();
        }
        System.out.println("User Name = ");
        if (in.hasNextLine()) {
            stringValue = in.nextLine();
        }
        System.out.printf("User Name: %s, User Age: %d", stringValue, integerValue);
        */




        /*
        BigInteger integer = in.nextBigInteger();
        System.out.println(integer);

        String string = in.nextLine();
        System.out.println(string);
        */
    }
}
