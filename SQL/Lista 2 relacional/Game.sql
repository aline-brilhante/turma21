create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
tipo varchar (255) not null,
poder varchar (255) not null,
foco varchar (255) not null,
primary key (id)
);

create table tb_personagens (
id bigint auto_increment,
nome varchar (255) not null,
jogo varchar (255) not null,
arma varchar (255) not null,
defesa int not null,
ataque int not null,
classe_id bigint,
primary key (id),
foreign key (classe_id) references tb_classe (id)
);

insert tb_classe (tipo, poder, foco) values ("Antipaladino", "Magia Divina", "Símbolos Profanos");
insert tb_classe (tipo, poder, foco) values ("Monge", "Ki", "Focos de Ki");
insert tb_classe (tipo, poder, foco) values ("Paladino", "Magia Divina", "Símbolos Sagrados");

insert into tb_personagens (nome, jogo, arma, defesa, ataque, classe_id) values ("Cecil Harvey", "Final Fantasy IV", "Espada", 1350, 1680, 3);
insert into tb_personagens (nome, jogo, arma, defesa, ataque, classe_id) values ("Diana", "Dungeons & Dragons", "Espada", 3200, 1890, 2);
insert into tb_personagens (nome, jogo, arma, defesa, ataque, classe_id) values ("Lord Soth", "Dragonlance", "Machado", 670, 3300, 1);
insert into tb_personagens (nome, jogo, arma, defesa, ataque, classe_id) values ("Alhandra", "Dungeons & Dragons", "Machado", 2800, 1350, 3);
insert into tb_personagens (nome, jogo, arma, defesa, ataque, classe_id) values ("Príncipe Arthas Menethil", "World Of Warcraft", "Espada", 1680, 1760, 1);

select * from tb_classe;

select * from tb_personagens;

select * from tb_personagens where ataque > 2000;

select * from tb_personagens where defesa between 1000 and 2000;

select * from tb_personagens where nome like "%C%";

select * from tb_personagens inner join tb_classe on tb_classe.id = tb_personagens.classe_id;

select * from tb_personagens where exists (select tipo from tb_classe where tb_classe.id = tb_personagens.classe_id and tipo = "Paladino");
