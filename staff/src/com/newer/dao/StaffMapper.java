package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.newer.pojo.Staff;


public interface StaffMapper {
	List<Staff> findPager(@Param("pageno")Integer pageno,@Param("pagesize")Integer pagesize,@Param("sort")String sort,@Param("order")String order,@Param("sal")Double sal);
	
	int findTotal(@Param("ename")String ename);

}
