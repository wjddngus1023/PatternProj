package WoohyunChung20161621;

public class LoadCardPayMenuCommand implements Command{
	
	CardPayMenu cardPayMenu = new CardPayMenu();
	
	public LoadCardPayMenuCommand(CardPayMenu cardPayMenu){
		this.cardPayMenu = cardPayMenu;
	}
	public void execute(){	// ���� �޴����� ������ ���� ���Ŀ�� ���� ����(Ŀ�ǵ�����+���ø��޼ҵ�����)
		cardPayMenu.LoadMenu(); // ���ø� �޼ҵ� ȣ��
	}

}
