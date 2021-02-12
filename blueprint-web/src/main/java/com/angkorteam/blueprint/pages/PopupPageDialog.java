package com.angkorteam.blueprint.pages;

import com.angkorteam.webui.frmk.wicket.layout.MasterPage;
import com.angkorteam.webui.frmk.wicket.markup.html.panel.Panel;
import org.apache.wicket.MarkupContainer;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;

public class PopupPageDialog extends Panel {

    private AjaxLink<Void> okayButton;

    public PopupPageDialog(String id) {
        super(id);
    }

    @Override
    protected void onInitData() {
    }

    @Override
    protected void onInitHtml(MarkupContainer body) {
        this.okayButton = new AjaxLink<Void>("okayButton") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                ((MasterPage) getPage()).getModalDialog().close(target);
            }
        };
        body.add(this.okayButton);
    }

}
