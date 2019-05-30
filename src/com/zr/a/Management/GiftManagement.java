package com.zr.a.Management;

import java.util.Scanner;

import com.zr.a.Data.Customer;
import com.zr.a.Data.Gift;
import com.zr.a.Data.Goods;

/**
 * @author 白昊天
 *  真情回馈
 */
public class GiftManagement {
	/* 商品信息 */
	public Goods goods[] = new Goods[50];
	/* 会员信息 */
	public Customer customers[] = new Customer[100];

	/**
	 * 传递数据库
	 */
	public void setData(Goods[] goods, Customer[] customers) { // 如果不使用this，请把形参名改变即可
		this.goods = goods;
		this.customers = customers;
	}

	/**
	 * 返回上一级菜单
	 */
	public void returnLastMenu() {
		System.out.print("\n\n请按'n'返回上一级菜单:");
		Scanner input = new Scanner(System.in);
		boolean con = true;
		do {
			if (input.next().equals("n")) {
				Menu menu = new Menu();
				menu.setData(goods, customers);
				menu.showSendGMenu();
			} else {
				System.out.print("输入错误, 请重新'n'返回上一级菜单：");
				con = false;
			}
		} while (!con);
	}

	/**
	 * 实现生日问候功能
	 */
	public void sendBirthCust() {
		System.out.println("老潼关肉夹馍旗舰店管理系统 > 生日问候\n\n");
		System.out.print("请输入今天的日期(月/日<用两位表示>)：");
		Scanner input = new Scanner(System.in);
		String date = input.next();
		System.out.println(date);
		String id = "";
		boolean isAvailable = false;
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].customerBirth != null && customers[i].customerBirth.equals(date)) {
				id = id + customers[i].customerID + "\n";
				isAvailable = true;
			}
		}
		if (isAvailable) {
			System.out.println("过生日的会员是：");
			System.out.println(id);
			System.out.println("恭喜！获赠" + goods[10].goodsName + " " + goods[6].goodsName);
		} else {
			System.out.println("今天没有过生日的会员！");
		}

		// 返回上一级菜单
		returnLastMenu();
	}

	/**
	 * 幸运大放送
	 */
	public void sendGoldenCust() {
		System.out.println("老潼关肉夹馍旗舰店管理系统 > 幸运大放送\n\n");
		int index = 0;
		int max = customers[0].customerScore;
		// 假定积分各不相同
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].customerScore == 0) {
				break; // 数组后面为空用户
			}
			// 求最大积分的客户
			if (customers[i].customerScore > max) {
				max = customers[i].customerScore;
				index = i;
			}
		}
		System.out.println("具有最高积分的会员是： " + customers[index].customerID + "\t" + customers[index].customerBirth + "\t"
				+ customers[index].customerScore);
		// 创建冰峰对象
		Gift laptop = new Gift();
		laptop.giftName = "冰峰";
		laptop.giftPrice = 5;
		System.out.print("恭喜！获赠礼品： ");
		System.out.println(laptop);

		// 返回上一级菜单
		returnLastMenu();
	}
}
