package com.healthcare.billing.service;

import com.healthcare.billing.controller.model.ProcedureRate;
import com.healthcare.billing.model.Procedure;

import java.util.List;

public interface BillingService {

    public ProcedureRate getProcedureRate(String id);

    public List<Procedure> getAllProcedures();

}
