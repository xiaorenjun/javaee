package com.newer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newer.pojo.Staff;
import com.newer.service.StaffService;
import com.newer.util.Pager;

import net.sf.json.JSON;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;

@Controller
public class Staffcontroller {
	@Resource(name="staffService")
	private StaffService staffService;
	
	@RequestMapping("staffController_list")
	  public void list(@RequestParam(value = "page", required = true) Integer page,
	      @RequestParam(value = "rows", required = true) Integer rows,
	      @RequestParam(value = "sort", required = true) String sort,
	      @RequestParam(value = "order", required = true) String order,
	      @RequestParam(value = "ename", required = false) String ename,
	      @RequestParam(value = "sal", required = false) Double sal,
	      HttpServletResponse response) {

	    // 处理起始页和结束页
	    Integer pageno = (page - 1) * rows;
	    Integer pagesize = page * rows;

	    Pager<Staff> pager = staffService.list(pageno, pagesize, sort, order, ename, sal);

	    JsonConfig jsonConfig = new JsonConfig();

	    JSON json = JSONSerializer.toJSON(pager, jsonConfig);

	    try {
	      PrintWriter out = response.getWriter();
	      out.println(json.toString());
	      out.flush();
	      out.close();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	  }

}
