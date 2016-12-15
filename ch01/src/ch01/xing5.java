package ch01;

import java.util.Scanner;

public class xing5 {
	public static void main(String[] args) {
		System.out.println("欢迎使用管理系统");
		System.out.println("1.登陆系统");
		System.out.println("2.退出");
		System.out.println("请选择，输入数字：");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		switch (num) {
		case 1:
			System.out.println("欢迎使用管理系统");
			System.out.println("\n");
			System.out.println("1.客户信息管理\n");
			System.out.println("2.购物结算\n");
			System.out.println("3.注销\n");
			System.out.println("******************");
			System.out.println("请输入数字：");
			break;
			
		case 2:
			System.out.println("谢谢使用");
			break;

		default:
			System.out.println("输入错误。");
			break;
		}
	}
}
