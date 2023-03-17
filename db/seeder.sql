USE adlister_db;

# TRUNCATE users;

insert into users (id, username, email, password) VALUE (1, 'robert', 'robert.arroyos02@gmail.com', 'password');

TRUNCATE ads;

insert into ads (user_id, title, description) VALUES (1,'playstation for sale','This is a slightly used playstation');
insert into ads (user_id, title, description) VALUES (1,'playstation for sale','This is a slightly used playstation');
insert into ads (user_id, title, description) VALUES (1,'Super Nintendo','Get your game on with this old-school classic!');
insert into ads (user_id, title, description) VALUES (1,'Junior Java Developer Position','Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript');
insert into ads (user_id, title, description) VALUES (1,'JavaScript Developer needed','Must have strong Java skills');

