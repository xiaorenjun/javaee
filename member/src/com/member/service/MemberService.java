package com.member.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.member.dao.MemberMapper;
import com.member.pojo.Member;


@Service("memberService")
public class MemberService {
		//注解方式注入xxxMapper的实例(Spring配置文件中的MapperScannerConfigurer自动扫描产生XxxMapper接口的实例)
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
