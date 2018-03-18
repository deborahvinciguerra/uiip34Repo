use biblioteca;
DELETE from libri;
delete from lettori;
delete from presta;

INSERT INTO libri(idlibro,titolo,ncopie,autori)
VALUES ("l1","abcd",2,3),
		("l2","lo shampo",1,3),
        ("l3","melograno",2,1);
        
INSERT INTO lettori(idlettori,nome,indirizzo,libri)
VALUES  ("let1","luigi","roma 12","l1"),
		("let2","marta","Napoli 34","l12"),
        ("let3","mercy","NewYork 65","l5");
        
INSERT INTO presta(idlibro,idlettori,copieDisponibili)
VALUES  ("l1","let1",3),
		("l2","let2",3),
        ("l3","let3",3);