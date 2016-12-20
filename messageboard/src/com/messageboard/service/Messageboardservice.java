package com.messageboard.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.messageboard.dao.MessageBoardMapper;
import com.messageboard.pojo.Messageboard;

@Service("mbService")
public class Messageboardservice {
	@Resource(name="mbMapper")
	private MessageBoardMapper mbMapper;
	
	public int add(Messageboard mb){
		return mbMapper.add(mb);
	}

}
