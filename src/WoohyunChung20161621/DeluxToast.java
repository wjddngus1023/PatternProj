package WoohyunChung20161621;

public class DeluxToast implements Toast{
	
	public DeluxToast(){
		int cost = 2000;
		System.out.println("-- ������ " + cost + "�� �Դϴ�. --\n");
	}
	@Override
	public int cost(){
		return 2000;
	}
}
