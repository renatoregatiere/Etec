CREATE TABLE livro (
	idlivro SERIAL NOT NULL, 
	nomelivro VARCHAR(40),
	generolivro VARCHAR(40),
	autorlivro VARCHAR (30),
	resumolivro VARCHAR (180),
	precolivro  numeric (7,2),
	isbnlivro VARCHAR (13),
	CONSTRAINT pk_livro 
	PRIMARY KEY (idlivro));