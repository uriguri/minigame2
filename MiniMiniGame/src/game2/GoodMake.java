package game2;

import java.util.Scanner;

public class GoodMake {

	Scanner sc = new Scanner(System.in);
	
	String drink;

	String goodMake (String var1, String var2, String var3) {
		
		if(var1.equals("물") && var2.equals("커피") && var3.equals("없음")) {
			System.out.println("**************************");
			System.out.println("아메리카노 완성");
			System.out.println("**************************");
			drink = "아메리카노";
		} else if (var1.equals("물") && var2.equals("없음") && var3.equals("커피")){
			System.out.println("**************************");
			System.out.println("아메리카노 완성");
			System.out.println("**************************");
			drink = "아메리카노";
			
		} else if (var1.equals("우유") && var2.equals("커피") && var3.equals("없음")){
			System.out.println("**************************");
			System.out.println("카페 라떼 완성");
			System.out.println("**************************");
			drink = "카페라떼";
		} else if (var1.equals("우유") && var2.equals("없음") && var3.equals("커피")){
			System.out.println("**************************");
			System.out.println("카페 라떼 완성");
			System.out.println("**************************");
			drink = "카페라떼";
			
		} else if (var1.equals("우유") && var2.equals("바닐라") && var3.equals("커피")){
			System.out.println("**************************");
			System.out.println("바닐라 라떼 완성");
			System.out.println("**************************");
			drink = "바닐라라떼";
		} else if (var1.equals("우유") && var2.equals("커피") && var3.equals("바닐라")){
			System.out.println("**************************");
			System.out.println("바닐라 라떼 완성");
			System.out.println("**************************");
			drink = "바닐라라떼";
			
		} else if (var1.equals("우유") && var2.equals("초코") && var3.equals("커피")){
			System.out.println("**************************");
			System.out.println("카페 모카 완성");
			System.out.println("**************************");
			drink = "카페모카";
		} else if (var1.equals("우유") && var2.equals("커피") && var3.equals("초코")){
			System.out.println("**************************");
			System.out.println("카페 모카 완성");
			System.out.println("**************************");
			drink = "카페모카";
		} else 
			System.out.println("음료 제조에 실패했습니다~~T.T");
		
		return drink;
	}

	
	
	/*
	 if(var1.equals("물") && var2.equals("커피") && var3.equals("없음")) {
			String dirnk1 = "아메리카노";
			System.out.println("**************************");
			System.out.println("아메리카노 완성");
			System.out.println("**************************");
		} else if (var1.equals("물") && var2.equals("없음") && var3.equals("커피")) {
			String drink1 =  "아메리카노";
			System.out.println("**************************");
			System.out.println("아메리카노 완성");
			System.out.println("**************************");
		} 
	  
	
	 */

	
	
	
}
