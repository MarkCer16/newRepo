package entity;

public class GommistaRegistrato {
	
	private int id;
	private String nome;
	private String cognome;
	private String indirizzo;
	private String username;
	private String password;
	
	
	public GommistaRegistrato(int id, String nome, String cognome, String indirizzo, String username, String password) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.username = username;
		this.password = password;
	}
	
	
	public GommistaRegistrato(GommistaRegistrato g) {
		this(g.id , g.nome , g.cognome , g.indirizzo , g.username , g.password);
	}
	
	//id get and set
	public int getId(){
		return this.id;
	}
	
	public void setId(int id) {
		this.id= id;
	}

	//nome get and set
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//cognome get and set
	public String getCognome(){
		return this.cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	//indirizzo get and set
	public String getIndirizzo() {
		return this.indirizzo;
	}
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	//username get and set
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username= username;
	}
	
	//password get and set
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
