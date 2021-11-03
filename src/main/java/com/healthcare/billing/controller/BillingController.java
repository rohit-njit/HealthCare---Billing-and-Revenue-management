package com.healthcare.billing.controller;

import com.healthcare.billing.controller.model.ProcedureRate;
import com.healthcare.billing.service.BillingService;
import com.healthcare.billing.service.BillingServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {

    @RequestMapping("/procedures/{procedureId}/rates")
    public ProcedureRate getRate(@PathVariable String procedureId) {
        ProcedureRate pr = new ProcedureRate();
        pr.setId(procedureId);
        pr.setRate(100);
        pr.setProcedureId("Random-id");
        BillingService service = new BillingServiceImpl();
        service.getProcedureRate(procedureId);
        return pr;
    }

}
