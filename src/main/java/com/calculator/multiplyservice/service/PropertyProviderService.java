package com.calculator.multiplyservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * Created by akashdeepnew on 20/12/18.
 */
@RefreshScope
@Service
public class PropertyProviderService {

    @Value("${operation.credit.cost:2.3}")
    private Double creditCost;

    public Double getCreditCost() {
        return creditCost;
    }
}
