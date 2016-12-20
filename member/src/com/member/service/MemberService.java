package com.member.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.member.dao.MemberMapper;
import com.member.pojo.Member;


@Service("memberService")
public class MemberService {
		//ע�ⷽʽע��xxxMapper��ʵ��(Spring�����ļ��е�MapperScannerConfigurer�Զ�ɨ�����XxxMapper�ӿڵ�ʵ��)
		@Resource(name="memberMapper")
		private MemberMapper memberMapper;
		
		public List<Member> find(String mname,String mcardno){
			return memberMapper.find(mname, mcardno);
			}
			
		public int add(Member member){
			return memberMapper.add(member);
		}
		
		public int modify(Member member){
			return memberMapper.modify(member);
		}
		
		public int remove(Integer mid){
			return memberMapper.remove(mid);
		}
		
		public Member findById(Integer mid){
			return memberMapper.findById(mid);
		}


}
