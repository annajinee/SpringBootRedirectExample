package com.example.demo;


import org.springframework.web.bind.annotation.*;


/**
 * Created by annakim on 7/24/17.
 */

@RestController
public class SampleController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String event(){
        System.out.println("왔음");
        return "Hello World!";
    }
}
