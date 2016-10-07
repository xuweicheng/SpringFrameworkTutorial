package com.pluralsight.model;

import org.hibernate.validator.constraints.Range;

/**
 * Created by WeichengXu on 10/6/2016.
 */
public class Goal {

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Range(min=1, max=120)
    private int minutes;
}
