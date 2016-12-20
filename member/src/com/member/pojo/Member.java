package com.member.pojo;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer mid;
	private String mname;
	private String mphone;
	private Integer mlevel;
	private Date mintime;
	private String mcardno;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public Integer getMlevel() {
		return mlevel;
	}
	public void setMlevel(Integer mlevel) {
		this.mlevel = mlevel;
	}
	public Date getMintime() {
		return mintime;
	}
	public void setMintime(Date mintime) {
		this.mintime = mintime;
	}
	public String getMcardno() {
		return mcardno;
	}
	public void setMcardno(String mcardno) {
		this.mcardno = mcardno;
	}

	
}
