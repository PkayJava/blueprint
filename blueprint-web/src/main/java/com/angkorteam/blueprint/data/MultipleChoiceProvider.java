package com.angkorteam.blueprint.data;

import com.angkorteam.webui.frmk.common.WicketFactory;
import com.angkorteam.webui.frmk.wicket.markup.html.form.select2.Option;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MultipleChoiceProvider extends com.angkorteam.webui.frmk.wicket.markup.html.form.select2.MultipleChoiceProvider {

    public MultipleChoiceProvider(String table, String idField) {
        super(table, idField);
    }

    public MultipleChoiceProvider(String table, String idField, String queryField) {
        super(table, idField, queryField);
    }

    public MultipleChoiceProvider(String table, String idField, String queryField, String orderBy) {
        super(table, idField, queryField, orderBy);
    }

    public MultipleChoiceProvider(String table, String idField, String queryField, String orderBy, String labelField) {
        super(table, idField, queryField, orderBy, labelField);
    }

    @Override
    protected Option queryOption(String query, Map<String, Object> params) {
        ApplicationContext context = WicketFactory.getApplicationContext();
        DataSource dataSource = context.getBean(DataSource.class);
        NamedParameterJdbcOperations named = new NamedParameterJdbcTemplate(dataSource);
        Map<String, Object> record = null;
        try {
            record = named.queryForMap(query, params);
        } catch (DataAccessException e) {
        }
        if (record == null) {
            return null;
        } else {
            return new Option((String) record.get("id"), (String) record.get("text"));
        }
    }

    @Override
    protected List<Option> queryOptions(String query, Map<String, Object> params) {
        ApplicationContext context = WicketFactory.getApplicationContext();
        DataSource dataSource = context.getBean(DataSource.class);
        NamedParameterJdbcOperations named = new NamedParameterJdbcTemplate(dataSource);
        List<Map<String, Object>> records = named.queryForList(query, params);
        List<Option> options = new ArrayList<>(records.size());
        for (Map<String, Object> record : records) {
            options.add(new Option((String) record.get("id"), (String) record.get("text")));
        }
        return options;
    }
}
