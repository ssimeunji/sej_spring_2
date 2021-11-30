package com.sej.ex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sej.ex.dto.TraineeDTO;
import com.sej.ex.service.TraineeService;

@Controller
public class HomeController {
	//스프링이 관리하는 객체를 사용하기
	//의존성 주입(DI, Dependency Injection)
	@Autowired
	private TraineeService ts;
	
	//TraineeService ts = new TraineeService();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		return "index";
	}
	
	@RequestMapping(value = "/insertform", method = RequestMethod.GET)
	public String insertForm() {

		return "insert";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute TraineeDTO trainee) {
		
		System.out.println("insertTrainee: " +trainee);
		
		// TraineeService에 있는 insert메서드 호출하면서 trainee 객체를 넘긴다면
		ts.insert(trainee);
		
		return "index";
	}
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public String findAll(Model model) {
		// select * from trainee 결과를 mybatis가 List에 담아주고 그 리턴을 가져옴
		List<TraineeDTO> tList = ts.findAll();
		
		model.addAttribute("tList",tList);
		
		return "findAll";
	}
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String findById(@RequestParam("t_number") long t_number, Model model) {
		System.out.println("findById: "+t_number);
		
		/*
		 * TraineeService.findById() 호출
		 * TraineeRepository.findById() 호출(mapper 호출시 sql.selectOne() 메서드 사용)
		 * trainee-mapper.findById 호출(mapper에서 parameterType="long"이라고 하면 됨)
		 * 
		 * 호출하고 역순으로 리턴을 가져와서(리턴타입이 뭐가 되야 할지 관건)
		 * 결과출력은 detail.jsp에서 해당 객체값을 출력하면 됩니다.
		 */
		TraineeDTO trainee = ts.findById(t_number);
		model.addAttribute("trainee", trainee);
		
		return "detail";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(@RequestParam("t_number") long t_number) {
		/*
		 * TraineeService.delete() 호출
		 * TraineeRepository.findById() 호출(mapper 호출시 sql.delete() 메서드 사용)
		 * trainee-mapper.delete 호출(mapper에서 parameterType="long"이라고 하면 됨)
		 * 
		 * 호출하고 역순으로 리턴을 가져와서(리턴타입이 뭐가 되야 할지 관건)
		 * 결과출력은 detail.jsp에서 해당 객체값을 출력하면 됩니다.
		 */
		ts.delete(t_number);
		//삭제 완료된 목록
		// 삭제 처리 후 단순히 findAll.jsp만 출력한 결과(list를 가져가는 내용이없음)
		//return "findAll";
		
		// 삭제가 반영된 목록을 다시 요청해야 하며,
		// 다시 요청하는 방식은 redirect 가 있음.
		// redirect를 할 때는 컨트롤러의 주소를 요청해야 함(절대로 jsp를 요청하는 것이 아님)
		return "redirect:/findAll";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateForm(@RequestParam("t_number") long t_number, Model model) {
		// t_number에 해당하는 데이터를 DB에서 가져와서 update.jsp로 가져감
		TraineeDTO trainee = ts.findById(t_number);
		model.addAttribute("trainee", trainee);
		return "update";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(@ModelAttribute TraineeDTO trainee) {
		System.out.println("Controller.update()"+trainee);
		
		ts.update(trainee);
		return "redirect:/findAll";

	}
	
}
