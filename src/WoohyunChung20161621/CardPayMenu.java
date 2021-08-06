package WoohyunChung20161621;

public class CardPayMenu extends MenuTemplate{

	@Override
	void LoadPayMessage(){
		System.out.println("-- 결제를 진행하겠습니다. --\n");
		System.out.println("-- 카드를 끝까지 밀어넣어 주십시오.  --\n");
	}
	@Override
	void LoadQuestion(){
		System.out.println("-- 결제가 완료되었습니다. 영수증을 발급하시겠습니까? --\n");
	}
	@Override
	void LoadText(){
		System.out.println("1. 예");
		System.out.println("2. 아니오");
	}
}

