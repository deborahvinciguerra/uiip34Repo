###########################
# DUMPING DATA BIBLIOTECA #
###########################

INSERT INTO tessera (id, nome, cognome, indirizzo) VALUES 
					(1, 'Angelo', 'Manganiello', 'via Olmo'),
                    (2, 'Eugenio', 'Trodella', 'via Rossi'),
                    (3, 'Gianluca', 'Cocco', 'via Verdi'),
                    (4, 'Daniele', 'd\'Angela', 'via Manzoni'),
                    (5, 'Gianluigi', 'Leone', 'via Leopardi'),
                    (6, 'Andrea', 'Franza', 'via Cavour'),
                    (7, 'Natalia', 'Albanese', 'via Mazzini'),
                    (8, 'Carla', 'Ventre', 'via Bianchi'),
                    (9, 'Francesca', 'Farinaccio', 'via Neri');

INSERT INTO autore(id, nome, cognome) VALUES
					(1,'Paolo', 'Atzeni'),
                    (2,'Stefano', 'Ceri'),
                    (3,'Riccardo', 'Torlone'),
                    (4,'Piero', 'Fraternali'),
                    (5,'Stefano', 'Paraboschi'),
                    (6,'Stephen', 'King'),
                    (7,'Roberto', 'Saviano');
                    
INSERT INTO libro (codice, titolo, nCopie) VALUES
					('001','Basi di dati',5),
                    ('002','Revival',3),
                    ('003','Mucchio di ossa',4),
                    ('004', 'Gomorra', 7);
                    
INSERT INTO scrittura (autore, libro) VALUES
					(1,'001'),
                    (2,'001'),
                    (3,'001'),
                    (4,'001'),
                    (5,'001'),
                    (6,'002'),
                    (6,'003'),
                    (7,'004');

INSERT INTO prestito(utente,libro) VALUES 
					(1,'001'),
                    (2,'001'),
                    (3,'001'),
                    (1,'002'),
                    (3,'002'),
                    (4,'002');
	