package game2;

import java.util.Scanner;

public class GoodMake {

	Scanner sc = new Scanner(System.in);
	
	String drink;

	String goodMake (String var1, String var2, String var3) {
		
		if(var1.equals("��") && var2.equals("Ŀ��") && var3.equals("����")) {
			System.out.println("**************************");
			System.out.println("�Ƹ޸�ī�� �ϼ�");
			System.out.println("**************************");
			drink = "�Ƹ޸�ī��";
		} else if (var1.equals("��") && var2.equals("����") && var3.equals("Ŀ��")){
			System.out.println("**************************");
			System.out.println("�Ƹ޸�ī�� �ϼ�");
			System.out.println("**************************");
			drink = "�Ƹ޸�ī��";
			
		} else if (var1.equals("����") && var2.equals("Ŀ��") && var3.equals("����")){
			System.out.println("**************************");
			System.out.println("ī�� �� �ϼ�");
			System.out.println("**************************");
			drink = "ī���";
		} else if (var1.equals("����") && var2.equals("����") && var3.equals("Ŀ��")){
			System.out.println("**************************");
			System.out.println("ī�� �� �ϼ�");
			System.out.println("**************************");
			drink = "ī���";
			
		} else if (var1.equals("����") && var2.equals("�ٴҶ�") && var3.equals("Ŀ��")){
			System.out.println("**************************");
			System.out.println("�ٴҶ� �� �ϼ�");
			System.out.println("**************************");
			drink = "�ٴҶ��";
		} else if (var1.equals("����") && var2.equals("Ŀ��") && var3.equals("�ٴҶ�")){
			System.out.println("**************************");
			System.out.println("�ٴҶ� �� �ϼ�");
			System.out.println("**************************");
			drink = "�ٴҶ��";
			
		} else if (var1.equals("����") && var2.equals("����") && var3.equals("Ŀ��")){
			System.out.println("**************************");
			System.out.println("ī�� ��ī �ϼ�");
			System.out.println("**************************");
			drink = "ī���ī";
		} else if (var1.equals("����") && var2.equals("Ŀ��") && var3.equals("����")){
			System.out.println("**************************");
			System.out.println("ī�� ��ī �ϼ�");
			System.out.println("**************************");
			drink = "ī���ī";
		} else 
			System.out.println("���� ������ �����߽��ϴ�~~T.T");
		
		return drink;
	}

	
	
	/*
	 if(var1.equals("��") && var2.equals("Ŀ��") && var3.equals("����")) {
			String dirnk1 = "�Ƹ޸�ī��";
			System.out.println("**************************");
			System.out.println("�Ƹ޸�ī�� �ϼ�");
			System.out.println("**************************");
		} else if (var1.equals("��") && var2.equals("����") && var3.equals("Ŀ��")) {
			String drink1 =  "�Ƹ޸�ī��";
			System.out.println("**************************");
			System.out.println("�Ƹ޸�ī�� �ϼ�");
			System.out.println("**************************");
		} 
	  
	
	 */

	
	
	
}
