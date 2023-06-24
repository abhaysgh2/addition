package com.example.addition.utility;

import org.springframework.stereotype.Component;

@Component
public class Addition {
    public Integer addition(Integer param1, Integer param2){
        return param1 + param2;
    }
}
