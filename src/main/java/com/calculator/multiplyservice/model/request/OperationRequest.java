package com.calculator.multiplyservice.model.request;

import java.math.BigDecimal;

/**
 * Created by akashdeepnew on 20/12/18.
 */
public class OperationRequest {
    private BigDecimal firstNumber;
    private BigDecimal secondNumber;

    public OperationRequest() {
    }

    public OperationRequest(BigDecimal firstNumber, BigDecimal secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public BigDecimal getFirstNumber() {
        return firstNumber;
    }

    public BigDecimal getSecondNumber() {
        return secondNumber;
    }

    @Override
    public String toString() {
        return "OperationRequest{" +
                "firstNumber=" + firstNumber +
                ", SecondNumber=" + secondNumber +
                '}';
    }
}
