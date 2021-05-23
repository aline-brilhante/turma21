create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(
id bigint auto_increment,
verdura boolean not null,
legume boolean not null,
fruta boolean not null,
primary key (id)
);

create table tb_produto (
id bigint auto_increment,
nome varchar (255) not null,
organico boolean not null,
sazonal boolean not null,
disponivel boolean not null,
preco int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_categoria (verdura, legume, fruta) values (true , false, false);
insert tb_categoria (verdura, legume, fruta) values (false , true, false);
insert tb_categoria (verdura, legume, fruta) values (false , false, true);

insert into tb_produto (nome, organico, sazonal, disponivel, preco, categoria_id) values ("Morango", true, false, true, 16, 3);
insert into tb_produto (nome, organico, sazonal, disponivel, preco, categoria_id) values ("Repolho", false, true, true, 3, 1);
insert into tb_produto (nome, organico, sazonal, disponivel, preco, categoria_id) values ("Cenoura", true, false, true, 12, 2);
insert into tb_produto (nome, organico, sazonal, disponivel, preco, categoria_id) values ("Pitaya", true, false, true, 56, 3);
insert into tb_produto (nome, organico, sazonal, disponivel, preco, categoria_id) values ("Uva", true, true, true, 10, 3);

select * from tb_categoria;

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%C%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto where exists (select fruta from tb_categoria where tb_categoria.id = tb_produto.categoria_id and fruta = true);


