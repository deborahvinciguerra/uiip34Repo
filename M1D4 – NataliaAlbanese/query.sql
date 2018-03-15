select c.nome, c.cognome, r.modellotel
from Rubrica as r inner join contatto as c on r.idContatto = c.id;

update smartphone
	set name = '3gb'
    where id = 1; 
    
update contatto
	set nome = 'francesca', cognome='farinaccio'
    where id = 2;
    
   
select id, ram
	from smartphone;
