
package com.trainer.english.controller.dto.fulfillment;

import javax.validation.Valid;

public class Payload {

    @Valid
    private Google google;
    @Valid
    private Facebook facebook;
    @Valid
    private Slack slack;

    public Google getGoogle() {
        return google;
    }

    public void setGoogle(Google google) {
        this.google = google;
    }

    public Facebook getFacebook() {
        return facebook;
    }

    public void setFacebook(Facebook facebook) {
        this.facebook = facebook;
    }

    public Slack getSlack() {
        return slack;
    }

    public void setSlack(Slack slack) {
        this.slack = slack;
    }

}
