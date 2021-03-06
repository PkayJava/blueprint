package com.angkorteam.blueprint.data;

import com.angkorteam.webui.frmk.common.WicketFactory;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class MySQLDataProvider extends com.angkorteam.webui.frmk.provider.MySQLDataProvider {

    public MySQLDataProvider() {
    }

    public MySQLDataProvider(String from) {
        super(from);
    }

    @Override
    protected List<Map<String, Object>> queryIterator(String query, Map<String, Object> params) {
        DataSource dataSource = WicketFactory.getApplicationContext().getBean(DataSource.class);
        NamedParameterJdbcOperations named = new NamedParameterJdbcTemplate(dataSource);
        return named.queryForList(query, params);
    }

    @Override
    protected long querySize(String query, Map<String, Object> params) {
        DataSource dataSource = WicketFactory.getApplicationContext().getBean(DataSource.class);
        NamedParameterJdbcOperations named = new NamedParameterJdbcTemplate(dataSource);
        Long size = named.queryForObject(query, params, Long.class);
        return size == null ? 0 : size;
    }

}
