package game2;
/*
  	음료를 만들자 miniGame ver0.1
  	제작 : 한우리
  	제작일 : 2020 - 10 - 31
  	설명 : 손님은 음료 4개 중 무작위로 주문한다 {아메리카노, 카페라떼, 카페모카, 바닐라라떼}
  		   플레이어는 주어진 재료 {물, 우유, 커피, 초코, 바닐라} 를 입력한다.
  		  만들어진 음료는 손님이 주문한 음료와 비교하여 포인트를 얻는다!
  		  
  	추가하고 싶은 기능 : Thread를 이용한 미니게임 시간 제한 기능
  					음료를 만들고 저장하여 한 번에 제공하기
  					손님이 음료를 여러개 주문하기(난이도 추가)
  					좀 더 간결한 코드로 Ver Up
  					
  	생각 : 미니게임이란 주제를 팀원들과 정하고 처음엔 너무 쉬운것 아닌가? 싶었다.
  		  생각을 계속하니 자바 콘솔에서 게임이라고 부를 만 한 것 들은 3,6,9 / 가위바위보 / 숫자야구 뿐이였고
  		  배운 것 들을 활용해 만드는 첫 프로젝트라서 많은 것을 해보고싶었다.
  		  하지만 백지에 처음부터 코딩하는것은 참 어려운 일이라는 것을 다시금 깨달았다.
  		  스타벅스에서 근무했던 기억을 더듬어 그것을 코드로 표현해봤다(정말 많이 다르지만).
  		 음료를 만들고 제공하는 것을 어떻게 표현할 지 많은 생각을 했더니 얼추 윤곽은 나왔지만 
  		  떠도는 소스코드를 참고하는것은 실력이 늘지 않을 것 같아서 객체부터 다시 책을펴고 
  		  개념을 다잡고 천천히 코딩했더니 그래도 돌아가는(?) 미니게임이 완성되었다.
  		  내일은 다시 책을 보며 개념을 익히고 하나씩 뜯어고치는 재미를 즐겨봐야겠다..
  		  
 */
import java.util.Scanner;

public class Game2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		
		
		while(true) {
			
			System.out.println("메뉴를 선택해주세요 ㅎㅇㅎㅇ");
			System.out.println(" 1. 손님의 주문 확인하기.");
			System.out.println(" 2. 음료만들기 + 제공하기.");
			System.out.println(" 3. 게임 종료하기.");
			select = sc.nextInt();
			
		switch(select) {
		case 1:
			System.out.println("손님의 주문을 확인합니다");
		// 손님의 주문
		Customer c1 = new Customer();
		c1.customer();
			break;
		case 2:
			System.out.println("음료를 만들어 볼까요~?");
		// 플레이어의 음료 만들기
		Player p1 = new Player();
		p1.makeDrink();
			break;
		case 3:
			System.out.println("게임을 종료합니다~ 띠로링~");
			System.exit(0);
		}
	
		}
		
		
	}

}
