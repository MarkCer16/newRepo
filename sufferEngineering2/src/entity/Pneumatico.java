package entity;

public class Pneumatico {
	private int id;
	private String casaProduttrice;
	private int larghezzaSezione;
	private double altezzaLarghezza;
	private String strutturaRadiale;
	private int diametro;
	private String stagionalita;
	private int prezzoDefault;

	
	public Pneumatico(int id, String casaProd, int largSez, double altLar, String strRad, int diametro, String stag, int preDef) {
		this.id = id;
		this.casaProduttrice = casaProd;
		this.larghezzaSezione = largSez;
		this.altezzaLarghezza = altLar;
		this.strutturaRadiale = strRad;
		this.diametro = diametro;
		this.stagionalita = stag;
		this.prezzoDefault = preDef;
	}
	
	public Pneumatico(Pneumatico p) {
		this.id = p.id;
		this.casaProduttrice = p.casaProduttrice;
		this.larghezzaSezione = p.larghezzaSezione;
		this.diametro = p.diametro;
		this.altezzaLarghezza= p.altezzaLarghezza;
		this.strutturaRadiale = p.strutturaRadiale;
		this.stagionalita = p.stagionalita;
		this.prezzoDefault = p.prezzoDefault;
	}
	
	//id get and set
	public int getId(){
		return this.id;
	}
	
	public void setId(int id) {
		this.id= id;
	}
	
	//casaProduttrice get and set
	public String getCasaProduttrice(){
		return this.casaProduttrice;
	}
	
	public void setCasaProduttrice(String casaProd) {
		this.casaProduttrice = casaProd;
	}
	
	//larghezzaSezione get and set
	public int getLarghezzaSezione(){
		return this.larghezzaSezione;
	}
	
	public void setLarghezzaSezione(int larSez) {
		this.larghezzaSezione= larSez;
	}
	
	//altezzaLarghezza get and set
	public double getAltezzaLarghezza() {
		return this.altezzaLarghezza;
	}
	
	public void setAltezzaLarghezza(double altLar) {
		this.altezzaLarghezza = altLar;
	}
	
	//strutturaRadiale get and set
	public String getStrutturaRadiale() {
		return this.strutturaRadiale;
	}
	
	public void setStrutturaRadiale(String strRad) {
		this.strutturaRadiale = strRad;
	}
	
	//diametro get and set
	public int getDiametro() {
		return this.diametro;
	}
	
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	
	//stagionalita get and set
	public String getStagionalita() {
		return this.stagionalita;
	}
	
	public void setStagionalita(String stagionalita) {
		this.stagionalita = stagionalita;
	}
	
	//prezzoDefault get and set
	public int getPrezzoDefault() {
		return this.prezzoDefault;
	}
	
	public void setPrezzoDefault(int prDef) {
		this.prezzoDefault = prDef;
	}
}
