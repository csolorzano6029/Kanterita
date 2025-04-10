DROP DATABASE IF EXISTS restaurant;

CREATE DATABASE restaurant;

\ c restaurant;

CREATE TABLE orders (
    id SERIAL PRIMARY KEY NOT NULL,
    number VARCHAR(255) NOT NULL,
    client VARCHAR(255) NOT NULL,
    total DOUBLE PRECISION,
    date_order TIMESTAMP NOT NULL,
    status VARCHAR(1) NOT NULL DEFAULT '1',
    create_date TIMESTAMP NOT NULL DEFAULT NOW(),
    update_date TIMESTAMP NULL
);

CREATE TABLE order_details (
    id SERIAL PRIMARY KEY NOT NULL,
    id_order INTEGER NOT NULL,
    detail VARCHAR(255) NOT NULL,
    amount DOUBLE PRECISION NOT NULL,
    unit_price DOUBLE PRECISION NOT NULL,
    total_detail DOUBLE PRECISION NOT NULL,
    status VARCHAR(1) NOT NULL DEFAULT '1',
    create_date TIMESTAMP NOT NULL DEFAULT NOW(),
    update_date TIMESTAMP NULL,
    CONSTRAINT fk_details_order FOREIGN KEY(id_order) REFERENCES orders(id)
);

-- Datos de prueba
INSERT INTO
    orders (number, client, total, date_order)
VALUES
    ('A001', 'JUAN PEREZ', 34, NOW());

INSERT INTO
    order_details (
        id_order,
        detail,
        amount,
        unit_price,
        total_detail
    )
VALUES
    (1, 'HAMBURGUESA', 3, 10, 30),
    (1, 'COCA-COLA NEGRA', 5, 2.50, 15);