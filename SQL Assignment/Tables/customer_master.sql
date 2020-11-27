create table customer_master(customer_number int(5), firstname varchar(10), lastname varchar(10), city varchar(10));
Query OK, 0 rows affected, 1 warning (0.87 sec)

mysql> INSERT INTO customer_master VALUES(1,'ushakiran','surapaneni', 'vizag');
Query OK, 1 row affected (0.20 sec)

mysql> INSERT INTO customer_master VALUES(2,'venu','venkata', 'chennai');
Query OK, 1 row affected (0.20 sec)

mysql> INSERT INTO customer_master VALUES(3,'rama','krishna', 'delhi');
Query OK, 1 row affected (0.11 sec)

mysql> INSERT INTO customer_master VALUES(4,'mishad','sheik', 'chennai');
Query OK, 1 row affected (0.28 sec)

mysql> INSERT INTO customer_master VALUES(5,'vamsi','anupoju', 'mumbai');
Query OK, 1 row affected (0.06 sec)

mysql> INSERT INTO customer_master VALUES(6,'sai','kumar', 'banglore');
Query OK, 1 row affected (0.20 sec)

mysql> INSERT INTO customer_master VALUES(7,'gowtham','sai', 'chennai');
Query OK, 1 row affected (0.12 sec)

mysql> INSERT INTO customer_master VALUES(8,'pavan','kumar', 'mumbai');
Query OK, 1 row affected (0.15 sec)

mysql> INSERT INTO customer_master VALUES(9,'mukesh','mike', 'chennai');
Query OK, 1 row affected (0.14 sec)

mysql> INSERT INTO customer_master VALUES(10,'bhose','raj', 'kolkata');
Query OK, 1 row affected (0.12 sec)

mysql> INSERT INTO customer_master VALUES(11,'diwakar','gunnu', 'mumbai');
Query OK, 1 row affected (0.18 sec)

mysql> SELECT * FROM customer_master;