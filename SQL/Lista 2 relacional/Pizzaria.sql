create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
salgada boolean not null,
doce boolean not null,
vegana boolean not null,
primary key (id)
);

create table tb_pizza (
id bigint auto_increment,
sabor varchar (255) not null,
ingredientes varchar (255) not null,
massa varchar (255) not null,
bordaRecheada boolean not null,
preco int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_categoria (salgada, doce, vegana) values (true , false, false);
insert tb_categoria (salgada, doce, vegana) values (false, true, false);
insert tb_categoria (salgada, doce, vegana) values (true, false, true);
insert tb_categoria (salgada, doce, vegana) values (false, true, true);

insert into tb_pizza (sabor, ingredientes, massa, bordaRecheada, preco, categoria_id) values ("Marguerita", "Mussarela, molho de tomate, manjeiricão e parmesão", "Tradicional", false, 38, 1);
insert into tb_pizza (sabor, ingredientes, massa, bordaRecheada, preco, categoria_id) values ("Brigadeiro", "Ganache de chocolate meio amargo com granulado", "Tradicional", true, 28, 2);
insert into tb_pizza (sabor, ingredientes, massa, bordaRecheada, preco, categoria_id) values ("Cogumelos", "Cogumelo paris, shimeji, mussarela vegana e cebola roxa", "Integral", false, 41, 3);
insert into tb_pizza (sabor, ingredientes, massa, bordaRecheada, preco, categoria_id) values ("Prestígio Veg", "Ganashe de chocolate meio amargo vegano e côco ralado", "Tradicional", false, 38, 4);
insert into tb_pizza (sabor, ingredientes, massa, bordaRecheada, preco, categoria_id) values ("Mussarela de Búfala gluten free", "Mussarela de búfala, molho de tomate, manjeiricão e orégano", "Sem glúten", false, 47, 1);

select * from tb_categoria;

select * from tb_pizza;

select * from tb_pizza where preco > 45;

select * from tb_pizza where preco between 29 and 60;

select * from tb_pizza where sabor like "%C%";

select * from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;

select * from tb_pizza where exists (select doce from tb_categoria where tb_categoria.id = tb_pizza.categoria_id and doce = true);
