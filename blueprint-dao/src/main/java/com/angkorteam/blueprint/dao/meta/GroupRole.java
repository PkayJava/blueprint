package com.angkorteam.blueprint.dao.meta;

import com.angkorteam.metamodel.AbstractTable;
import org.apache.metamodel.DataContext;
import org.apache.metamodel.schema.Column;

public class GroupRole extends AbstractTable {

    public final Column ID;

    public final Column GROUP_ID;

    public final Column ROLE_ID;

    public static GroupRole staticInitialize(DataContext dataContext) {
        return new GroupRole(dataContext);
    }

    private GroupRole(DataContext dataContext) {
        super(dataContext, "tbl_group_role");
        this.ID = getInternalColumnByName("group_role_id");
        this.GROUP_ID = getInternalColumnByName("group_id");
        this.ROLE_ID = getInternalColumnByName("role_id");
    }

}
