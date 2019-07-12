package com.danielberryman;

public class MinsToYrsAndDysCalc {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 1440;
            long daysLeft = days % 365;
            long years = days / 365;

            System.out.println(String.format("%02d", minutes) + " min = " +
                    String.format("%02d", years) + " y and " +
                    String.format("%02d", daysLeft) + " d");
        }
    }
}
