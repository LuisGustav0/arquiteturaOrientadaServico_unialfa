package acme.pay.resources;

import java.io.IOException;
import java.util.Date;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import acme.travel.model.CarReserve;
import acme.travel.model.ServiceStatus;
import acme.travel.model.ServiceType;

public class Pojo2Json {
	
	@Test
    public void car2JsonTransform() 
    {
		CarReserve reserve = new CarReserve();

		reserve.setCustomer("Joao");
		reserve.setEndDay(new Date());
		reserve.setInitialDay(new Date());
		reserve.setName("Prisma");
		reserve.setPrice(30F);
		reserve.setStatus(ServiceStatus.PENDING_PAYMENT);
		reserve.setType(ServiceType.CAR);
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            //Use pretty print for printing the output
            String beutifulJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(reserve);
            System.out.println(beutifulJson);
 
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
