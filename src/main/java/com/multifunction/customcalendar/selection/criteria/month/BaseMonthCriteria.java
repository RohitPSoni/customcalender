package com.multifunction.customcalendar.selection.criteria.month;

import com.multifunction.customcalendar.model.Day;
import com.multifunction.customcalendar.selection.criteria.BaseCriteria;

import java.util.Calendar;

public abstract class BaseMonthCriteria extends BaseCriteria {

    protected abstract int getMonth();

    protected abstract int getYear();

    @Override
    public boolean isCriteriaPassed(Day day) {
        return day.getCalendar().get(Calendar.MONTH) == getMonth()
                && day.getCalendar().get(Calendar.YEAR) == getYear();
    }
}
