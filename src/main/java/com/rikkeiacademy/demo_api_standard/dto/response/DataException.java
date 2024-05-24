package com.rikkeiacademy.demo_api_standard.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DataException<T> {
    private T mesasge;
    private HttpStatus httpStatus;
}
