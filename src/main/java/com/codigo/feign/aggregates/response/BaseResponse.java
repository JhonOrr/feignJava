package com.codigo.feign.aggregates.response;

import lombok.*;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class BaseResponse {
    private int code;
    private String message;
    private Optional data;
}
