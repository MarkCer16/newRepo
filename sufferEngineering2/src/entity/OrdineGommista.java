package entity;
import java.time.LocalDate;

public class OrdineGommista {
	private int id;
	private LocalDate dataEmissione;
	
	public OrdineGommista(int id, LocalDate dataEmissione) {
		this.id = id;
		this.dataEmissione = dataEmissione;
	}
	
	public OrdineGommista(OrdineGommista o) {
		this.id = o.id;
		this.dataEmissione = o.dataEmissione;
	}
	
	//id get and set
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	//dataEmissione get and set
	public LocalDate getDataEmissione() {
		return this.dataEmissione;
	}
	
	public void setDataEmissione(LocalDate datEm) {
		this.dataEmissione = datEm;
	}
}
