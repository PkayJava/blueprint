package com.angkorteam.blueprint.pages;

import com.angkorteam.blueprint.MasterPage;
import com.angkorteam.webui.frmk.common.Bookmark;
import com.angkorteam.webui.frmk.wicket.layout.Size;
import com.angkorteam.webui.frmk.wicket.layout.UIColumn;
import com.angkorteam.webui.frmk.wicket.layout.UIContainer;
import com.angkorteam.webui.frmk.wicket.layout.UIRow;
import com.angkorteam.webui.frmk.wicket.markup.html.form.HtmlTextArea;
import com.angkorteam.webui.frmk.wicket.markup.html.form.JavascriptTextArea;
import com.angkorteam.webui.frmk.wicket.markup.html.form.RichTextField;
import com.angkorteam.webui.frmk.wicket.markup.html.form.SQLTextArea;
import org.apache.wicket.MarkupContainer;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

@Bookmark("/text/area")
public class TextAreaPage extends MasterPage {

    protected Form<Void> form;

    protected UIRow row1;

    protected UIColumn sample1Column;
    protected UIContainer sample1Container;
    protected JavascriptTextArea sample1Field;
    protected String sample1Value;

    protected UIColumn sample2Column;
    protected UIContainer sample2Container;
    protected SQLTextArea sample2Field;
    protected String sample2Value;

    protected UIRow row2;

    protected UIColumn sample4Column;
    protected UIContainer sample4Container;
    protected HtmlTextArea sample4Field;
    protected String sample4Value;

    protected UIColumn sample5Column;
    protected UIContainer sample5Container;
    protected RichTextField sample5Field;
    protected String sample5Value;

    @Override
    protected void onInitData() {
        super.onInitData();
    }

    @Override
    protected void onInitHtml(MarkupContainer body) {
        this.form = new Form<>("form");
        body.add(this.form);

        this.row1 = UIRow.newUIRow("row1", this.form);

        this.sample1Column = this.row1.newUIColumn("sample1Column", Size.Six_6);
        this.sample1Container = this.sample1Column.newUIContainer("sample1Container");
        this.sample1Field = new JavascriptTextArea("sample1Field", new PropertyModel<>(this, "sample1Value"));
        this.sample1Field.setLabel(Model.of("Javascript"));
        this.sample1Container.add(this.sample1Field);
        this.sample1Container.newFeedback("sample1Feedback", this.sample1Field);

        this.sample2Column = this.row1.newUIColumn("sample2Column", Size.Six_6);
        this.sample2Container = this.sample2Column.newUIContainer("sample2Container");
        this.sample2Field = new SQLTextArea("sample2Field", new PropertyModel<>(this, "sample2Value"));
        this.sample2Field.setLabel(Model.of("SQL"));
        this.sample2Container.add(this.sample2Field);
        this.sample2Container.newFeedback("sample2Feedback", this.sample2Field);

        this.row1.newUIColumn("lastColumn");

        this.row2 = UIRow.newUIRow("row2", this.form);

        this.sample4Column = this.row2.newUIColumn("sample4Column", Size.Six_6);
        this.sample4Container = this.sample4Column.newUIContainer("sample4Container");
        this.sample4Field = new HtmlTextArea("sample4Field", new PropertyModel<>(this, "sample4Value"));
        this.sample4Field.setLabel(Model.of("Html Text Editor"));
        this.sample4Container.add(this.sample4Field);
        this.sample4Container.newFeedback("sample4Feedback", this.sample4Field);

        this.sample5Column = this.row2.newUIColumn("sample5Column", Size.Six_6);
        this.sample5Container = this.sample5Column.newUIContainer("sample5Container");
        this.sample5Field = new RichTextField("sample5Field", new PropertyModel<>(this, "sample5Value"));
        this.sample5Field.setLabel(Model.of("Rich Text Editor"));
        this.sample5Container.add(this.sample5Field);
        this.sample5Container.newFeedback("sample5Feedback", this.sample5Field);

        this.row2.newUIColumn("lastColumn");
    }

}
