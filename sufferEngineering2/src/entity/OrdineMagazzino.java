package entity;
import java.time.LocalDate;

public class OrdineMagazzino {
	private int id;
	private LocalDate dataEmissione;
	private int idMagazzino;
	
	public OrdineMagazzino(int id, LocalDate dataEmissione, int mag) {
		this.id = id;
		this.dataEmissione = dataEmissione;
		this.idMagazzino = mag;
	}
	
	public OrdineMagazzino(OrdineMagazzino o) {
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
	
	//idMagazzino get and set
	public int getIdMagazzino() {
		return this.idMagazzino;
	}
	
	public void setIdMagazzino(int mag) {
		this.idMagazzino = mag;
	}
}
