package com.mealkit.apibridge.composite.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ServiceAddresses {
    private String cmp;
    private String pro;
    private String rev;
    private String rec;

    public ServiceAddresses(){
        this.cmp = null;
        this.pro = null;
        this.rev = null;
        this.rec = null;
    }
}
