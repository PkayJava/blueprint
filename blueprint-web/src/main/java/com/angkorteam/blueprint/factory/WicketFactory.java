package com.angkorteam.blueprint.factory;

import com.angkorteam.blueprint.pages.Home1Page;
import com.angkorteam.blueprint.pages.LoginPage;
import com.angkorteam.webui.frmk.common.AuthenticatedWicketFactory;
import org.apache.wicket.Page;
import org.apache.wicket.authroles.authentication.AbstractAuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WicketFilter;

public class WicketFactory extends AuthenticatedWicketFactory {

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public Class<? extends Page> getHomePage() {
        WebSession session = (WebSession) WebSession.get();
        if (session != null) {
            Roles roles = session.getRoles();
            if (roles != null && session.isSignedIn()) {
                return Home1Page.class;
            }
        }
        return LoginPage.class;
    }

    @Override
    public void destroy(WicketFilter filter) {
    }

    @Override
    protected Class<? extends AbstractAuthenticatedWebSession> getWebSessionClass() {
        return WebSession.class;
    }

    @Override
    protected Class<? extends WebPage> getSignInPageClass() {
        return LoginPage.class;
    }

}
