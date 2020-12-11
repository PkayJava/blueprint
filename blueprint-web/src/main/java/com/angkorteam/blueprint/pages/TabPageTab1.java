package com.angkorteam.blueprint.pages;

import com.angkorteam.webui.frmk.wicket.extensions.markup.html.tabs.ContentPanel;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.tabs.Tab;
import org.apache.wicket.extensions.markup.html.tabs.TabbedPanel;

public class TabPageTab1 extends ContentPanel {

    public TabPageTab1(String id, String name, TabbedPanel<Tab> containerPanel) {
        super(id, name, containerPanel);
    }

    @Override
    protected void initData() {
    }

    @Override
    protected void onInitHtml() {
    }

}
