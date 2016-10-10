package com.pluralsight.controller;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value="/activities", method= RequestMethod.GET)
    public @ResponseBody
    List<Activity> findAllActivities(){
        List<Activity> activities = new ArrayList<Activity>();

        Activity run = new Activity();
        run.setDesc("Run");
        activities.add(run);

        Activity bike = new Activity();
        run.setDesc("bike");
        activities.add(bike);

        Activity swim = new Activity();
        run.setDesc("swim");
        activities.add(swim);

        return activities;
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
