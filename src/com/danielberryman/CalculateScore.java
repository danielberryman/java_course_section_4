package com.danielberryman;

public class CalculateScore {

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            return finalScore;
//        }
//
//        return -1;
//    }
//
//    public static void displayHighScorePosition(String name, int position) {
//        System.out.println(name + " managed to get into position " + position + " on the high score table.");
//    }
//
//    public static int calculateHighScore(int score) {
//        if (score > 1000) {
//            return 1;
//        } else if (score > 500 && score < 1000) {
//            return 2;
//        } else if (score > 100 && score < 500) {
//            return 3;
//        } else {
//            return 4;
//        }
//    }
}
