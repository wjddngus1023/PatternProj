package WoohyunChung20161621;

public class LoadBevMenuCommand implements Command{

BevMenu bevMenu = new BevMenu();
	
	public LoadBevMenuCommand(BevMenu bevMenu){
		this.bevMenu = bevMenu;
	}
	public void execute(){	// ���� �޴����� ������ ���� ���Ŀ�� ���� ����(Ŀ�ǵ�����+���ø��޼ҵ�����)
		bevMenu.LoadMenu();// ���ø� �޼ҵ� ȣ��
	}

}


