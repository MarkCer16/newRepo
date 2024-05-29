package entity;

public class PneumaticiInMagazzino {
	private int idMagazzino;
	private int idPneumatico;
	private int quantita;
	
	public PneumaticiInMagazzino(int mag, int pne, int qua) {
		this.idMagazzino = mag;
		this.idPneumatico = pne;
		this.quantita = qua;
	}
	
	public PneumaticiInMagazzino(PneumaticiInMagazzino pim) {
		this.idMagazzino = pim.idMagazzino;
		this.idPneumatico = pim.idPneumatico;
		this.quantita = pim.quantita;
	}
	
	//idMagazzino get and set
	public int getIdMagazzimo() {
		return this.idMagazzino;
	}
	
	public void setIdMagazzino(int mag) {
		this.idMagazzino = mag;
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
