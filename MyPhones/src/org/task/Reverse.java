package org.task;

public class Reverse {
	public static void main(String[]args) {
		String w="nirmal";
		String rev="";
		
		for (int i= w.length()-1; i >= 0; i--) {
			//6-1=5,5>=0
			//5-1=4,4>=0
			//4-1=3,3>=0
			//3-1=2,2>=0
			//2-1=1,1>=0
			//1-1=0,0>=0
			rev=rev+w.charAt(i);
			//""+l=l
			//l+a=la0
			//la+m=lam
			//lam+r=lamr
			//lamr+i=lamri
			//lamri+n=lamrin
		}
		System.out.println(rev);
	}
	

}
