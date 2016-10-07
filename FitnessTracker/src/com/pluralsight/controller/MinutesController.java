package com.pluralsight.controller;

import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WeichengXu on 10/5/2016.
 */
@Controller
@RequestMapping(value="/fitnesstracker")
public class MinutesController {

    @RequestMapping(value="/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise ) {
        System.out.println("exercise: " + exercise.getMinutes());
        return "addMinutes";
    }
//    @RequestMapping(value="/addMinutes")
//    public String addMinutes(@ModelAttribute("exercise") Exercise exercise ) {
//        System.out.println("exercise: " + exercise.getMinutes());
//        return "redirect:addMoreMinutes.html";
//        return "forward:addMoreMinutes.html";
//    }

//    @RequestMapping(value="/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise ) {
//        System.out.println("exercising: " + exercise.getMinutes());
//        return "addMinutes";
//    }
}
