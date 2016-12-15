package ch01;

import java.util.Scanner;

public class xing6 {
	public static void main(String[] args) {
		System.out.println("请输入消费金额：");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.println("是否参加优惠活动");
		System.out.println("1：满50元，加2元换百事可乐一瓶");
		System.out.println("2：满100元，加3元换500ml百事可乐一瓶");
		System.out.println("3：满100元，加10元换5公斤面粉");
		System.out.println("4：满200元，加10元换菜锅一个");
		System.out.println("5：满200元，加20元换爽肤水一瓶");
		System.out.println("0：不换购");
		System.out.println("请选择：");
		
		if (input.hasNextInt()==true){
			int xuan=input.nextInt();
			switch(xuan){
			case 1:
		if(num<50){
			System.out.println("对不起，您的消费金额不足50元");
			}else{
			System.out.println("本次消费总额："+(num+2));
			System.out.print("成功换购：百事可乐饮料1瓶");
				}
			break;
			case 2:
		if(num<100){
			System.out.println("对不起，您的消费金额不足100元");
		}else{
			System.out.println("本次消费总额："+(num+3));
			System.out.print("成功换购：500ml百事可乐饮料1瓶");
		}
			break;
			case 3:
		if(num<100){
			System.out.println("对不起，您的消费金额不足100元");
		}else{
			System.out.println("本次消费总额："+(num+10));
			System.out.print("成功换购：5公斤面粉");
		}
			break;
			case 4:
			if(num<200){
				System.out.println("对不起，您的消费金额不足200元");
			}else{
				System.out.println("本次消费总额："+(num+10));
				System.out.print("成功换购：炒菜锅一个");
			}
			break;	
			case 5:
			if(num<200){
				System.out.println("对不起，您的消费金额不足200元");
			}else{
				System.out.println("本次消费总额："+(num+20));
				System.out.print("成功换购：爽肤水一瓶");
		}
			break;
		
			case 0:
				System.out.println("不换购");
			break;
		}
			
		}
		
		}
		
	}
	

