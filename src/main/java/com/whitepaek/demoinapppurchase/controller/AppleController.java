package com.whitepaek.demoinapppurchase.controller;

import com.whitepaek.demoinapppurchase.model.UserReceipt;
import com.whitepaek.demoinapppurchase.service.AppleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppleController {

    private final AppleService appleService;

    public AppleController(AppleService appleService) {
        this.appleService = appleService;
    }

    @PostMapping("/purchase")
    public ResponseEntity purchase(@RequestBody UserReceipt userReceipt) {

        String code = appleService.updatePurchaseHistory(userReceipt);

        return ResponseEntity.ok(code);
    }

}
