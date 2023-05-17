package org.gesteventi.java.obj;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento{
	
	private LocalTime ora;
	private BigDecimal prezzo;
	
	public Concerto(String titolo, LocalDate data, int postiTot, int postiPre, LocalTime ora, BigDecimal prezzo) throws Exception {
		
		super(titolo, data, postiTot, postiPre);
		
		setOra(ora);
		setPrezzo(prezzo);
	}
	
	
	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		
		return "(C) "
			+ "\ndata e ora del concerto: " + getData() + " - " + getOra()
			+ "\ntitolo concerto: " + getTitolo()
			+ "\nprezzo: " + String.format("%,.2f", getPrezzo()) + "$";
	}
	
}
