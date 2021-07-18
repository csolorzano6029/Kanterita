DROP DATABASE IF EXISTS restaurante;
CREATE DATABASE IF NOT EXISTS restaurante;

use restaurante;

create table ORDER_ENTITY (
id bigint(20) not null auto_increment,
number varchar(255),
client varchar(255),
total Double,
date_Order DateTime,
primary key(id)
)engine = innodb;

create table DETAILS_ENTITY (
id bigint(20) not null auto_increment,
id_Order bigint(20) not null,
detail varchar(255),
amount Double,
unit_Price Double,
total_Detail Double,
primary key(id),
constraint fk_details_order foreign key(id_Order) references ORDER_ENTITY(id)
)engine = innodb;

Show tables;

describe details_entity;

describe order_entity;

INSERT INTO ORDER_ENTITY (number, client, total, date_order) values ('A001', 'JUAN PEREZ', 34, NOW());
INSERT INTO DETAILS_ENTITY (id_Order, detail, amount, unit_Price, total_Detail) values (1, 'HAMBUERGUESA', 3, 10, 30);
INSERT INTO DETAILS_ENTITY (id_Order, detail, amount, unit_Price, total_Detail) values (1, 'COCA-COLA NEGRA', 5, 2.50, 15);