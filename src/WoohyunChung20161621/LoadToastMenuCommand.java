package WoohyunChung20161621;

public class LoadToastMenuCommand implements Command {
	
	ToastMenu toastMenu = new ToastMenu();
	
	public LoadToastMenuCommand(ToastMenu toastMenu){
		this.toastMenu = toastMenu;
	}
	public void execute(){ // ���� �޴����� ������ ���� ���Ŀ�� ���� ����(Ŀ�ǵ�����+���ø��޼ҵ�����)
		toastMenu.LoadMenu(); // ���ø� �޼ҵ� ȣ��
	}

}
