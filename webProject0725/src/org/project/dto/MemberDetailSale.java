package org.project.dto;

public class MemberDetailSale {
	private int custNo;
	private int saleNol;
	private String pCode;
	private int price;

	public MemberDetailSale(int custNo, int saleNol, String pCode, int price) {
		super();
		this.custNo = custNo;
		this.saleNol = saleNol;
		this.pCode = pCode;
		this.price = price;
	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public int getSaleNol() {
		return saleNol;
	}

	public void setSaleNol(int saleNol) {
		this.saleNol = saleNol;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
