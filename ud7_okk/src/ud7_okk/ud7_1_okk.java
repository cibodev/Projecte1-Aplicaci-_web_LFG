package ud7_okk;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Random;

public class ud7_1_okk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// Alumnos pertenecientes al curso de programación
		Hashtable<String, Double> alumnos = new Hashtable<String, Double>();
		alumnos.put("Emma", 6.5);
		alumnos.put("Dani", (double) 8);
		alumnos.put("Sara", 9.5);
		alumnos.put("Carlo", 5.9);
		alumnos.put("Paula", (double) 7);

				
		for (Entry<String, Double> entry : alumnos.entrySet()) {
			System.out.println(entry.getKey() + " tiene de nota media un  " + entry.getValue());
		}
		
		Random rnd = new Random();
		int n = rnd.nextInt(10-0+1);
		System.out.println(n);
	}
}