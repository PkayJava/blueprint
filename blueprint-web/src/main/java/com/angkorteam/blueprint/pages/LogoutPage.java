package com.angkorteam.blueprint.pages;

import com.angkorteam.blueprint.factory.WebSession;
import com.angkorteam.webui.frmk.common.Bookmark;
import org.apache.wicket.markup.html.WebPage;

@Bookmark("/logout")
public class LogoutPage extends WebPage {

    @Override
    protected void onInitialize() {
        super.onInitialize();
        ((WebSession) getSession()).signOut();
        setResponsePage(getApplication().getHomePage());
    }

}
