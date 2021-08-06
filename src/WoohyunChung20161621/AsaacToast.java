package WoohyunChung20161621;

import java.util.Scanner;

public class AsaacToast {

	public static void main(String[] args){
		
		Beverage DefaultDrink = new DefaultDrink(); // 기본음료 생성
		
		int ordercount = 1; // 주문횟수
		int exit = 0; 
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in); // nextLine() 버퍼에 Enter가 남아있을 경우 예외 발생, 스캐너 추가 선언
						
		ToastMenu toastMenu = new ToastMenu();
		LoadToastMenuCommand loadToastMenu = new LoadToastMenuCommand(toastMenu);		
		BevMenu bevMenu = new BevMenu();
		LoadBevMenuCommand loadBevMenu = new LoadBevMenuCommand(bevMenu);
		CardPayMenu cardPayMenu = new CardPayMenu();
		LoadCardPayMenuCommand loadCardPayMenu = new LoadCardPayMenuCommand(cardPayMenu); // 커맨드생성
		
		while(exit != -1){ // -1받을때까지 무한반복
		
		loadToastMenu.execute(); // 토스트메뉴를 표시하는 커맨드 실행
			
		String Toastname = sc.nextLine(); 
		
		Toast toast = ToastFactory.createToast(Toastname); // 팩토리 메소드 호출 
	
		loadBevMenu.execute(); // 음료수메뉴를 표시하는 커맨드 실행
	
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
				System.out.println("올바른 숫자를 입력해주세요");
				break;
				}
		
		System.out.println("-- " + DefaultDrink.getDescription() + "를 주문받았습니다. -- \n\n" + "-- 가격은 " + DefaultDrink.cost() + "원입니다. --\n"); // 가격출력
		
		loadCardPayMenu.execute(); // 결제메뉴를 표시하는 커맨드 실행
		String receiptSelect = sc.nextLine();
		
		switch(receiptSelect){
		case "1" :		
			int total = DefaultDrink.cost() + toast.cost();
			String ToastCost = String.valueOf(toast.cost()); // int값인 toast.cost() 형변환
			System.out.println("================================");
			System.out.println("     " + Toastname + "        " + ToastCost + " 원"); // 생성된 토스트의 가격을 뽑아보자
			System.out.println("     " + DefaultDrink.getDescription() + "        " + DefaultDrink.cost() + " 원\n");
			System.out.println("     " + "총합 : " + "     " + total + " 원");
			System.out.println("     주문번호 : " + ordercount);
			System.out.println("================================\n");
			System.out.println("-- 이용해 주셔서 감사합니다. 초기화면으로 되돌아가시려면 아무 숫자나 입력하시고, 프로그램을 종료하려면 -1을 입력하세요 --\n");
			break;
		case "2" :
			System.out.println("================");
			System.out.println("주문번호 : " + ordercount);
			System.out.println("================");
			System.out.println("-- 이용해 주셔서 감사합니다. 초기화면으로 되돌아가시려면 아무 숫자나 입력하시고, 프로그램을 종료하려면 -1을 입력하세요 --\n");
			break;
		}

		
		ordercount ++;
		exit = sc2.nextInt();
		
	}
		System.out.println("== 프로그램을 종료합니다. ==");
		sc.close();
		sc2.close();	
	}
}
