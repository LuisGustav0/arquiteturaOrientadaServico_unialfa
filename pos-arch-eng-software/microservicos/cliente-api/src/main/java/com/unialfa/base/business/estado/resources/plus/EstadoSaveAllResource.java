package com.unialfa.base.business.estado.resources.plus;

import com.unialfa.base.business.estado.Estado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EstadoSaveAllResource extends EstadoGetServiceResource {

    @PostMapping
    default ResponseEntity<List<Estado>> saveAll(@RequestBody List<Estado> listaEstado) {
        List<Estado> listaEstadoSalvo = this.getService().saveAll(listaEstado);

        return ResponseEntity.status(HttpStatus.CREATED).body(listaEstadoSalvo);
    }
}
