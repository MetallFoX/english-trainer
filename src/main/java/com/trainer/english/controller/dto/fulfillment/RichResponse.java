
package com.trainer.english.controller.dto.fulfillment;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

public class RichResponse {

    @Valid
    private List<Item> items = new ArrayList<Item>();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
