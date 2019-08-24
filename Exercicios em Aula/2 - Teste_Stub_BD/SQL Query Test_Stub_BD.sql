create schema teste;

use teste;

create table usuario(
    id int not null primary key,
    nome varchar(50) not null
)

insert into usuario values (1,'Kelvin')
insert into usuario values (2,'Fulano')

select * from usuario;

drop schema teste