create database inventory_management_system ;
use inventory_management_system;

DROP TABLE USERS
DROP TABLE CUSTOMER
DROP TABLE BILLDETAILS
DROP TABLE INVENTORY
DROP TABLE ORDERS
DROP TABLE SUPPLIER
DROP TABLE PRODUCT

create table USERS(
UserId int identity(1,1) primary key not null,
UserName varchar(100),
UserContact int,
Roles varchar(100),
Passwords varchar(100),
)

create table PRODUCT(
ProductId int identity(1,1) primary key not null,
ProductName varchar(100), 
ProductQuantity_piece int ,
ProductQuantity_kg int,
SellingPrice money
)

create table SUPPLIER(
SupplierId int identity(1,1) primary key not null,
SupplierName varchar(100),
ProductId int FOREIGN KEY REFERENCES PRODUCT(ProductId) on delete set null,
Quantity int,
BuyingPrice money,
SupplierContact varchar(50),
PaymentOfOrder varchar(100)
)

create table INVENTORY (
 InventoryId int identity (1,1) primary key not null,
 SupplierId int FOREIGN KEY REFERENCES SUPPLIER(SupplierId) on delete set null,
 InventoryName varchar(100),
 ProductId int FOREIGN KEY REFERENCES PRODUCT(ProductId) on delete set null,
 Quantity int 
)

create table CUSTOMER(
CustomerId int identity(1,1) primary key not null,
CustomerName varchar(200),
CustomerContact varchar(100),
CustomerAddress varchar (200),
PurchasedAmount int ,
)

create table BILLDETAILS(
BillId int identity(1,1) primary key not null,
CustomerId int FOREIGN KEY REFERENCES CUSTOMER(CustomerId) on delete set null,
ProductId int FOREIGN KEY REFERENCES PRODUCT(ProductId) on delete set null,
Quantity int,
Amount int,
OrderDate date
)

create table ORDERS(
OrderId int identity(1,1) primary key not null,
ProductId int FOREIGN KEY REFERENCES PRODUCT(ProductId) on delete set null,
Quantity int,
OrderDate date,
)


select * from USERS
select * from INVENTORY
select * from PRODUCT
select * from SUPPLIER
select * from CUSTOMER
select * from ORDERS
select*from BILLDETAILS




INSERT INTO USERS(UserName,Roles,  UserContact, Passwords) 
VALUES ( 'Ms.Sadia','manager',01928374,'1234567'),
       ('Ms.Tisha','manager',0149364,'1234098'),
       ('Ms.Badhon','manager',02642944,'1234647')
	   

INSERT INTO PRODUCT(ProductName,ProductQuantity_piece,ProductQuantity_kg,SellingPrice) 
VALUES ('Beaf',0,200,550.00),
('Mutton',0,250,600.00),
('Chicken',0,200,300.00),
('Nestle NIDO-1+ Growing Up Milk Powder',300,0,350.00),
('Lactogen-3 (BIB)',200,0,480.00),
('Cerelac Wheat Mixed Fruit',150,0,375.00),
('Johnsons Baby Shampoo 100 Ml (Imported)',100,0,160.00),
('Meril Baby Shampoo 110 Ml',150,0,100.00),
('Pampers Pants Diaper (7-12kg)',150,0,1499.00),
('Smart Heart Adult Sea F. Cat Food 480g',50,0,285.00),
('Snickers Single',300,0,55.00),
('Snickers Single',300,0,15.00),
('Pran Mango Bar',150,0,7.00),
('Nestle Kit Kat Chocolate',150,0,30.00),
('Cadbury Dairy Milk Chocolate',200,0,13.00),
('M&M Choco Chocolate',200,0,80.00),
('Apple (Gala)',0,400,200.00),
('Papaya (Paka Pepe)',0,400,165.00),
('Sweet Orange South Africa',0,200,350.00),
('Banana (Chini Chompa)',400,0,5),
('Diamond Alu (Potato) Premium Loose',0,200,18.00),
('Aloe Vera',0,50,65.00),
('Long Bean (Borboti)',100,0,70.00),
('Eggplant/Begun (Round) (Per Kg)',0,100,98.00),
('Wax Gourd (Chalkumra)',50,0,40.00),
('Capsicum (Red)',40,0,570.00),
('Lady Finger (Dherosh)',0,50,50.00),
('Ridge Gourd (Jhinga)',0,20,60.00),
('Banana Green',0,20,10.0),
('Green Papaya (Kacha Pepe)',0,50,24.00),
('Lemon',0,100,10.00),
('Mishti Kumra',0,100,40.00),
('Multi Grain Bread 400 gm',100,0,100.00),
('Pran Dhaka Cheese 225 gm',100,0,150.00),
('Milk Vita Butter 200 gm',50,0,172.00),
('Pran Premium Ghee',50,0,420.00),
('Golden Harvest Dal Puri (10 Pcs)',100,0,100.00),
('Golden Harvest Mini Singara (40 Pcs)',50,0,180.00),
('Kazi Farms Kitchen Kids Chicken Nuggets 250 gm',150,0,165.00),
('CP Chicken Nuggets',30,0,280.00),
('Golden Harvest French Fries 1 kg',100,0,230.00),
('Horlicks (Jar) 900 gm',100,0,695.00),
('Maltova Yummy C.Caramel Drink - Maltova (MALT DRINK POWDER CARAMEL) 400 gm',100,0,345.00),
('Tang Mango Jar 750 gm',100,0,615.00),
('Coke (Coca Cola) 325 ml',100,0,135.00)



INSERT INTO SUPPLIER(SupplierName,ProductId,Quantity,BuyingPrice,SupplierContact,PaymentOfOrder) 
VALUES ('Mr.Arafat',1,200,520.00,01598768912,100400.00),
('Mr.Tashreef',2,250.00,600.00,01596836975,150000.00),
('Mr.Rishad',4,300,350.00,01698756923,105000.00),
('MR.Shafayet',5,300,480.00,01598763251,144000.00),
('Ms.Nilu',3,200,290.00,01897569231,58000.00),
('Mr.Sameer',7,100,150.00,01258963876,15000.00),
('Mr.Sabbir',6,200,350.00,01598764893,70000.00),
('Mr.Moin',9,150,1400.00,01897225693,210000.00),
('Mr.Tasin',10,50,200.00,0148612236,10000.00),
('Mr.Jamy',13,100,5.00,0159768326,500.00),
('Mr.Sami',14,100,25.00,01897569325,250.00),
('Mr.Jim',22,300,60.00,01589634896,18000.00),
('Mr.Topu',32,200,20.00,0789566333,4000.00),
('Mr.Muhu',34,100,140.00,01598769325,14000.00),
('Mr.Prity',40,100,250.00,0159876259,25000.00),
('Mr.Rejwan',43,50,330.00,01598769325,16500.00)


INSERT INTO INVENTORY(SupplierID,InventoryName,ProductId,Quantity) 
VALUES (1,'meat',1,200),
       (2,'meat',2,250),
       (3,'baby food',4,300),
       (4,'babyfood',5,200),
		(9,'Catfood',10,300),
		 (10,'Chocolate',13,300),
		 (11,'Chocolate',14,200),
		(12,'Vegetables',22,100),
		 (13,'Vegetables',32,100),
		 (14,'Dairy',34,50),
		 (15,'Snacks',40,100),
		 (16,'Snacks',43,100)

INSERT INTO CUSTOMER(CustomerName, CustomerContact,CustomerAddress,PurchasedAmount)
VALUES('Mr. Amit','01598623693','14\2 mohammodpur',2000.00),
('Mr. Atik','01269876936','Khilagon 15/A',5632.00),
('Mr. Tuhin','01258796358','45/3 road 2 ,Banani',1422.00),
('Mr. Rajib','01589653256','Road A ,Block 2,Dhanmondi',2399.00),
('Mrs. Preeti','01598693698','W/C 1422 Motijheel',2496.00),
('Mr. Toki','01789654896','14/8 Uttora',9865.00),
('Mr. Tara','01589632589','25/2 building 3 Mugda',12569.00),
('Mr. Sami','01574125874','33 road A, Kamlapur',250.00),
('Ms. July','01258963258','55/7 Dhanmondi',2698.00),
('Mr. August','01257466696','1/4 lalbag',2477.00),
('Mr. Robi','01896325659','A block Badda',4533.00),
('Mr. Rafi','01478521478','Shahabag',1472.00),
('Mrs. Farah','01369852369','1419/2 Tejgao',12563.00),
('Ms. Orin','02148896325','15/2 najirabajar',1122.00)


INSERT INTO ORDERS(ProductId,Quantity,OrderDate)
VALUES(1,200,'2019-02-03'),
(2,150,'2019-03-05'),
(3,200,'2018-06-08'),
(4,50,'2019-07-15'),
(5,50,'2019-02-11'),
(6,150,'2019-03-12'),
(8,200,'2019-05-29'),
(9,300,'2019-01-01'),
(11,150,'2019-06-22'),
(12,100,'2019-07-12'),
(13,140,'2019-03-22'),
(21,120,'2019-04-16'),
(22,200,'2019-09-23'),
(23,150,'2019-12-22'),
(26,50,'2019-01-22'),
(27,60,'2019-02-12'),
(28,50,'2019-09-19')

INSERT INTO BILLDETAILS(CustomerId,ProductId,Quantity,Amount,OrderDate)
VALUES(1,2,2,1200.00,'2019-05-06'),
(2,3,1,300.00,'2019-12-23'),
(3,6,3,1125.00,'2019-08-03'),
(4,7,2,320.00,'2019-05-03'),
(5,10,1,285.00,'2019-08-14'),
(6,11,4,220.00,'2019-05-12'),
(7,1,4,350.00,'2019-02-14'),
(8,9,2,2998.00,'2019-04-02'),
(9,3,3,900.00,'2019-03-26'),
(10,40,2,560.00,'2019-08-19'),
(11,25,1,40.00,'2019-06-22'),
(12,32,3,120.00,'2019-07-24'),
(13,14,4,120.00,'2019-04-22'),
(14,29,5,50.00,'2019-04-19')
