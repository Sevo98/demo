package com.example.demo.controllers;

import com.example.demo.domain.*;
import com.example.demo.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusinessController {
    private BusinessRepository businessRepository;

    @Autowired
    public BusinessController(BusinessRepository businessRepository){
        this.businessRepository = businessRepository;
    }

    @GetMapping("/getBusinessList")
    public List<Business> allBusiness(){
        return businessRepository.findAll();
    }
}
