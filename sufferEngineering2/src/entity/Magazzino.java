package entity;

public class Magazzino {
	private int id;
	private String indirizzo;
	private String nomeResponsabile;
	
	public Magazzino(int id, String ind, String nomeRes) {
		this.id = id;
		this.indirizzo = ind;
		this.nomeResponsabile = nomeRes;
	}
	
	public Magazzino(Magazzino m) {
		this.id = m.id;
		this.indirizzo = m.indirizzo;
		this.nomeResponsabile = m.nomeResponsabile;
	}
	
	//id get and set
	public int getId(){
		return this.id;
	}
	
	public void setId(int id) {
		this.id= id;
	}
	
	//indirizzo get and set
	public String getIndirizzo(){
		return this.indirizzo;
	}
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo= indirizzo;
	}
	
	//nomeResponsabile get and set
	public String getNomeResponsabile(){
		return this.nomeResponsabile;
	}
	
	public void setNomeResponsabile(String nomeRes) {
		this.nomeResponsabile= nomeRes;
	}
}
