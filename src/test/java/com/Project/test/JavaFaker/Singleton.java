package com.Project.test.JavaFaker;

public class Singleton {
    private static String word;

    public static String getWord() {
        if (word == null) {
            System.out.println("First time call.Word object is null.");
            System.out.println("Assigning value to it now.");
            word = "something";
        }
        else {
            System.out.println("Second time call.Word object is already set.");
        }
        return word;
    }

}
