drop database biblioteca;
create database biblioteca;
use biblioteca;

create table if not exists libro(
	idLibro int not null primary key,
    titolo varchar(40) not null,
    autori varchar(40)not null,
    ncopie int
);

describe libro;

create table if not exists richiesta(
	idRichiesta int not null primary key,
    idLibro int not null,  
    foreign key (idLibro) references libro(idLibro)
);

create table if not exists lettore(
	id int not null primary key,
    nome varchar(40) not null,
    indirizzo varchar(40) not null,
    idTessera int not null,
    idRichiesta int not null,
	foreign key (idRichiesta) references richiesta(idRichiesta)
);

describe lettore;
