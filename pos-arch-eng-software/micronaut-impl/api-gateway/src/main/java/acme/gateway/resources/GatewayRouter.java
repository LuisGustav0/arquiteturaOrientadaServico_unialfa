package acme.gateway.resources;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * A simple Camel route that triggers from a timer and calls a bean and prints
 * to system out.
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
public class GatewayRouter extends RouteBuilder {

	@Override
	public void configure() {

		/*
		 from("servlet:///acme-travel?matchOnUriPrefix=true")
		  	.log("redirecting to acme-travel ${in.headers}") 
		  	.removeHeaders("CamelHttp*", Exchange.HTTP_METHOD, Exchange.HTTP_URI) 
		  	.serviceCall("acme-travel", "undertow:http://acme-travel/acme-travel/api/greeting") 
		  	.log("resolve service call ${in.headers}") 
		  .end();
		  */
		
		from("servlet:///acme-travel?matchOnUriPrefix=true")
			.log("redirecting to acme-travel")
			.removeHeaders("CamelHttp*", Exchange.HTTP_METHOD, Exchange.HTTP_URI)
			.serviceCall()
				.name("acme-travel")
				.expression()
				.simple("undertow:http://${header.CamelServiceCallServiceHost}:${header.CamelServiceCallServicePort}${header.CamelHttpUri}")
		.end();
		
		from("servlet:///acme-fly?matchOnUriPrefix=true")
			.log("redirecting to acme-fly")
			.removeHeaders("CamelHttp*", Exchange.HTTP_METHOD, Exchange.HTTP_URI)
			.serviceCall()
				.name("acme-fly")
				.expression()
				.simple("undertow:http://${header.CamelServiceCallServiceHost}:${header.CamelServiceCallServicePort}${header.CamelHttpUri}")
		.end();

		from("servlet:///acme-hotel?matchOnUriPrefix=true")
			.log("redirecting to acme-hotel")
			.removeHeaders("CamelHttp*", Exchange.HTTP_METHOD, Exchange.HTTP_URI)
			.serviceCall()
				.name("acme-hotel")
				.expression()
				.simple("undertow:http://${header.CamelServiceCallServiceHost}:${header.CamelServiceCallServicePort}${header.CamelHttpUri}")
		.end();

		from("servlet:///acme-car?matchOnUriPrefix=true").log("redirecting to acme-car")
			.log("redirecting to acme-pay")
			.removeHeaders("CamelHttp*", Exchange.HTTP_METHOD, Exchange.HTTP_URI)
			.serviceCall()
				.name("acme-car")
				.expression()
				.simple("undertow:http://${header.CamelServiceCallServiceHost}:${header.CamelServiceCallServicePort}${header.CamelHttpUri}")
		.end();

		from("servlet:///acme-pay?matchOnUriPrefix=true")
			.log("redirecting to acme-pay")
			.removeHeaders("CamelHttp*", Exchange.HTTP_METHOD, Exchange.HTTP_URI)
			.serviceCall()
				.name("acme-pay")
				.expression()
				.simple("undertow:http://${header.CamelServiceCallServiceHost}:${header.CamelServiceCallServicePort}${header.CamelHttpUri}")
		.end();

		from("direct:greeting").streamCaching().transform().constant("Hello Camel World! I am api-gateway").end();
/*
		rest().enableCORS(true)
			.get("/greeting").produces("text/plain").to("direct:greeting")
			.get("/gateway")
				.route()
				.multicast(AggregationStrategies.flexible().accumulateInCollection(ArrayList.class))
				.parallelProcessing()
					.to("direct:microprofile")
					.to("direct:springboot").end()
				.convertBodyTo(String.class).marshal().json(JsonLibrary.Jackson).endRest();
				*/
	}
}
