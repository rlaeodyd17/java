package app;

import vo.TV;

public class TvApp {

	public static void main(String[] args) {
		
		TV pr1 = new TV();
		
		TV pr2 = new TV("Samsung","SmartTV", "200,000원");
		
		pr1.setCompany("Samsung");
		pr1.setModel("SmartTV");
		pr1.setPrice("200,000원");
		
		System.out.println("제조사 : " + pr1.getCompany());
		System.out.println("모델명 : " + pr1.getModel());
		System.out.println("가격 (원): " + pr1.getPrice());

		System.out.println("제조사 : " + pr2.getCompany() + "모델명 :" + pr2.getModel() + "가격 : " + pr2.getPrice());
		
		
		
	}//main() end
	
}//TvApp end 
