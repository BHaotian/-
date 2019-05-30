package com.zr.a.Management;

import java.util.Scanner;

import com.zr.a.Data.Customer;
import com.zr.a.Data.Gift;
import com.zr.a.Data.Goods;

/**
 * @author �����
 *  �������
 */
public class GiftManagement {
	/* ��Ʒ��Ϣ */
	public Goods goods[] = new Goods[50];
	/* ��Ա��Ϣ */
	public Customer customers[] = new Customer[100];

	/**
	 * �������ݿ�
	 */
	public void setData(Goods[] goods, Customer[] customers) { // �����ʹ��this������β����ı伴��
		this.goods = goods;
		this.customers = customers;
	}

	/**
	 * ������һ���˵�
	 */
	public void returnLastMenu() {
		System.out.print("\n\n�밴'n'������һ���˵�:");
		Scanner input = new Scanner(System.in);
		boolean con = true;
		do {
			if (input.next().equals("n")) {
				Menu menu = new Menu();
				menu.setData(goods, customers);
				menu.showSendGMenu();
			} else {
				System.out.print("�������, ������'n'������һ���˵���");
				con = false;
			}
		} while (!con);
	}

	/**
	 * ʵ�������ʺ���
	 */
	public void sendBirthCust() {
		System.out.println("������������콢�����ϵͳ > �����ʺ�\n\n");
		System.out.print("��������������(��/��<����λ��ʾ>)��");
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
			System.out.println("�����յĻ�Ա�ǣ�");
			System.out.println(id);
			System.out.println("��ϲ������" + goods[10].goodsName + " " + goods[6].goodsName);
		} else {
			System.out.println("����û�й����յĻ�Ա��");
		}

		// ������һ���˵�
		returnLastMenu();
	}

	/**
	 * ���˴����
	 */
	public void sendGoldenCust() {
		System.out.println("������������콢�����ϵͳ > ���˴����\n\n");
		int index = 0;
		int max = customers[0].customerScore;
		// �ٶ����ָ�����ͬ
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].customerScore == 0) {
				break; // �������Ϊ���û�
			}
			// �������ֵĿͻ�
			if (customers[i].customerScore > max) {
				max = customers[i].customerScore;
				index = i;
			}
		}
		System.out.println("������߻��ֵĻ�Ա�ǣ� " + customers[index].customerID + "\t" + customers[index].customerBirth + "\t"
				+ customers[index].customerScore);
		// �����������
		Gift laptop = new Gift();
		laptop.giftName = "����";
		laptop.giftPrice = 5;
		System.out.print("��ϲ��������Ʒ�� ");
		System.out.println(laptop);

		// ������һ���˵�
		returnLastMenu();
	}
}
