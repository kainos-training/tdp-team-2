DROP DATABASE IF EXISTS team2;
CREATE DATABASE team2;

USE team2;

CREATE TABLE frameworks (
ID int(11) PRIMARY KEY AUTO_INCREMENT,
Name varchar(50),
Language varchar(50)
);
DELIMITER // 
CREATE PROCEDURE addFramework (name varchar(50),
language varchar(50)
	)
BEGIN
INSERT INTO frameworks(Name, Language)
VALUES (name, language);
end //
DELIMITER ;

