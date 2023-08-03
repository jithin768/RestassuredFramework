package airlines;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirlinesTest {

    @Test
    public void createAirline(){

         Response response= RestAssured.given().log().all()
                .baseUri("https://api.instantwebtools.net/v1/airlines")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "        \"id\": 122223,\n" +
                        "        \"name\": \"Quatar Airways\",\n" +
                        "        \"country\": \"Quatar\",\n" +
                        "        \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/300px-Qatar_Airways_Logo.svg.png\",\n" +
                        "        \"slogan\": \"Going Places Together\",\n" +
                        "        \"head_quaters\": \"Qatar Airways Towers, Doha, Qatar\",\n" +
                        "        \"website\": \"www.qatarairways.com\",\n" +
                        "        \"established\": \"1994\"\n"+"}").post().then().log().all().extract().response();

        Assert.assertEquals(response.statusCode(),200);
    }


}
