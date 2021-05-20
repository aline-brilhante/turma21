create database db_escola;

use db_escola;

create table tb_alunos(
id bigint auto_increment,
nome varchar (255) not null,
cpf varchar (11) not null,
sala int (3) not null,
nota float not null,
primary key (id)
);

select * from tb_alunos;

insert into tb_alunos(nome, cpf, sala, nota)
values("Lucas", "919251735", 37, 7.3);

select * from tb_alunos where nota > 7;

select * from tb_alunos where nota < 7;

update tb_alunos set nome = "Brunno" where id = 2;

