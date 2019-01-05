package com.calculator.multiplyservice.exceptions;

import com.calculator.multiplyservice.enums.APIResponseCodeENUM;

/**
 * Created by akashdeepnew on 20/12/18.
 */
public class APIBaseException extends Exception{
    private APIResponseCodeENUM apiResponseCodeENUM;

    public APIBaseException(APIResponseCodeENUM apiResponseCodeENUM) {
        this.apiResponseCodeENUM = apiResponseCodeENUM;
    }
    public APIResponseCodeENUM getApiResponseCodeENUM() {
        return apiResponseCodeENUM;
    }
}
