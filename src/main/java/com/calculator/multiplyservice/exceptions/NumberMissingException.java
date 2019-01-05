package com.calculator.multiplyservice.exceptions;

import com.calculator.multiplyservice.enums.APIResponseCodeENUM;

/**
 * Created by akashdeepnew on 20/12/18.
 */
public class NumberMissingException extends APIBaseException {
    public NumberMissingException() {
        super(APIResponseCodeENUM.NUMBER_MISSING);
    }
}
