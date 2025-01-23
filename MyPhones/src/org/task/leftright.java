package org.task;
public class leftright {
	public static void main(String[]args) {
		int i;
		int j;
		int row=5;
		for ( i = 0; i <row; i++) {
			//0<5=true,0+1=1
			//1<5=true,1+1=2
			//2<5=true,2+1=3
			//3<5=true,3+1=4
			//4<5=true
		
				//0<=0=true,0+1
				//1<=0=false
				
				//0<=1=true,0+1
				//1<=1=true,1+1
				//2<=1=false....
				
				//0<=2=true,0+1
				//1<=2=true,1+1
				//2<=2=true,2+1
				//3<=2=false....
				
				for (j = 0; j <=i; j++) {
					System.out.print("* ");
					
				}
				//0<=3=true,0+1
				//1<=3=true,1+1
				//2<=3=true,2+1
				//3<=3=true,3+1
				//4<=3=false...
				
				//0<=4=true,0+1
				//1<=4=true,1+1
				//2<=4=true,2+1
				//3<=4=true,3+1
				//4<=4=true,4+1
				//5<=4=false....
				
		
				
			
			System.out.println();
			
		}
	}
}
	


