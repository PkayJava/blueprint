package com.angkorteam.blueprint.pages;

import com.angkorteam.blueprint.factory.WebSession;
import com.angkorteam.webui.frmk.common.Bookmark;
import com.angkorteam.webui.frmk.wicket.markup.html.panel.ComponentFeedbackPanel;
import com.angkorteam.webui.frmk.wicket.resource.AdminLteMinJS;
import com.angkorteam.webui.frmk.wicket.resource.ICheckBootstrapMinCSS;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

@Bookmark("/login")
public class LoginPage extends WebPage {

    protected Form<Void> form;

    protected TextField<String> loginField;
    protected ComponentFeedbackPanel loginFeedback;
    protected String loginValue;

    protected PasswordTextField passwordField;
    protected ComponentFeedbackPanel passwordFeedback;
    protected String passwordValue;

    protected Button loginButton;

    @Override
    protected void onInitialize() {
        super.onInitialize();

        this.form = new Form<>("form");
        add(this.form);

        this.loginField = new TextField<>("loginField", new PropertyModel<>(this, "loginValue"));
        this.loginField.setLabel(Model.of("Username"));
        this.loginField.setRequired(true);
        this.form.add(this.loginField);
        this.loginFeedback = new ComponentFeedbackPanel("loginFeedback", this.loginField);
        this.form.add(this.loginFeedback);

        this.passwordField = new PasswordTextField("passwordField", new PropertyModel<>(this, "passwordValue"));
        this.passwordField.setLabel(Model.of("Password"));
        this.passwordField.setRequired(true);
        this.form.add(this.passwordField);

        this.passwordFeedback = new ComponentFeedbackPanel("passwordFeedback", this.passwordField);
        this.form.add(this.passwordFeedback);

        this.loginButton = new Button("loginButton") {
            @Override
            public void onSubmit() {
                onClickLoginButton();
            }
        };
        this.form.add(this.loginButton);
    }

    protected void onClickLoginButton() {
        WebSession webSession = (WebSession) getSession();
        boolean valid = webSession.signIn(this.loginValue, this.passwordValue);
        if (!valid) {
            this.loginField.error("invalid");
            this.passwordField.error("invalid");
        } else {
            setResponsePage(getApplication().getHomePage());
        }
    }

    @Override
    public void renderHead(IHeaderResponse response) {
        // <!-- icheck bootstrap -->
        response.render(CssHeaderItem.forReference(ICheckBootstrapMinCSS.INSTANCE));

        // <!-- AdminLTE App -->
        response.render(JavaScriptHeaderItem.forReference(AdminLteMinJS.INSTANCE));
        response.render(OnDomReadyHeaderItem.forScript("document.getElementById(\"" + this.loginField.getMarkupId(true) + "\").focus();"));
    }

}
