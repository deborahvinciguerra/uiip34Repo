DROP DATABASE IF EXISTS PhoneRubrica;

CREATE DATABASE IF NOT EXISTS PhoneRubrica
	DEFAULT CHARACTER SET latin1
    DEFAULT COLLATE latin1_general_ci;
    
USE PhoneRubrica;

ALTER DATABASE PhoneRubrica
	DEFAULT CHARACTER SET utf8
    DEFAULT COLLATE utf8_unicode_ci;

CREATE TABLE IF NOT EXISTS country (
    code VARCHAR(2),
    name VARCHAR(32) NOT NULL,
    PRIMARY KEY (code)
);

CREATE TABLE IF NOT EXISTS opsys (
    id INT NOT NULL AUTO_INCREMENT,
    description VARCHAR(64),
    company VARCHAR(64),
    openSource TINYINT(1),
    PRIMARY KEY (id)
);
    
CREATE TABLE IF NOT EXISTS brand (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(32) NOT NULL,
    country VARCHAR(2) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_contry FOREIGN KEY (country)
        REFERENCES country(code)
);

CREATE TABLE IF NOT EXISTS smartphone (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL,
    ram VARCHAR(5),
    cpu VARCHAR(64),
    displayPpi INT(11),
    displaySize VARCHAR(12),
    displayResolution varchar(64),
    size VARCHAR(64),
    weight INT(4),
    notes VARCHAR(1024),
    brand INT not null,
    opSys INT not null,
    PRIMARY KEY (id),
    CONSTRAINT fk_brand FOREIGN KEY (brand)
        REFERENCES brand(id),
    CONSTRAINT fk_opSys FOREIGN KEY (opsys)
        REFERENCES opsys(id)
); 

CREATE TABLE IF NOT EXISTS rubrica (
	id INT NOT NULL auto_increment,
    smartphone int not null,
    nome VARCHAR(32) NOT NULL,
    cognome VARCHAR(32) NOT NULL,
    numero VARCHAR(15) NOT NULL,
    primary key (id),
    constraint fk_smartphone foreign key (smartphone) references smartphone(id) 
    );







