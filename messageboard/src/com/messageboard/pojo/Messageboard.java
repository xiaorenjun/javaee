package com.messageboard.pojo;

import java.io.Serializable;

public class Messageboard implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer mid;
	private String mbtype;
	private String mbclass;
	private String mbarea;
	private String message;
	private String rtype;
	private String mname;
	
	
	@Override
	public String toString() {
		return "Messageboard [mid=" + mid + ", mbtype=" + mbtype + ", mbclass=" + mbclass + ", mbarea=" + mbarea
				+ ", message=" + message + ", rtype=" + rtype + ", mname=" + mname + "]";
	}
	public Messageboard() {
		
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMbtype() {
		return mbtype;
	}
	public void setMbtype(String mbtype) {
		this.mbtype = mbtype;
	}
	public String getMbclass() {
		return mbclass;
	}
	public void setMbclass(String mbclass) {
		this.mbclass = mbclass;
	}
	public String getMbarea() {
		return mbarea;
	}
	public void setMbarea(String mbarea) {
		this.mbarea = mbarea;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRtype() {
		return rtype;
	}
	public void setRtype(String rtype) {
		this.rtype = rtype;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
		
	
	

}
