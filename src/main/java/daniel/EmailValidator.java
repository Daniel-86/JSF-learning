package daniel;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: daniel
 * Date: 9/05/15
 */
@FacesValidator("emailValidator")
public class EmailValidator implements Validator {
    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        Pattern emailPattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = emailPattern.matcher((CharSequence) o);
        HtmlInputText inputText = (HtmlInputText) uiComponent;
        String label;

        label = (inputText.getLabel() == null || inputText.getLabel().trim().equals(""))? inputText.getId(): inputText.getLabel();
        if(!matcher.matches()) {
            throw new ValidatorException(new FacesMessage(label + ": no es un email válido"));
        }
    }
}
