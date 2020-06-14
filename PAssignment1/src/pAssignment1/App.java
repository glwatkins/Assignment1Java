package pAssignment1;

import java.util.ArrayList;

public class App {

	public App() {
	}
	
	public static void main(String[] args) {
		ArrayList<Celebrant> celebrant = new ArrayList<Celebrant>() ;
			Loadcelebrant.load(celebrant);
			
			CelebrantGUI gui = new CelebrantGUI (celebrant);
			gui.setVisible(true);
	}
	
}
