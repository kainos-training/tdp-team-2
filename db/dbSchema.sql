DROP DATABASE IF EXISTS team2;
CREATE DATABASE team2;

USE team2;


CREATE TABLE languages (
ID int(11) PRIMARY KEY Auto_INCREMENT,
Name varchar(50)
);
CREATE TABLE frameworks (
ID int(11) PRIMARY KEY AUTO_INCREMENT,
Name varchar(50),
Language int(11), FOREIGN KEY (Language) 
	REFERENCES languages(ID) 
);

DELIMITER // 
CREATE PROCEDURE addFramework (name varchar(50),
languageId int(11)
	)
BEGIN
INSERT INTO frameworks(Name, Language)
VALUES (name, languageId);
end //
DELIMITER ;

DELIMITER // 
CREATE PROCEDURE addLanguage (name varchar(50)
	)
BEGIN
INSERT INTO languages(Name)
VALUES (name);
end //
DELIMITER ;

DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `Framework_User`;
CREATE TABLE `Framework_User` (
  `userid` int(11) NOT NULL,
  `frameworkid` int(11) NOT NULL,
  PRIMARY KEY (`userid`,`frameworkid`),
  KEY `fk_Framework_User_Framework_idx` (`frameworkid`),
  CONSTRAINT `fk_Framework_User_Framework` FOREIGN KEY (`frameworkid`) REFERENCES `frameworks` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
);
