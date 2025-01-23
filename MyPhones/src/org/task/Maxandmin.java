package org.task;

public class Maxandmin {
	public static void main(String[]args) {
		int[]z= {73,99,535,67,89};
		int max=0;
		int min=z[0];
		for (int i = 0; i < z.length; i++) {
			if(z[i]>max) {
				max=z[i];
				//73>0
				//99>73
				//535>99
				//67>535(false)
				//max=535
				//89>535(false)
					
				
				
		}
			else if (z[i]<min) {
				min=z[i];
				//67<73
				//99<67
				
			}
				
				
				
			}
		System.out.println("largest number is:"+max);
		System.out.println("smallest number is:"+min);
			
		
}
}

		
		
	


