delete from city;
delete from country;

insert into country (id, name) values (1, 'Germany');
insert into country (id, name) values (2, 'Turkey');
insert into country (id, name) values (3, 'Egypt');
insert into country (id, name) values (4, 'India');
insert into country (id, name) values (5, 'Ukraine');

insert into city (name, country_id) values ('Berlin', 1);
insert into city (name, country_id) values ('Munich', 1);
insert into city (name, country_id) values ('Istanbul', 2);
insert into city (name, country_id) values ('Kairo', 3);
insert into city (name, country_id) values ('Delhi', 4);
insert into city (name, country_id) values ('Kiev', 5);
