-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-05-08 06:53:51.256

-- tables
-- Table: customer
CREATE TABLE customer (
    id serial  NOT NULL,
    registration_code varchar(255)  NOT NULL,
    full_name varchar(255)  NOT NULL,
    email varchar(255)  NOT NULL,
    telephone varchar(255)  NOT NULL,
    CONSTRAINT customer_pk PRIMARY KEY (id)
);

-- Table: order
CREATE TABLE "order" (
    id serial  NOT NULL,
    date_of_submission date  NOT NULL,
    CONSTRAINT order_pk PRIMARY KEY (id)
);

-- Table: order_customer
CREATE TABLE order_customer (
    id serial  NOT NULL,
    order_id int  NOT NULL,
    customer_id int  NOT NULL,
    CONSTRAINT order_customer_pk PRIMARY KEY (id)
);

-- Table: order_line
CREATE TABLE order_line (
    id serial  NOT NULL,
    quantity int  NOT NULL,
    product_id int  NOT NULL,
    order_id int  NOT NULL,
    CONSTRAINT order_line_pk PRIMARY KEY (id)
);

-- Table: product
CREATE TABLE product (
    id serial  NOT NULL,
    name varchar(255)  NOT NULL,
    sku_code varchar(255)  NOT NULL,
    unit_price varchar(255)  NOT NULL,
    CONSTRAINT product_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: order_customer_customer (table: order_customer)
ALTER TABLE order_customer ADD CONSTRAINT order_customer_customer
    FOREIGN KEY (customer_id)
    REFERENCES customer (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: order_customer_order (table: order_customer)
ALTER TABLE order_customer ADD CONSTRAINT order_customer_order
    FOREIGN KEY (order_id)
    REFERENCES "order" (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: order_line_order (table: order_line)
ALTER TABLE order_line ADD CONSTRAINT order_line_order
    FOREIGN KEY (order_id)
    REFERENCES "order" (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: order_line_product (table: order_line)
ALTER TABLE order_line ADD CONSTRAINT order_line_product
    FOREIGN KEY (product_id)
    REFERENCES product (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

