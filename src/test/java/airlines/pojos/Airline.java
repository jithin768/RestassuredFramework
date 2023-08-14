package airlines.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import utils.DateUtils;
import utils.RandomDataGenerator;
import utils.RandomDataTypeNames;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Airline {

    private int id=Integer.parseInt(RandomDataGenerator.getRandomNumber(6));
    private String name=RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.FULLNAME);
    private String country=RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.COUNTRY);
    private String logo=RandomDataGenerator.getAlphabets(10);
    private String Slogan=RandomDataGenerator.getAlphabets(10);
    private String head_quaters=RandomDataGenerator.getRandomDataFor(RandomDataTypeNames.CITYNAME);
    private String website="http://"+ RandomStringUtils.randomAlphabetic(10)+".com";
    private String established= String.valueOf(RandomDataGenerator.getnumberBetween(1900, DateUtils.getCurrentYear()));





}
