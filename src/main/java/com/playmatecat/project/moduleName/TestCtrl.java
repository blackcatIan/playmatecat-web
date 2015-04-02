package com.playmatecat.project.moduleName;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("")
public class TestCtrl {
	
	@RequestMapping("/testPage")
	public ModelAndView testPage(Model model) {
		ModelAndView mav = new ModelAndView("testModule.testMain");
		model.addAttribute("testParam", "testModelParams");
		return mav;
	}
	
	@RequestMapping("/cas-login")
	public ModelAndView casLogin(Model model) {
		System.out.println("do-cas-login");
		
		ModelAndView mav = new ModelAndView("testModule.testMain");
		model.addAttribute("testParam", "testModelParams");
		return mav;
	}
}
