package com.example.mealkit.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    @Column
    private String product_name;





    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "market_id")
    @ToString.Exclude
    private Market market;
    @Builder
    public Product(String product_name, Market market){
        this.product_name = product_name;
        this.market = market;
    }


    public void update(String product_name){
        this.product_name = product_name;
    }
}
