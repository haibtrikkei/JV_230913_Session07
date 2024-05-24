package com.rikkeiacademy.demo_api_standard.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer proId;
    @Column(nullable = false)
    @NotEmpty(message ="Product name is not empty" )
    private String proName;
    private String producer;
    @NotNull(message = "Year making is empty")
    @Min(value = 1900,message = "Year making must be greater or equal than 1900")
    private Integer yearMaking;
    @Min(value = 0,message = "Price must be greater or equal than zeo")
    @NotNull(message = "Price is empty")
    private Double price;
}
