package com.messageboard.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Repository;

import com.messageboard.pojo.Messageboard;

@Repository("mbMapper")
public interface MessageBoardMapper {
	@Insert("insert into MESSAGEBOARD(MID,MBTYPE,MBCLASS,MBAREA,MESSAGE,RTYPE,MNAME) values (#{mid},#{mbtype},#{mbclass},#{mbarea},#{message},#{rtype},#{mname})")
	@SelectKey(statement = "select SEQ_MEMBER.nextval from DUAL", keyProperty = "mid", resultType = int.class, before = true)
	int add(Messageboard mb);

}
