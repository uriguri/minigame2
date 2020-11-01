package game2;

import java.util.Scanner;

public class Player {

	// 일정한 회수가 지나면 fals로 변경해 게임이 종료되도록 함.(라이프개념)
	boolean game2Continue = true;
	int game2Life = 5;
	String drink;
	
	//플레이어는 음료를 만든다
	void makeDrink() {
		
		// 계속 실행되도록 반복문 
		while(game2Continue) {
			
		// 음료의 재료를 입력받을 스캐너
		Scanner sc = new Scanner(System.in);
		
		// 게임 시작시 화면 
		System.out.println("**************************");
		System.out.println("남은 목숨 : "+game2Life);
		System.out.println("준비된 재료 리스트를 확인 하세요.");
		System.out.println("|물|우유|커피|바닐라|초코|없음");
		System.out.println("**************************");
		
		// 메인재료 선택하기
		System.out.println("메인 재료를 하나 선택해 입력해주세요(물or우유)");
		String var1 = sc.nextLine();
		System.out.println("메인에 넣을 재료는 = " +var1);
		
		// 메인재료 예외처리
		if(var1.equals("물") || var1.equals("우유")){
			System.out.println("메인 재료를 넣었습니다^0^");
		} else {
			--game2Life;
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T 남은목숨"+ game2Life);
			if(game2Life==0) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
			
		// 추가재료 선택하기
		System.out.println("추가재료를 입력해주세요(커피or바닐라or초코or없음)");
		String var2 = sc.nextLine();
		System.out.println("두 번째 선택한 재료는 = " +var2);
		
		// 추가재료 예외처리
		if(var2.equals("커피") || var2.equals("바닐라") || var2.equals("초코")||var2.equals("없음")){
			System.out.println("추가 재료를 넣었습니다^0^");
		} else {
			--game2Life;
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T 남은목숨"+ game2Life);
			if(game2Life==0) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
		
		// 추가재료 선택하기2
		System.out.println("추가재료를 입력해주세요(커피or바닐라or초코or없음).");
		String var3 = sc.nextLine();
		System.out.println("세 번째 선택한 재료는 = " +var3);
		
		// 추가재료 예외처리2
		if(var3.equals("커피") || var3.equals("바닐라") || var3.equals("초코")||var3.equals("없음")){
			System.out.println("추가 재료를 넣었습니다^0^");
		} else {
			--game2Life;
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T 남은목숨"+ game2Life);
			if(game2Life==0) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
		
		GoodMake good = new GoodMake();
		good.goodMake(var1, var2, var3);
		Customer menu = new Customer();
		String cDrink = menu.customer();
		String pDrink = good.drink;
		
		if(cDrink.equals(pDrink)) {
			System.out.println("잘 마셨습니다~ ^^ 포인트 +100");
			break;
		} else {
			--game2Life;
			System.out.println("더럽게 맛 없네 다신 안와!!!!!!!! 남은목숨 : " +game2Life);
			if(game2Life==0) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			continue;
		}
		
	
		}
		}
	}
	

}


