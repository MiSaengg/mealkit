package com.example.mealkit.controller;

import com.example.mealkit.dto.AddProductRequest;
import com.example.mealkit.model.Market;
import com.example.mealkit.model.Product;
import com.example.mealkit.repository.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ProductApiControllerTest {
    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected ObjectMapper objectMapper;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    ProductRepository productRepository;

    @BeforeEach
    public void setMockMvc(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
                .build();
        productRepository.deleteAll();
    }

    @DisplayName("Add Product : Successfully add the product in Market")
    @Test
    public void addProduct() throws Exception{
        //given
        final String url = "/api/product";
        final String product_name = "Kimchi";
        //Market Data
        final String name = "market curly";
        final boolean admin = true;
        final String location = "1801-1001 RICHARD ST VANCOUVER BC V6B 1J6";
        final String password = "1234";
        final String ratingURL = "5678";
        final byte[] image = new byte[123];
        final String description = "description";
        final Market market = new Market(admin, name,location,password,ratingURL,image,description);

        final AddProductRequest userRequest = new AddProductRequest(product_name,market);
        final String requestBody = objectMapper.writeValueAsString(userRequest);

        //when (Send a Request)
        ResultActions result = mockMvc.perform(post(url)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(requestBody));

        //then
        result.andExpect(status().isCreated());

        List<Product> products = productRepository.findAll();

        assertThat(products.size()).isEqualTo(1);
        assertThat(products.get(0).getProduct_name()).isEqualTo(product_name);
        assertThat(products.get(0).getMarket()).isEqualTo(market);
    }




}