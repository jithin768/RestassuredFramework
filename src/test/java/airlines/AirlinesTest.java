package airlines;

import restUtils.RestUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlinesTest {

    @Test
    public void createAirline() throws IOException {

        System.out.println(System.getProperty("env")+"ENV value");
        String env=System.getProperty("env")==null ? "qa" : System.getProperty("env");
        Map<String,String> data= JsonUtils.getJsonDataAsMap("airlines/"+env+"/airlinesApiData.json");
        String endpoint=data.get("createAirlineEndpoint");
        Map<String, Object> payload=Payloads.getPayloadsfromMap("12222238 ","ABC name","ABC country",
                "ABC logo","ABC slogan", "ABC head_quarters","ABC Website","ABC established");

        Response response= RestUtils.performPayload(endpoint,payload,new HashMap<>());

        Assert.assertEquals(response.statusCode(),200);
    }


}
