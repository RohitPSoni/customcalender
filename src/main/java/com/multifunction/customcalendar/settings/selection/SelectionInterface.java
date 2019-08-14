package com.multifunction.customcalendar.settings.selection;

import com.multifunction.customcalendar.utils.SelectionType;

public interface SelectionInterface {

    @SelectionType
    int getSelectionType();

    void setSelectionType(@SelectionType int selectionType);
}
