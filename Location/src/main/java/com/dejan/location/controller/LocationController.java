package com.dejan.location.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {

	@RequestMapping("/showCreate")//uri name doesn't have to be same as method name
	public String showCreate() {
		// it shows starting page
		return "createLocation";
	}
}
