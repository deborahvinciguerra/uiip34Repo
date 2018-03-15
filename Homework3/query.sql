insert into rubrica (smartphone,nome,cognome,numero) values 
(4,'Eugenio','Trodella','346 2873128');

select r.nome,r.cognome,s.name from rubrica as r inner join smartphone as s on r.smartphone=s.id;

update rubrica 
set numero='3573425245' where id=1;

update smartphone 
set ram='3Gb' where id=1;


select r.nome, r.cognome, s.name, s.ram from rubrica as r inner join smartphone as s on r.smartphone = s.id;



