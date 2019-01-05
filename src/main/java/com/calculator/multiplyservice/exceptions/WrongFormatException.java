package com.calculator.multiplyservice.exceptions;

import com.calculator.multiplyservice.enums.APIResponseCodeENUM;

/**
 * Created by akashdeepnew on 20/12/18.
 */
public class WrongFormatException extends APIBaseException {
    public WrongFormatException() {
        super(APIResponseCodeENUM.WRONG_FORMAT);
    }
}
