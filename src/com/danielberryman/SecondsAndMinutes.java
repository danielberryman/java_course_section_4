package com.danielberryman;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationstring(int mins, int secs){
        if(mins < 0 || secs < 0 || secs > 59){
            return INVALID_VALUE_MESSAGE;
        }

        int hrs = mins / 60;
        int remainingMins = mins % 60;

        return String.format("%02d", hrs) + "h " +
                String.format("%02d", remainingMins) + "m " +
                String.format("%02d", secs) + "s";
    }

    public static String getDurationstring(int secs){
        if(secs < 0){
            return INVALID_VALUE_MESSAGE;
        }

        int mins = secs / 60;
        int remainingSecs = secs % 60;

        return getDurationstring(mins, remainingSecs);
    }
}
