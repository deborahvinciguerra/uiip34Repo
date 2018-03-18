drop database biblioteca;
create database if not exists biblioteca;

use biblioteca;

create table if not exists utente(
	id int(90) not null,
	nome varchar(20) not null ,
    cognome varchar(20) not null,
    indirizzo varchar(90) ,
    primary key (id)
);

create table if not exists libro(
	id int(90) not null,
	titolo varchar(60) ,
    autore varchar(60) ,
    primary key (id)
);

create table if not exists prestito(
	
	idUtente int(90) not null,
    idLibro int(90) not null,
    titolo varchar(60) ,
    autore varchar(60) ,
    primary key (idUtente,idLibro),
	constraint fk_idUtente foreign key(idUtente) references utente(id),
	constraint fk_idLibro foreign key(idLibro) references libro(id)
);