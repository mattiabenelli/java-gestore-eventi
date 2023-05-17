package org.gesteventi.java.obj;

import java.time.LocalDate;

public class Evento {
	
	private int titolo;
	private LocalDate data;
	private int postiTot;
	private int postiPre;
	
 
	
	
	public int getTitolo() {
		return titolo;
	}
	public void setTitolo(int titolo) {
		this.titolo = titolo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public int getPostiTot() {
		return postiTot;
	}
	public void setPostiTot(int postiTot) {
		this.postiTot = postiTot;
	}
	public int getPostiPre() {
		return postiPre;
	}
	public void setPostiPre(int postiPre) {
		this.postiPre = postiPre;
	}
}
