package game2;

public class Customer {

	// �մ��� �ֹ��� �մϴ�.
	public String customer() {
		String menu = menuChoice();
		System.out.println("*******������ �����մϴ�*******");
		System.out.println("�մ��� �ֹ��� �Ϸ� �Խ��ϴ�. �ѹ��ѹ�");
		System.out.println("�մ�  : >> "+ menu + "�ּ���");
		System.out.println("**************************");
		return menu;
	}
	
	// �մ��� �޴��� 4�����߿� �ϳ��� ������.
	public String menuChoice() {
		
		int cnt=0;
		String[] menuList = {"�Ƹ޸�ī��", "ī���", "ī���ī", "�ٴҶ��"};
		cnt = (int) (Math.random()*4);
		String mc = menuList[cnt];
		return mc;
	}
}

