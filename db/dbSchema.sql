DROP DATABASE IF EXISTS team2;
CREATE DATABASE team2;

USE team2;

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
  CONSTRAINT `fk_Framework_User_1` FOREIGN KEY (`userid`) REFERENCES `User` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);
