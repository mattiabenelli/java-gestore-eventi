package org.gesteventi.java.obj;

import java.time.LocalDate;

public class Evento {
	
	private String titolo;
	private LocalDate data;
	private int postiTot;
	private int postiPre;
	LocalDate oggi = LocalDate.now();
	
	public Evento (String titolo, LocalDate data, int postiTot, int postiPre) throws Exception {
		 
		setTitolo(titolo);
		setData(data);
		setPostiTot(postiTot);
		setPostiPre(postiPre);
		
	}
	
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) throws Exception {
		
		if(data.compareTo(oggi) < 0) {
			
			throw new Exception("la data non può essere precedente a quella di oggi");
		}
		
		this.data = data;
	}
	
	public int getPostiTot() {
		return postiTot;
	}
	private void setPostiTot(int postiTot) throws Exception {
		
		if(postiTot <= 0) {
			
			throw new Exception("il numero di posti totali");
		}
		
		this.postiTot = postiTot;
	}
	
	public int getPostiPre() {
		return postiPre;
	}
	private void setPostiPre(int postiPre) {
		this.postiPre = postiPre;
	}
	
	public void prenota() throws Exception {
		
		if(postiPre == postiTot) {
			
			throw new Exception("posti esauriti");
		}
		else if(data.compareTo(oggi) < 0) {
			
			throw new Exception("l'evento si è già concluso");
		}
		else {
			
			postiPre++;
		}
	}
	
	public void disdici() throws Exception {
		
		if(postiPre == 0) {
			
			throw new Exception("non ci sono prenotazioni attive");
		}
		else if(data.compareTo(oggi) < 0) {
			
			throw new Exception("l'evento si è già concluso");
		}
		else {
			
			postiPre--;
		}
	}
	
	@Override
	public String toString() {

		return "(E)\n" 
				+"titolo evento: " + titolo
				+"\ndata: " + data
				+"\nposti totali: " + postiTot
				+"\nposti prenotati: " + postiPre;
	}
	
	public String toStringTitolo() {
		
		return data + titolo;
	}
}
