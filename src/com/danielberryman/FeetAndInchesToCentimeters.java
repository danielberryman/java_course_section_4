package com.danielberryman;

public class FeetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

//      VALIDATION
        if(feet < 0){
            return -1;
        } else if(inches < 0 || inches > 12){
            return -1;
        }

//      TURN INPUTS TO CENTIMETERS
        double feetToCentimeters = (feet * 12) * 2.54;
        double inchesToCentimeters = inches * 2.54;

        System.out.println(feet + " feet and " + inches + " inches =");

        return feetToCentimeters + inchesToCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){

//      VALIDATION
        if(inches < 0){
            return -1;
        }

//      TURN INPUT TO FEET
        double feet = (double) inches / 12;
        System.out.println(inches + " inches equals " + feet + " feet");

        double inchesLeft = 0;

        if(feet < 1){
            feet = 0;
            inchesLeft = inches;
        } else {
            feet = inches / 12;
            inchesLeft = inches % 12;
        }

        return calcFeetAndInchesToCentimeters(feet, inchesLeft);
    }
}
