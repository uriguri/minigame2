package game2;

public class Customer {

	// 손님은 주문을 합니다.
	public String customer() {
		String menu = menuChoice();
		System.out.println("*******게임을 시작합니다*******");
		System.out.println("손님이 주문을 하러 왔습니다. 뚜벅뚜벅");
		System.out.println("손님  : >> "+ menu + "주세요");
		System.out.println("**************************");
		return menu;
	}
	
	// 손님은 메뉴를 4가지중에 하나를 골라야함.
	public String menuChoice() {
		
		int cnt=0;
		String[] menuList = {"아메리카노", "카페라떼", "카페모카", "바닐라라떼"};
		cnt = (int) (Math.random()*4);
		String mc = menuList[cnt];
		return mc;
	}
}

