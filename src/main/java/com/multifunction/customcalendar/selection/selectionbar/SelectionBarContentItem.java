package com.multifunction.customcalendar.selection.selectionbar;

import com.multifunction.customcalendar.model.Day;

public class SelectionBarContentItem implements SelectionBarItem {

    private Day day;

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public SelectionBarContentItem(Day day) {
        this.day = day;
    }
}

