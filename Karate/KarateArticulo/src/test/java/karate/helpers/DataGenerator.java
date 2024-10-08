package karate.helpers;

import com.github.javafaker.Faker;

public class DataGenerator {
    public static String getRandomEmail() {
        Faker faker = new Faker();
        String email = faker.name().firstName().toLowerCase() + faker.random().nextInt(0, 100) + "@test.com";
        return email;
    }
    public static String getRandomPassword() {
        Faker faker = new Faker();
        String password = faker.internet().password();
        return password;
    }
}