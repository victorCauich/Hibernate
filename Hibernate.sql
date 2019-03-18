drop database if exists oda;
create database oda;
use oda;

create table tipoobjeto(
	id_tipoobjeto int not null primary key,
    nombre_tipoobjeto varchar(10) not null
);

create table licenciatura_unidadaprendizaje (
	id_licenciatura int not null primary key auto_increment,
    nombre_licenciatura varchar (100),
    nombre_unidadaprendizaje varchar (100)
);

create table subcategoria (
	id_subcategoria int not null primary key auto_increment,
    nombre_subcategoria varchar (100) not null
);

create table autor(
	id_autor int not null primary key auto_increment,
    nombre_autor varchar (50) not null,
    apellidopaterno_autor varchar (50),
    apellidomaterno_autor varchar (50),
    tipo_autor varchar (10)
);

create table objetoaprendizaje(
	id_objetoaprendizaje int not null primary key auto_increment,
    nombre_objetoaprendizaje varchar(100) not null,
    duracion_objetoaprendizaje time not null,
    objetivo_objetoaprendizaje varchar (500),
    descripcion_objetoaprendizaje varchar (500),
    enlace_objetoaprendizaje varchar (150),
    
    id_tipoobjeto int not null,
    id_licenciatura int not null,
    id_subcategoria int not null,
    id_autor int not null,
    
    
	constraint fk_id_tipoobjeto foreign key (id_tipoobjeto) references tipoobjeto (id_tipoobjeto),
    constraint fk_id_licenciatura foreign key (id_licenciatura) references licenciatura_unidadaprendizaje (id_licenciatura),
    constraint fk_id_subcategoria foreign key (id_subcategoria) references subcategoria (id_subcategoria),
    constraint fk_id_autor foreign key (id_autor) references autor (id_autor)
);

insert into tipoobjeto value
(1, "VIDEO"),
(2, "PODCAST");


