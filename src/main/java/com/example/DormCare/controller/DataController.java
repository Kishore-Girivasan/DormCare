package com.example.DormCare.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DormCare.model.ApiResponse;
import com.example.DormCare.model.RequestData;

@RestController
@RequestMapping("/api")
public class DataController {
    @PostMapping("/receive-data")

    public ApiResponse receivedata(@RequestBody RequestData requestdata){
        String data = requestdata.getData();
        System.out.print(data);
        return new ApiResponse("Data received successfully!");
    }
    

}
