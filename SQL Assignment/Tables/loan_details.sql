mysql> CREATE TABLE loan_details(customer_number int(5), loan_approved varchar(5));
Query OK, 0 rows affected, 1 warning (1.91 sec)

mysql> INSERT INTO loan_details VALUES(1,'Yes');
Query OK, 1 row affected (0.22 sec)

mysql> INSERT INTO loan_details VALUES(4,'No');
Query OK, 1 row affected (0.15 sec)

mysql> INSERT INTO loan_details VALUES(7,'No');
Query OK, 1 row affected (0.08 sec)

mysql> INSERT INTO loan_details VALUES(10,'Yes');
Query OK, 1 row affected (0.11 sec)

mysql> SELECT * FROM loan_details;