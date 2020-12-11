package com.angkorteam.blueprint.pages;

import com.angkorteam.blueprint.MasterPage;
import com.angkorteam.webui.frmk.common.Bookmark;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.tabs.EmptyContentPanel;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.tabs.Tab;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.tabs.TabbedPanel;
import org.apache.wicket.MarkupContainer;

import java.util.ArrayList;
import java.util.List;

@Bookmark("/tab")
public class TabPage extends MasterPage {


    protected TabbedPanel tabs;

    protected Tab tab1Tab;

    protected Tab tab2Tab;

    protected Tab disabledTab;

    @Override
    protected void onInitData() {
        super.onInitData();
        this.tab1Tab = new Tab("Tab 1", "Tab 1", TabPageTab1.class);
        this.tab2Tab = new Tab("Tab 2", "Tab 2", TabPageTab2.class);
        this.disabledTab = new Tab("Disabled", "Disabled", EmptyContentPanel.class);
        this.disabledTab.setEnabled(false);
    }

    @Override
    protected void onInitHtml(MarkupContainer body) {
        List<Tab> tabs = new ArrayList<>();
        if (this.tab1Tab != null) {
            tabs.add(this.tab1Tab);
        }
        if (this.disabledTab != null) {
            tabs.add(this.disabledTab);
        }
        if (this.tab2Tab != null) {
            tabs.add(this.tab2Tab);
        }
        this.tabs = new TabbedPanel("tabs", tabs);
        body.add(this.tabs);
    }

}
