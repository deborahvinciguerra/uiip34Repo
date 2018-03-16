drop database viaggi;
create database if not exists viaggi;

use viaggi;

create table if not exists aeroporto(
	citta varchar(20) not null primary key,
    nazione varchar(20) not null,
    npiste int 
);


create table if not exists aereo(
	tipoAereo varchar(4) not null primary key,
    nPass int not null,
    quantitaMerci int not null
);

create table if not exists volo(
	idVolo int not null,
    giornoSett varchar(10) not null,
    cittaPart varchar(20) not null,
    cittaArr varchar(20) not null,
    tipoAereo varchar(4) not null,
    oraPartenza int (2) not null,
    oraArrivo int (2) not null,
    constraint pk_id primary key(idVolo,giornoSett),
    constraint fk_cittaPart foreign key(cittaPart) references aeroporto(citta),
	constraint fk_cittaArr foreign key(cittaArr) references aeroporto(citta),
    constraint fk_tipoAereo foreign key(tipoAereo) references aereo(tipoAereo)
);