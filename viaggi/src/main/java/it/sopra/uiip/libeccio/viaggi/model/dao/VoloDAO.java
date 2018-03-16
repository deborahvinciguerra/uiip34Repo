package it.sopra.uiip.libeccio.viaggi.model.dao;

import it.sopra.uiip.libeccio.viaggi.model.Volo;

public interface VoloDAO {

	public void insert (Volo volo);
	public void selectById (String id);
	public void update (String id, Volo volo);
	
}
