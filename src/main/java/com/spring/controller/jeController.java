package com.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.jeService;

import org.springframework.http.ResponseEntity;

import java.util.List;


@RestController
public class jeController {

    @Autowired
    private jeService dataService;

    
    @RequestMapping("/saveData222222")
    public ResponseEntity<String> saveData(@RequestBody List<List<Object>> data) {
    	System.out.println("data: "+data);
        try {
        	System.out.println("controller");
            //dataService.saveData(data);
            return ResponseEntity.ok("Data saved successfully!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error saving data: " + e.getMessage());
        }
    }
    
    @RequestMapping("")
    public ModelAndView test(){
    	
    	//System.out.println("inside test controller");
    	return new ModelAndView("index");
        
    }
    
}
