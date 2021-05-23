create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
tarjaPreta boolean not null,
tarjaVermelha boolean not null,
liberado boolean not null,
primary key (id)
);

create table tb_produto (
id bigint auto_increment,
nome varchar (255) not null,
composicao varchar (255) not null,
indicacao varchar (255) not null,
disponivel boolean not null,
preco int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_categoria (tarjaPreta, tarjaVermelha, liberado) values (true , false, false);
insert tb_categoria (tarjaPreta, tarjaVermelha, liberado) values (false , true, false);
insert tb_categoria (tarjaPreta, tarjaVermelha, liberado) values (false , false, true);

insert into tb_produto (nome, composicao, indicacao, disponivel, preco, categoria_id) values ("Benegrip", "Metabissulfito de sódico", "Gripe", true, 16, 3);
insert into tb_produto (nome, composicao, indicacao, disponivel, preco, categoria_id) values ("Mytedom", "Cloridrato de metadona", "Analgésico", true, 87, 1);
insert into tb_produto (nome, composicao, indicacao, disponivel, preco, categoria_id) values ("Dimorf", "Sulfato de morfina", "Analgésico", true, 98, 1);
insert into tb_produto (nome, composicao, indicacao, disponivel, preco, categoria_id) values ("AgemoxiCL", "Amoxicilina", "Antibiótico", true, 47, 2);
insert into tb_produto (nome, composicao, indicacao, disponivel, preco, categoria_id) values ("Scaflam", "Nimesulida", "Antinflamatório", true, 26, 2);

select * from tb_categoria;

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%B%";

select * from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto where exists (select tarjaPreta from tb_categoria where tb_categoria.id = tb_produto.categoria_id and tarjaPreta = true);
