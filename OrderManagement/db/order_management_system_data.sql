INSERT INTO public.customer (id, registration_code, full_name, email, telephone) VALUES (DEFAULT, '11111', 'Joe Willow', 'joe@willow.ee', '+372 58488493');
INSERT INTO public.customer (id, registration_code, full_name, email, telephone) VALUES (DEFAULT, '22222', 'Tim Cold', 'tim@cold.ee', '+372 57676785');
INSERT INTO public.customer (id, registration_code, full_name, email, telephone) VALUES (DEFAULT, '33333', 'Rogan Sea', 'rogan@sea.ee', '+372 53434253');

INSERT INTO public.product (id, name, sku_code, unit_price) VALUES (DEFAULT, 'Wood', '44444', '40');
INSERT INTO public.product (id, name, sku_code, unit_price) VALUES (DEFAULT, 'Metal', '55555', '50');
INSERT INTO public.product (id, name, sku_code, unit_price) VALUES (DEFAULT, 'Steel', '66666', '60');

INSERT INTO public.order_line (id, quantity, product_id) VALUES (DEFAULT, 10, 1);
INSERT INTO public.order_line (id, quantity, product_id) VALUES (DEFAULT, 10, 2);
INSERT INTO public.order_line (id, quantity, product_id) VALUES (DEFAULT, 10, 3);

INSERT INTO public."order" (id, date_of_submission, order_line_id, customer_id) VALUES (DEFAULT, '2022-05-25', 1, 1);
INSERT INTO public."order" (id, date_of_submission, order_line_id, customer_id) VALUES (DEFAULT, '2022-06-25', 2, 2);
INSERT INTO public."order" (id, date_of_submission, order_line_id, customer_id) VALUES (DEFAULT, '2022-07-25', 3, 3);