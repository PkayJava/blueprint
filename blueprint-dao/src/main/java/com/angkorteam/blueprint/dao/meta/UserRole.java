package com.angkorteam.blueprint.dao.meta;

import com.angkorteam.metamodel.AbstractTable;
import org.apache.metamodel.DataContext;
import org.apache.metamodel.schema.Column;

public class UserRole extends AbstractTable {

    public final Column ID;

    public final Column USER_ID;

    public final Column ROLE_ID;

    public static UserRole staticInitialize(DataContext dataContext) {
        return new UserRole(dataContext);
    }

    private UserRole(DataContext dataContext) {
        super(dataContext, "tbl_user_role");
        this.ID = getInternalColumnByName("user_role_id");
        this.USER_ID = getInternalColumnByName("user_id");
        this.ROLE_ID = getInternalColumnByName("role_id");
    }

}
