package com.angkorteam.blueprint.dao.meta;

import com.angkorteam.metamodel.AbstractTable;
import org.apache.metamodel.DataContext;
import org.apache.metamodel.schema.Column;

public class Group extends AbstractTable {

    public final Column ID;

    public final Column NAME;

    public final Column ENABLED;

    public final Column SYSTEM_DEFINED;

    public final Column DESCRIPTION;

    public static Group staticInitialize(DataContext dataContext) {
        return new Group(dataContext);
    }

    private Group(DataContext dataContext) {
        super(dataContext, "tbl_group");
        this.ID = getInternalColumnByName("group_id");
        this.ENABLED = getInternalColumnByName("enabled");
        this.NAME = getInternalColumnByName("name");
        this.SYSTEM_DEFINED = getInternalColumnByName("system_defined");
        this.DESCRIPTION = getInternalColumnByName("description");
    }

}
