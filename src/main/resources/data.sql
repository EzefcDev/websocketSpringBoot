--create the users table--
create table users( user_id int not null auto_increment, user_name varchar(255) not null,
 user_lastname varchar(255) not null, user_dni varchar(255) not null, PRIMARY KEY(user_id));

--create the message table--
create table message( message_id int not null auto_increment, user_dni varchar(255) not null,
 target_user varchar(255) not null, message_text varchar(255) not null, viewed BIT, PRIMARY KEY(message_id));

 insert into users ( user_name, user_lastname, user_dni)
 values('Ezequiel', 'Ramirez', '20437037'),
       ('Marcos', 'Pereyra', '22408890'),
       ('Patricio', 'Velzaques', '33555666');

 insert into message ( user_dni, target_user, message_text, viewed)
  values('20437037', '22408890', 'hola', false),
        ('33555666', '20437037', 'que haces', false),
        ('33227034', '22408890', 'estoy en la luna', false),
        ('22408890', '20437037', 'wacho loco', false),
        ('33555666', '22408890', 'mira vos', false),
        ('33555666', '20437037', 'va como pinia', false);