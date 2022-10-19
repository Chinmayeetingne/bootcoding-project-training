package com.online.restaurant.utils;

import java.util.Random;

public class PhoneNumberGenerator {
    final static int MAX = 999999999;
    final static int MIN = 100000000;
    static Random random = new Random();
    public static int getPhoneNumberGenerator(){

        int number = random.nextInt(MAX - MIN);
        int otp = MIN + number;

        //99999 = maximum limit
        //10000 = minimum limit

        System.out.println("Phone Number = " + otp );
        return otp;
    }

    public static void main(String[] args) {
        for (int i = 0;i<100;i++){
            PhoneNumberGenerator.getPhoneNumberGenerator();
        }

    }

}
