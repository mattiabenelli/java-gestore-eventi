package org.gesteventi.java;

import java.time.LocalDate;
import java.util.Scanner;

import org.gesteventi.java.obj.Evento;

public class Main {
	
	public static void main(String[] args) {
		
		Evento e1 = null;
		int choice;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci data: ");
		LocalDate data =  LocalDate.parse(sc.nextLine());
		
		System.out.println("inserisci nome dell'evento");
		String titolo = sc.nextLine();
		
		System.out.println("inserisci numero posti: ");
		int postiTot = sc.nextInt();
		
		try {
			e1 = new Evento(titolo, data, postiTot, 0);
			
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
				e1.prenota(numPre);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(e1);
		
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
				e1.disdici(numPre);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(e1);
		
		sc.close();
	}
}
