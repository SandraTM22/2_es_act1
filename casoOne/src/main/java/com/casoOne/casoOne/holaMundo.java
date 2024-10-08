package com.casoOne.casoOne;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaMundo {
    @RequestMapping("/")
    public String hola(){
        return "hola Mundo!";
    }
}
