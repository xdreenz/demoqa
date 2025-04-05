package helpers;

import net.datafaker.Faker;
import java.util.Random;

public class DataHelper {
    private static final Faker faker = new Faker();
    private static final String[] genders = new String[] {"Male", "Female", "Other"};

    public static String getFirstName() {
        return faker.name().firstName();
    }

    public static String getLastName() {
        return faker.name().lastName();
    }

    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getAddress() {
        return faker.address().streetAddress();
    }

    public static String getPhoneNumber() {
        return faker.numerify("##########");
    }

    public static String getGender() {
        return genders[new Random().nextInt(genders.length)];
    }

    public static String getBirthDate() {
        return faker.timeAndDate().birthday("dd MMM yyyy");
    }
}
