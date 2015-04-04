package com.playmatecat.project.moduleName;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.playmatecat.commons.loginModule.vo.LoginVO;
import com.playmatecat.utils.encrypt.UtilsAES;

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
	public ModelAndView casLogin(LoginVO loginVO, Model model, RedirectAttributes redirectAttributes) {
		System.out.println("do-cas-login");
		
		//解密后形式 用户名,密码,单点登录时间
		String encryptTicket = UtilsAES.decrypt(loginVO.getTicket());
		
		String ticketArr[] = encryptTicket.split(",");
		String username = ticketArr[0];
		String password = ticketArr[1];
		
//		Subject subject = SecurityUtils.getSubject();
//		AuthenticationToken token = new UsernamePasswordToken(username,password);
		
		
		ModelAndView mav = new ModelAndView( "redirect:" + loginVO.getUrl());
		model.addAttribute("testParam", "testModelParams");
		redirectAttributes.addAttribute("testParam", "testModelParams");
		
		return mav;
	}
}
