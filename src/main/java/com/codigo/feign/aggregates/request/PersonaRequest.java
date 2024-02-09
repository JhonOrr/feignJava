package com.codigo.feign.aggregates.request;

import lombok.Getter;
import lombok.Setter;
//esto es para mandar al Api
@Getter
@Setter
public class PersonaRequest {
    private String tipoDoc;
    private String numDoc;
}
