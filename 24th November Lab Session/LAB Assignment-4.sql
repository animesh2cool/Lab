show databases;
create database if not exists Anudip_Assignment;
use Anudip_Assignment;
create table if not exists Customer4 ( Cust_id varchar(5) primary key,
                        Fname varchar (15) not null, 
                        Lname varchar(15), 
                        Area varchar(2) not null, 
                        phone numeric(10) unique );
                        
insert into Customer4 values ('A01','Ivan','Ross','SA',6125467);
insert into Customer4 values ('A02','Vandana','Ray','MU',5560379);
insert into Customer4 values ('A03','Pramada','Jauguste','DA',4560389);
insert into Customer4 values ('A04','Basu','Navindi','BA',6125401);
insert into Customer4 values ('A05','Ravi','Shridhar','NA',null);
insert into Customer4 values ('A06','Rukmini','Aiyer','GH',5125274);
                        
create table if not exists Movie ( Mv_no int primary key,
					 Cust_id varchar (5) ,
                     constraint frk_key
                     Foreign Key (Cust_id) references Customer4(Cust_id), 
					 Title varchar(20) not null, 
					 Star varchar(2) not null, 
					 Price numeric(3) );
insert into Movie values ('1','A02','Bloody','JC',181);
insert into Movie values ('2','A04','The Firm','TC',200);
insert into Movie values ('3','A01','Pretty Woman','RG',151);
insert into Movie values ('4','A06','Home Alone','MC',150);
insert into Movie values ('5','A05','The Fugitive','MF',200);
insert into Movie values ('6','A03','Coma','MD',100);
insert into Movie values ('7','A02','Dracula','GO',150);
insert into Movie values ('8','A06','Quick Change','BM',100);
insert into Movie values ('9','A03','Gone with the Wind','CB',200);
insert into Movie values ('10','A05','Carry on Doctor','LP',100);


#Prove that entity integrity constraint is ensured by both the tables. (2 conditions to be checked).
insert into Movie values ('11','A07','Joker','LT',150);   # this entity will not allow because Referential Integrity Constraints is not satisfy
insert into Customer4 values (null,'Rakesh','Aiyer','PH',9025274);  # this entity will not allow because Entity integrity constraints is not satisfy

#Prove that referential integrity constraint is ensured by both the tables.
insert into Movie values ('11','A01','Harry Potter','LO',200);  # here cust_id 'A01' present in the Customer4 table

#Prove that domain integrity constraint is ensured by the Movie table.
insert into Movie values ('12','A03','Gone Girl','DB',BB);   # this entity will not allow because data type of domain includes integer but we input a string

#Display the movie titles, whose price is greater than 100 but less than 200.
select Title from movie where Price between 100 and 200;

#Display the cust_id who have seen movies having stars as either JC or TC or MC.
select Cust_id from movie where Star = 'JC' or Star = 'TC' or Star = 'MC';

#Display the details of those customers who have an A in their area name.
select Cust_id , Fname , Lname , Phone from Customer4 where Area like '%A%';

#Display the movie titles, whose price is within 180 and the movie titles are of exactly 6 characters.
select Title from movie where Price < 180 and length(Title) = 6;

#Display the movie name, their original prices and the prices after 10% increment. Give alias name to the incremented price column.
select Title , Price as 'Original Price' , Price*1.10 as 'Incremented Price' from movie;

#Display all the customer details in the following way: ‘Ivan Ross stays in SA and his phone number is 6125467.’
select concat(Fname , ' ', Lname , ' stays in ' , Area, ' and his phone number is ' , Phone) from customer4 where phone is not null;

#Add a not null constraint to the Lname field in Customer.
#ALTER TABLE products MODIFY stocks INT NOT NULL;
alter table Customer4 modify Lname varchar(15) not null ;

#Display the customer’s name whose phone number is not recorded.
select Fname , Lname from customer4 where Phone is null;

#Add the phone number according to your own wish for the person mentioned in problem no 12
update customer4 set Phone = 5560777 where Phone is null;

#Display the unique customer ids from movie table.
select distinct Cust_id from movie;

#Remove the not null constraint from Star column in movie table.
alter table movie modify Star varchar(15) null ;

#Delete any row from the Customer table. If you cannot delete, then note the error message displayed.
delete from customer4 where Cust_id = 'A01';  ## Error Code: 1451. Cannot delete or update a parent row: a foreign key constraint fails (`anudip_assignment`.`movie`, CONSTRAINT `frk_key` FOREIGN KEY (`Cust_id`) REFERENCES `customer4` (`Cust_id`))

#Delete any row from the Movie table. If you cannot delete, then note the error message displayed.
delete from movie where Cust_id = 'A04';

#Drop the Customer table. If you cannot drop, then note the error message displayed.
drop table customer4;   ## Error Code: 3730. Cannot drop table 'customer4' referenced by a foreign key constraint 'frk_key' on table 'movie'.

#Drop the Movie table. If you cannot drop, then note the error message displayed.
drop table movie;

#Drop the foreign key from Movie table.
ALTER TABLE movie DROP CONSTRAINT frk_key;

