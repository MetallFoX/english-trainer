
package com.trainer.english.controller.dto.fulfillment;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

public class QueryResult {

    public String queryText;
    @Valid
    public Parameters parameters;
    public Boolean allRequiredParamsPresent;
    public String fulfillmentText;
    @Valid
    public List<FulfillmentMessage> fulfillmentMessages = new ArrayList<FulfillmentMessage>();
    @Valid
    public List<OutputContext> outputContexts = new ArrayList<OutputContext>();
    @Valid
    public Intent intent;
    public Long intentDetectionConfidence;
    @Valid
    public DiagnosticInfo diagnosticInfo;
    public String languageCode;

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public Boolean getAllRequiredParamsPresent() {
        return allRequiredParamsPresent;
    }

    public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
        this.allRequiredParamsPresent = allRequiredParamsPresent;
    }

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

    public List<OutputContext> getOutputContexts() {
        return outputContexts;
    }

    public void setOutputContexts(List<OutputContext> outputContexts) {
        this.outputContexts = outputContexts;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public Long getIntentDetectionConfidence() {
        return intentDetectionConfidence;
    }

    public void setIntentDetectionConfidence(Long intentDetectionConfidence) {
        this.intentDetectionConfidence = intentDetectionConfidence;
    }

    public DiagnosticInfo getDiagnosticInfo() {
        return diagnosticInfo;
    }

    public void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
        this.diagnosticInfo = diagnosticInfo;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }
}
