GRANT USAGE ON *.* TO 'libraryuser'@'localhost';
DROP USER 'libraryuser'@'localhost';
CREATE USER 'libraryuser'@'localhost' IDENTIFIED BY 'librarypassword';
GRANT SELECT ON LibraryDB.* TO 'libraryuser'@'localhost';
GRANT INSERT ON LibraryDB.* TO 'libraryuser'@'localhost';
