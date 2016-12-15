package ch01;

import java.util.Scanner;

public class xing3 {
	public static void main(String[] args) {
		System.out.println("添加用户信息\n");
		System.out.println("请输入你要添加用户的数量：");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		for (int i =1 ; i <=num; i++) {
			System.out.println("请输入用户编号:");
			int num1=input.nextInt();
			System.out.println("请输入用户的年龄：");
			int num2=input.nextInt();
			if(num2<18){
				System.out.println("不满18岁你不能玩游戏");
				continue;
			}
			System.out.println(" 你输入的信息是:");
			System.out.println("编号是："+num1+"年龄是"+num2);
			System.out.println();
			
		}
	}
}
