package com.healthcare.billing.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class BillingController {

    @RequestMapping("/procedures/{procedureId}/rates")
    public String getRate(@PathVariable String procedureId) {
        return "{\"message\" : \"This API is under construction.\"}";
    }

    @RequestMapping("/procedures")
    public String getProcedures() {
        return "{\"message\" : \"This API is under construction.\"}";
    }

    @RequestMapping("/claims")
    public String getClaims() {
        return "{\"message\" : \"This API is under construction.\"}";
    }

    @RequestMapping("/claims/{claimId}")
    public String getClaim(@PathVariable String claimId) {
        return "{\"message\" : \"This API is under construction.\"}";
    }

    @RequestMapping(value = "/claims/{claimId}", method = RequestMethod.POST)
    public String createClaim(@PathVariable String claimId) {
        return "{\"message\" : \"This API is under construction.\"}";
    }
    @RequestMapping(value = "/claims/{claimId}", method = RequestMethod.PUT)
    public String updateClaim(@PathVariable String claimId) {
        return "{\"message\" : \"This API is under construction.\"}";
    }
    @RequestMapping(value = "/claims/{claimId}", method = RequestMethod.DELETE)
    public String deleteClaim(@PathVariable String claimId) {
        return "{\"message\" : \"This API is under construction.\"}";
    }


}
