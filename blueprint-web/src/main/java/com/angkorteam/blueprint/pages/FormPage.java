package com.angkorteam.blueprint.pages;

import com.angkorteam.blueprint.MasterPage;
import com.angkorteam.webui.frmk.common.Bookmark;
import com.angkorteam.webui.frmk.wicket.layout.Size;
import com.angkorteam.webui.frmk.wicket.layout.UIColumn;
import com.angkorteam.webui.frmk.wicket.layout.UIContainer;
import com.angkorteam.webui.frmk.wicket.layout.UIRow;
import com.angkorteam.webui.frmk.wicket.markup.html.form.*;
import com.angkorteam.webui.frmk.wicket.markup.html.form.select2.*;
import org.apache.wicket.MarkupContainer;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Bookmark("/form")
public class FormPage extends MasterPage {

    protected Form<Void> form;

    protected UIRow row1;

    protected ISingleChoiceProvider sample1Provider;
    protected UIColumn sample1Column;
    protected UIContainer sample1Container;
    protected Select2SingleChoice sample1Field;
    protected Option sample1Value;

    protected IMultipleChoiceProvider sample2Provider;
    protected UIColumn sample2Column;
    protected UIContainer sample2Container;
    protected Select2MultipleChoice sample2Field;
    protected List<Option> sample2Value;

    protected SmartTextProvider sample3Provider;
    protected UIColumn sample3Column;
    protected UIContainer sample3Container;
    protected SmartTextField sample3Field;
    protected String sample3Value;

    protected UIRow row2;

    protected UIColumn sample4Column;
    protected UIContainer sample4Container;
    protected DateTextField sample4Field;
    protected Date sample4Value;

    protected UIColumn sample5Column;
    protected UIContainer sample5Container;
    protected ColorTextField sample5Field;
    protected String sample5Value;

    protected UIColumn sample6Column;
    protected UIContainer sample6Container;
    protected DateTimeTextField sample6Field;
    protected Date sample6Value;

    protected UIRow row3;

    protected UIColumn sample7Column;
    protected UIContainer sample7Container;
    protected TimeTextField sample7Field;
    protected Date sample7Value;

    protected UIColumn sample8Column;
    protected UIContainer sample8Container;
    protected DayMonthTextField sample8Field;
    protected Date sample8Value;

    protected UIColumn sample9Column;
    protected UIContainer sample9Container;
    protected IPTextField sample9Field;
    protected String sample9Value;

    protected UIColumn sample10Column;
    protected UIContainer sample10Container;
    protected MonthYearTextField sample10Field;
    protected String sample10Value;

    @Override
    protected void onInitData() {
        super.onInitData();
        List<Option> options = Arrays.asList(
                new Option("Monday", "Monday")
                , new Option("Tuesday", "Tuesday")
                , new Option("Wednesday", "Wednesday")
                , new Option("Thursday", "Thursday")
                , new Option("Friday", "Friday")
                , new Option("Saturday", "Saturday")
                , new Option("Sunday", "Sunday")
        );
        this.sample1Provider = new MemorySingleChoiceProvider(options);
        this.sample2Provider = new MemoryMultipleChoiceProvider(options);
        this.sample3Provider = new MemorySmartTextProvider(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }

    @Override
    protected void onInitHtml(MarkupContainer body) {
        this.form = new Form<>("form");
        body.add(this.form);

        this.row1 = UIRow.newUIRow("row1", this.form);

        this.sample1Column = this.row1.newUIColumn("sample1Column", Size.Four_4);
        this.sample1Container = this.sample1Column.newUIContainer("sample1Container");
        this.sample1Field = new Select2SingleChoice("sample1Field", new PropertyModel<>(this, "sample1Value"), this.sample1Provider, 2);
        this.sample1Field.setLabel(Model.of("Dropdown"));
        this.sample1Container.add(this.sample1Field);
        this.sample1Container.newFeedback("sample1Feedback", this.sample1Field);

        this.sample2Column = this.row1.newUIColumn("sample2Column", Size.Four_4);
        this.sample2Container = this.sample2Column.newUIContainer("sample2Container");
        this.sample2Field = new Select2MultipleChoice("sample2Field", new PropertyModel<>(this, "sample2Value"), this.sample2Provider, 2);
        this.sample2Field.setLabel(Model.of("Tag"));
        this.sample2Container.add(this.sample2Field);
        this.sample2Container.newFeedback("sample2Feedback", this.sample2Field);

        this.sample3Column = this.row1.newUIColumn("sample3Column", Size.Four_4);
        this.sample3Container = this.sample3Column.newUIContainer("sample3Container");
        this.sample3Field = new SmartTextField("sample3Field", new PropertyModel<>(this, "sample3Value"), this.sample3Provider, 2);
        this.sample3Field.setLabel(Model.of("Smart Text"));
        this.sample3Container.add(this.sample3Field);
        this.sample3Container.newFeedback("sample3Feedback", this.sample3Field);

        this.row1.newUIColumn("lastColumn");

        this.row2 = UIRow.newUIRow("row2", this.form);

        this.sample4Column = this.row2.newUIColumn("sample4Column", Size.Four_4);
        this.sample4Container = this.sample4Column.newUIContainer("sample4Container");
        this.sample4Field = new DateTextField("sample4Field", new PropertyModel<>(this, "sample4Value"));
        this.sample4Field.setLabel(Model.of("Date"));
        this.sample4Container.add(this.sample4Field);
        this.sample4Container.newFeedback("sample4Feedback", this.sample4Field);

        this.sample5Column = this.row2.newUIColumn("sample5Column", Size.Four_4);
        this.sample5Container = this.sample5Column.newUIContainer("sample5Container");
        this.sample5Field = new ColorTextField("sample5Field", new PropertyModel<>(this, "sample5Value"));
        this.sample5Field.setLabel(Model.of("Color"));
        this.sample5Container.add(this.sample5Field);
        this.sample5Container.newFeedback("sample5Feedback", this.sample5Field);

        this.sample6Column = this.row2.newUIColumn("sample6Column", Size.Four_4);
        this.sample6Container = this.sample6Column.newUIContainer("sample6Container");
        this.sample6Field = new DateTimeTextField("sample6Field", new PropertyModel<>(this, "sample6Value"));
        this.sample6Field.setLabel(Model.of("Datetime"));
        this.sample6Container.add(this.sample6Field);
        this.sample6Container.newFeedback("sample6Feedback", this.sample6Field);

        this.row2.newUIColumn("lastColumn");

        this.row3 = UIRow.newUIRow("row3", this.form);

        this.sample7Column = this.row3.newUIColumn("sample7Column", Size.Three_3);
        this.sample7Container = this.sample7Column.newUIContainer("sample7Container");
        this.sample7Field = new TimeTextField("sample7Field", new PropertyModel<>(this, "sample7Value"));
        this.sample7Field.setLabel(Model.of("Time"));
        this.sample7Container.add(this.sample7Field);
        this.sample7Container.newFeedback("sample7Feedback", this.sample7Field);

        this.sample8Column = this.row3.newUIColumn("sample8Column", Size.Three_3);
        this.sample8Container = this.sample8Column.newUIContainer("sample8Container");
        this.sample8Field = new DayMonthTextField("sample8Field", new PropertyModel<>(this, "sample8Value"));
        this.sample8Field.setLabel(Model.of("Day / Month"));
        this.sample8Container.add(this.sample8Field);
        this.sample8Container.newFeedback("sample8Feedback", this.sample8Field);

        this.sample9Column = this.row3.newUIColumn("sample9Column", Size.Three_3);
        this.sample9Container = this.sample9Column.newUIContainer("sample9Container");
        this.sample9Field = new IPTextField("sample9Field", new PropertyModel<>(this, "sample9Value"));
        this.sample9Field.setLabel(Model.of("IP"));
        this.sample9Container.add(this.sample9Field);
        this.sample9Container.newFeedback("sample9Feedback", this.sample9Field);

        this.sample10Column = this.row3.newUIColumn("sample10Column", Size.Three_3);
        this.sample10Container = this.sample10Column.newUIContainer("sample10Container");
        this.sample10Field = new MonthYearTextField("sample10Field", new PropertyModel<>(this, "sample10Value"));
        this.sample10Field.setLabel(Model.of("Month / Year"));
        this.sample10Container.add(this.sample10Field);
        this.sample10Container.newFeedback("sample10Feedback", this.sample10Field);

        this.row3.newUIColumn("lastColumn");

    }

}
