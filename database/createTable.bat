DROP TABLE USER_CENTRE_INTERET
DROP TABLE USER
DROP TABLE CENTRE_INTERET

CREATE TABLE USER(
id integer not null IDENTITY,
nom varchar(90) not null,
prenom varchar(90) not null,
email varchar(90) not null,
centre_interet integer,
gravatar integer
)

CREATE TABLE CENTRE_INTERET(
id integer not null IDENTITY,
libelle varchar(90) not null
)

CREATE TABLE USER_CENTRE_INTERET(
id_user integer not null,
id_interet integer not null,
PRIMARY KEY(id_user,id_interet)
)

alter table USER_CENTRE_INTERET add constraint fk_interet foreign key(id_interet) references CENTRE_INTERET(id)
alter table USER_CENTRE_INTERET add constraint fk_user foreign key(id_user) references USER(id)

