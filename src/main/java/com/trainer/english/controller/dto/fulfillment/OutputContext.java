
package com.trainer.english.controller.dto.fulfillment;

import javax.validation.Valid;

public class OutputContext {

    public String name;
    public Long lifespanCount;
    @Valid
    public Parameters_ parameters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLifespanCount() {
        return lifespanCount;
    }

    public void setLifespanCount(Long lifespanCount) {
        this.lifespanCount = lifespanCount;
    }

    public Parameters_ getParameters() {
        return parameters;
    }

    public void setParameters(Parameters_ parameters) {
        this.parameters = parameters;
    }
}
