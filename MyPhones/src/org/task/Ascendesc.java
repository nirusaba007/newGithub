package org.task;



public class Ascendesc {
	public static void main(String[]args) {
		int t[]= {873,555,919,387,280};
		int c=0;
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				if (t[i]>t[j]) {
					c=t[i];
					t[i]=t[j];
					t[j]=c;
					
					
				}
				
			}
			
		}
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
			
			//for (int j = 0; j < t.length; j++) {
				//System.out.println(t[j]);
				
			
		}
		
		
	}

}
