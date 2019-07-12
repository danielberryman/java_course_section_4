package com.danielberryman;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if(temperature < 25 || temperature > 45){
                return false;
            }
            return true;
        } else {
            if(temperature < 25 || temperature > 35){
                return false;
            }
            return true;
        }
    }
}
