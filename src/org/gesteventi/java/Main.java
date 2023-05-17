package org.gesteventi.java;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.gesteventi.java.obj.Concerto;
import org.gesteventi.java.obj.Evento;
import org.gesteventi.java.obj.ProgrammaEventi;

public class Main {
	
	public static void main(String[] args) {
		
		Concerto c1 = null;
		int choice;
		
		List<Evento> eventi = new ArrayList<>();
		ProgrammaEventi programma = new ProgrammaEventi(null, eventi);

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("inserisci data: ");
		LocalDate data =  LocalDate.parse(sc.nextLine());
		
		System.out.println("inserisci nome del concerto");
		String titolo = sc.nextLine();
		
		System.out.println("inserisci numero posti: ");
		int postiTot = sc.nextInt();
		
		System.out.println("inserisci l'ora del concerto: ");
		LocalTime ora = LocalTime.parse(sc.next());
		
		System.out.println("inserisci prezzo: ");
		BigDecimal prezzo = sc.nextBigDecimal();
		
		try {
			c1 = new Concerto(titolo, data, postiTot, 0, ora, prezzo);
			eventi.add(c1);
			
		} catch (Exception e) {

			System.out.println("problema durante creazione dell'evento riprovare");
		}
		
		while(true) {
			
			System.out.println("Vuoi prenotare dei posti? 1-si 2-no");
			choice = sc.nextInt();
			
			if(choice < 1 || choice > 2) {
				System.out.println("codice non valido: riprovare");
				continue;
			}
			else {
				break;
			}
			
		}
		if(choice == 1) {
			
			System.out.println("Quanti posti vuoi prenotare: ");
			int numPre  = sc.nextInt();
			
			try {
				c1.prenota(numPre);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(c1);
		
		while(true) {
			
			System.out.println("Vuoi disdire le prenotazioni? 1-si 2-no");
			choice = sc.nextInt();
			
			if(choice < 1 || choice > 2) {
				System.out.println("codice non valido: riprovare");
				continue;
			}
			else {
				break;
			}
			
		}
		if(choice == 1) {
			
			System.out.println("Quanti posti vuoi disdire: ");
			int numPre  = sc.nextInt();
			
			try {
				c1.disdici(numPre);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(c1);
		
		System.out.println(programma);
		
		sc.close();
	}
}
