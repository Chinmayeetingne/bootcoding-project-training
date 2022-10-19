package com.online.restaurant.utils;

import java.util.Random;

public class OTPGenerator {
    final static int MAX = 999999;
    final static int MIN = 100000;
    static Random random = new Random();
    public static int getOTP(){
        Random random = new Random();
        final int MAX = 999999;
        final int MIN = 100000;
        int number = random.nextInt(MAX - MIN); //899999
        int otp = MIN + number; //100000+2=100002

        //99999 = maximum limit
        //10000 = minimum limit

        System.out.println("OTP Number = " + number );
        return otp;
    }

    public static void main(String[] args) {
        for (int i = 0;i<100;i++){
            OTPGenerator.getOTP();
        }

    }

}
