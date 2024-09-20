package com.thirdApp.demoThirdApp.controller;

import org.springframework.web.bind.annotation.*;

import com.thirdApp.demoThirdApp.pojo.Numbers;

@RestController
@RequestMapping("/api")
public class AddController {

    // Add two numbers using query parameters
    @GetMapping("/add")
    public int addNumbers(@RequestParam int num1, @RequestParam int num2) {
    	int sum = num1 + num2;
    	System.out.println(sum);
        return sum;
    }
    
 // Add two numbers using a POST request with a JSON body
    @PostMapping("/add")
    public int addNumbers(@RequestBody Numbers numbers) {
    	System.out.println(numbers.getNum1()+numbers.getNum2());
        return numbers.getNum1() + numbers.getNum2();
    }
}

