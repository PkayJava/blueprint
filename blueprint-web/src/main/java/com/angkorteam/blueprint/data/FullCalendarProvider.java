package com.angkorteam.blueprint.data;

import com.angkorteam.webui.frmk.wicket.markup.html.FullCalendarItem;
import org.joda.time.LocalDate;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FullCalendarProvider extends com.angkorteam.webui.frmk.wicket.markup.html.FullCalendarProvider {

    public FullCalendarProvider() {
    }

    @Override
    public List<FullCalendarItem> query(Date start, Date end) {
        FullCalendarItem item = new FullCalendarItem();
        item.setStart(LocalDate.now().minusDays(5).toDate());
        item.setTitle("Title");
//        item.setUrl("url");
//        item.setResourceId("resourceId");
        return Arrays.asList(item);
    }

}
