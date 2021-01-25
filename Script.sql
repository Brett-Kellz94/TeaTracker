create table user_account (
userId int not null,
first_name varchar(30),
last_name varchar(30),
username varchar(30),
passphrase varchar(100),
auth_level int,
address varchar(100),
constraint PK_user primary key (userId)
);

create table orders (
orderId int not null,
userId int not null,
itemId int not null,
quantity int not null,
total_cost numeric (5,2) not null,
constraint PK_orderId primary key (orderId)
);

create table inventory (
itemId int not null,
item_name varchar(20) not null,
quantity int not null,
teaType varchar(10)
);



user


