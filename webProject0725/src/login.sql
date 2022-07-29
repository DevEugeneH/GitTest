
/* Drop Tables */

DROP TABLE login CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE login
(
	userId varchar2(20) NOT NULL,
	userPw varchar2(20) NOT NULL,
	PRIMARY KEY (userId)
);



