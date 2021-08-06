package WoohyunChung20161621;

public class ToastFactory {

	public static Toast createToast(String type){
		Toast toast = null;
		switch(type){
		
		case "�������佺Ʈ":
			System.out.println("-- " + type + "�� �ֹ��޾ҽ��ϴ� --\n");
			toast = (Toast) new BaconToast();
			break;
		case "�Ҵ��佺Ʈ":
			System.out.println("-- " + type + "�� �ֹ��޾ҽ��ϴ� --\n");
			toast = (Toast) new BuldakToast();
			break;
		case "���佺Ʈ":
			System.out.println("-- " + type + "�� �ֹ��޾ҽ��ϴ� --\n");
			toast = (Toast) new HamToast();
			break;
		case "ġ���佺Ʈ":
			System.out.println("-- " + type + "�� �ֹ��޾ҽ��ϴ� --\n");
			toast = (Toast) new CheeseToast();
			break;
		case "��ġ���佺Ʈ":
			System.out.println("-- " + type + "�� �ֹ��޾ҽ��ϴ� --\n");
			toast = (Toast) new HamCheeseToast();
			break;
		case "�𷰽��佺Ʈ":
			System.out.println("-- " + type + "�� �ֹ��޾ҽ��ϴ� --\n");
			toast = (Toast) new DeluxToast();
			break;
		}
		return toast;
	}
}
