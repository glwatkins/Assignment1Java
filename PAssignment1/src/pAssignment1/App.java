package pAssignment1;

import java.util.ArrayList;

public class App {

	public App() {
	}
	
	public static void main(String[] args) {
		ArrayList<Celebrant> celebrantData = new ArrayList<Celebrant>() ;
		Loadcelebrant.load(celebrantData);
			
		CelebrantGUI gui = new CelebrantGUI(celebrantData);
		gui.setVisible(true);
	}
	
}
