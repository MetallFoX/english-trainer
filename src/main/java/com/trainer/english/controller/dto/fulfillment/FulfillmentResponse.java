
package com.trainer.english.controller.dto.fulfillment;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

public class FulfillmentResponse {

    private String fulfillmentText;
    @Valid
    private List<FulfillmentMessage> fulfillmentMessages = new ArrayList<FulfillmentMessage>();
    private String source;
    @Valid
    private Payload payload;
    @Valid
    private List<OutputContext> outputContexts = new ArrayList<OutputContext>();
    @Valid
    private FollowupEventInput followupEventInput;

    public String getFulfillmentText() {
        return fulfillmentText;
    }

    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public List<FulfillmentMessage> getFulfillmentMessages() {
        return fulfillmentMessages;
    }

    public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
        this.fulfillmentMessages = fulfillmentMessages;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public List<OutputContext> getOutputContexts() {
        return outputContexts;
    }

    public void setOutputContexts(List<OutputContext> outputContexts) {
        this.outputContexts = outputContexts;
    }

    public FollowupEventInput getFollowupEventInput() {
        return followupEventInput;
    }

    public void setFollowupEventInput(FollowupEventInput followupEventInput) {
        this.followupEventInput = followupEventInput;
    }

}
