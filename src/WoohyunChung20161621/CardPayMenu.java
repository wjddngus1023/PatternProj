package WoohyunChung20161621;

public class CardPayMenu extends MenuTemplate{

	@Override
	void LoadPayMessage(){
		System.out.println("-- ������ �����ϰڽ��ϴ�. --\n");
		System.out.println("-- ī�带 ������ �о�־� �ֽʽÿ�.  --\n");
	}
	@Override
	void LoadQuestion(){
		System.out.println("-- ������ �Ϸ�Ǿ����ϴ�. �������� �߱��Ͻðڽ��ϱ�? --\n");
	}
	@Override
	void LoadText(){
		System.out.println("1. ��");
		System.out.println("2. �ƴϿ�");
	}
}

