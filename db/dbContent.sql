/*SQL CONTENT GOES HERE*/
-- Insert into frameworks table

USE team2;
CALL addLanguage("Java");
CALL addLanguage("C#");
CALL addLanguage("Javascript");
CALL addLanguage("Scala");
CALL addLanguage("PHP");
CALL addLanguage("Ruby");

call addFramework("Grails",1);
call addFramework("Play", 1);
call addFramework("SpringMVC", 1);
call addFramework("Dropwizard", 1);
call addFramework("ASP.NET", 2);
call addFramework("AngularJS", 3);
call addFramework("KnockoutJS", 3);
call addFramework("Backbone.js", 3);
call addFramework("Ember.js", 3);
call addFramework("Express.js", 3);
call addFramework("Unified.js", 3);
call addFramework("Play", 4);
call addFramework("Zend Framework", 5);
call addFramework("Sinatra",6);
call addFramework("Ruby on Rails", 6);
call addFramework("Drupal", 5);



INSERT INTO `User` VALUES (1,'Peadar'),(2,'Martin'),(3,'Josh'),(4,'Tanya');

