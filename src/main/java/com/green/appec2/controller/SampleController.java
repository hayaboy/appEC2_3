package com.green.appec2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @RequestMapping("/getArr")
    public String [] getArr(){
        return new String[]{"jajjang,jjamppong,bibim"};
    }


}
