package com.dayone;
public class Student {
	private String studname;
	private int studid;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studid+" "+studname+" "+studreg;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public long getStudreg() {
		return studreg;
	}
	public void setStudreg(long studreg) {
		this.studreg = studreg;
	}
	private long studreg;
	}
