--Query for adding new book to books table
insert into books(Title, Author, Publisher, Production_date, NumberOfCopies)
VALUES ('Chess', 'Stefan Zveyq', 'Parlaq imzalar', '2020-01-01', 5);

--Query for register new reader in library

insert into reader(First_name, Last_name, Address, Phone_number, Email)
VALUES ('Samir', 'Aghayev', 'Kubinka', 994508051394, 'agayer.samir8@gmail.com');
alter table reader
    alter column phone_number type numeric(15);

--Query for giving book to reader

select *
from reader
where id = 3;
select *
from books
where Title like '%Farm%';


insert into loan(book_id, reader_id, loan_date, return_date)
VALUES (5, 3, current_date, current_date + 5);

update books
set NumberOfCopies=NumberOfCopies - 1
where id = 5;


--Query for returning a book from a reader

select *
from books;

delete
from loan
where book_id = 5;

update books
set NumberOfCopies = NumberOfCopies + 1
where id = 1;



--Query for searching books based on various criteria.
select Production_date from books where Production_date>'1839-04-28';
select NumberOfCopies from books where NumberOfCopies>200; --və s. və ilaxır.


--Query for searching currently available books.
select *
from books
where NumberOfCopies > 0;


--Query for searching popular books among readers.
select (select Title from books where id = loan.book_id), count(book_id) as num_of_books
from loan
group by book_id;

--select Title from books union select max((select count(book_id) from loan group by book_id )) from loan;


--Query for searching books read by a specific reader.
-- FOR 3nd READER
SELECT *
FROM books
WHERE id IN (select book_id from loan where reader_id = (select id from reader where First_name like '%Alisa%'));
--or
SELECT *
FROM books
WHERE id IN (select book_id from loan where reader_id = 3);


--Query for searching books written by a specific author.
SELECT Title
FROM books
WHERE id IN (select book_id from authorship where author_id = 3);

--or
SELECT Title
FROM books
WHERE id IN (select id from books where author like '%Leo%');


--Query for updating book information.
update books
set Title='Little Prince',
    Author='Antoine de Saint-Exupéry', Production_date='1943-04-01', NumberOfCopies=300
where id = 2;



--Query for deleting a book from the library.
delete
from books
where id = 1;

--Query for searching books by genre.
--yazammırıx because, əvvəldən books database-ni wrong create etmişik. HEŞ bir kitaba janr verməmişik.


--Query for calculating the total number of books borrowed by a reader.
select count(reader_id)
from loan
where reader_id = 3;
--or
select count(reader_id)
from loan
where reader_id = (select id from reader where First_name like '%Alisa%');

--Query for finding the most borrowed book in the library
-- ilə Query for searching popular books among readers eyni şey deyilmi?


--Query for updating reader information.
update reader
set First_name='Mikayıl',
    last_name='Müşfiq'
where id = 1;
select *
from reader;
