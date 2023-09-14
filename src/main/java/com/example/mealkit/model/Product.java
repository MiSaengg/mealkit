package com.example.mealkit.model;

import com.example.mealkit.dto.UpdateProductRequest;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    @Column(nullable = false)
    private String product_name;

    @Column
    private String product_description;

    @ElementCollection
    private List<String> product_type;

    @Column
    private int product_stock;

    @Column
    private BigDecimal product_price;

    @Column
    private BigDecimal product_discount;

    @ElementCollection
    private List<String> product_allergy;

    @Column
    private Date product_production_date;

    @Column
    private Date product_expiration_date;

    @Lob
    @Column
    private byte[] product_image;

    @Column
    private String product_size;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "market_id")
    @ToString.Exclude
    private Market market;

    @Builder
    public Product(String product_name, String product_description, List<String> product_type, int product_stock,
                   BigDecimal product_price, BigDecimal product_discount, List<String> product_allergy,
                   Date product_production_date, Date product_expiration_date, byte[] product_image,
                   String product_size, Market market) {
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_type = product_type;
        this.product_stock = product_stock;
        this.product_price = product_price;
        this.product_discount = product_discount;
        this.product_allergy = product_allergy;
        this.product_production_date = product_production_date;
        this.product_expiration_date = product_expiration_date;
        this.product_image = product_image;
        this.product_size = product_size;
        this.market = market;
    }

    public void update(String product_name, String product_description, List<String> product_type, int product_stock,
                       BigDecimal product_price, BigDecimal product_discount, List<String> product_allergy,
                       Date product_production_date, Date product_expiration_date, byte[] product_image,
                       String product_size, Market market){
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_type = product_type;
        this.product_stock = product_stock;
        this.product_price = product_price;
        this.product_discount = product_discount;
        this.product_allergy = product_allergy;
        this.product_production_date = product_production_date;
        this.product_expiration_date = product_expiration_date;
        this.product_image = product_image;
        this.product_size = product_size;
        this.market = market;
    }


    public void update(String product_name){
        this.product_name = product_name;
    }
}

