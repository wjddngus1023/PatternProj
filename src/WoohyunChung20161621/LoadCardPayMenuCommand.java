package WoohyunChung20161621;

public class LoadCardPayMenuCommand implements Command{
	
	CardPayMenu cardPayMenu = new CardPayMenu();
	
	public LoadCardPayMenuCommand(CardPayMenu cardPayMenu){
		this.cardPayMenu = cardPayMenu;
	}
	public void execute(){	// 차후 메뉴판의 수정을 위해 컴파운드 패턴 적용(커맨드패턴+템플릿메소드패턴)
		cardPayMenu.LoadMenu(); // 템플릿 메소드 호출
	}

}
