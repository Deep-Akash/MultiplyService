package com.calculator.multiplyservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by akashdeepnew on 20/12/18.
 */
@Service
public class PropertyProviderService {

    @Value("${operation.credit.cost:2.3}")
    private Double creditCost;

    public Double getCreditCost() {
        return creditCost;
    }
}
