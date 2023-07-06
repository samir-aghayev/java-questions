CREATE TABLE Student
(
    student_id           SERIAL PRIMARY KEY UNIQUE,
    student_pin          VARCHAR NOT NULL CHECK ( LENGTH(student_pin) IN (5, 7)),
    student_status       BOOL         DEFAULT (FALSE),
    student_created_date TIMESTAMP(3) DEFAULT (NOW()),
    first_name           VARCHAR(7),
    last_name            VARCHAR(7),
    student_age          INT CHECK (student_age >= 6)
);

INSERT INTO Student(student_pin, first_name, last_name, student_age)
VALUES ('fdgfg', 'Elvin', 'Urek', '28'),
       ('sedgf', 'Murad', 'Ferecza', '19'),
       ('fdgfg', 'Huseyn', 'Necefov', '19')