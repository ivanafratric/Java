package edunova.klase;

public abstract class Osoba extends Object {
	
	private String ime;
	private String prezime;
	
	
	public Osoba() {
		super();
	}
	
	public Osoba(String ime, String prezime) {
	this.ime = ime;
	this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	@Override
	public String toString() {
		// return ime + " " + prezime;
		
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append(" ").append(prezime);
		return sb.toString();
		
		
	}

}
