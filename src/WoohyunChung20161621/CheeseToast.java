package WoohyunChung20161621;

public class CheeseToast implements Toast {
	
	public CheeseToast(){
		int cost = 1000;
		System.out.println("-- ������ " + cost + "�� �Դϴ�. --\n");
	}
	@Override
	public int cost(){
		return 1000;
	}

}
