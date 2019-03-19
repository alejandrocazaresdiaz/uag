package com.alexCazares;

/**
 *
 * @author Alejandro Cazares
 */
public class AnalogClock7 {

    public static void main(String[] args) {
        int hour = Integer.parseInt(args[0]);
        int minute = Integer.parseInt(args[1]);
        new AnalogClock7().eval(hour, minute);
    }

    public void eval(int hour, int minute) {
        //calculate the inner angle
        int angleHour = (360 / 12) * hour;
        int angleMinute = (360 / 60) * minute;
        int angle = Math.abs(angleHour - angleMinute);
//        System.out.println(angleHour);
//        System.out.println(angleMinute);
        System.out.println((angle > 180 ? 360 - angle : angle) + "°");
    }


}
