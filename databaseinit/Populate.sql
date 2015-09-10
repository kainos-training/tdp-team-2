use LibraryDB;
insert into Category (CategoryID, CategoryName) values (2, 'Technical');
insert into Category (CategoryID, CategoryName) values (3, 'Project Execution');

insert into Category (CategoryID, CategoryName) values (1, 'Leadership and Management');
insert into Book (Title, Author, YearPublished) values ('Web Design with HTML, CSS, JavaScript and jQuery', 'Jon Duckett', 2014);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 2);
insert into Book (Title, Author, YearPublished) values ('Windows 10 for Dummies', 'Andy Rathbone', 2015);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 2);
insert into Book (Title, Author, YearPublished) values ('Rapid Development', 'Steve McConnell', 1996);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 2);
insert into Book (Title, Author, YearPublished) values ('Becoming the Bull', 'John Doe', 2015);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 2);
insert into Book (Title, Author, YearPublished) values ('Head First Design Patterns', 'Eric Freeman', 2004);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 2);

insert into Book (Title, Author, YearPublished) values ('Using Distractions to Get the Right Things Done', 'Mark J. Silverman', 2015);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 1);
insert into Book (Title, Author, YearPublished) values ('Simple Success Secrets No One Told You About', 'John Carlton', 2015);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 1);
insert into Book (Title, Author, YearPublished) values ('The Fearless Mindset', 'Peter Scott', 2015);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 1);
insert into Book (Title, Author, YearPublished) values ('Gorilla Mindset', 'Mike Cernovich', 2015);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 1);
insert into Book (Title, Author, YearPublished) values ('Content Machine', 'Dan Norris', 2015);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 1);

insert into Book (Title, Author, YearPublished) values ('Project Management for Beginners', 'Isabella Brown', 2015);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 3);
insert into Book (Title, Author, YearPublished) values ('The Phoenix Project', 'Gene Kim', 2013);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 3);
insert into Book (Title, Author, YearPublished) values ('Continuous Delivery', 'Jez Humble', 2010);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 3);
insert into Book (Title, Author, YearPublished) values ('Lean Enterprise', 'Jez Humble', 2015);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 3);
insert into Book (Title, Author, YearPublished) values ('Leading the Transformation', 'Gary Gruver', 2015);
insert into BookCategory(BookID, CategoryID) values (LAST_INSERT_ID(), 3);
