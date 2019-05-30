package com.zr.a.Data;
/**
 * Gift.java
 * 礼品类
 */
public class Gift {
	
	 public String giftName;
	 public double giftPrice;
     
     public String toString(){
    	 return "一个价值￥" + giftPrice + "的" + giftName;
     }
     
}
