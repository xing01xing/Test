package ch01;

import java.util.Scanner;

public class xing8 {
	public static void main(String[] args) {
		String jige;
		Scanner input=new Scanner(System.in);
		System.out.println("��������?(y/n)");
		jige=input.next();
		while(!"y".equals(jige)){
			System.out.println("�����Ķ�����");
			System.out.println("�����ϻ����\n");
			System.out.println("��������?(y/n)��");
			jige=input.next();
		}
		System.out.println("���ѧϰ����");
	}
}
