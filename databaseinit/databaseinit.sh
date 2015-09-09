echo "Enter root's password each time"
cat user.sql | mysql -u root -p
echo "create database LibraryDB" | mysql -u root -p
cat database.sql | mysql -u root -p
