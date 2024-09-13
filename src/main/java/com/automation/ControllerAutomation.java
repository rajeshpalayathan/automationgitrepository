package com.automation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/automationRM")

public class ControllerAutomation {

	@GetMapping(value="/getrajesh")
public String getmethod()
{
		return "“The most amazing things that can happen to a human being will happen to you, if you just lower your expectations.”\r\n"
				+ "― Phil Dunphy";
}
	
}
