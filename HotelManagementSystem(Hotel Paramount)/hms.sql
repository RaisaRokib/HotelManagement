CREATE DATABASE hms

CREATE TABLE registration (
  username varchar(100) NOT NULL Primary key,
  password varchar(50) NOT NULL,
  NameOfUser varchar(250) NOT NULL,
  ContactNo varchar(15) NOT NULL,
  Email varchar(250) NOT NULL
)

select *from registration

      
CREATE TABLE users(
	userid int IDENTITY(1,1) PRIMARY KEY,
	UserName varchar(100) Foreign key references registration(username),
	user_Password varchar(100) NOT NULL
)

select *from users


-->same goes for changing pass(update users an registration)
-->
create table employee(
name varchar(30),
age int CHECK(age>18),
gender varchar(30),
job varchar(30),
salary varchar(30),
phone varchar(30),
NID varchar(30) not null primary key,
email varchar(40)
)

select *from employee
                     
create table room(
room_number varchar(20) not null primary key,
availability varchar(20),
clean_status varchar(20),
price varchar(20),
bed_type varchar(30)
)
select *from room

create table driver(
name varchar(30) not null primary key,
age int CHECK(age>18),
gender varchar(20),
company varchar(30),
brand varchar(30),
available varchar(10),
location varchar(50)
)

select *from driver

create table department( 
	department varchar(30) not null primary key,
	budget float
)

select *from department

create table customer( 

id varchar(30) ,
number varchar(30) not null primary key,
name varchar(30),
gender varchar(30),
country varchar(30),
room_number varchar(20) NOT NULL FOREIGN KEY REFERENCES room(room_number),
status varchar(30),
deposit varchar(30)
)
select count(number) as 'number of guests' from customer
select *from customer


--> adddrivers.java
	INSERT INTO driver values( 'khan', '27', 'Male','axio', 'afa', 'Yes','gulshan')
	INSERT INTO driver values( 'rakibba', '25', 'Male','axio', 'corolla', 'Yes','jatrabari')
	INSERT INTO driver values( 'jollibba', '27', 'Male','axio', 'afa', 'Yes','banani')
    
	SELECT * FROM driver WHERE name LIKE '%raki%'

--> addemployee.java
	INSERT INTO employee values( 'aroni', '28', 'female','Housekeeping', '19000', '01359858585','788', 'asdads@gmail.com')

--> addroom.java
	INSERT INTO room values( '112', 'Available', 'Cleaned','7000', 'Double Bed')
	INSERT INTO room values( '107', 'Available', 'Cleaned','3000', 'Single Bed')

--> changepassword.java
	select Username,User_Password from users where Username='jibon' and User_Password= '465'
	update Registration set password='456',nameofuser='jibon mia',Email='kobir@gmail.com',ContactNo='019234422243' where Username='jibon'
	update Users set user_password='456' where username='jibon'
 
--> customerinfo.java
	select * from customer

--> department.java
	insert into department values('Management',10000.55)
	insert into department values('service',25000.55)
	select * from department

--> employee.java
	select * from employee

--> login.java
	INSERT INTO users (username, user_Password) VALUES('ayad', '205')
	INSERT INTO users (username, user_Password) VALUES('raisa', '123')
	INSERT INTO users (username, user_Password) VALUES('zuthi', '135')

	select * from users where Username='jibon' and User_Password= '465'

--> logindetails.java
	select UserName as 'User Name',User_Password as 'Password' from users order by username

--> managerinfo.java
	select * from Employee where job = 'Manager'

--> newcustomer.java
	select * from room where availability='Available'

--> pickup.java
	select * from driver
	select * from driver where brand = 'afa' order by age

--> room.java
	select * from room

--> searchroom.java
	select * from room where bed_type = 'single bed'
	select * from room where availability = 'Available' AND bed_type = 'single bed'                      

--> updatecheck.java
	select * from customer where number = '10003'
	select * from room where room_number = '102'

--> updateroom.java
	update room set clean_status = 'Cleaned' where room_number = '102'
	update room set availability = 'Available' where room_number = '101'
	update room set clean_status= 'Cleaned' where room_number= '101'

--> userregistration.java
	INSERT INTO registration (username, password, NameOfUser, ContactNo, Email) VALUES 
	('ayad', '205', 'ayad arefin', '01353535658', 'ayad@gmail.com')
	INSERT INTO registration (username, password, NameOfUser, ContactNo, Email) VALUES
	('zuthi', '135', 'Jarin Anjum Zuthi', '01926857669', 'zuthi135@gmail.com')
	INSERT INTO registration (username, password, NameOfUser, ContactNo, Email) VALUES
	('raisa', '123', 'Raisa Rokib', '01344857669', 'coolzibon@gmail.com')
	
	delete from registration where Username = 'ayad'
	delete from users where Username = 'ayad'

	update registration set password='206',nameofuser='ayad arefin',Email='ayad@gmail.com',ContactNo='01353535658' where Username='ayad'
	update users set user_password='206' where username='ayad'

--> userregistrationrecord.java
	select nameofuser as 'Name', UserName as 'User Name',Password,ContactNo as 'Contact No',Email as 'Email ID' from registration
	select * from registration where username= 'ayad'

--> checkbed.java
	SELECT c.name, c.country, r.bed_type
	FROM customer c JOIN room r
	ON c.room_number = r.room_number where r.bed_type='single bed';

--> customerquery.java

	SELECT *
	FROM customer c JOIN room r
	ON c.room_number = r.room_number where r.price=(select top 1 r.price as 'r.price' 
	from room r join customer c on c.room_number= r.room_number order by r.price desc)

	select count(number) as 'number of guests' from customer

-->checkout.java
	select * from customer where number = '10002'
	Delete from customer where number = '10002'
	update room set availability = 'Available' AND clean_status= 'Cleaned' where room_number = '10002';

--> showinfo.java

	select * from driver where gender like '%le%'

	select * from driver where name like '%ja%'

	select * from driver where age between 18 and 30 

	select * from driver where location like '%ba%'

                                












