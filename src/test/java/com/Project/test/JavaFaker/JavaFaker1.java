package com.Project.test.JavaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker1 {
    @Test
    public void test() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        System.out.println("firstName = " + firstName);
        String lastName = faker.name().lastName();
        System.out.println("lastName = " + lastName);
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.address().city() = " + faker.address().city());

        System.out.println("faker.address().zipCode() = " + faker.numerify("####-######"));

        System.out.println("faker.letterify(\"#####-####lll\") = " + faker.letterify("??????-??????lll"));
        System.out.println("faker.bothify(\"???#??#-???#??#lll\") = " + faker.bothify("???#??#-???#??#lll"));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
    }
}
