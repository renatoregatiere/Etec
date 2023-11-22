CREATE TABLE livro (
	idlivro int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
	nomelivro VARCHAR(40),
	generolivro VARCHAR(40),
	autorlivro VARCHAR (30),
	resumolivro VARCHAR (180),
	precolivro  numeric (7,2),
	isbnlivro VARCHAR (13));