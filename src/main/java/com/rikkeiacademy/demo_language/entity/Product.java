package com.rikkeiacademy.demo_language.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private Integer proId;
    private String proName;
    private String producer;
    private Integer yearMaking;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date expireDate;
    private Double price;
}
