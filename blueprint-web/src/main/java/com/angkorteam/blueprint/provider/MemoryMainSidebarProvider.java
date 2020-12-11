package com.angkorteam.blueprint.provider;

import com.angkorteam.blueprint.BootApplication;
import com.angkorteam.blueprint.pages.*;
import com.angkorteam.webui.frmk.model.Brand;
import com.angkorteam.webui.frmk.model.MainSidebar;
import com.angkorteam.webui.frmk.model.UserPanel;
import com.angkorteam.webui.frmk.model.menu.sidebar.SidebarMenu;
import com.angkorteam.webui.frmk.model.menu.sidebar.SidebarMenuItem;
import com.angkorteam.webui.frmk.provider.IMainSidebarProvider;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.resource.PackageResourceReference;

import java.util.ArrayList;
import java.util.List;

public class MemoryMainSidebarProvider implements IMainSidebarProvider {

    private long userId;

    public MemoryMainSidebarProvider() {
    }

    @Override
    public MainSidebar fetchMainSidebar() {
        Brand brand = new Brand("Blueprint", new PackageResourceReference(BootApplication.class, "user.png"), (Class<? extends WebPage>) WebApplication.get().getHomePage());
        UserPanel userPanel = new UserPanel(new PackageResourceReference(BootApplication.class, "user.png"), "VIP User", ProfilePage.class);
        List<SidebarMenu> sidebarMenu = new ArrayList<>();
        sidebarMenu.add(new SidebarMenuItem("fas fa-home", "Home 1", null, Home1Page.class));
        sidebarMenu.add(new SidebarMenuItem("fas fa-home", "Home 2", null, Home2Page.class));
        sidebarMenu.add(new SidebarMenuItem("fas fa-home", "Data", null, DataPage.class));
        sidebarMenu.add(new SidebarMenuItem("fas fa-home", "Tab", null, TabPage.class));
        sidebarMenu.add(new SidebarMenuItem("fas fa-home", "Form", null, FormPage.class));
        sidebarMenu.add(new SidebarMenuItem("fas fa-home", "Text Area", null, TextAreaPage.class));
        sidebarMenu.add(new SidebarMenuItem("fas fa-home", "Dialog", null, PopupPage.class));
        sidebarMenu.add(new SidebarMenuItem("fas fa-sign-out-alt", "Logout", null, LogoutPage.class));

        MainSidebar mainSidebar = new MainSidebar();
        mainSidebar.setBrand(brand);
        mainSidebar.setUserPanel(userPanel);
        mainSidebar.setSidebarMenu(sidebarMenu);
        mainSidebar.setSearchable(false);
        return mainSidebar;
    }

}
