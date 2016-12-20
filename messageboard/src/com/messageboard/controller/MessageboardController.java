package com.messageboard.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.messageboard.pojo.Messageboard;
import com.messageboard.service.Messageboardservice;

@Controller
@SessionAttributes(value="message",types={Messageboard.class})
public class MessageboardController {
	@Resource(name="mbService")
	private Messageboardservice mbService;
	private Messageboard mb;
	
	private String result;
	public Messageboardservice getMbService() {
		return mbService;
	}
	public void setMbService(Messageboardservice mbService) {
		this.mbService = mbService;
	}
	public Messageboard getMb() {
		return mb;
	}
	public void setMb(Messageboard mb) {
		this.mb = mb;
	}
	
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("addMessage")
	public ModelAndView add(Messageboard mb){
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(mb);
		if(mb != null && mbService.add(mb)>0){
			result="��ӳɹ�";
		}else{
			result="���ʧ�ܣ�����ϸ���������";
		}
		
		modelAndView.addObject("result", result);
		modelAndView.setViewName("result");
		
		return modelAndView;
	}

}
