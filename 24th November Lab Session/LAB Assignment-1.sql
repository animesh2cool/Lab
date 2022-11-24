show databases;
create database if not exists Anudip_Assignment;
use Anudip_Assignment;
create table customer (Cust_id varchar(5) not null,
                        Fname varchar (15) not null, 
                        Lname varchar(15) not null, 
                        Area varchar(2) not null, 
                        phone numeric(10) unique,
                        DOB date,
                        Payment numeric(6,2));
insert into customer values ('A01','Ivan','Ross','SA',6125467,'1986-01-15',800.50);
insert into customer values ('A02','Vandana','Ray','MU',5560379,'1987-12-20',1000.75);
insert into customer values ('A03','Pramada','Jauguste','DA',4560389,'1967-07-25',500.00);
insert into customer values ('A04','Basu','Navindi','BA',6125401,'1956-02-27',860.00);
insert into customer values ('A05','Ravi','Shridhar','NA',null,'1989-02-15',500.50);
insert into customer values ('A06','Rukmini','Aiyer','GH',5125274,'1987-07-23',1500.50);

#Display the structure of the table you have created.
desc customer;

# Display the data of the created table.
select * from customer;

# Insert a row which will accept system date
# Display the data in the table.
insert into customer values ('A10','Animesh','Manna','IN',7003440120,curdate(),900.50);
select * from customer;

# Update the phone numbers of customer A02 and A04.
update customer set phone = 5560777 where Cust_id = 'A02';
update customer set phone = 6125555 where Cust_id = 'A04';

# Update the date of birth of customer A03 and A05.
# Display the updated table
update customer set DOB = '1977-05-11' where Cust_id = 'A03';
update customer set DOB = '1999-08-07' where Cust_id = 'A05';
select * from customer;

# Delete 2 rows from the table for customers A01 and A05.
delete from customer where Cust_id = 'A01';
delete from customer where Cust_id = 'A05';

# Delete all the rows from the table.
delete from customer;

# Insert 5 records according to your own wish.
insert into customer values ('A01','Animesh','Manna','WB',7125467,'1992-01-16',1000.50);
insert into customer values ('A02','Rupam','Roy','MH',7060379,'1996-12-20',700.75);
insert into customer values ('A03','Rishi','Mondal','OH',9560389,'1998-07-25',600.00);
insert into customer values ('A04','Avik','Saha','AS',null,'1995-02-27',870.00);
insert into customer values ('A05','Ravi','Dhar','BH',76125401,'1999-02-15',1000.50);

# Update one record based on any criteria according to your own wish.
update customer set Payment = 50.77 where Cust_id = 'A05';

# Delete any 1 record from the table based on particular criteria.
delete from customer where Fname = 'Rishi';
