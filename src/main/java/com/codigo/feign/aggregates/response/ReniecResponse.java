package com.codigo.feign.aggregates.response;

import lombok.Getter;
import lombok.Setter;

//cuando consumimos un api, necesito una clase para la respuesta
@Getter
@Setter
public class ReniecResponse {
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String tipoDocumento;
    private String numeroDocumento;
    private String digitoVerificador;

}
