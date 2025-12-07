create table produto (
    id varchar(255) not null primary key,
    nome varchar(100) not null,
    descricao text,
    preco decimal(10, 2) not null
);