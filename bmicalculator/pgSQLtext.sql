CREATE table users (
	id BIGSERIAL PRIMARY KEY,
	first_name VARCHAR(20) not null,
	last_name VARCHAR(20) not null,
	age int not null
)

CREATE TABLE bmirecords (
    id BIGSERIAL PRIMARY KEY,
    userId INT not null,
    bmi NUMERIC(4,2) not null,
    CONSTRAINT fk_user FOREIGN KEY (userId) REFERENCES users(id)
);
