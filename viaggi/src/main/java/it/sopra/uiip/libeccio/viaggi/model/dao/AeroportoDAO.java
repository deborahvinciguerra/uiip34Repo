package it.sopra.uiip.libeccio.viaggi.model.dao;

import it.sopra.uiip.libeccio.viaggi.model.Aeroporto;

public interface AeroportoDAO {

	public void insert (Aeroporto aeroporto);
	public Aeroporto selectByCitta (String citta);
	public void update (String citta, Aeroporto aeroporto);
	
}
