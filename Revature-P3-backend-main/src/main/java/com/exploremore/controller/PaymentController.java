package com.exploremore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exploremore.pojo.PaymentPojo;
import com.exploremore.service.PaymentService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("payment")
	public PaymentPojo addPaymentInfo(@RequestBody PaymentPojo paymentPojo) {
		
		return paymentService.addPaymentInfo(paymentPojo);
		
	}
	
	@GetMapping("payment/{uid}")
	public PaymentPojo getPaymentInfo(@PathVariable("uid") int userId) {
		return paymentService.getPaymentInfo(userId);
	}
}
