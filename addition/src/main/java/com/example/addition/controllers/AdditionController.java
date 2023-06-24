package com.example.addition.controllers;


import com.example.addition.model.AdditionResponse;
import com.example.addition.model.RequestParameters;
import com.example.addition.service.AddRespService;
import com.example.addition.utility.Addition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/add")
public class AdditionController {
    @Autowired
    Addition addition;
    @Autowired
    AddRespService addRespService;
    @PostMapping("/body")
    public ResponseEntity<AdditionResponse> addNumbers1(@RequestBody RequestParameters requestParameters){
        Integer result = addition.addition(requestParameters.getParam1(), requestParameters.getParam2());
        AdditionResponse additionResponse= addRespService.getAdditionResponse(requestParameters.getParam1(),requestParameters.getParam2(),result);
        return new ResponseEntity<>(additionResponse, HttpStatus.OK);
    }

    @PostMapping("/param")
    public ResponseEntity<AdditionResponse> addNumbers2(@RequestParam("paramA") Integer a, @RequestParam("paramB") Integer b){
        Integer result = addition.addition(a, b);
        AdditionResponse additionResponse= addRespService.getAdditionResponse(a,b,result);
        return new ResponseEntity<>(additionResponse, HttpStatus.OK);
    }
}
