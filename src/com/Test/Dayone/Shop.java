package com.Test.Dayone;

public class Shop {
	
	public static void main(String[] args) {
		
		Shopper shop = new Shopper();
		shop.addMoney(10);
		shop.addMoney(15);
		shop.addMoney(35);
		shop.addMoney(40);
		shop.addMoney(25);
		shop.addMoney(45);
		System.out.println(shop.getMoney());
		
		
		
	}

}
