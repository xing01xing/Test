package ch01;

import java.util.Scanner;

public class xing3 {
	public static void main(String[] args) {
		System.out.println("����û���Ϣ\n");
		System.out.println("��������Ҫ����û���������");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		for (int i =1 ; i <=num; i++) {
			System.out.println("�������û����:");
			int num1=input.nextInt();
			System.out.println("�������û������䣺");
			int num2=input.nextInt();
			if(num2<18){
				System.out.println("����18���㲻������Ϸ");
				continue;
			}
			System.out.println(" ���������Ϣ��:");
			System.out.println("����ǣ�"+num1+"������"+num2);
			System.out.println();
			
		}
	}
}
