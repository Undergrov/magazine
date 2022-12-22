INSERT INTO delivery (warehouse_from, warehouse_to, cargo_amount, transporter, cargo_name, delivery_date)VALUES
        ('1', '2', 15, 'Ivan', 'Nissan', '2020-02-09'),
        ('1', '2', 15, 'Ivan', 'Nissan', '2020-02-09'),
        ('1', '2', 15, 'Ivan', 'Nissan', '2020-02-09'),
        ('1', '2', 15, 'Ivan', 'Nissan', '2020-02-09');

INSERT INTO warehouse (city, location, street, title)VALUES
    ('New York', 'Ohio, USA', '7841 Thorne St.Reynoldsburg, OH 43068', 'Veralock'),
    ('Washington', 'Alabama, USA', '297 E. Princess Dr.Harvey, IL 60426', 'HoldingPoint'),
    ('Detroit', 'Texas, USA', '417 W. Lexington Rd.Elizabeth, NJ 07202', 'Storaze'),
    ('Miami', 'Arizona, USA', '9917 Talbot RoadOwensboro, KY 42301', 'BoxMaven');

INSERT INTO transporter (car_model, load_capacity, name_carrier)VALUES
    ('Toyota Auris', 20, 'John'),
    ('Honda NSX', 35, 'Jake'),
    ('Hyundai ix35', 51, 'Alan'),
    ('Mercedes Benz GLE Class', 26, 'Kyle'),
    ('Chrysler 300', 76, 'Andrew'),
    ('GMC Sierra', 17, 'Joey'),
    ('Audi A4', 73, 'Connor'),
    ('Kia Cee''d',47, 'Alex');

