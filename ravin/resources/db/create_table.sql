CREATE SCHEMA IF NOT EXISTS ravin;
SET search_path TO ravin;


CREATE TABLE IF NOT EXISTS Person (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    address VARCHAR(200),
    phone VARCHAR(20),
    cpf VARCHAR(14) UNIQUE,
    dateOfBirth DATE,
    observations TEXT,
    hasActive BOOLEAN
);

CREATE TABLE IF NOT EXISTS Employee (
    id SERIAL PRIMARY KEY,
	personId INTEGER REFERENCES Person(id),
    rg VARCHAR(20),
    meritalStatus VARCHAR(20),
    schooling VARCHAR(50),
    responsability VARCHAR(50),
    pis INTEGER,
    admissionDate DATE,
    resignationDate DATE,
    employeeAviability VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Customer (
	id SERIAL PRIMARY KEY,
	personId INTEGER REFERENCES Person(id),
    allergies TEXT,
    vip BOOLEAN
);

CREATE TABLE IF NOT EXISTS "Table" (
    id SERIAL PRIMARY KEY,
    employeeId INTEGER REFERENCES Employee(id),
    name VARCHAR(100) NOT NULL,
    code VARCHAR(20) UNIQUE,
    number INTEGER UNIQUE,
    tableStatus VARCHAR(20)
);

CREATE TABLE IF NOT EXISTS Product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    code VARCHAR(20) UNIQUE,
    costPrice NUMERIC(10, 2),
    salePrice NUMERIC(10, 2),
    preparationTime VARCHAR(50),
    comments TEXT,
    productType VARCHAR(50),
    hasActive BOOLEAN
);

CREATE TABLE IF NOT EXISTS "Order" (
    id SERIAL PRIMARY KEY,
    productId INTEGER REFERENCES Product(id),
    requestDateTime TIMESTAMP,
    startPreparationDateTime TIMESTAMP,
    remindingPreparationTime TIMESTAMP,
    preparationOrderStatus VARCHAR(50),
    comments TEXT,
    quantity INTEGER
);

CREATE TABLE IF NOT EXISTS Commanda (
    id SERIAL PRIMARY KEY,
    tableId INTEGER REFERENCES "Table"(id),
    customerId INTEGER REFERENCES Customer(id),
    code VARCHAR(20) UNIQUE,
    comments TEXT,
    commandaStatus VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS CommandaOrder (
    id SERIAL PRIMARY KEY,
    commandaId INTEGER REFERENCES Commanda(id),
    orderId INTEGER REFERENCES "Order"(id)
);

SELECT setval('ravin."Table_id_seq"', 1, false);
SELECT setval('ravin."Order_id_seq"', 1, false);
SELECT setval('ravin."person_id_seq"', 1, false);
SELECT setval('ravin."employee_id_seq"', 1, false);
SELECT setval('ravin."customer_id_seq"', 1, false);
SELECT setval('ravin."commanda_id_seq"', 1, false);
SELECT setval('ravin."product_id_seq"', 1, false);
SELECT setval('ravin."commandaorder_id_seq"', 1, false);