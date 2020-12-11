package com.angkorteam.blueprint;

import com.angkorteam.blueprint.factory.WebSession;
import com.angkorteam.blueprint.provider.MemoryMainSidebarProvider;
import com.angkorteam.blueprint.provider.MemoryThemeProvider;
import com.angkorteam.blueprint.provider.MemoryFooterProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public abstract class MasterPage extends com.angkorteam.webui.frmk.wicket.layout.MasterPage {

    public MasterPage() {
    }

    public MasterPage(IModel<?> model) {
        super(model);
    }

    public MasterPage(PageParameters parameters) {
        super(parameters);
    }

    @Override
    protected void onInitData() {
        this.mainSidebarProvider = new MemoryMainSidebarProvider();
        this.footerProvider = new MemoryFooterProvider();
        this.themeProvider = new MemoryThemeProvider();
    }

    @Override
    public WebSession getSession() {
        return (WebSession) super.getSession();
    }

}
