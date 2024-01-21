package com.app.mycontroller.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex/*")
@Slf4j
public class ExampleController {
    public void ex01(){
        log.info("ex01")
    }
}
