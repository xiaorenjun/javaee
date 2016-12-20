package com.member.action;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.member.pojo.Member;
import com.member.service.MemberService;


public class MemberAction {
	@Resource(name = "memberService")
	private MemberService memberService;
	private Member member;
	private List<Member> members;
	
	public String list(){
		if (member == null) {
			member = new Member();
		    }
			members = memberService.find(member.getMname(), member.getMcardno());
		return "list";	
	}
	
	public String addMember(){
		if (member == null) {
			member = new Member();
		    }
		member.setMintime(new Date());
		memberService.add(member);

		return "add";
	}
	
	public String modifyMember(){	
		if (member == null) {
			member = new Member();
		    }
//		System.out.println(member.getMid()+" "+member.getMname()+" "+member.getMphone()+" "+member.getMlevel());
//		member.setMid(11);
		member.getMid();
		memberService.modify(member);

		return "modify";
	}
	
	public String findMember(){
		if (member == null) {
			member = new Member();
		    }
		System.out.println(member.getMid());
		member=memberService.findById(member.getMid());
	
		return "find";
	}
	
	public String removeMember(){
		if (member == null) {
			member = new Member();
		    }
		memberService.remove(member.getMid());
		return "remove";
	}

	public MemberService getMemberService() {
		return memberService;
	}

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}
	
	

}
