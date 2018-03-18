use biblioteca;

insert into libri(idLibro, titolo, autori, numeroCopie) values
				(1,"the java language","James Gosling, Bill Joy, Guy Steele, Gilad Bracha",5), 
                (2,"the java programming","James Gosling, Ken Arnold",3),
                (3,"learning Sql","Alan Beaulieu",1),
                (4,"oracle pl/sql","Steven Feuerstein, Bill Pribyl",2),
                (5,"html 5","Daniele Bochicchio, Stefano Mostarda",6);
                
insert into lettori(codiceFiscale,nome,indirizzo) values
			     ("d1","daniele","via savoia"),
                 ("g1","gianluca","via roma"),
                 ("a1","andrea","via umberto I");
                 
insert into prestiti(idLibro,codiceFiscale) values
				("1","d1"),
                ("2","g1"),
                ("3","a1");
                
