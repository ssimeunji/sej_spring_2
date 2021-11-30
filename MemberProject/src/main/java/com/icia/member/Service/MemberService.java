package com.icia.member.Service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.member.dto.MemberDTO;
import com.icia.member.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository mr;
	
	@Autowired
	private HttpSession session;
	
	// 회원가입
	public int save(MemberDTO member) {
		System.out.println("MemberService.save():"+member);
		int result = mr.save(member);
		return result;
	}
	
	// 로그인
	public String login(MemberDTO member) {
		System.out.println("MemberService.login():"+member);
		MemberDTO loginMember = mr.login(member);
		if(loginMember != null) {
			// 로그인 성공(로그인 정보(아이디)를 세션에 저장)
			session.setAttribute("loginId", member.getM_id());
			session.setAttribute("loginNumber", loginMember.getM_number());
			return "main";
		} else {
			// 로그인 실패
			return "login";
		}
	}

	// 회원 목록
	public List<MemberDTO> findAll() {
		List<MemberDTO> mList = mr.findAll();
		
		return mList;
	}

	// 회원 상세 조회
	public MemberDTO findById(long m_number) {
		MemberDTO member = mr.findById(m_number);
		return member;
	}

	// 삭제 처리
	public void delete(long m_number) {
		mr.delete(m_number);
	}

	// 수정 처리
	public void update(MemberDTO member) {
		mr.update(member);
		
	}

	// 아이디 중복 체크
	public String idDuplicate(String m_id) {
		String result = mr.idDuplicate(m_id);
		if(result == null) {
			return "ok"; //조회결과가 없기 때문에 해당 아이디는 사용 가능
		} else {
			return "no"; //조회결과가 있기 때문에 해당 아이디는 사용 불가능
		}
	}
	

}
