package com.icia.member.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.member.dto.MemberDTO;

@Repository
public class MemberRepository {

	@Autowired
	private SqlSessionTemplate sql;
	
	// 회원가입
	public int save(MemberDTO member) {
		System.out.println("MemberRepository.save(): "+member);
		return sql.insert("Member.save", member);
	}

	// 로그인
	public MemberDTO login(MemberDTO member) {
		System.out.println("MemberRepository.login(): "+member);
		return sql.selectOne("Member.login", member);
	}

	// 회원 목록
	public List<MemberDTO> findAll() {
		return sql.selectList("Member.findAll");

	}

	// 회원 상세 조회
	public MemberDTO findById(long m_number) {
		return sql.selectOne("Member.findById", m_number);
	}

	// 삭제 처리
	public void delete(long m_number) {
		sql.delete("Member.delete", m_number);
		
	}
	// 수정 처리
	public void update(MemberDTO member) {
		sql.update("Member.update", member);
		
	}

	// 아이디 중복 체크
	public String idDuplicate(String m_id) {
		return sql.selectOne("Member.idDuplicate", m_id);
	}

}
