/* ..:: Ejecutar con un usuario ada_user recien creado ::.. */

CREATE TABLE ada_user.tbl_booking (	
    cod_booking NUMBER NOT NULL, 
	name VARCHAR2(100 BYTE), 
	email VARCHAR2(100 BYTE), 
	origin VARCHAR2(50 BYTE), 
	destination VARCHAR2(50 BYTE), 
	dep_date_time DATE, 
	duration NUMBER, 
	PRIMARY KEY (cod_booking)
);

CREATE SEQUENCE ada_user.sq_tbl_booking MINVALUE 1 START WITH 1 INCREMENT BY 1 CACHE 10;