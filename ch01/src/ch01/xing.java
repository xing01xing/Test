package ch01;

public class xing {
	
	public static void main(String[] args) {
		int row=5;
		for (int i =1 ; i<=row ; i++) {
			
		for (int j = 0; j<row-i ; j++) {
			System.out.print(" ");
		}
		for (int j=0;j<2*i-1;j++){
			
			System.out.print("*");
		
		}
		System.out.println();
	}
	
	}
}
