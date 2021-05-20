-- criar banco de dados
create database db_rh;

-- acessar banco de dados
use db_rh;

-- criar tabela
create table tb_funcionaries(
id bigint auto_increment,
nome varchar (255) not null,
cpf varchar (11) not null,
salario float not null,
horastrabalhadas int not null,
primary key (id)
);

-- busca de dados
select * from tb_funcionaries;

insert into tb_funcionaries (nome, cpf, salario, horastrabalhadas)
values ("Tereza" , "1986394619", 2560.65, 30);

select * from tb_funcionaries where salario > 2000;

select * from tb_funcionaries where salario < 2000;

update tb_funcionaries set salario = 2000 where id = 3;





