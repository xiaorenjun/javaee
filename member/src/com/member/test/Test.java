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
		member.setMname("李四");
		member.setMintime(new Date());
		member.setMlevel(4);
		member.setMphone("13508400987");
		member.setMcardno("V00002");
		
		int count =memberService.add(member);
		 if (count > 0) {
		      System.out.println("保存成功");
		    } else {
		      System.out.println("保存失败");
		    }
	}
	
	@org.junit.Test
	public void modify(){
		Member member=new Member();
		member.setMid(2);
		member.setMname("王五");
		member.setMintime(new Date());
		member.setMlevel(4);
		member.setMphone("13508400000");
		member.setMcardno("V00004");
		
		int count =memberService.modify(member);
		 if (count > 0) {
		      System.out.println("修改成功");
		    } else {
		      System.out.println("修改失败");
		    }
	}
	
	 @org.junit.Test
	  public void remove() {
	    int count = memberService.remove(2);
	    if (count > 0) {
	      System.out.println("删除成功");
	    } else {
	      System.out.println("删除失败");
	    }
	  }
	
	@SuppressWarnings("resource")
	@Before
	public void init(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		memberService=ctx.getBean("memberService",MemberService.class);
	}

}
