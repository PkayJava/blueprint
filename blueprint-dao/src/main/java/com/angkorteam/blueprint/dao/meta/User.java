package com.angkorteam.blueprint.dao.meta;

import com.angkorteam.metamodel.AbstractTable;
import org.apache.metamodel.DataContext;
import org.apache.metamodel.schema.Column;

public class User extends AbstractTable {

    public final Column ID;

    public final Column NAME;

    public final Column ENABLED;

    public final Column SYSTEM_DEFINED;

    public final Column DESCRIPTION;

    public final Column LOGIN;

    public final Column PASSWORD;

    public static User staticInitialize(DataContext dataContext) {
        return new User(dataContext);
    }

    private User(DataContext dataContext) {
        super(dataContext, "tbl_user");
        this.ID = getInternalColumnByName("user_id");
        this.ENABLED = getInternalColumnByName("enabled");
        this.NAME = getInternalColumnByName("name");
        this.SYSTEM_DEFINED = getInternalColumnByName("system_defined");
        this.DESCRIPTION = getInternalColumnByName("description");
        this.LOGIN = getInternalColumnByName("login");
        this.PASSWORD = getInternalColumnByName("pwd");
    }

}
