package game2;

import java.util.Scanner;

public class Player {

	// ������ ȸ���� ������ fals�� ������ ������ ����ǵ��� ��.(����������)
	boolean game2Continue = true;
	int game2Life = 5;
	String drink;
	
	//�÷��̾�� ���Ḧ �����
	void makeDrink() {
		
		// ��� ����ǵ��� �ݺ��� 
		while(game2Continue) {
			
		// ������ ��Ḧ �Է¹��� ��ĳ��
		Scanner sc = new Scanner(System.in);
		
		// ���� ���۽� ȭ�� 
		System.out.println("**************************");
		System.out.println("���� ��� : "+game2Life);
		System.out.println("�غ�� ��� ����Ʈ�� Ȯ�� �ϼ���.");
		System.out.println("|��|����|Ŀ��|�ٴҶ�|����|����");
		System.out.println("**************************");
		
		// ������� �����ϱ�
		System.out.println("���� ��Ḧ �ϳ� ������ �Է����ּ���(��or����)");
		String var1 = sc.nextLine();
		System.out.println("���ο� ���� ���� = " +var1);
		
		// ������� ����ó��
		if(var1.equals("��") || var1.equals("����")){
			System.out.println("���� ��Ḧ �־����ϴ�^0^");
		} else {
			--game2Life;
			System.out.println("������ ��Ḹ ���� �� �ֽ��ϴ� T.T �������"+ game2Life);
			if(game2Life==0) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
			
		// �߰���� �����ϱ�
		System.out.println("�߰���Ḧ �Է����ּ���(Ŀ��or�ٴҶ�or����or����)");
		String var2 = sc.nextLine();
		System.out.println("�� ��° ������ ���� = " +var2);
		
		// �߰���� ����ó��
		if(var2.equals("Ŀ��") || var2.equals("�ٴҶ�") || var2.equals("����")||var2.equals("����")){
			System.out.println("�߰� ��Ḧ �־����ϴ�^0^");
		} else {
			--game2Life;
			System.out.println("������ ��Ḹ ���� �� �ֽ��ϴ� T.T �������"+ game2Life);
			if(game2Life==0) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
		
		// �߰���� �����ϱ�2
		System.out.println("�߰���Ḧ �Է����ּ���(Ŀ��or�ٴҶ�or����or����).");
		String var3 = sc.nextLine();
		System.out.println("�� ��° ������ ���� = " +var3);
		
		// �߰���� ����ó��2
		if(var3.equals("Ŀ��") || var3.equals("�ٴҶ�") || var3.equals("����")||var3.equals("����")){
			System.out.println("�߰� ��Ḧ �־����ϴ�^0^");
		} else {
			--game2Life;
			System.out.println("������ ��Ḹ ���� �� �ֽ��ϴ� T.T �������"+ game2Life);
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
			System.out.println("�� ���̽��ϴ�~ ^^ ����Ʈ +100");
			break;
		} else {
			--game2Life;
			System.out.println("������ �� ���� �ٽ� �ȿ�!!!!!!!! ������� : " +game2Life);
			if(game2Life==0) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			continue;
		}
		
	
		}
		}
	}
	

}


