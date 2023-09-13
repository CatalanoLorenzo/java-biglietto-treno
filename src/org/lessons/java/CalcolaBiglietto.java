package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Scrivi il tuo nomei kilometri che vuoi percorrere");
		
		int km = input.nextInt();
		
		System.out.println("Scrivi l'eta del passeggero");
		
		int etaPasseggero = input.nextInt();
		
		input.close();
		
		double prezzoKm = 0.21;
		
		int scontoMinori = 20;
		
		int scontoOver = 40;
		
		int prezzoPieno = (int) (prezzoKm * km) ;
		
		if(etaPasseggero <= 18) {
		
			int prezzo = prezzoPieno * scontoMinori / 100 ;
			
			System.out.println("il Prezzo del biglietto è " + prezzo);

			
		}else if (etaPasseggero >= 65) {
		
			int prezzo = prezzoPieno * scontoOver / 100 ;
			
			System.out.println("il Prezzo del biglietto è " + prezzo);
			
		}else {
			
			int prezzo = prezzoPieno;
			
			System.out.println("il Prezzo del biglietto è " + prezzo);
		}
		
	}	

}
