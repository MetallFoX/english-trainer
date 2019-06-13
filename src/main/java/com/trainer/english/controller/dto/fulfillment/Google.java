
package com.trainer.english.controller.dto.fulfillment;

import javax.validation.Valid;

public class Google {

    private Boolean expectUserResponse;
    @Valid
    private RichResponse richResponse;

    public Boolean getExpectUserResponse() {
        return expectUserResponse;
    }

    public void setExpectUserResponse(Boolean expectUserResponse) {
        this.expectUserResponse = expectUserResponse;
    }

    public RichResponse getRichResponse() {
        return richResponse;
    }

    public void setRichResponse(RichResponse richResponse) {
        this.richResponse = richResponse;
    }

}
