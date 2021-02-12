package com.angkorteam.blueprint.pages;

import com.angkorteam.webui.frmk.wicket.extensions.markup.html.tabs.ContentPanel;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.tabs.Tab;
import org.apache.wicket.MarkupContainer;
import org.apache.wicket.extensions.markup.html.tabs.TabbedPanel;

import java.util.Map;

public class TabPageTab2 extends ContentPanel {

    public TabPageTab2(String id, String name, TabbedPanel<Tab> containerPanel, Map<String, Object> data) {
        super(id, name, containerPanel, data);
    }

    @Override
    protected void onInitData() {
    }

    @Override
    protected void onInitHtml(MarkupContainer body) {
    }

}
