package airlines;

import airlines.pojos.Airline;
import restUtils.RestUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlinesTest extends AirlineAPIs{

    @Test
    public void createAirline() throws IOException {

        /*System.out.println(System.getProperty("env")+"ENV value");
        String env=System.getProperty("env")==null ? "qa" : System.getProperty("env");
        Map<String,Object> data= JsonUtils.getJsonDataAsMap("airlines/"+env+"/airlinesApiData.json");
        String endpoint=data.get("createAirlineEndpoint");*/

        //Airline payload=Payloads.getPayloadsfromPojos();
        /*Airline payload=new Airline();*/
        //Response response= RestUtils.performPayloadPost(endpoint,payload,new HashMap<>());
        Airline payload=new Airline().toBuilder().name("jithin").build();

        Response response=createAirline(payload);
        Assert.assertEquals(response.statusCode(),200);
    }


}
