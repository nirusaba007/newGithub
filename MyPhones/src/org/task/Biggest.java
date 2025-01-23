package org.task;

public class Biggest {
	public static void main(String[]args) {
		int[]n= {99,28,243,15,60};
		int first =0;
		int third=0;
		
		for (int i = 0; i < n.length; i++) {
			//0<5;true,0+1
			
			//1<5,true,1+1
			//2<5,true,2+1
			//3<5,true,3+1
			//4<5,true,4+1
			//5<5,false(terminate)
			if (n[i]>first) {
				//n[0]=99>0(true)
				//n[1]=28>99(false)
				//n[2]=243>99(true)
				//n[3]=15>243(false)
				
				third=first;
				//99
				first=n[i];
				//first=99
				//first=243
				
			}
				
				else if (n[i]>third) {
					//28>0(true)
					//15>99
					
					
				}
				
				
			}
		System.out.println(first);
		System.out.println(third);
			
		}
		
	}


