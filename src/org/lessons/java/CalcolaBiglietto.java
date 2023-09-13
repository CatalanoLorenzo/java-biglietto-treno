package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {

		// abilito la lettura degli input
		Scanner input = new Scanner(System.in);

		// mostro in terminale la richiasta all'utente
		System.out.println("Scrivi i kilometri che vuoi percorrere");

		// associo alla variabile di tipo intero l'input dell'utente
		int km = input.nextInt();

		// mostro in terminale la richiasta all'utente
		System.out.println("Scrivi l'eta del passeggero");

		// associo alla variabile di tipo intero l'input dell'utente
		int etaPasseggero = input.nextInt();

		// disabilito la lettura degli input perchè non è piu richiesto nessun valore
		// all'utente
		input.close();

		// genero una variabile di tipo double per il prezzo al km
		double prezzoKm = 0.21;

		// genero una varaibile per lo sconto degli under 18
		int scontoMinori = 20;

		// genero una variabile per lo sconto degli over 65
		int scontoOver = 40;

		// genero una variabile di tipo double per il prezzo pieno calcolandomela col
		// prodotto del prezzo pieno per i km
		double prezzoPieno = prezzoKm * km;

		// entro nella condizione se l'èta del passeggero è inferiore a 18
		if (etaPasseggero < 18) {

			// genero una variabile di tipo double e l'associo al calco prezzopieno -
			// prezzopieno / sconto /100
			double prezzo = prezzoPieno - (prezzoPieno * scontoMinori / 100);

			// mostro il risultato a schermo
			System.out.println("il Prezzo del biglietto è " + String.format("%.02f",prezzo) + "€");

			// entro nella condizione se l'èta del passeggero è superiore o uguale a 65
		} else if (etaPasseggero >= 65) {

			// genero una variabile di tipo double e l'associo al calco prezzopieno -
			// prezzopieno / sconto /100
			double prezzo = prezzoPieno - (prezzoPieno * scontoOver / 100);

			// mostro il risultato a schermo
			System.out.println("il Prezzo del biglietto è " + String.format("%.02f",prezzo) + "€");

			// entro nella condizione se l'èta del passeggero è compresa tra 18 e 64
		} else {

			// mostro il risultato a schermo
			System.out.println("il Prezzo del biglietto è " + String.format("%.02f",prezzoPieno) + "€");
		}

	}

}
