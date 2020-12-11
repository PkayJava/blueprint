package com.angkorteam.blueprint.dao.meta;

import com.angkorteam.metamodel.AbstractTable;
import org.apache.metamodel.DataContext;
import org.apache.metamodel.schema.Column;

public class UserGroup extends AbstractTable {

    public final Column ID;

    public final Column USER_ID;

    public final Column GROUP_ID;

    public static UserGroup staticInitialize(DataContext dataContext) {
        return new UserGroup(dataContext);
    }

    private UserGroup(DataContext dataContext) {
        super(dataContext, "tbl_user_group");
        this.ID = getInternalColumnByName("user_group_id");
        this.USER_ID = getInternalColumnByName("user_id");
        this.GROUP_ID = getInternalColumnByName("group_id");
    }

}
