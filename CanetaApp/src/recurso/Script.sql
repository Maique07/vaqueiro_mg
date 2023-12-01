create database if not exists papelaria;
use papelaria;
create table caneta(
codigo int auto_increment primary key,
modelo varchar(50),
cor varchar(50),
ponta decimal(2,1),
carga int,
tampada boolean
);