package airlines;

import net.datafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

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
        Faker faker=new Faker();
        payload.put("id",faker.number().digits(10));
        payload.put("name",faker.name().firstName());
        payload.put("country",faker.address().country());
        payload.put("logo", RandomStringUtils.randomAlphabetic(25));
        payload.put("slogan",RandomStringUtils.randomAlphabetic(25));
        payload.put("head_quaters",faker.address().city());
        payload.put("website","http://"+RandomStringUtils.randomAlphabetic(10)+".com");
        payload.put("established",faker.number().numberBetween(1900,2020));

        return payload;
    }
}
