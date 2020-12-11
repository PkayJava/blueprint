package com.angkorteam.blueprint.provider;

import com.angkorteam.webui.frmk.model.Footer;
import com.angkorteam.webui.frmk.provider.IFooterProvider;
import org.apache.wicket.Application;
import org.apache.wicket.markup.html.WebPage;

public class MemoryFooterProvider implements IFooterProvider {

    @Override
    public Footer fetchFooter() {
        return new Footer("Angkor Team - Blueprint", "3.0", (Class<? extends WebPage>) Application.get().getHomePage());
    }

}
