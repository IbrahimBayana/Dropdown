package com.Project.test.JavaFaker;

import org.testng.annotations.Test;

public class SingletonPractice {
    @Test
    public void test() {
        String str1 = Singleton.getWord();
        String str2 = Singleton.getWord();
        String str3 = Singleton.getWord();
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
    }
}
