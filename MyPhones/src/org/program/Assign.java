package org.program;

public class Assign {
	public static void main(String[] args) {
		int max=0;
		int[]y= {99,53,726,33,12};
		for (int i = 0; i < y.length; i++) {
			//0<5=true;0+1
			//1<5=true;1+1
			//2<5=true;2+1
			//3<5=true;3+1
			//4<5=true;4+1
			//5<5=false;loop  will be terminated.
			if (y[i]>max) {
				max=y[i];
				//y[0]>max
				//max=99
				//y[1]>max(false)
				//y[2]>max(true)
				//max=726
				//y[3]>max(true)
				//y[4]>max(true)
				
				
				//max=726;
				
			}
			
		}
		
	
System.out.println("largest number: "+ max);

	}
}


