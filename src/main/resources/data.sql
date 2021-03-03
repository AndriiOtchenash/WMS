DROP TABLE IF EXISTS user;

                        CREATE TABLE user (
                          id INT AUTO_INCREMENT  PRIMARY KEY,
                          first_name VARCHAR(250) NOT NULL,
                          last_name VARCHAR(250) NOT NULL
                          );

                        INSERT INTO user (first_name, last_name) VALUES
                          ('Andrew', 'Otchenash'),
                          ('Vera', 'Otchenash'),
                          ('Sofia', 'Otcheash');

DROP TABLE IF EXISTS product;

                          CREATE TABLE product (
                            id INT AUTO_INCREMENT  PRIMARY KEY,
                            name VARCHAR(250) NOT NULL,
                            color VARCHAR(250) NOT NULL
                            );

                          INSERT INTO product (name, color) VALUES
                            ('cotton', 'white'),
                            ('wool', 'yelow'),
                            ('linen_cotton', 'linen_color');

