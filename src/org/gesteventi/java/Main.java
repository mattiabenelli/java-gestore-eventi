package org.gesteventi.java;

import java.time.LocalDate;
import java.util.Scanner;

import org.gesteventi.java.obj.Evento;

public class Main {
	
	public static void main(String[] args) {
		
		Evento e1 = null;

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
		
		try {
			e1.prenota();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(e1);
		
		try {
			e1.disdici();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(e1);
		e1.toStringTitolo();
		
		sc.close();
	}
}
