package com.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.member.pojo.Member;

@Repository("memberMapper")
public interface MemberMapper {
	
	@Insert("insert into MEMBER(MID,MNAME,MPHONE,MLEVEL,MINTIME,MCARDNO) values"
	+ "(#{mid},#{mname,jdbcType=VARCHAR},#{mphone,jdbcType=VARCHAR},#{mlevel},#{mintime,jdbcType=DATE},#{mcardno,jdbcType=VARCHAR})")
	@SelectKey(statement = "select SEQ_MEMBER.nextval from DUAL", keyProperty = "mid", resultType = int.class, before = true)
	int add(Member member);
		
	@Update("update MEMBER set MNAME=#{mname},MPHONE=#{mphone},MLEVEL=#{mlevel},MCARDNO=#{mcardno} where MID=#{mid}")
	int modify(Member member);
	
	@Delete("delete from MEMBER where MID=#{mid}")
	int remove(Integer mid);
	
	@Select("select MID,MNAME,MPHONE,MLEVEL,MCARDNO from MEMBER where MID=#{mid}")
	Member findById(Integer mid);
	
	List<Member> find(@Param("mname")String mname,@Param("mcardno")String mcardno);
}
