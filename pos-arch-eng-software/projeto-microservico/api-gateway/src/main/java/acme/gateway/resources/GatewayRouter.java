package acme.gateway.resources;

import java.util.ArrayList;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.util.toolbox.AggregationStrategies;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * A simple Camel route that triggers from a timer and calls a bean and prints
 * to system out.
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
@ConfigurationProperties(prefix = "gateway")
public class GatewayRouter extends RouteBuilder {

	private String springbootsvcurl, microprofilesvcurl;
	private String travelUrl, flyUrl, hotelUrl,carUrl,payUrl,apiUrl;

	private static final String REST_ENDPOINT = "http4:%s/api?httpClient.connectTimeout=1000"
			+ "&bridgeEndpoint=true&copyHeaders=true&connectionClose=true";

	@Override
    public void configure() {
		
		from("servlet:///acme-travel?matchOnUriPrefix=true")
		.log("redirecting to acme-travel")
		.toF(REST_ENDPOINT, travelUrl)
		.end();

		from("servlet:///acme-fly?matchOnUriPrefix=true")
		.log("redirecting to acme-fly")
		.toF(REST_ENDPOINT, flyUrl)
		.end();
		
		from("servlet:///acme-hotel?matchOnUriPrefix=true")
		.log("redirecting to acme-hotel")
		.toF(REST_ENDPOINT, hotelUrl)
		.end();
		
		from("servlet:///acme-car?matchOnUriPrefix=true")
		.log("redirecting to acme-car")
		.toF(REST_ENDPOINT, carUrl)
		.end();

		from("servlet:///acme-pay?matchOnUriPrefix=true")
		.log("redirecting to acme-pay")
		.toF(REST_ENDPOINT, payUrl)
		.end();
		
        from("direct:microprofile").streamCaching()
                .toF(REST_ENDPOINT, microprofilesvcurl)
                .log("Response from MicroProfile microservice: ${body}")
                .convertBodyTo(String.class)
                .end();

        from("direct:springboot").streamCaching()
                .toF(REST_ENDPOINT, springbootsvcurl)
                .log("Response from Spring Boot microservice: ${body}")
                .convertBodyTo(String.class)
                .end();

        from("direct:greeting").streamCaching()
        .transform().constant("Hello Camel World! I am api-gateway")
        .end();

        rest().enableCORS(true)
        	.get("/greeting").produces("text/plain").to("direct:greeting")
        	.get("/gateway")
            .route()
                .multicast(AggregationStrategies.flexible()
                    .accumulateInCollection(ArrayList.class))
                .parallelProcessing()
                    .to("direct:microprofile")
                    .to("direct:springboot")
                .end()
             .convertBodyTo(String.class)
            .marshal().json(JsonLibrary.Jackson)
        .endRest();
    }

	public void setSpringbootsvcurl(String springbootsvcurl) {
		this.springbootsvcurl = springbootsvcurl;
	}

	public void setMicroprofilesvcurl(String microprofilesvcurl) {
		this.microprofilesvcurl = microprofilesvcurl;
	}

	public void setTravelUrl(String travelUrl) {
		this.travelUrl = travelUrl;
	}

	public void setFlyUrl(String flyUrl) {
		this.flyUrl = flyUrl;
	}

	public void setHotelUrl(String hotelUrl) {
		this.hotelUrl = hotelUrl;
	}

	public void setCarUrl(String carUrl) {
		this.carUrl = carUrl;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}
}
