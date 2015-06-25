SELECT 1;

create table Location (
	id identity,
	thekey varchar(20) unique not null,
	name varchar(120) not null,
	locationtype varchar(10) not null,
	iata varchar(3) not null,
	creationdate timestamp not null
);