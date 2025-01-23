package org.phone;

public class Minimums {
	public static void name(String[]args) {
		int[]x= {53,97,165,992,25};
		int min=x[0];
		for (int i =0; i < x.length; i++) {
			//1<6=true,1+1
			//2<6=true,2+1
			//3<6=true,3+1
			//4<6=true,4+1
			//5<6=true,5+1
			//6<6=false
			if (x[i]<min) {
				min=x[i];
				//x[0]<x[0]
				//53<53(false)
				//97<53(true)
				//min=53
				//53<165(false)
				//53<992(true)
				//53<254(false)
				//53<25(true)
				//min=25
				
				
				
				
			}
		}
		
		
		System.out.println("smallest number is:"+min);
	}
		
	}


