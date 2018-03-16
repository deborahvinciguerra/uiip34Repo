package dao;

import Model.Aeroporto;

public interface AeroportoDAO
{
	public void inserisci(Aeroporto aeroporto);
	public Aeroporto cercaPerCitta(String citta);
}
