package it.sopra.uiip.libeccio.viaggi.model.dao;

import it.sopra.uiip.libeccio.viaggi.model.Aereo;

public interface AereoDAO {

	public void insert (Aereo aereo);
	public Aereo selectByTipo (String tipo);
	public void update (String tipo, Aereo aereo);
	
}
