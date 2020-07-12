package com.java8.list.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class FindTopMerchantSale {
	List<Merchant> m = new ArrayList<>();
	static int loop = 50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindTopMerchantSale o = new FindTopMerchantSale();
		List<Merchant> z = new ArrayList<>();
		o.m.add(new Merchant("Mike"));
		o.m.add(new Merchant("Alex"));
		System.out.println("Before: "+o.m);
		z = o.findTopMerchantsDataExample(o.m,10);
		System.out.println("After: "+z);

	}

	 List<Merchant> findTopMerchantsDataExample(List<Merchant> merchants, int month) {
		   // Local class
//		   @Data 
//		   class MerchantSales {
//		      final Merchant merchant;
//		      final double sales;
//		   }
		 
		List<Merchant> m = new ArrayList<>();
//		System.out.println("Before: "+merchants);
		  m = merchants.stream()
		       .map(merchant -> new MerchantSales(merchant, computeSales( month)))
		       .sorted((m2, m1) -> Double.compare(m2.getSales(), m1.getSales()))
		       .map(MerchantSales::getMerchant)
		       .collect(Collectors.toList());
//		       .collect(toList());
//		  System.out.println("After: "+m);
		   return m;
		}
	
	private  int computeSales(int month) {
		// TODO Auto-generated method stub
		loop = loop - month;
		System.out.println(loop);
		return loop;
	}

//	List<Merchant> findTopMerchantsRecordExample(List<Merchant> merchants, int month) {
//		 
//		   // Local record
//		   record MerchantSales(Merchant merchant, double sales) {}
//		 
//		   return merchants.stream()
//		       .map(merchant -> new MerchantSales(merchant, computeSales(merchant, month)))
//		       .sorted((m1, m2) -> Double.compare(m2.getSales(), m1.getSales()))
//		       .map(MerchantSales::getMerchant)
//		       .collect(toList());
//		}
	
}
