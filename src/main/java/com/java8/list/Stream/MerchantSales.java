package com.java8.list.Stream;



public class MerchantSales {

	       @Override
	public String toString() {
		return "MerchantSales [merchant=" + merchant + ", sales=" + sales + "]";
	}
		public MerchantSales(Merchant merchant2, int computeSales) {
		// TODO Auto-generated constructor stub
			merchant = merchant2;
			sales = computeSales;
	}
		Merchant merchant;
	       double sales;
		public Merchant getMerchant() {
			return merchant;
		}
		public void setMerchant(Merchant merchant) {
			this.merchant = merchant;
		}
		public double getSales() {
			return sales;
		}
		public void setSales(double sales) {
			this.sales = sales;
		}


}
