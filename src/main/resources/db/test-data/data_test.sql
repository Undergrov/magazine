INSERT INTO transporter (name, car_model, capacity) VALUES
                    ('John','Volvo', 15000),
                    ('Nick','BMW', 27000),
                    ('Joey','Nissan', 30000);


INSERT INTO warehouse (title, country, region, city, street) VALUES
                    ('Vigilant','USA', 'Ohio', 'Detroit', '21 Peachtree Ave. Marion, NC 28752'),
                    ('StorageRent','USA', 'Florida', 'New York','714 Carson Drive Everett, MA 02149'),
                    ('StorageCentre','USA', 'Washington', 'Los Angeles', '53 Marvon St. Lake Worth, FL 33460');


INSERT INTO delivery (delivery_date, cargo_name, cargo_amount, status, transporter_id, warehouse_from_id, warehouse_to_id ) VALUES
                    ('2022-04-07', 'Sugar', 5000, 'SUBMITED', 1, 3, 2),
                    ('2019-06-09', 'Flour', 7000, 'CANCELLED', 3, 1, 2),
                    ('2005-01-07', 'Salt', 1000, 'PROCESSING', 2, 2, 1);