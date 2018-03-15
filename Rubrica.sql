create database if not exists Rubrica
	default character set latin1
    default collate latin1_general_ci;

use Rubrica; 

alter database Rubrica
	default character set utf8
    default collate utf8_unicode_ci;


create table if not exists country(
	code varchar(2) not null primary key,
    name varchar(32) not null
);


create table if not exists brand(
	id int(11) not null auto_increment,
    name varchar(32) not null,
    country varchar(2) not null,
    primary key(id),
    constraint fk_country foreign key (country) references country(code)
);

create table if not exists opSys(
	id int(11) not null auto_increment primary key,
    description varchar(64) not null,
    company varchar(64) not null,
    openSource tinyint  not null
);

create table if not exists utente(
	codiceFiscale varchar(16) not null primary key,
    nome varchar(20) not null,
    cognome varchar(20) not null,
    eta int not null,
    indirizzo varchar(30) not null
);


create table if not exists smartphone(
	id int(11) not null auto_increment primary key,
    name varchar(64) not null,
    ram varchar(5) not null,
    cpu varchar(64) not null,
    displayPpi int(11) not null,
    displaySize varchar(12) not null,
    displayResolution varchar(64) not null,
    size varchar(64) not null,
    weight int(4) not null,
    notes varchar(1024) not null,
    brand int(11) not null,
    opSys int(11) not null,
    codiceFiscale varchar(16) not null,
	constraint fk_brand foreign key (brand) references brand(id),
    constraint fk_opSys foreign key (opSys) references opSys(id),
    constraint fk_utente foreign key (codiceFiscale) references utente(codiceFiscale)
);

create table if not exists schedaTelefonica(
	numeroTelefono varchar(10) not null primary key,
    operatore varchar(15) not null,
    codiceFiscale varchar(16) not null,
    constraint fk_codiceFiscale foreign key (codiceFiscale) references utente(codiceFiscale)
)
