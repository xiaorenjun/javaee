package com.member.test;

import java.util.Date;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.member.pojo.Member;
import com.member.service.MemberService;




public class Test {
	private MemberService memberService;
	
	@org.junit.Test
	public void findById(){
		Member member=memberService.findById(1);
		System.out.println(member.getMname()+" "+member.getMphone());
	}
	
	@org.junit.Test
	public void add(){
		Member member=new Member();
		member.setMid(2);
		member.setMname("����");
		member.setMintime(new Date());
		member.setMlevel(4);
		member.setMphone("13508400987");
		member.setMcardno("V00002");
		
		int count =memberService.add(member);
		 if (count > 0) {
		      System.out.println("����ɹ�");
		    } else {
		      System.out.println("����ʧ��");
		    }
	}
	
	@org.junit.Test
	public void modify(){
		Member member=new Member();
		member.setMid(2);
		member.setMname("����");
		member.setMintime(new Date());
		member.setMlevel(4);
		member.setMphone("13508400000");
		member.setMcardno("V00004");
		
		int count =memberService.modify(member);
		 if (count > 0) {
		      System.out.println("�޸ĳɹ�");
		    } else {
		      System.out.println("�޸�ʧ��");
		    }
	}
	
	 @org.junit.Test
	  public void remove() {
	    int count = memberService.remove(2);
	    if (count > 0) {
	      System.out.println("ɾ���ɹ�");
	    } else {
	      System.out.println("ɾ��ʧ��");
	    }
	  }
	
	@SuppressWarnings("resource")
	@Before
	public void init(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		memberService=ctx.getBean("memberService",MemberService.class);
	}

}
