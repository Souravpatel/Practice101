package com.practice.products.main;

import com.practice.products.ProductList;

public class MainClass {
	public static void main(String[] args)
	{
		ProductList pl = new ProductList("Bluetooth Speaker",50,"15.2.2020",1500);
		
		System.out.println("PRODUCT DETAILS \n 1. TYPE:"+pl.getProdname()+"\n QUANTITY: "+pl.getProdqty()+"\n MFD: "+pl.getProddate()+"\n PRICE: "+pl.getProdprice());
	}

}
