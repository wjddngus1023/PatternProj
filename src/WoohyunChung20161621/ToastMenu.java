package WoohyunChung20161621;

public class ToastMenu extends MenuTemplate{
	
	@Override
	void LoadPayMessage(){
		
	}
	@Override
	void LoadQuestion(){
		System.out.println("-- 어서오세요 아삭 토스트입니다. 주문하실 토스트를 입력해주세요 --\n");
	}
	@Override
	void LoadText(){
		System.out.println("햄토스트");
		System.out.println("햄치즈토스트");
		System.out.println("불닭토스트");
		System.out.println("치즈토스트");
		System.out.println("디럭스토스트");
		System.out.println("베이컨토스트");
	}
}
