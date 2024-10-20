create table students
(
    id  serial not null primary key,
    firstname varchar(250) not null,
    surname   varchar(250) not null,
    age       smallint     not null
)