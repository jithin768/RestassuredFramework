package airlines;

import groovy.xml.StreamingDOMBuilder;
import io.restassured.response.Response;
import restUtils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class AirlineAPIs {

    public Response createAirline(Map<String, Object> createAirlinePayload){

        String endpoint= (String) Base.dataFromJsonFile.get("createAirlineEndpoint");
        return RestUtils.performPayloadPost(endpoint,createAirlinePayload,new HashMap<>());
    }


}
