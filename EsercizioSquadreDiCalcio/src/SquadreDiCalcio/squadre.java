package SquadreDiCalcio;
import java.util.ArrayList;

public class squadre {

	public static void main(String[] args) {
		ArrayList<Calciatore> squadra1= new ArrayList<Calciatore>();
		
		squadra1.add(new Calciatore("Antonio", "Cassano", 20));
		squadra1.add(new Calciatore("Francesco", "Totti", 16));
		squadra1.add(new Calciatore("Alessandro", "Delpiero", 15));
		squadra1.add(new Calciatore("Luca", "Toni", 24));
		squadra1.add(new Calciatore("Paolo", "Maldini", 2));
		
		for(Calciatore c:squadra1)
			System.out.println(c.getNome()+" "+c.getCognome()+" ha segnato "+c.getNgoal()+" goal");
		
		
			

	}

}
