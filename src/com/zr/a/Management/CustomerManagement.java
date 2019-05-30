package com.zr.a.Management;

import java.util.Scanner;

import com.zr.a.Data.*;
import com.zr.a.Data.Customer;

/**
 * @author 屈刚
 *  会员类
 */
public class CustomerManagement {
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
				// 到时候添加 menu.setData(goods, customers);
				// 到时候添加 menu.showCustMMenu();
			} else {
				System.out.print("输入错误, 请重新'n'返回上一级菜单：");
				con = false;
			}
		} while (!con);
	}

	/**
	 * 循环增加会员：MY
	 */
	public void add() {
		System.out.println("潼关肉夹馍旗舰店 > 会员信息管理 > 修改会员信息\n\n");
		String con = "n";
		// 确定插入会员位置
		int index = -1;
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].customerID == 0) {
				index = i;
				break;
			}
		}

		do { // 循环录入会员信息
			Scanner input = new Scanner(System.in);
			System.out.print("请输入会员号(<4位整数>)：");
			int no = input.nextInt();
			System.out.print("请输入会员生日（月/日<用两位数表示>）：");
			String birth = input.next();
			System.out.print("请输入积分：");
			int score = input.nextInt();

			// 会员号无效则跳出
			if (no < 1000 || no > 9999) {
				System.out.println("客户号" + no + "是无效会员号！");
				System.out.println("录入信息失败\n");
				System.out.println("继续添加会员吗？（y/n）");
				con = input.next();
				continue;
			}
			// 添加会员

			customers[index].customerID = no;
			customers[index].customerBirth = birth;
			customers[index++].customerScore = score;
			System.out.println("新会员添加成功！");
			System.out.println("继续添加会员吗？（y/n）");
			con = input.next();
		} while ("y".equals(con) || "Y".equals(con));
		returnLastMenu();
	}

	/**
	 * 更改客户信息
	 */
	public void modify() {
		System.out.println("潼关肉夹馍旗舰店 > 会员信息管理 > 修改会员信息\n\n");
		System.out.print("请输入会员号：");
		Scanner input = new Scanner(System.in);
		int no = input.nextInt();
		System.out.println("  会员号            生日             积分      ");
		System.out.println("------------|------------|---------------");
		int index = -1;
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].customerID == no) {
				System.out.println(customers[i].customerID + "\t\t" + customers[i].customerBirth + "\t\t"
						+ customers[i].customerScore);
				index = i;
				break;
			}
		}

		if (index != -1) {
			while (true) {
				System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
				System.out.println("\t\t\t\t1.修 改 会 员 生 日.\n");
				System.out.println("\t\t\t\t2.修 改 会 员 积 分.\n");
				System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
				System.out.print("请选择，输入数字：");
				switch (input.nextInt()) {
				case 1:
					System.out.print("请输入修改后的生日：");
					customers[index].customerBirth = input.next();
					System.out.println("生日信息已更改！");
					break;
				case 2:
					System.out.print("请输入修改后的会员积分：");
					customers[index].customerScore = input.nextInt();
					System.out.println("会员积分已更改！");
					break;
				}

				System.out.println("是否修改其他属性(y/n):");
				String flag = input.next();
				;
				if ("n".equalsIgnoreCase(flag))
					break;
			}
		} else {
			System.out.println("抱歉，没有你查询的会员。");
		}

		// 返回上一级菜单
		returnLastMenu();

	}

	/**
	 * 查询客户的信息
	 */
	public void search() {
		System.out.println("潼关肉夹馍旗舰店 > 会员信息管理 > 修改会员信息\n\n");
		String con = "y";
		Scanner input = new Scanner(System.in);
		while (con.equals("y")) {
			System.out.print("请输入会员号：");
			int no = input.nextInt();
			System.out.println("  会员号                         生日                      积分      ");
			System.out.println("------------|------------|---------------");
			boolean isAvailable = false;
			for (int i = 0; i < customers.length; i++) {
				if (customers[i].customerID == no) {
					System.out.println(customers[i].customerID + "\t\t" + customers[i].customerBirth + "\t\t"
							+ customers[i].customerScore);
					isAvailable = true;
					break;
				}
			}
			if (!isAvailable) {
				System.out.println("抱歉，没有你查询的会员信息。");
			}
			System.out.print("\n要继续查询吗（y/n）:");
			con = input.next();
		}

		// 返回上一级菜单
		returnLastMenu();
	}

	/**
	 * 显示所有的会员信息
	 */
	public void show() {
		System.out.println("潼关肉夹馍旗舰店 > 会员信息管理 > 修改会员信息\n\n");
		System.out.println("  会员号                          生日                          积分      ");
		System.out.println("------------|------------|---------------");
		int length = customers.length;
		for (int i = 0; i < length; i++) {
			if (customers[i].customerID == 0) {
				break; // 客户信息已经显示完毕
			}
			System.out.println(customers[i].customerID + "\t\t" + customers[i].customerBirth + "\t\t"
					+ customers[i].customerScore);
		}

		// 返回上一级菜单
		returnLastMenu();
	}

}
