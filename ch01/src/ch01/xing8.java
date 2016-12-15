package ch01;

import java.util.Scanner;

public class xing8 {
	public static void main(String[] args) {
		String jige;
		Scanner input=new Scanner(System.in);
		System.out.println("及格了吗?(y/n)");
		jige=input.next();
		while(!"y".equals(jige)){
			System.out.println("上午阅读材料");
			System.out.println("下午上机编程\n");
			System.out.println("及格了吗?(y/n)：");
			jige=input.next();
		}
		System.out.println("完成学习任务");
	}
}
