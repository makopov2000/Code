package com.java8.comparator;

import java.sql.Timestamp;
import java.util.Date;

public class WalmartCahs{
	Integer key;
	Timestamp stamp;
	String vslue;
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public Date getStamp() {
		return stamp;
	}
	public void setStamp(Timestamp stamp) {
		this.stamp = stamp;
	}
	public String getVslue() {
		return vslue;
	}
	public void setVslue(String vslue) {
		this.vslue = vslue;
	}
	@Override
	public String toString() {
		return "WalmartCahs [key=" + key + ", stamp=" + stamp + ", vslue=" + vslue + "]";
	}
}