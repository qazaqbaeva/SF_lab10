delete from books;

select * from users;

select * from books;

insert into books(id, author, category, title, year, owner_id)
values
(3, 'rupi kaur', 'poetry', 'milk and honey', 2010, 16),
(4, 'P.L. Travers', 'a classic', 'Mary Poppins Opens the Door', 2011, 16),
(5, 'Melville Herman', 'a classic', 'Moby Dick', 2010, 17),
(6, 'David Yoon', 'Young Adult', 'Frankly in Love', 1990, 17),
(7, 'Marie Lu', 'Young Adult', 'Warcross', 2004, 18),
(8, 'Mary Szybist', 'poetry', 'Incarnadine: Poems', 2005, 18);




SELECT * FROM users
ORDER BY id;

SELECT * FROM roles;
SELECT * FROM users_roles;

INSERT INTO roles(id, name)
VALUES (1, 'USER'), (2, 'ADMIN'), (3, 'SUPER_ADMIN');

INSERT INTO users_roles(user_id, roles_id)
VALUES (14, 1), (16, 2), (17,2), (17, 3);