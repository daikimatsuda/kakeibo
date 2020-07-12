package com.example.kakeibo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.kakeibo.dto.MoneyInsertApiRespose;

@Controller
@RequestMapping("/money/api")
public class MoneyApiController extends BaseApiController {

	@PostMapping(path = "/insert")
	public ResponseEntity<ApiResponse> insert(Model model) {
		MoneyInsertApiRespose apiResponse = new MoneyInsertApiRespose();
		//apiResponse.setDryerId();
		return createResponse(HttpStatus.OK, apiResponse);
	}
	
}
