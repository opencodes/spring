package com.rkjha.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FormController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworldform";
	}

	@RequestMapping("/showSuccess")
	public String showSuccess(@RequestParam("studentName") String studentName, Model model){
		
		model.addAttribute("message", studentName);
		return "success-form";
	}
}
