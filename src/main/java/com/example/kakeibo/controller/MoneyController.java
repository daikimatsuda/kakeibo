package com.example.kakeibo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.kakeibo.form.MoneyForm;

@RequestMapping("/money")
@Controller
public class MoneyController {

	@RequestMapping(value="/new",method = RequestMethod.POST)
	public String newIndex(MoneyForm form, Model model) {
		return "newcreate";
	}
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public String insert(MoneyForm form, Model model) {
		
		model.addAttribute("insertFlag",true);
		return newIndex(form, model);
	}
}
