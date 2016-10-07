/**
 * Created by WeichengXu on 10/4/2016.
 */
package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="/fitnesstracker")
public class HelloController {

    @RequestMapping(value="/greeting")
    public String sayHello (Model model){

        model.addAttribute("greeting", "Finally Hello World");

        return "hello";
    }
}
