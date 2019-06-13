
package com.trainer.english.controller.dto.fulfillment;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

public class Text {

    @Valid
    public List<String> text = new ArrayList<String>();

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }
}
