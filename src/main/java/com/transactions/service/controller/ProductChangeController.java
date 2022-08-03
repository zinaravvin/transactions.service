package com.transactions.service.controller;

import com.transactions.service.request.CreateProductChangeCommand;
import com.transactions.service.request.CreateTempSusupenseCommand;
import com.transactions.service.response.GetProductChangeResponse;
import com.transactions.service.response.GetTempSuspenseResponse;
import com.transactions.service.service.ProductChangeService;
import com.transactions.service.service.SuspendTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/aristo/v1")
public class ProductChangeController {

    @Autowired
    ProductChangeService service;
    @PostMapping("/productChange/{accountId}")
    public ResponseEntity<GetProductChangeResponse> createProductChange(@RequestBody CreateProductChangeCommand body, @PathVariable("accountId") String accountId) throws Exception {
        GetProductChangeResponse response = service.processProductChangeData(body,accountId);
        return ResponseEntity.ok(response);
    }
}
