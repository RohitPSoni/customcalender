package com.multifunction.customcalendar.adapter.viewholder;

import android.view.View;
import android.widget.TextView;

import com.multifunction.customcalendar.R;
import com.multifunction.customcalendar.model.Day;
import com.multifunction.customcalendar.view.CalendarView;

public class OtherDayHolder extends BaseDayHolder {

    public OtherDayHolder(View itemView, CalendarView calendarView) {
        super(itemView, calendarView);
        tvDay = (TextView) itemView.findViewById(R.id.tv_day_number);
    }

    public void bind(Day day) {
        tvDay.setText(String.valueOf(day.getDayNumber()));
        tvDay.setTextColor(calendarView.getOtherDayTextColor());
    }
}
