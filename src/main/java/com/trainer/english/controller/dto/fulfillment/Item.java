
package com.trainer.english.controller.dto.fulfillment;

import javax.validation.Valid;

public class Item {

    @Valid
    private SimpleResponse simpleResponse;

    public SimpleResponse getSimpleResponse() {
        return simpleResponse;
    }

    public void setSimpleResponse(SimpleResponse simpleResponse) {
        this.simpleResponse = simpleResponse;
    }

}
