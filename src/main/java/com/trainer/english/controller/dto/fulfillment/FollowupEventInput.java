
package com.trainer.english.controller.dto.fulfillment;

import javax.validation.Valid;

public class FollowupEventInput {

    private String name;
    private String languageCode;
    @Valid
    private Parameters_ parameters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Parameters_ getParameters() {
        return parameters;
    }

    public void setParameters(Parameters_ parameters) {
        this.parameters = parameters;
    }

}
