package com.achyut.SimipleWebApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class Product {


    @Id int prodId;
    private String prodName;
    private int prodPrice;


}
