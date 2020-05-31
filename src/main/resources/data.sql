DROP TABLE IF EXISTS delivery_data;
DROP TABLE IF EXISTS pawned_item cascade;
DROP TABLE IF EXISTS customer cascade;

CREATE TABLE customer(
    ID serial,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255) unique not null,
    birth_date date,
    phone_number varchar(255),
    PRIMARY KEY (ID)
);

CREATE TABLE pawned_item (
    ID serial,
    item_name varchar(255),
    material varchar(255),
    weight float,
    price float,
    payed boolean,
    customerid serial,
    PRIMARY KEY (ID),
    FOREIGN KEY (customerid) REFERENCES customer(ID)
);

INSERT INTO customer (first_name, last_name, email, birth_date, phone_number)
VALUES ('John', 'Doe', 'john.doe@gmail.com', '1990-03-25', '0043727145692');

