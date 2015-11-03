GRANT USAGE ON *.* TO 'Team2User'@'localhost';
DROP USER 'Team2User'@'localhost';
CREATE USER 'Team2User'@'localhost' IDENTIFIED BY 'Team2Password';
GRANT SELECT ON team2.* TO 'Team2User'@'localhost';
GRANT INSERT ON team2.* TO 'Team2User'@'localhost'; 

DROP DATABASE IF EXISTS team2;
CREATE DATABASE team2;

USE team2;


DROP TABLE IF EXISTS `languages`;
CREATE TABLE languages (
ID int(11) PRIMARY KEY Auto_INCREMENT,
Name varchar(50)
);

DROP TABLE IF EXISTS `frameworks`;
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
  CONSTRAINT `fk_User_Framework_User` FOREIGN KEY (`userid`) REFERENCES `User` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Framework_User_Framework` FOREIGN KEY (`frameworkid`) REFERENCES `frameworks` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
);



