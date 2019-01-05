package com.calculator.multiplyservice.service;

import com.calculator.multiplyservice.model.request.OperationRequest;
import com.calculator.multiplyservice.model.response.OperationResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by akashdeepnew on 20/12/18.
 */
@Service
public class MultiplyService {

    @Autowired
    private PropertyProviderService propertyProviderService;

    public OperationResultResponse multiply(OperationRequest request) {
        BigDecimal result = multiply(request.getFirstNumber(),request.getSecondNumber());
        return new OperationResultResponse(result,getCreditCost());
    }

    private BigDecimal multiply(BigDecimal first, BigDecimal second) {
        return first.multiply(second);
    }

    public Double getCreditCost() {
        return propertyProviderService.getCreditCost();
    }

}
