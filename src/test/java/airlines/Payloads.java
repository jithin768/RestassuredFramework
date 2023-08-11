package airlines;

import airlines.pojos.Airline;
import net.datafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;
import utils.DateUtils;
import utils.RandomDataGenerator;
import utils.RandomDataTypeNames;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Payloads {

    public static Map<String, Object> getPayloadsfromMap(String id,String name,String country, String logo,String slogan,
                                                         String head_quaters,String website,String established){

        Map<String,Object> payload=new HashMap<>();
        payload.put("id",id);
        payload.put("name",name);
        payload.put("country",country);
        payload.put("logo",logo);
        payload.put("slogan",slogan);
        payload.put("head_quaters",head_quaters);
        payload.put("website",website);
        payload.put("established",established);

        return payload;
    }

    public static Map<String, Object> getPayloadsfromMap(){

        Map<String,Object> payload=new HashMap<>();
        //Faker faker=new Faker();
        payload.put("id",RandomDataGenerator.getRandomNumber(10));
        payload.put("name", RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.FULLNAME));
        payload.put("country",RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.COUNTRY));
        payload.put("logo", RandomDataGenerator.getAlphabets(10));
        payload.put("slogan",RandomDataGenerator.getAlphabets(10));
        payload.put("head_quaters",RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.CITYNAME));
        payload.put("website","http://"+RandomStringUtils.randomAlphabetic(10)+".com");
        payload.put("established",RandomDataGenerator.getnumberBetween(1900, DateUtils.getCurrentYear()));

        return payload;
    }


    public static Airline getPayloadsfromPojos(){

        return Airline.builder()
                .id(Integer.parseInt(RandomDataGenerator.getRandomNumber(6)))
                .name(RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.FULLNAME))
                .country(RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.COUNTRY))
                .logo(RandomDataGenerator.getAlphabets(10))
                .Slogan(RandomDataGenerator.getAlphabets(10))
                .head_quaters(RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.CITYNAME))
                .website("http://"+RandomStringUtils.randomAlphabetic(10)+".com")
                .established(String.valueOf(RandomDataGenerator.getnumberBetween(1900, DateUtils.getCurrentYear()))).build();

    }
}
