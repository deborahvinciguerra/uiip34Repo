package Model;

public class Aereo
{
	private String tipoAereo;
	private int nPass;
    private int quantitaMerci;
	
    //costruttore parametrico
    public Aereo(String tipoAereo, int nPass, int quantitaMerci) {
		this.tipoAereo = tipoAereo;
		this.nPass = nPass;
		this.quantitaMerci = quantitaMerci;
	}

	
    //getters&setters
    public String getTipoAereo() {
		return tipoAereo;
	}

	public void setTipoAereo(String tipoAereo) {
		this.tipoAereo = tipoAereo;
	}

	public int getnPass() {
		return nPass;
	}

	public void setnPass(int nPass) {
		this.nPass = nPass;
	}

	public int getQuantitaMerci() {
		return quantitaMerci;
	}

	public void setQuantitaMerci(int quantitaMerci) {
		this.quantitaMerci = quantitaMerci;
	}


	
	//metodi override
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
    
    
	
}
