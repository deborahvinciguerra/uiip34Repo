package it.sopra.uiip.libeccio.viaggi.model.dao;

import it.sopra.uiip.libeccio.viaggi.model.Volo;

public interface VoloDAO {

	public void insert (Volo volo);
	public Volo selectById (int id);
	public void update (int id, Volo volo);
	
}
