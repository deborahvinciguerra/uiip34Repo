
use Rubrica;

select u.codiceFiscale, u.nome, u.cognome, u.eta, s.name 
from utente as u inner join smartphone as s on u.codiceFiscale = s.codiceFiscale;


update utente 
set eta = 27
where codiceFiscale = "AAAAAAAAFFFFFFFF";

update smartphone
set displayResolution = "780x1280"
where id = 4;


select *
from smartphone;

