CREATE DATABASE IF NOT EXISTS Phone
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
    
USE Phone;

ALTER DATABASE Phone
	DEFAULT CHARACTER SET utf8
	DEFAULT COLLATE utf8_unicode_ci;
   

CREATE TABLE IF NOT EXISTS country (
    code VARCHAR (2) NOT NULL PRIMARY KEY,
    name VARCHAR (32) NOT NULL
);

CREATE TABLE IF NOT EXISTS brand (
	id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR (32) NOT NULL,
    country VARCHAR (2) NOT NULL,
    CONSTRAINT fk_country FOREIGN KEY (country) REFERENCES country(code)
);




CREATE TABLE IF NOT EXISTS opsys (
	id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR (64) NOT NULL,
    company VARCHAR (64) NOT NULL,
    openSource TINYINT (1) NOT NULL
);

CREATE TABLE IF NOT EXISTS smartphone (
	id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR (64) NOT NULL,
    ram VARCHAR (5) NOT NULL,
    cpu VARCHAR (64) NOT NULL,
    displayPpi INT (11) NOT NULL,
    displaySize VARCHAR (12) NOT NULL,
    displayResolution VARCHAR (64) NOT NULL,
    size VARCHAR (64) NOT NULL,
    weight INT (4) NOT NULL,
    notes VARCHAR (1024) NOT NULL,
    brand INT (11) NOT NULL,
    opSys INT (11) NOT NULL,
    CONSTRAINT fk_brand FOREIGN KEY (brand) REFERENCES brand(id),
    CONSTRAINT fk_opSys FOREIGN KEY (opsys) REFERENCES opsys(id)
    
);

create table if not exists contatto(
	id INT(11) NOT NULL PRIMARY KEY,
    nome VARCHAR (30) NOT NULL,
    cognome VARCHAR (30) NOT NULL,
    numtelefono varchar(10)

);


create table if not exists rubrica(
	id varchar(32) not null primary key,
    idContatto int(11) not null,
    modellotel varchar(32),
    idsmartphone int(11),
    foreign key (idsmartphone) references smartphone(id),
    foreign key (idContatto) references contatto(id)
);    