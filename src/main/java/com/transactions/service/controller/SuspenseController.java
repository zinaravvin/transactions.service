package com.transactions.service.controller;

import com.transactions.service.errors.SuspenseErrorResponse;
import com.transactions.service.request.CreateTempSusupenseCommand;
import com.transactions.service.response.GetTempSuspenseResponse;
import com.transactions.service.service.SuspendTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/aristo/v1")
public class    SuspenseController {
    @Autowired
    SuspendTransactionService service;
    @PostMapping("/suspend/temp/{accountId}")
    public ResponseEntity<GetTempSuspenseResponse> createTempSuspense(@RequestBody CreateTempSusupenseCommand body, @PathVariable("accountId") String accountId) {
        GetTempSuspenseResponse response = service.processSuspendData(body,accountId);
        return ResponseEntity.ok(response);
    }

}
