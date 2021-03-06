package com.Nicole.ecommerce.controller;

import com.Nicole.ecommerce.dto.Purchase;
import com.Nicole.ecommerce.dto.PurchaseResponse;
import com.Nicole.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("https://angular-ecommerce-nicole.herokuapp.com")
@RestController
@RequestMapping("/checkout")

public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }
}
