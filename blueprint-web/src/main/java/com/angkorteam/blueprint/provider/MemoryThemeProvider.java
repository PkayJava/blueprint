package com.angkorteam.blueprint.provider;

import com.angkorteam.webui.frmk.model.BrandColor;
import com.angkorteam.webui.frmk.model.Theme;
import com.angkorteam.webui.frmk.provider.IThemeProvider;

public class MemoryThemeProvider implements IThemeProvider {

    @Override
    public Theme fetchTheme() {
        Theme theme = new Theme();
        theme.setBrandColor(BrandColor.Light);
        return theme;
    }

}
