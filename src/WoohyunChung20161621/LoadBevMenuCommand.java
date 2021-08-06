package WoohyunChung20161621;

public class LoadBevMenuCommand implements Command{

BevMenu bevMenu = new BevMenu();
	
	public LoadBevMenuCommand(BevMenu bevMenu){
		this.bevMenu = bevMenu;
	}
	public void execute(){	// 차후 메뉴판의 수정을 위해 컴파운드 패턴 적용(커맨드패턴+템플릿메소드패턴)
		bevMenu.LoadMenu();// 템플릿 메소드 호출
	}

}


