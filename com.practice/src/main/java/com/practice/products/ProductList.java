package com.practice.products;

public class ProductList {
	private String prodname;
	private int prodqty;
	private String proddate;
	private int prodprice;
	public ProductList() {
		// TODO Auto-generated constructor stub
	}
	public ProductList(String prodname, int prodqty, String proddate, int prodprice) {
		super();
		this.prodname = prodname;
		this.prodqty = prodqty;
		this.proddate = proddate;
		this.prodprice = prodprice;
	}
	public int getProdprice() {
		return prodprice;
	}
	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getProdqty() {
		return prodqty;
	}
	public void setProdqty(int prodqty) {
		this.prodqty = prodqty;
	}
	public String getProddate() {
		return proddate;
	}
	public void setProddate(String proddate) {
		this.proddate = proddate;
	}
	

}
