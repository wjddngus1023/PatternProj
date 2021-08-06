package WoohyunChung20161621;

import java.util.Scanner;

public class AsaacToast {

	public static void main(String[] args){
		
		Beverage DefaultDrink = new DefaultDrink(); // �⺻���� ����
		
		int ordercount = 1; // �ֹ�Ƚ��
		int exit = 0; 
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in); // nextLine() ���ۿ� Enter�� �������� ��� ���� �߻�, ��ĳ�� �߰� ����
						
		ToastMenu toastMenu = new ToastMenu();
		LoadToastMenuCommand loadToastMenu = new LoadToastMenuCommand(toastMenu);		
		BevMenu bevMenu = new BevMenu();
		LoadBevMenuCommand loadBevMenu = new LoadBevMenuCommand(bevMenu);
		CardPayMenu cardPayMenu = new CardPayMenu();
		LoadCardPayMenuCommand loadCardPayMenu = new LoadCardPayMenuCommand(cardPayMenu); // Ŀ�ǵ����
		
		while(exit != -1){ // -1���������� ���ѹݺ�
		
		loadToastMenu.execute(); // �佺Ʈ�޴��� ǥ���ϴ� Ŀ�ǵ� ����
			
		String Toastname = sc.nextLine(); 
		
		Toast toast = ToastFactory.createToast(Toastname); // ���丮 �޼ҵ� ȣ�� 
	
		loadBevMenu.execute(); // ������޴��� ǥ���ϴ� Ŀ�ǵ� ����
	
		String BeverageSelect = sc.nextLine();
		
		switch(BeverageSelect){
		case "1" : 
			DefaultDrink = new Americano(DefaultDrink);		
			break;
		case "2" :
			DefaultDrink = new CafeLatte(DefaultDrink);
			break;
		case "3" : 
			DefaultDrink = new Juice(DefaultDrink);
			break;
		case "4" : 
			DefaultDrink = new Coke(DefaultDrink);
			break;
		case "5" :
			DefaultDrink = new Beer(DefaultDrink);
			break;
		case "6" :
			DefaultDrink = new NoneDrink(DefaultDrink);
			break;
			default :
				System.out.println("�ùٸ� ���ڸ� �Է����ּ���");
				break;
				}
		
		System.out.println("-- " + DefaultDrink.getDescription() + "�� �ֹ��޾ҽ��ϴ�. -- \n\n" + "-- ������ " + DefaultDrink.cost() + "���Դϴ�. --\n"); // �������
		
		loadCardPayMenu.execute(); // �����޴��� ǥ���ϴ� Ŀ�ǵ� ����
		String receiptSelect = sc.nextLine();
		
		switch(receiptSelect){
		case "1" :		
			int total = DefaultDrink.cost() + toast.cost();
			String ToastCost = String.valueOf(toast.cost()); // int���� toast.cost() ����ȯ
			System.out.println("================================");
			System.out.println("     " + Toastname + "        " + ToastCost + " ��"); // ������ �佺Ʈ�� ������ �̾ƺ���
			System.out.println("     " + DefaultDrink.getDescription() + "        " + DefaultDrink.cost() + " ��\n");
			System.out.println("     " + "���� : " + "     " + total + " ��");
			System.out.println("     �ֹ���ȣ : " + ordercount);
			System.out.println("================================\n");
			System.out.println("-- �̿��� �ּż� �����մϴ�. �ʱ�ȭ������ �ǵ��ư��÷��� �ƹ� ���ڳ� �Է��Ͻð�, ���α׷��� �����Ϸ��� -1�� �Է��ϼ��� --\n");
			break;
		case "2" :
			System.out.println("================");
			System.out.println("�ֹ���ȣ : " + ordercount);
			System.out.println("================");
			System.out.println("-- �̿��� �ּż� �����մϴ�. �ʱ�ȭ������ �ǵ��ư��÷��� �ƹ� ���ڳ� �Է��Ͻð�, ���α׷��� �����Ϸ��� -1�� �Է��ϼ��� --\n");
			break;
		}

		
		ordercount ++;
		exit = sc2.nextInt();
		
	}
		System.out.println("== ���α׷��� �����մϴ�. ==");
		sc.close();
		sc2.close();	
	}
}
