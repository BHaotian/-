package com.zr.a.Data;

/**
 * ��ʼ������
 */
public class Data {
	/* ��Ʒ��Ϣ */
	public Goods goods[] = new Goods[50];
	/* ��Ա��Ϣ */
	public Customer customers[] = new Customer[100];
	/* ����Ա */
	public Manager manager = new Manager();

	public void ini() {
		for (int i = 0; i < goods.length; i++) {
			goods[i] = new Goods();
		}

		// ��Ʒ0
		goods[0].goodsName = "���������";
		goods[0].goodsPrice = 10;

		// ��Ʒ1
		goods[1].goodsName = "�������Ĥ";
		goods[1].goodsPrice = 12;

		// ��Ʒ2
		goods[2].goodsName = "���������";
		goods[2].goodsPrice = 15;

		// ��Ʒ3
		goods[3].goodsName = "���������";
		goods[3].goodsPrice = 12;

		// ��Ʒ4
		goods[4].goodsName = "����˿�����";
		goods[4].goodsPrice = 8;

		// ��Ʒ5
		goods[5].goodsName = "�˱����Ӽ���";
		goods[5].goodsPrice = 8;

		// ��Ʒ6
		goods[6].goodsName = "������Ƥ";
		goods[6].goodsPrice = 12;

		// ��Ʒ7
		goods[7].goodsName = "�齴��Ƥ";
		goods[7].goodsPrice = 12;

		// ��Ʒ8
		goods[8].goodsName = "˫����Ƥ";
		goods[8].goodsPrice = 12;

		// ��Ʒ9
		goods[9].goodsName = "������Ƥ";
		goods[9].goodsPrice = 12;

		// ��Ʒ10
		goods[10].goodsName = "����";
		goods[10].goodsPrice = 3;

		// ��Ʒ11
		goods[11].goodsName = "ѩ��";
		goods[11].goodsPrice = 3;

		for (int i = 0; i < customers.length; i++) {
			customers[i] = new Customer();
		}
		// �ͻ�1
		customers[0].customerID = 0001;
		customers[0].customerBirth = "02/15";
		customers[0].customerScore = 200;
		// �ͻ�2
		customers[1].customerID = 0002;
		customers[1].customerBirth = "06/26";
		customers[1].customerScore = 400;
		// �ͻ�3
		customers[2].customerID = 0003;
		customers[2].customerBirth = "05/09";
		customers[2].customerScore = 500;
		// �ͻ�4
		customers[3].customerID = 0004;
		customers[3].customerBirth = "09/18";
		customers[3].customerScore = 220;
		// �ͻ�5
		customers[4].customerID = 0005;
		customers[4].customerBirth = "08/19";
		customers[4].customerScore = 500;
		// �ͻ�6
		customers[5].customerID = 0006;
		customers[5].customerBirth = "12/06";
		customers[5].customerScore = 700;
		// �ͻ�7
		customers[6].customerID = 0007;
		customers[6].customerBirth = "12/21";
		customers[6].customerScore = 1000;
	}
}
