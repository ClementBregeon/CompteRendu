package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoMVCController {
	
	@GetMapping("/message")
	public String displayMessage()
	{
		return "Hello Ynov";
		}

}
