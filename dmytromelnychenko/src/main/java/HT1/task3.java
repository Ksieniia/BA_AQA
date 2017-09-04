package HT1;

//Задание 3
//Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток. n - ввести с консоли.

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {

        Integer uValue;
        Integer hours;
        Integer minutes;
        Integer seconds;

        System.out.print("Enter count of days: ");
        Scanner in = new Scanner(System.in);
        uValue = in.nextInt();
        hours = uValue*24;
        minutes = hours*60;
        seconds = minutes*60;

        System.out.println("In " + uValue + " days:");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");

    }

}
