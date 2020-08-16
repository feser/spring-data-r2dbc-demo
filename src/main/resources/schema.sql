create table if not exists country (
    id bigserial not null primary key,
    name text not null
);

create table if not exists city (
    id bigserial not null primary key,
    name text not null,
    country_id bigserial references country (id)
);