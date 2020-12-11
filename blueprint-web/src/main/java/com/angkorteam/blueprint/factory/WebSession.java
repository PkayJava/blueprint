package com.angkorteam.blueprint.factory;

import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;

public class WebSession extends AuthenticatedWebSession {

    private Roles roles;

    public WebSession(Request request) {
        super(request);
    }

    @Override
    protected boolean authenticate(String username, String password) {
        this.roles = new Roles();
        return true;
    }

    @Override
    public Roles getRoles() {
        return this.roles;
    }

}
