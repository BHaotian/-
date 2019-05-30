package com.zr.a.Management;

import java.util.Scanner;

import com.zr.a.Data.Customer;
import com.zr.a.Data.Goods;

/**
 * @author ������ 
 *  �˵���
 */
public class Menu {

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
	 * ��ʾ������������콢��ĵ�¼�˵�
	 */
	public void showLoginMenu() {
		System.out.println("\n\n\t\t\t    ��ӭ����������������콢��\n\n");
		System.out.println("===============================================================================\n");
		System.out.println("\t\t\t\t 1. �� ¼ ϵ ͳ\n\n");
		System.out.println("\t\t\t\t 2. �� �� �� �� Ա �� ��\n\n");
		System.out.println("\t\t\t\t 3. �� ��\n\n");
		System.out.println("===============================================================================\n");
		System.out.print("��ѡ��,��������:");
	}

	/**
	 * ��ʾ������������콢������˵�
	 */
	public void showMainMenu() {
		System.out.println("\n\n\t\t\t\t��ӭʹ��������������콢�����ϵͳ\n");
		System.out.println("===============================================================================\n");
		System.out.println("\t\t\t\t 1. �� �� �� Ϣ �� ��\n");
		System.out.println("\t\t\t\t 2. �� �� �� ��\n");
		System.out.println("\t\t\t\t 3. �� �� �� ��\n");
		System.out.println("\t\t\t\t 4. ע ��\n");
		System.out.println("===============================================================================\n");
		System.out.print("��ѡ��,��������:");

		Scanner input = new Scanner(System.in);
		boolean con = false;
		do {
			String num = input.next();
			if (num.equals("1")) {
				// ��ʾ�ͻ���Ϣ����˵�
				showCustMMenu();
				break;
			} else if (num.equals("2")) {
				// ��ʾ�������˵�
				Pay pay = new Pay();
				pay.setData(goods, customers);
				pay.calcPrice();
				break;
			} else if (num.equals("3")) {
				// ��ʾ��������˵�
				showSendGMenu();
				break;
			} else if (num.equals("4")) {
				showLoginMenu();
				break;
			} else {
				System.out.print("��������������������֣�");
				con = false;
			}
		} while (!con);
	}

	/**
	 * �ͻ���Ϣ����˵�
	 */

	public void showCustMMenu() {
		System.out.println("������������콢�����ϵͳ > �ͻ���Ϣ����\n");
		System.out.println("===============================================================================\n");
		System.out.println("\t\t\t\t 1. �� ʾ �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t\t\t 2. �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t\t\t 3. �� �� �� �� �� Ϣ\n");
		System.out.println("\t\t\t\t 4. �� ѯ �� �� �� Ϣ\n");
		System.out.println("===============================================================================\n");
		System.out.print("��ѡ��,�������ֻ�'n'������һ���˵�:");
		Scanner input = new Scanner(System.in);

		boolean con = true; // �����������˵��Ŵ���
		do {
			CustomerManagement cm = new CustomerManagement();
			cm.setData(goods, customers);
			String num = input.next();
			if (num.equals("1")) {
				cm.show();
				break;
			} else if (num.equals("2")) {
				cm.add();
				break;
			} else if (num.equals("3")) {
				cm.modify();
				break;
			} else if (num.equals("4")) {
				cm.search();
				break;

			} else if (num.equals("n")) {
				showMainMenu();
				break;
			} else {
				System.out.println("�������, �������������֣�");
				con = false;
			}
		} while (!con);
	}

	/**
	 * ��ʾ������������콢�����������˵�
	 */
	public void showSendGMenu() {
		System.out.println("������������콢�����ϵͳ > �������\n");
		System.out.println("===============================================================================\n");
		System.out.println("\t\t\t\t 1. �� �� �� �� ��\n");
		System.out.println("\t\t\t\t 2. �� �� �� ��\n");
		System.out.println("===============================================================================\n");
		System.out.print("��ѡ��,�������ֻ�'n'������һ���˵�:");
		Scanner input = new Scanner(System.in);

		boolean con = true; // �����������˵��Ŵ���
		GiftManagement gm = new GiftManagement();
		gm.setData(goods, customers);
		do {
			String num = input.next();
			if (num.equals("1")) {
				// ���˴����
				gm.sendGoldenCust();
				break;
			} else if (num.equals("2")) {
				// �����ʺ�
				gm.sendBirthCust();
				break;
			} else if (num.equals("n")) {
				showMainMenu();
				break;
			} else {
				System.out.println("�������, �������������֣�");
				con = false;
			}
		} while (!con);
	}
}
