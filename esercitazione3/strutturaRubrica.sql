drop database rubrica;
CREATE DATABASE IF NOT exists rubrica
	default CHARACTER SET 	latin1
    default collate latin1_general_ci;
    
use rubrica;

alter database rubrica
	default character set utf8
    default collate utf8_unicode_ci;
    
    CREATE table IF NOT exists country (
 name varchar(32) not null,
 code varchar(2) ,
 primary key (code)
);

CREATE table IF NOT exists brand (
 id int (11) not null ,
 name varchar(32) not null,
 country varchar(2) not null,
 primary key (id) ,
 Constraint fk_country foreign key (country) references country(code)
);

CREATE table IF NOT exists opsys (
 id int (11) not null ,
 description varchar(64) not null,
 company varchar(64) not null,
 openSource tinyint(1) not null,
 primary key (id)
);





CREATE table IF NOT exists smartphone (
 id int (11) not null ,
 name varchar(64) not null,
 ram varchar(5) not null,
 cpu varchar(64) not null,
 displayPpi int(11) not null,
 displaySize varchar(12) not null,
 displayResolution varchar(64) not null,
 size varchar(64) not null,
 weight int(4) not null,
 notes varchar(1024) not null,
 brand int (11) not null,
 opSys int (11) not null,
 primary key (id),
 Constraint fk_brand foreign key (brand) references brand(id),
 Constraint fk_opSys foreign key (opSys) references opSys(id)
);






CREATE table IF NOT exists persone (
 id int (11) not null ,
 name varchar (20) not null,
 cognome varchar(20) not null,
 dataNascita varchar(25) not null,
 numeroTel	int (10) not null,
 smartphone int (11) not null,
 primary key (id),
 constraint fk_smartphone foreign key (smartphone) references smartphone(id)
);

