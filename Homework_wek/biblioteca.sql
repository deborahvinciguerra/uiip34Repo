DROP DATABASE biblioteca;

CREATE DATABASE IF NOT EXISTS Biblioteca;

USE Biblioteca;

CREATE TABLE IF NOT EXISTS tessera (
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(32) NOT NULL,
    cognome VARCHAR(32) NOT NULL,
    indirizzo VARCHAR(32) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS autore (
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(32) NOT NULL,
    cognome VARCHAR(32) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS libro (
	codice VARCHAR(13) NOT NULL,
    titolo VARCHAR(35) NOT NULL,
    nCopie INT(2) NOT NULL,
    PRIMARY KEY (codice)
);

CREATE TABLE IF NOT EXISTS prestito (
	utente INT NOT NULL,
    libro VARCHAR(13) NOT NULL,
    PRIMARY KEY (utente,libro),
    CONSTRAINT fk_prestito_tessera_ FOREIGN KEY (utente) REFERENCES tessera(id),
    CONSTRAINT fk_presito_libro FOREIGN KEY (libro) REFERENCES libro(codice)
);

CREATE TABLE IF NOT EXISTS scrittura (
	autore INT NOT NULL,
    libro VARCHAR(11) NOT NULL,
    PRIMARY KEY (autore,libro),
	CONSTRAINT fk_scrittura_autore FOREIGN KEY (autore) REFERENCES autore(id),
    CONSTRAINT fk_scrittura_libro FOREIGN KEY (libro) REFERENCES libro(codice)
);



