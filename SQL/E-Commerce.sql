create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
tipo varchar (50) not null,
marca varchar (50) not null,
tamanho char (3) not null,
preco float not null,
primary key (id)
);

select * from tb_produtos;

insert into tb_produtos (tipo, marca, tamanho, preco)
values ("Calça", "SHEIN", 'M', 84.90);

select * from tb_produtos where preco > 500;

select * from tb_produtos where preco < 500;

update tb_produtos set preco = 80 where id = 5;