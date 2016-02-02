package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.service.MoodService;

@Controller
public class AboutController {

	@Autowired
	private MoodService service;

	@RequestMapping(value = "/about")
	public String showAbout() {
		System.out.println("In About");
		return "about";
	}

}
