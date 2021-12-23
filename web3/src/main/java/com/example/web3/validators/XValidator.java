package com.example.web3.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.HashSet;
import java.util.Set;

@FacesValidator("xValidator")
public class XValidator implements Validator<Double> {
    private final Set<Double> xRange;

    public XValidator() {
        xRange = new HashSet<>();
        xRange.add(-2.0);
        xRange.add(-1.5);
        xRange.add(-1.0);
        xRange.add(-0.5);
        xRange.add(0.0);
        xRange.add(0.5);
        xRange.add(1.0);
    }

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Double o) throws ValidatorException {
        if (!xRange.contains(o)){
            FacesMessage msg = new FacesMessage("X value must be in {-2, -1.5, -1, -0.5, 0, 0.5, 1}");
            throw new ValidatorException(msg);
        }
    }

    public boolean validate(double o){
        return o >= -2 && o <= 1;
    }
}
