package com.unialfa.base.api.reservavoo;

import com.unialfa.base.api.reservavoo.model.ReservaVoo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class ReservaVooApi {

    @Value("${url.reserva.voo.api}")
    private String urlReservaVoo;

    public ReservaVoo save(final ReservaVoo reservaVoo) {
        final RestTemplate restTemplate = new RestTemplate();

        try {
            UriComponentsBuilder uri = UriComponentsBuilder.fromHttpUrl(urlReservaVoo).path("reserva-voo");

            return restTemplate.postForObject(uri.toUriString(), reservaVoo, ReservaVoo.class);
        } catch (HttpServerErrorException | HttpClientErrorException e) {
            System.err.println("response.status: " + e.getStatusCode());
            System.err.println("response.body: " + e.getResponseBodyAsString());
        }

        return null;
    }
}
