
package com.trainer.english.controller.dto.fulfillment;

import javax.validation.Valid;

public class FulfillmentMessage {

    @Valid
    public Text text;

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }
}
