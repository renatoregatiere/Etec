create table livro(
	idlivro integer auto_increment primary key not null,
	nomelivro varchar(40),
	generolivro varchar(40),
	autorlivro varchar(30),
	resumolivro varchar(180),
	precolivro numeric(7,2),
	isbnlivro varchar(13)
);