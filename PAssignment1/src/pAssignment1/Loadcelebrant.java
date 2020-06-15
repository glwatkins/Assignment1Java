package pAssignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Loadcelebrant {

public static void load(ArrayList<Celebrant> celebrant) {
	String fname;
	String lname;
	boolean marragecelebrant;
	boolean civilnionceleebrant;
	boolean canzmember;
	String resadentualcity;
	int age;
	int salary;
	String line;
	int i = 0;
	try {
		BufferedReader in = new BufferedReader (new FileReader("celebrantData.csv"));
		while ((line = in.readLine()) != null) {
				System.out.println(i);
				i++;
				String[] fields = line.split(",");
				fname= fields[0];
				lname= fields[1];
				marragecelebrant= Boolean.parseBoolean(fields[2]);
				civilnionceleebrant= Boolean.parseBoolean(fields[3]);
				canzmember= Boolean.parseBoolean(fields[4]);
				resadentualcity= fields[5];
				age= Integer.parseInt(fields[6]);
				salary= Integer.parseInt(fields[7]);
				celebrant.add(new Celebrant(fname, lname, marragecelebrant, civilnionceleebrant, canzmember, resadentualcity, age, salary));
	}}
	
	catch (Exception ex) {
		System.out.println(ex.getMessage());
	}
	
}
}
