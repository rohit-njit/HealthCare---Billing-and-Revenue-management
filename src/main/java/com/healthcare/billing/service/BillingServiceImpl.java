package com.healthcare.billing.service;

import com.google.gson.Gson;
import com.healthcare.billing.controller.model.ProcedureRate;
import com.healthcare.billing.model.Procedure;

import java.io.*;
import java.util.List;

public class BillingServiceImpl implements BillingService {

    @Override
    public ProcedureRate getProcedureRate(String id) {
        String path = "resources/main/templates/procedures.json";
//        File f = new File("resources/main/templates/procedures.json");
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            Procedure procedure = new Gson().fromJson(br, Procedure.class);
            System.out.println(procedure.getDescription());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        System.out.println(f.getAbsoluteFile());
        return null;
    }

    @Override
    public List<Procedure> getAllProcedures() {
        return null;
    }
}
