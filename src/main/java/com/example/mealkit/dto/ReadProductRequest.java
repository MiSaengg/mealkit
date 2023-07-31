package com.example.mealkit.dto;

import com.example.mealkit.model.Market;
import com.example.mealkit.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReadProductRequest {

    private Long product_id;
    private String product_name;
    private String product_description;
    private List<String> product_type;
    private int product_stock;
    private BigDecimal product_price;
    private BigDecimal product_discount;
    private List<String> product_allergy;
    private Date product_production_date;
    private Date product_expiration_date;
    private byte[] product_image;
    private String product_size;
    private Market market;

    public ReadProductRequest(Product product) {
        this.product_id = product.getProduct_id();
        this.product_name = product.getProduct_name();
        this.product_description = product.getProduct_description();
        this.product_type = product.getProduct_type();
        this.product_stock = product.getProduct_stock();
        this.product_price = product.getProduct_price();
        this.product_discount = product.getProduct_discount();
        this.product_allergy = product.getProduct_allergy();
        this.product_production_date = product.getProduct_production_date();
        this.product_expiration_date = product.getProduct_expiration_date();
        this.product_image = product.getProduct_image();
        this.product_size = product.getProduct_size();
        this.market = product.getMarket();
    }
}
