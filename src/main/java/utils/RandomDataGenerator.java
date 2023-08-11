package utils;

import net.datafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataGenerator {

    public static Faker faker=new Faker();

    public static String getRandomFirstName(){
        return faker.name().firstName();
    }

    public static String getRandomLastName(){
        return faker.name().lastName();
    }

    public static String getRandomFullName(){
        return faker.name().fullName();
    }

    public static String getRandomDataFor(RandomDataTypeNames dataTypeNames){
        switch (dataTypeNames){
            case FIRSTNAME :
                    return faker.name().firstName();
            case LASTNAME :
                return faker.name().lastName();
            case FULLNAME :
                return faker.name().fullName();
            case COUNTRY:
                return faker.address().country();
            case CITYNAME:
                return faker.address().cityName();
            default:
                return "Data Type name is not available";
        }
    }

    public static String getRandomNumber(int count){
        return faker.number().digits(count);
    }


    public static String getAlphabets(int count){
        return RandomStringUtils.randomAlphabetic(count);
    }

    public static int getnumberBetween(int start, int end){
        return faker.number().numberBetween(start, end);
    }
    public static String getWebsiteName(){
        return "http://"+RandomStringUtils.randomAlphabetic(10)+".com";
    }
}
