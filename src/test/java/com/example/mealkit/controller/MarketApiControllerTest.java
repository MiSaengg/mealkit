package com.example.mealkit.controller;

import com.example.mealkit.dto.CreateMarketDto;
import com.example.mealkit.dto.UpdateMarketDto;
import com.example.mealkit.model.Market;
import com.example.mealkit.repository.MarketRepository;
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
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class MarketApiControllerTest {
    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected ObjectMapper objectMapper;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    MarketRepository marketRepository;

    @BeforeEach
    public void setMockMvc(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
                .build();
        marketRepository.deleteAll();
    }

    @DisplayName("Add Market : Successfully add the market")
    @Test
    public void addMarket() throws Exception{
        //given
        final String url = "/api/market";
        final String name = "market curly";
        final boolean admin = true;
        final String location = "1801-1001 RICHARD ST VANCOUVER BC V6B 1J6";
        final String password = "1234";
        final String ratingURL = "5678";
        final byte[] image = new byte[123];
        final String description = "description";
        final CreateMarketDto userRequest = new CreateMarketDto(name, admin, location, password, ratingURL, image, description);

        final String requestBody = objectMapper.writeValueAsString(userRequest);

        //when (Send a Request)
        ResultActions result = mockMvc.perform(post(url)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(requestBody));


        //then
        result.andExpect(status().isCreated());

        List<Market> markets = marketRepository.findAll();

        assertThat(markets.size()).isEqualTo(1);
        assertThat(markets.get(0).getName()).isEqualTo(name);
        assertThat(markets.get(0).getDescription()).isEqualTo(description);
    }

    @DisplayName("Find All Market : Successfully find the all market")
    @Test
    public void findAllMarket() throws Exception{
        final String url = "/api/market";
        final String name = "market curly";
        final boolean admin = true;
        final String location = "1801-1001 RICHARD ST VANCOUVER BC V6B 1J6";
        final String password = "1234";
        final String ratingURL = "5678";
        final byte[] image = new byte[123];
        final String description = "description";

        marketRepository.save(Market.builder()
                .name(name)
                .description(description)
                .build());

        //when
        final ResultActions resultActions = mockMvc.perform(get(url).accept(MediaType.APPLICATION_JSON));

        //then
        resultActions
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value(name))
                .andExpect((jsonPath("$[0].description").value(description)));

    }

    @DisplayName("Update Market : Successfully update the market")
    @Test
    public void updateMarket() throws Exception{
        //given
        final String url = "/api/market/{id}";
        final String name = "market curly";
        final boolean admin = true;
        final String location = "1801-1001 RICHARD ST VANCOUVER BC V6B 1J6";
        final String password = "1234";
        final String ratingURL = "5678";
        final byte[] image = new byte[123];
        final String description = "description";

        Market savedMarket = marketRepository.save(Market.builder()
                .name(name)
                .description(description)
                .build());

        final String newName = "Market Curly Awesome";
        final boolean newAdmin = false;
        final String newLocation = "1301-1001 RICHARD ST VANCOUVER BC V6B 1J6";
        final String newPassword = "1245";
        final String newRatingURL = "6780";
        final byte[] newImage = new byte[166];
        final String newDescription = "New Description";

        UpdateMarketDto request = new UpdateMarketDto(newName,newAdmin, newLocation,newPassword,newRatingURL,newImage,newDescription);

        //when
        ResultActions result = mockMvc.perform(put(url, savedMarket.getId())
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(objectMapper.writeValueAsString(request)));

        //then
        result.andExpect((status().isOk()));

        Market market = marketRepository.findById(savedMarket.getId()).get();

        assertThat(market.getName()).isEqualTo(newName);
        assertThat(market.getDescription()).isEqualTo(newDescription);

    }
}