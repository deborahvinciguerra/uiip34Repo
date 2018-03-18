drop database if exists biblioteca;
create database biblioteca;

use biblioteca;

create table if not exists libri(
	idLibro int not null primary key,
    titolo varchar(30) not null,
    autori varchar(60) not null,
    numeroCopie int not null
);

create table if not exists lettori(
	codiceFiscale varchar(16) not null primary key,
    nome varchar(20) not null,
    indirizzo varchar(20) not null
);

create table if not exists prestiti(
	idLibro int not null,
    codiceFiscale varchar(16) not null,
    constraint pk_prestiti primary key (idLibro, codiceFiscale),
    constraint fk_idLibro foreign key (idLibro) references libri(idLibro),
    constraint fk_codFisc foreign key (codiceFiscale) references lettori(codiceFiscale)
);

