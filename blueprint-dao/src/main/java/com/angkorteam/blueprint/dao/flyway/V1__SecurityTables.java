package com.angkorteam.blueprint.dao.flyway;

import com.angkorteam.jdbc.query.InsertQuery;
import com.angkorteam.metamodel.LiquibaseJavaMigration;
import org.apache.metamodel.jdbc.JdbcDataContext;
import org.apache.metamodel.schema.Table;
import org.flywaydb.core.api.migration.Context;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;

public class V1__SecurityTables extends LiquibaseJavaMigration {

    @Override
    protected List<String> getXmlChecksum() {
        return Arrays.asList("V1__security_tables.xml");
    }

    @Override
    protected void doMigrate(Context context, DataSource dataSource, NamedParameterJdbcTemplate named, JdbcDataContext dataContext) throws Exception {
        // sub change 001
        updateLiquibase("V1__security_tables.xml");

        // sub change 002
        dataContext.refreshSchemas();
        Table user = dataContext.getDefaultSchema().getTableByName("tbl_user");
        insert_user(named, user, 1, true, "Socheat KHAUV", true, "Default User", "skhauv", "password");
    }

    protected void insert_user(NamedParameterJdbcTemplate named, Table table, long user_id, boolean enabled, String name, boolean system_defined, String description, String login, String password) {
        InsertQuery insertQuery = new InsertQuery(table.getName());
        insertQuery.addValue(table.getColumnByName("user_id").getName(), user_id);
        insertQuery.addValue(table.getColumnByName("name").getName(), name);
        insertQuery.addValue(table.getColumnByName("enabled").getName(), enabled);
        insertQuery.addValue(table.getColumnByName("system_defined").getName(), system_defined);
        insertQuery.addValue(table.getColumnByName("description").getName(), description);
        insertQuery.addValue(table.getColumnByName("login").getName(), login);
        insertQuery.addValue(table.getColumnByName("pwd").getName(), password);
        named.update(insertQuery.toSQL(), insertQuery.toParam());
    }

}