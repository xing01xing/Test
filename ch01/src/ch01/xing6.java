package ch01;

import java.util.Scanner;

public class xing6 {
	public static void main(String[] args) {
		System.out.println("���������ѽ�");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.println("�Ƿ�μ��Żݻ");
		System.out.println("1����50Ԫ����2Ԫ�����¿���һƿ");
		System.out.println("2����100Ԫ����3Ԫ��500ml���¿���һƿ");
		System.out.println("3����100Ԫ����10Ԫ��5�������");
		System.out.println("4����200Ԫ����10Ԫ���˹�һ��");
		System.out.println("5����200Ԫ����20Ԫ��ˬ��ˮһƿ");
		System.out.println("0��������");
		System.out.println("��ѡ��");
		
		if (input.hasNextInt()==true){
			int xuan=input.nextInt();
			switch(xuan){
			case 1:
		if(num<50){
			System.out.println("�Բ����������ѽ���50Ԫ");
			}else{
			System.out.println("���������ܶ"+(num+2));
			System.out.print("�ɹ����������¿�������1ƿ");
				}
			break;
			case 2:
		if(num<100){
			System.out.println("�Բ����������ѽ���100Ԫ");
		}else{
			System.out.println("���������ܶ"+(num+3));
			System.out.print("�ɹ�������500ml���¿�������1ƿ");
		}
			break;
			case 3:
		if(num<100){
			System.out.println("�Բ����������ѽ���100Ԫ");
		}else{
			System.out.println("���������ܶ"+(num+10));
			System.out.print("�ɹ�������5�������");
		}
			break;
			case 4:
			if(num<200){
				System.out.println("�Բ����������ѽ���200Ԫ");
			}else{
				System.out.println("���������ܶ"+(num+10));
				System.out.print("�ɹ����������˹�һ��");
			}
			break;	
			case 5:
			if(num<200){
				System.out.println("�Բ����������ѽ���200Ԫ");
			}else{
				System.out.println("���������ܶ"+(num+20));
				System.out.print("�ɹ�������ˬ��ˮһƿ");
		}
			break;
		
			case 0:
				System.out.println("������");
			break;
		}
			
		}
		
		}
		
	}
	

