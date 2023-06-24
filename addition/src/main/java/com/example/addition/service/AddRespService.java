package com.example.addition.service;

import com.example.addition.model.AdditionResponse;
import com.example.addition.model.RequestParameters;
import org.springframework.stereotype.Component;

@Component
public class AddRespService {
    public AdditionResponse getAdditionResponse(Integer a, Integer b, Integer result){
        AdditionResponse additionResponse = new AdditionResponse();
        additionResponse.setParam1(a);
        additionResponse.setParam2(b);
        additionResponse.setResult(result);
        return additionResponse;
    }
}
