package edunova.klase;

public class Pravokutnik {
	
	private int sirina;
	private int visina;
	
	public Pravokutnik() {
		System.out.println("Pozvan konstruktor od pravokutnika");
	}
	
	public Pravokutnik(int sirina, int visina) {
		this.sirina = sirina;
		this.visina = visina;
	}

	public int getSirina() {
		return sirina;
	}
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	
	public int povrsina() {
		return sirina * visina;
	}
	
	

}
