import com.revature.tourofheroes.exceptions.InvalidHealthException;
import com.revature.tourofheroes.menu.MainMenu;
import com.revature.tourofheroes.models.Hero;

public class Main {
//Class scope
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new keyword allocates space
		
		String newString = "a";
		//newString = "b";
		String newString2 = new String("a");
		String newString3 = "a";
		System.out.println(newString == newString3);
		System.out.println(newString == newString2);
		System.out.println(newString.equals(newString2));
		
		MainMenu newMenu = new MainMenu();
		
		boolean active = true;
		
		while (active) {
		newMenu.mainMenu();
		}
	}

}
