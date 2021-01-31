package com.angkorteam.blueprint.pages;

import com.angkorteam.webui.frmk.wicket.layout.MasterPage;
import com.angkorteam.webui.frmk.wicket.markup.html.panel.Panel;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;

public class PopupPageDialog extends Panel {

    private AjaxLink<Void> okayButton;

    public PopupPageDialog(String id) {
        super(id);
    }

    @Override
    protected void initData() {
    }

    @Override
    protected void onInitHtml() {
        this.okayButton = new AjaxLink<Void>("okayButton") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                ((MasterPage) getPage()).getModalDialog().close(target);
            }
        };
        add(this.okayButton);
    }

}
