package com.newer.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.newer.dao.StaffMapper;
import com.newer.pojo.Staff;
import com.newer.util.Pager;


@Service("staffService")
public class StaffService {
		//ע�ⷽʽע��xxxMapper��ʵ��(Spring�����ļ��е�MapperScannerConfigurer�Զ�ɨ�����XxxMapper�ӿڵ�ʵ��)
		@Resource(name="staffMapper")
		private StaffMapper staffMapper;
		
		public Pager<Staff> list(Integer pageno,Integer pagesize,String sort,String order,String ename,Double sal){
			Pager<Staff> pager=new Pager<Staff>();
			pager.setRows(staffMapper.findPager(pageno, pagesize, sort, order, sal));
			pager.setTotal(staffMapper.findTotal(ename));
			return pager;
		}

}
