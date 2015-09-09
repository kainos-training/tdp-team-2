insert into CATEGORY (CategoryID, CategoryName) values (1, 'Leadership and Management'); 
insert into CATEGORY (CategoryID, CategoryName) values (2, 'Technical'); 
insert into CATEGORY (CategoryID, CategoryName) values (3, 'Project Execution'); 
insert into BOOK (Title, Author, YearPublished) values ('Web Design with HTML, CSS, JavaScript and jQuery', 'Jon Duckett', 2014);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 1);
insert into BOOK (Title, Author, YearPublished) values ('Windows 10 for Dummies', 'Andy Rathbone', 2015);
insert into BOOK (Title, Author, YearPublished) values ('Web Design with HTML, CSS, JavaScript and jQuery', 'Jon Duckett', 2014);
