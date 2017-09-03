import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by gryzyuka on 03.09.2017.
 */
public class Ex1 {
    public static void main(String[] args) {
        Integer integerValue = new Integer(0);
        String stringValue= new String();
        Scanner in;
        while (true) {
            System.out.print("Value =");
                               //   System.out.print("UserAge = ");
            in = new Scanner(System.in);
            if (in.hasNextInt()) {
                integerValue = in.nextInt();
                System.out.println("Integer Value: " + integerValue);
            }
                              //   System.out.print("UserName = ");
            else if (in.hasNextLine()) {
                stringValue = in.nextLine();
                System.out.println("String Value: " + stringValue);
            }
           // System.out.printf("User  name: %s, User Age: %d", stringValue, integerValue);;
        }
        /*
        BigInteger integer = in.nextBigInteger();
        System.out.println(integer);

        String string = in.nextLine();
        System.out.println(string);
        */
    }
}
