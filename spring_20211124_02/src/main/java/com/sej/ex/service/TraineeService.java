package com.sej.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sej.ex.dto.TraineeDTO;
import com.sej.ex.repository.TraineeRepository;

@Service
public class TraineeService {
	
	@Autowired
	private TraineeRepository tr;

	public void insert(TraineeDTO trainee) {
		System.out.println("TraineeService.insert() 메서드 호출");
		System.out.println("객체값: "+trainee);
		
		// insert 메서드 호출 후 리턴값을 받아와서 리턴값을 출력해봅시다
		
		int result = tr.insert(trainee);
		System.out.println(result);
		
	}
	
	public List<TraineeDTO> findAll() {
		List<TraineeDTO> tList = tr.findAll();
		
		//tList 를 출력하는 sysout
		for(TraineeDTO t: tList) {			
			System.out.println(t);
		}
		
		return tList;
	}

	// 리턴타입:
	// 매개변수:
	// 리턴값: 
	public TraineeDTO findById(long t_number) {
		TraineeDTO trainee = tr.findById(t_number);
		System.out.println("TraineeService.findById(): "+trainee);
		return trainee;
	}
	
	// 리턴타입:
	// 매개변수:
	// 리턴값: 
	public void delete(long t_number) {
		tr.delete(t_number);

	}

	public void update(TraineeDTO trainee) {
		tr.update(trainee);
		
	}
	

}
