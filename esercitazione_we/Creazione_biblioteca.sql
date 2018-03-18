create database if not exists biblioteca;

use biblioteca;

create table if not exists libri(
	idlibro varchar(4) not null primary key,
	titolo varchar(20) not null,
    ncopie int not null,
	autori varchar(80)
);

create table if not exists lettori(
	idlettori varchar(20) not null primary key,
    nome varchar(20) not null,
    indirizzo varchar(20) not null ,
    libri varchar(4) not null    
);
create table if not exists presta(
 idlibro varchar(4),
 idlettori varchar(20),
 copieDisponibili int,
 constraint fk_libripr foreign key(idlibro) references libri(idlibro),
  constraint fk_lettoripr foreign key(idlettori) references lettori(idlettori)
 );
