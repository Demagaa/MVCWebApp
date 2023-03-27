package com.test.mvcwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Aleksei Chursin
 */

@Controller
public class ExitController {
    @GetMapping("/exit")
    public String exit(){
        return "exit/exit";
    }
}
