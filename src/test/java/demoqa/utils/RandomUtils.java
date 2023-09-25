package demoqa.utils;

import com.github.javafaker.Faker;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    private Faker fakerEng = new Faker(new Locale("en"));
    private String[] genders = {"Male", "Female", "Other"};
    private String[] months = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    private List<String> subjects = Arrays.asList("Maths", "English", "Physics", "Chemistry", "Computer Science");
    private List<String> hobbies = Arrays.asList("Sports", "Reading", "Music");
    private String[] state = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

    public String getRandomFirstName() {
        return fakerEng.name().firstName();
    }

    public String getRandomLastName() {
        return fakerEng.name().lastName();
    }

    public String getRandomEmail() {
        return fakerEng.internet().emailAddress();
    }

    public String getRandomGender() {
        return fakerEng.options().option(genders);
    }

    public String getRandomPhone() {
        return fakerEng.numerify("##########");
    }

    public String getRandomSubject() {
        String[] subjects =  {"Accounting", "Arts", "Biology", "Chemistry", "Civics", "Economics",
                "English", "Commerce", "Computer Science", "Physics", "Maths", "Hindi", "History", "Social Studies"};
        return new Faker().options().option(subjects);
    }
    public String getRandomHobbies() {
        String[] hobby = {"Sports", "Reading", "Music"};

        return new Faker().options().option(hobby);
    }

    public String getRandomAddress() {
        return fakerEng.address().fullAddress();
    }

    public String getRandomState() {
        return fakerEng.options().option(state);
    }

    public String getRandomCity(String state) {
        switch (state) {
            case "NCR": {
                String[] city = {"Delhi", "Gurgaon", "Noida"};
                return new Faker().options().option(city);
            }
            case "Uttar Pradesh": {
                String[] city = {"Agra", "Lucknow", "Merrut"};
                return new Faker().options().option(city);
            }
            case "Haryana": {
                String[] city = {"Karnal", "Panipat"};
                return new Faker().options().option(city);
            }
            case "Rajasthan": {
                String[] city = {"Jaipur", "Jaiselmer"};
                return new Faker().options().option(city);
            }
            default:
                return null;
        }
    }

    public String getRandomMonth() {
        return fakerEng.options().option(months);
    }

    public String getRandomYear() {
        return fakerEng.random().nextInt(1900, 2023).toString();
    }

    public String getRandomDay() {
        String day = fakerEng.random().nextInt(1, 28).toString();
        return Integer.parseInt(day) > 10 ? day : "0" + day;
    }

    public int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
