package com.biz.intout.model;

public class InOutDto {

	 private String io_date;
	 private String pname;
	 private String intout;
	 	
	 private int  price;
	 private int  amt;
	 
	 private int in_total;
	 private int out_total;
	 
	 
	 
	public String getIo_date() {
		return io_date;
	}
	public void setIo_date(String io_date) {
		this.io_date = io_date;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getIntout() {
		return intout;
	}
	public void setIntout(String intout) {
		this.intout = intout;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public int getIn_total() {
		return in_total;
	}
	public void setIn_total(int in_total) {
		this.in_total = in_total;
	}
	public int getOut_total() {
		return out_total;
	}
	public void setOut_total(int out_total) {
		this.out_total = out_total;
	}
	 
	 

}
