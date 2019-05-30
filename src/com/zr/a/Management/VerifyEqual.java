package com.zr.a.Management;
/**
 * @author 白昊天
 *  验证管理员的用户名和密码是否相等
 *
 */
import java.util.Scanner;

public class VerifyEqual {
	public boolean verify(String username, String password) {
		System.out.print("请输入用户名：");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.print("请输入密码：");
		input = new Scanner(System.in);
		String psw = input.next();
		if (name.equals(username) && password.equals(psw)) {
			return true;
		} else {
			return false;
		}
	}

}
