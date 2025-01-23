package org.task;

public class Minus {
	public static void main(String[]args) {
		int[]a= {87,73,15,5,8};
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
				
			}
			
		}
		System.out.println("smallest number:"+min);
	}

}
