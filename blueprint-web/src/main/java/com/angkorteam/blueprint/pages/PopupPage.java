package com.angkorteam.blueprint.pages;

import com.angkorteam.blueprint.MasterPage;
import com.angkorteam.webui.frmk.common.Bookmark;
import com.angkorteam.webui.frmk.wicket.layout.ModalDialog;
import org.apache.wicket.MarkupContainer;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.form.Form;

@Bookmark("/dialog")
public class PopupPage extends MasterPage {

    protected Form<Void> form;

    private AjaxButton buttonShow;

    @Override
    public void renderHead(IHeaderResponse response) {
        super.renderHead(response);
    }

    @Override
    protected void onInitHtml(MarkupContainer body) {
        this.form = new Form<>("form");
        body.add(this.form);

        this.buttonShow = new AjaxButton("buttonShow") {
            @Override
            protected void onSubmit(AjaxRequestTarget target) {
                buttonShowOnSubmit(target);
            }
        };
        this.form.add(this.buttonShow);

        body.add(this.modalDialog);

    }

    protected void buttonShowOnSubmit(AjaxRequestTarget target) {
        PopupPageDialog content = new PopupPageDialog(ModalDialog.CONTENT_ID);
        this.modalDialog.open(content, target);
    }

}
