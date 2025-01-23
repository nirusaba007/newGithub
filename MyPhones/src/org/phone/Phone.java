package org.phone;

public class Phone {
	private void phoneInfo() {
		System.out.println("phone info is about:realme");
	}
	private void phoneInfo(double phonePrice,String phoneDpi) {
		System.out.println("phone dpi sensitivity is:"+phoneDpi+'\t'+"phone price range is:"+phonePrice);
	}
	public static void main(String[]args) {
		Phone m5=new Phone();
		m5.phoneInfo();
		m5.phoneInfo(25.0000, "25hrtz");
	}

}
