package ch01;

import java.util.Scanner;

public class xing5 {
	public static void main(String[] args) {
		System.out.println("��ӭʹ�ù���ϵͳ");
		System.out.println("1.��½ϵͳ");
		System.out.println("2.�˳�");
		System.out.println("��ѡ���������֣�");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		switch (num) {
		case 1:
			System.out.println("��ӭʹ�ù���ϵͳ");
			System.out.println("\n");
			System.out.println("1.�ͻ���Ϣ����\n");
			System.out.println("2.�������\n");
			System.out.println("3.ע��\n");
			System.out.println("******************");
			System.out.println("���������֣�");
			break;
			
		case 2:
			System.out.println("ллʹ��");
			break;

		default:
			System.out.println("�������");
			break;
		}
	}
}
