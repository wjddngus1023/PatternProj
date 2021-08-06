package WoohyunChung20161621;

public abstract class MenuTemplate {
	
		final void LoadMenu(){
			LoadPayMessage();
			LoadQuestion();
			LoadFirstShell();
			LoadText();
			LoadLastShell();
		}
		
	 abstract void LoadPayMessage();
	 abstract void LoadQuestion();
	 abstract void LoadText();
	
	final void LoadFirstShell(){
		System.out.println("---------------------");
	}
	final void LoadLastShell(){
		System.out.println("---------------------\n");	
	}
	}


