package com.codigo.feign.service;

import com.codigo.feign.aggregates.response.BaseResponse;

public interface EmpresaService {
    BaseResponse getInfoSunat(String ruc);
}
