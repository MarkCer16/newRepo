package entity;

public class Dettaglio {
	private int idOrdine;
	private int idPneumatico;
	private int quantita;
	
	public Dettaglio(int ord, int pne, int qua) {
		this.idOrdine = ord;
		this.idPneumatico = pne;
		this.quantita = qua;
	}
	
	public Dettaglio(Dettaglio d) {
		this.idOrdine = d.idOrdine;
		this.idPneumatico = d.idPneumatico;
		this.quantita = d.quantita;
	}
	
	//idOrdine get and set
	public int getIdOrdine() {
		return this.idOrdine;
	}
	
	public void setIdOrdine(int ord) {
		this.idOrdine = ord;
	}
	
	//idPneumatico get and set
	public int getIdPneumatico() {
		return this.idPneumatico;
	}
	
	public void setIdPneumatico(int pne) {
		this.idPneumatico = pne;
	}
	
	//quantita get and set
	public int getQuantita() {
		return this.quantita;
	}
	
	public void setQuantita(int qua) {
		this.quantita = qua;
	}
}
