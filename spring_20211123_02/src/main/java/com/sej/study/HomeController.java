package com.sej.study;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	@RequestMapping(value="/loginpage", method = RequestMethod.GET)
	public String loginpage() {
		return "login";
	}
	
	// 화면에서 전달한 파라미터 받기
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Model model, @RequestParam("id") String id, @RequestParam("password") String password) {
		System.out.println("id: "+id+" password: "+password);
		
		// id를 model에 담아서 welcom.jsp로 가져가기
		model.addAttribute("idValue", id);
		// password를 pwValue에 감고 welcom.jsp에서 출력
		model.addAttribute("pwValue", password);
		// val 변수를 hello에 담고 welcom.jsp에서 출력
		String val = "이제 곧 끝나요";
		model.addAttribute("valValue", val);
		
		return "welcome";
	}
}
