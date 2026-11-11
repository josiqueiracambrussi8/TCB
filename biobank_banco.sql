create database biobank;
use biobank;

create table especime(
id_especime int not null auto_increment,
nome_cientifico varchar(200),
nome_popular varchar(100),
filo varchar(50),
classe varchar(50),
habitat varchar(50),
onde_visto varchar(70),
quanto_visto int,
caracteristica text,
periodo_reproducao varchar(50),
status_natividade varchar(30),
primary key(id_especime)
);

create table especime_animal(
id_especime int not null,
habito varchar(50),
dieta varchar(50),
comportamento_social text,
periodo_gestacao varchar(20),
migracao text,
extensao_territorio varchar(20),
primary key(id_especime),
constraint fk_especime_especimeanimal foreign key (id_especime) references especime(id_especime)
);

create table especime_planta(
id_especime int not null,
grupo_evolutivo varchar(50),
tipo_solo varchar(60),
necessidade_luz varchar(50),
necessidade_agua varchar(50),
estrategia_nutricional varchar(70),
primary key(id_especime),
constraint fk_especime_especimeplanta foreign key (id_especime) references especime(id_especime)
);

select * from especime_planta;