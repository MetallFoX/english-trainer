package com.trainer.english.controller;

import com.trainer.english.controller.dto.fulfillment.FulfillmentRequest;
import com.trainer.english.controller.dto.fulfillment.FulfillmentResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionsController {

    @PostMapping("/ask")
    FulfillmentResponse ask(@RequestBody FulfillmentRequest request) {
        System.out.println(request.getQueryResult().getQueryText());

        FulfillmentResponse response = new FulfillmentResponse();
        response.setFulfillmentText("Are you ok?");
        response.setOutputContexts(request.getQueryResult().getOutputContexts());

        return response;
    }
}