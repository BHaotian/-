package com.zr.a.Data;

/**
 * 初始化数据
 */
public class Data {
	/* 商品信息 */
	public Goods goods[] = new Goods[50];
	/* 会员信息 */
	public Customer customers[] = new Customer[100];
	/* 管理员 */
	public Manager manager = new Manager();

	public void ini() {
		for (int i = 0; i < goods.length; i++) {
			goods[i] = new Goods();
		}

		// 商品0
		goods[0].goodsName = "金牌肉夹馍";
		goods[0].goodsPrice = 10;

		// 商品1
		goods[1].goodsName = "纯瘦肉夹膜";
		goods[1].goodsPrice = 12;

		// 商品2
		goods[2].goodsName = "优质肉夹馍";
		goods[2].goodsPrice = 15;

		// 商品3
		goods[3].goodsName = "臊子肉夹馍";
		goods[3].goodsPrice = 12;

		// 商品4
		goods[4].goodsName = "土豆丝肉夹馍";
		goods[4].goodsPrice = 8;

		// 商品5
		goods[5].goodsName = "八宝辣子夹馍";
		goods[5].goodsPrice = 8;

		// 商品6
		goods[6].goodsName = "秘制凉皮";
		goods[6].goodsPrice = 12;

		// 商品7
		goods[7].goodsName = "麻酱凉皮";
		goods[7].goodsPrice = 12;

		// 商品8
		goods[8].goodsName = "双椒凉皮";
		goods[8].goodsPrice = 12;

		// 商品9
		goods[9].goodsName = "秦镇米皮";
		goods[9].goodsPrice = 12;

		// 商品10
		goods[10].goodsName = "可乐";
		goods[10].goodsPrice = 3;

		// 商品11
		goods[11].goodsName = "雪碧";
		goods[11].goodsPrice = 3;

		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer();
		}
		// 客户1
		customers[0].customerID = 0001;
		customers[0].customerBirth = "02/15";
		customers[0].customerScore = 200;
		// 客户2
		customers[1].customerID = 0002;
		customers[1].customerBirth = "06/26";
		customers[1].customerScore = 400;
		// 客户3
		customers[2].customerID = 0003;
		customers[2].customerBirth = "05/09";
		customers[2].customerScore = 500;
		// 客户4
		customers[3].customerID = 0004;
		customers[3].customerBirth = "09/18";
		customers[3].customerScore = 220;
		// 客户5
		customers[4].customerID = 0005;
		customers[4].customerBirth = "08/19";
		customers[4].customerScore = 500;
		// 客户6
		customers[5].customerID = 0006;
		customers[5].customerBirth = "12/06";
		customers[5].customerScore = 700;
		// 客户7
		customers[6].customerID = 0007;
		customers[6].customerBirth = "12/21";
		customers[6].customerScore = 1000;
	}
}
