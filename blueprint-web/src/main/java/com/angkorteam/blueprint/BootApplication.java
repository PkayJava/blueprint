package com.angkorteam.blueprint;

import com.angkorteam.webui.frmk.common.WicketFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootApplication.class, args);
    }

    public static ApplicationContext getApplicationContext() {
        return WicketFactory.getApplicationContext();
    }

}
