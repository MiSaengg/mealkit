package com.example.mealkit.dto;

import com.example.mealkit.model.Market;
import com.example.mealkit.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddProductRequest {
    private String product_name;
//    private String product_description;
//    private List<String> product_type;
//    private int product_stock;
//    private BigDecimal product_price;
//    private BigDecimal product_discount;
//    private List<String> product_allergy;
//    private Date product_production_date;
//    private Date product_expiration_date;
//    private byte[] product_image;
//    private String product_size;
    private Market market;

    public Product toEntity(){
        return Product
                .builder()
                .product_name(product_name)
//                .product_description(product_description)
//                .product_type(product_type)
//                .product_stock(product_stock)
//                .product_price(product_price)
//                .product_discount(product_discount)
//                .product_allergy(product_allergy)
//                .product_production_date(product_production_date)
//                .product_expiration_date(product_expiration_date)
//                .product_image(product_image)
//                .product_size(product_size)
                .market(market)
                .build();
    }
}
