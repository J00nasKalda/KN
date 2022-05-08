INSERT INTO public.customer (id, registration_code, full_name, email, telephone) VALUES (DEFAULT, '11111', 'Tom Tomason', 'tom@hot.ee', '+372 54343434');
INSERT INTO public.customer (id, registration_code, full_name, email, telephone) VALUES (DEFAULT, '22222', 'Joe Joeson', 'joe@hot.ee', '+372 56565656');
INSERT INTO public.customer (id, registration_code, full_name, email, telephone) VALUES (DEFAULT, '33333', 'Ron Ronson', 'ron@hot.ee', '+372 58585858');

INSERT INTO public.product (id, name, sku_code, unit_price) VALUES (DEFAULT, 'Wood', '101010', '10');
INSERT INTO public.product (id, name, sku_code, unit_price) VALUES (DEFAULT, 'Metal', '202020', '20');
INSERT INTO public.product (id, name, sku_code, unit_price) VALUES (DEFAULT, 'Steel', '303030', '30');

INSERT INTO public."order" (id, date_of_submission) VALUES (DEFAULT, '2022-05-25');
INSERT INTO public."order" (id, date_of_submission) VALUES (DEFAULT, '2022-06-25');
INSERT INTO public."order" (id, date_of_submission) VALUES (DEFAULT, '2022-07-25');


INSERT INTO public.order_customer (id, order_id, customer_id) VALUES (DEFAULT, 1, 1);
INSERT INTO public.order_customer (id, order_id, customer_id) VALUES (DEFAULT, 2, 2);
INSERT INTO public.order_customer (id, order_id, customer_id) VALUES (DEFAULT, 3, 3);

INSERT INTO public.order_line (id, quantity, product_id, order_id) VALUES (DEFAULT, 10, 1, 1);
INSERT INTO public.order_line (id, quantity, product_id, order_id) VALUES (DEFAULT, 10, 2, 2);
INSERT INTO public.order_line (id, quantity, product_id, order_id) VALUES (DEFAULT, 10, 3, 3);
