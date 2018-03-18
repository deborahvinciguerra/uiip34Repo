
insert into libro(idLibro, titolo, autori, nCopie)
	values(1, "Gomorra", "Saviano", 6),
		(2, "Il fu Mattia Pascal", "Pirandello", 10),
		(3, "Il ritratto di Dorian Gray", "Wilde", 5),
        (4, "Uno, nessuno e centomila", "Pirandello", 20);
        
        
insert into richiesta(idRichiesta, idLibro)
	values(1,1),
		(2,2),
		(3,4);
    
        
insert into lettore(id, nome, indirizzo, idTessera, idRichiesta)
	values(1, "Natalia", "via Pomodoro", 1, 1),
		(2, "Carla", "via Carciofo", 2, 2),
		(3, "Natalia", "via Pomodoro", 1, 3);
        
