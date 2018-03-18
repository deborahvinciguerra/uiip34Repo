drop database if exists biblio;
create database biblio;

use biblio;

create table if not exists archivio (
	id_libro int(12) auto_increment primary key,
    titolo varchar(64) not null,
    autori varchar(128) not null,
    n_copie int(4) not null
);

create table if not exists tessere (
	id_tessera int(12) auto_increment primary key,
    nome varchar(64) not null,
    indirizzo varchar(64) not null
);

create table if not exists registro (
	id_prestito int(12) auto_increment primary key,
    id_libro int(12) not null,
    id_tessera int(12) not null,
    foreign key (id_libro) references archivio(id_libro),
    foreign key (id_tessera) references tessere(id_tessera)
);