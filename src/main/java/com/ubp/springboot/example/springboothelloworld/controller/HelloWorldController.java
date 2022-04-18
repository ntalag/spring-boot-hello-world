package com.ubp.springboot.example.springboothelloworld.controller;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// import org.json.simple.JSONValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
@GetMapping("/hello-world")
public String HelloWorld(){
    Map<String, Object> report = new HashMap<>();
    report.put("Greeting", "Hello World");
    report.put("appUser", System.getenv("appUser"));
    report.put("appSecret", System.getenv("appSecretkey"));
    String jsonResult="";
    ObjectMapper mapper = new ObjectMapper();
    try {
         jsonResult = mapper.writeValueAsString(report);
    } catch (JsonProcessingException e) {
        
        e.printStackTrace();
    }
     
     return jsonResult;

    // return "Hello World: " + System.getenv("appUser");
}

}