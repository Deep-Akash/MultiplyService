package com.calculator.multiplyservice.controller;

import com.calculator.multiplyservice.enums.APIResponseCodeENUM;
import com.calculator.multiplyservice.exceptions.APIBaseException;
import com.calculator.multiplyservice.model.request.OperationRequest;
import com.calculator.multiplyservice.model.response.APIResponse;
import com.calculator.multiplyservice.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * Created by akashdeepnew on 20/12/18.
 */
@RestController
@RequestMapping(value = "/multiply")
public class MultiplyOperationController {

    @Autowired
    private MultiplyService multiplyService;

    @Autowired
    private ValidationService validateService;


    @PostMapping("/calculate")
    @ResponseBody
    public APIResponse calculate(@RequestBody OperationRequest operationRequest) throws Exception {
        validateService.validateServiceRequest(operationRequest);
        return APIResponse.buildSuccess(multiplyService.multiply(operationRequest));
    }

    @GetMapping("/cost")
    @ResponseBody
    public APIResponse creditCost() throws Exception {
        return APIResponse.buildSuccess(multiplyService.getCreditCost());
    }


    @ExceptionHandler
    @ResponseBody
    public APIResponse handleException(Exception ex) {
        if (ex instanceof APIBaseException){
            return APIResponse.buildFailure(((APIBaseException) ex).getApiResponseCodeENUM());
        }
        return APIResponse.buildFailure(APIResponseCodeENUM.GENERAL_FAILURE);
    }
}
