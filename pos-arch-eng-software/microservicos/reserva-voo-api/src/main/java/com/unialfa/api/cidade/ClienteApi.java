package com.unialfa.api.cidade;

import com.unialfa.api.cidade.model.Cidade;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class ClienteApi {

    @Value("${url.cliente.api}")
    private String urlClienteApi;

    public Cidade findById(Long id) {
        final RestTemplate restTemplate = new RestTemplate();

        try {
            UriComponents uri = UriComponentsBuilder.fromHttpUrl(urlClienteApi)
                                                    .path("cidade")
                                                    .path("/{id}")
                                                    .buildAndExpand( id);

            return restTemplate.getForObject(uri.toUriString(), Cidade.class);
        } catch (HttpServerErrorException | HttpClientErrorException e) {
            System.err.println("response.status: " + e.getStatusCode());
            System.err.println("response.body: " + e.getResponseBodyAsString());
        }

        return null;
    }
}
