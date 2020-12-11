package com.angkorteam.blueprint.dao.meta;

import com.angkorteam.metamodel.AbstractTable;
import org.apache.metamodel.DataContext;
import org.apache.metamodel.schema.Column;

public class Role extends AbstractTable {

    public final Column ID;

    public final Column NAME;

    public final Column ENABLED;

    public final Column DESCRIPTION;

    public static Role staticInitialize(DataContext dataContext) {
        return new Role(dataContext);
    }

    private Role(DataContext dataContext) {
        super(dataContext, "tbl_role");
        this.ID = getInternalColumnByName("role_id");
        this.ENABLED = getInternalColumnByName("enabled");
        this.NAME = getInternalColumnByName("name");
        this.DESCRIPTION = getInternalColumnByName("description");
    }

}
