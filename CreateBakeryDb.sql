DROP TABLE IF EXISTS stocktbl;
DROP TABLE IF EXISTS userlogintbl;
DROP TABLE IF EXISTS ordertbl;

CREATE TABLE stocktbl
(
	baked_item TEXT PRIMARY KEY,
	quantity INTEGER NOT NULL,
	price REAL NOT NULL
);

CREATE TABLE ordertbl
(
	id SERIAL PRIMARY KEY,
	username TEXT NOT NULL,
	baked_item TEXT NOT NULL,
	quantity INTEGER NOT NULL,
	price REAL NOT NULL
);

CREATE TABLE userlogintbl
(	
	username TEXT PRIMARY KEY,
	address TEXT NOT NULL,
	pass TEXT NOT NULL
);