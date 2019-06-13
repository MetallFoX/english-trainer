
package com.trainer.english.controller.dto.fulfillment;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

public class Card {

    private String title;
    private String subtitle;
    private String imageUri;
    @Valid
    private List<Button> buttons = new ArrayList<Button>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

}
