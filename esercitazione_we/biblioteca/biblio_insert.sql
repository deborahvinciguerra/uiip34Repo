use biblio;

insert into tessere (nome, indirizzo) values
	('nome1', 'indirizzo1'),
    ('nome2', 'indirizzo2'),
    ('nome3', 'indirizzo3');
    
insert into archivio (titolo, autori, n_copie) values
	('libro1', 'autori1', 4),
    ('libro2', 'autori2', 7),
    ('libro3', 'autori3', 1);
    
insert into registro (id_libro, id_tessera) values
	(2, 1),
    (3, 2),
    (1, 3);
