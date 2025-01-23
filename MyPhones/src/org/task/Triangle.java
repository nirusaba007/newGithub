package org.task;

public class Triangle {
public static void main(String[]args) {
	int k;
	int l;
	int row=6;
	for (k = 0; k<row; k++) {
		//0<6=true,
		for (l =row-k; l>1;l--) {
			//l=6-1=5,5>1
			System.out.print(" ");
		}
			for (l=0; l <=k; l++) {
				//0<6,0+1=1
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		
	}
}

