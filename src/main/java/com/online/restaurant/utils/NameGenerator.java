package com.online.restaurant.utils;

import java.util.Random;

public class NameGenerator {

    private static String[] names =
            {"Chinmayee", "Yash", "Shruti", "Nachiket", "Om", "Pinky","Prerna", "Rashi",  "Sharayu", "Jayant",
            "Abhishek"};

    public static String getName(){
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        String name = names[randomIndex];
        System.out.println("Names = " + name);
        return name;
    }
     public static void main(String[] args)
     {
        NameGenerator.getName();
     }

}
