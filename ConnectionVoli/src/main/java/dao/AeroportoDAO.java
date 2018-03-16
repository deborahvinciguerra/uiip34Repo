package dao;

import model.Aeroporto;

public interface AeroportoDAO
{
	public void inserisci(Aeroporto aeroporto);
	public Aeroporto cercaPerCitta(String citta);
}
