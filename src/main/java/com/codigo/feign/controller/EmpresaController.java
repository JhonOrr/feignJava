package com.codigo.feign.controller;

import com.codigo.feign.aggregates.response.BaseResponse;
import com.codigo.feign.service.EmpresaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/empresa")
public class EmpresaController {
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService){
        this.empresaService = empresaService;
    }

    @GetMapping("/{numero}")
    public BaseResponse getInfoSunat(@PathVariable String numero){
        return empresaService.getInfoSunat(numero);
    }

}
