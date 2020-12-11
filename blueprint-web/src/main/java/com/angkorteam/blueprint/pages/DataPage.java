package com.angkorteam.blueprint.pages;

import com.angkorteam.blueprint.MasterPage;
import com.angkorteam.webui.frmk.common.Bookmark;
import com.angkorteam.webui.frmk.provider.ListDataProvider;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.repeater.data.table.AbstractDataTable;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.repeater.data.table.DataTable;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.repeater.data.table.export.CSVDataExporter;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.repeater.data.table.export.ExcelDataExporter;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.repeater.data.table.export.ExportToolbar;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.repeater.data.table.filter.Column;
import com.angkorteam.webui.frmk.wicket.extensions.markup.html.repeater.data.table.filter.Expression;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.wicket.MarkupContainer;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.filter.FilterForm;
import org.apache.wicket.model.Model;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Bookmark("/data")
public class DataPage extends MasterPage {

    private List<Map<String, Object>> data;

    protected FilterForm<Map<String, Expression>> sampleBrowseForm;
    protected ListDataProvider sampleBrowseProvider;
    protected List<IColumn<Map<String, Object>, String>> sampleBrowseColumn;
    protected AbstractDataTable<Map<String, Object>, String> sampleBrowseTable;

    @Override
    protected void onInitData() {
        super.onInitData();

        this.data = new ArrayList<>(10);
        {
            Map<String, Object> record = new HashMap<>();
            record.put("name", "Socheat KHAUV");
            record.put("position", "Software Engineer");
            record.put("programing", "Java");
            record.put("experience", "15 Year");
            record.put("org", "Individual");
            record.put("age", 18);
            record.put("alive", true);
            record.put("dob", new LocalDate(LocalDate.now().getYear() - 18, LocalDate.now().monthOfYear().get(), LocalDate.now().dayOfMonth().get()).toDate());
            this.data.add(record);
        }
        {
            Map<String, Object> record = new HashMap<>();
            record.put("name", "Sophea MAK");
            record.put("position", "Software Engineer");
            record.put("programing", "Java");
            record.put("experience", "15 Year");
            record.put("org", "Individual");
            record.put("age", 18);
            record.put("alive", true);
            record.put("dob", new LocalDate(LocalDate.now().getYear() - 18, LocalDate.now().monthOfYear().get(), LocalDate.now().dayOfMonth().get()).toDate());
            this.data.add(record);
        }
        {
            Map<String, Object> record = new HashMap<>();
            record.put("name", "Somnang TANG");
            record.put("position", "Software Engineer");
            record.put("programing", "Java");
            record.put("experience", "15 Year");
            record.put("org", "Individual");
            record.put("age", 18);
            record.put("alive", true);
            record.put("dob", new LocalDate(LocalDate.now().getYear() - 18, LocalDate.now().monthOfYear().get(), LocalDate.now().dayOfMonth().get()).toDate());
            this.data.add(record);
        }
        {
            Map<String, Object> record = new HashMap<>();
            record.put("name", "Vilay ENG");
            record.put("position", "Software Engineer");
            record.put("programing", "Java");
            record.put("experience", "15 Year");
            record.put("org", "Individual");
            record.put("age", 18);
            record.put("alive", true);
            record.put("dob", new LocalDate(LocalDate.now().getYear() - 18, LocalDate.now().monthOfYear().get(), LocalDate.now().dayOfMonth().get()).toDate());
            this.data.add(record);
        }
        {
            Map<String, Object> record = new HashMap<>();
            record.put("name", "Chet BIL");
            record.put("position", "Software Engineer");
            record.put("programing", "Java");
            record.put("experience", "15 Year");
            record.put("org", "Individual");
            record.put("age", 18);
            record.put("alive", true);
            record.put("dob", new LocalDate(LocalDate.now().getYear() - 18, LocalDate.now().monthOfYear().get(), LocalDate.now().dayOfMonth().get()).toDate());
            this.data.add(record);
        }
        {
            Map<String, Object> record = new HashMap<>();
            record.put("name", "Chan Dara SANG");
            record.put("position", "Software Engineer");
            record.put("programing", "Java");
            record.put("experience", "15 Year");
            record.put("org", "Individual");
            record.put("age", 18);
            record.put("alive", true);
            record.put("dob", new LocalDate(LocalDate.now().getYear() - 18, LocalDate.now().monthOfYear().get(), LocalDate.now().dayOfMonth().get()).toDate());
            this.data.add(record);
        }
        {
            Map<String, Object> record = new HashMap<>();
            record.put("name", "Visal THORN");
            record.put("position", "Software Engineer");
            record.put("programing", "Java");
            record.put("experience", "15 Year");
            record.put("org", "Individual");
            record.put("age", 18);
            record.put("alive", true);
            record.put("dob", new LocalDate(LocalDate.now().getYear() - 18, LocalDate.now().monthOfYear().get(), LocalDate.now().dayOfMonth().get()).toDate());
            this.data.add(record);
        }
        {
            Map<String, Object> record = new HashMap<>();
            record.put("name", "Bormy CHANTHORNG");
            record.put("position", "Software Engineer");
            record.put("programing", "Java");
            record.put("experience", "15 Year");
            record.put("org", "Individual");
            record.put("age", 18);
            record.put("alive", true);
            record.put("dob", new LocalDate(LocalDate.now().getYear() - 18, LocalDate.now().monthOfYear().get(), LocalDate.now().dayOfMonth().get()).toDate());
            this.data.add(record);
        }

        this.sampleBrowseProvider = new ListDataProvider(this.data);

        this.sampleBrowseColumn = new ArrayList<>();
        this.sampleBrowseColumn.add(Column.text(Model.of("Name"), "name", "name", this.sampleBrowseProvider));
        this.sampleBrowseColumn.add(Column.number(Model.of("Age"), "age", "age", this.sampleBrowseProvider));
        this.sampleBrowseColumn.add(Column.datetime(Model.of("Birth Date"), "dob", "dob", this.sampleBrowseProvider, "dd/MM/yyyy"));
        this.sampleBrowseColumn.add(Column.yesno(Model.of("Alive"), "alive", "alive", this.sampleBrowseProvider));
        this.sampleBrowseColumn.add(Column.text(Model.of("Company / Organization"), "org", "org", this.sampleBrowseProvider));
        this.sampleBrowseColumn.add(Column.text(Model.of("Position"), "position", "position", this.sampleBrowseProvider));
        this.sampleBrowseColumn.add(Column.text(Model.of("Programing Language"), "programing", "programing", this.sampleBrowseProvider));
        this.sampleBrowseColumn.add(Column.text(Model.of("Experience"), "experience", "experience", this.sampleBrowseProvider));
    }

    @Override
    protected void onInitHtml(MarkupContainer body) {
        this.sampleBrowseForm = new FilterForm<>("sampleBrowseForm", this.sampleBrowseProvider);
        body.add(this.sampleBrowseForm);

        this.sampleBrowseTable = new DataTable<>("sampleBrowseTable", this.sampleBrowseColumn, this.sampleBrowseProvider, 3);
        this.sampleBrowseTable.addBottomToolbar(new ExportToolbar(this.sampleBrowseTable, Model.of("sample-" + DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.format(new java.util.Date()))).addDataExporter(new CSVDataExporter()).addDataExporter(new ExcelDataExporter()));
        this.sampleBrowseForm.add(this.sampleBrowseTable);
    }

}
