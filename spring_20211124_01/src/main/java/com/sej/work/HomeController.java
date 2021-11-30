package com.sej.work;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	//join 주소요청 처리
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String joinForm() {
		return "join";
	}
	@RequestMapping(value = "/join2", method = RequestMethod.GET)
	public String joinForm2() {
		return "join2";
	}
	
	// memberjoin 주소요청 처리
	@RequestMapping(value = "/memberjoin", method = RequestMethod.POST)
	public String memberJoin( @RequestParam("id") String id, @RequestParam("password") String password, @RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("gender") String gender) {
		System.out.println("아이디: "+id);
		System.out.println("비밀번호: "+password);
		System.out.println("이름: "+name);
		System.out.println("이메일: "+email);
		System.out.println("성별: "+gender);
		
		// DTO(Data Transfer Object)
		MemberDTO member = new MemberDTO();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		member.setEmail(email);
		member.setGender(gender);
		
		return "login";
	}
	
	// ModelAttribute로 DTO에 담을 때 주의할 점
	// jsp에서 사용한 name값과 DTO 필드값이 똑같아야함
	@RequestMapping(value = "/memberjoin2", method = RequestMethod.POST)
	public String memberJoin2(@ModelAttribute MemberDTO member, Model model) {
		
		System.out.println("memberJoin2: " +member);
		
		model.addAttribute("member", member);
		
		return "login";
	}
	
}
