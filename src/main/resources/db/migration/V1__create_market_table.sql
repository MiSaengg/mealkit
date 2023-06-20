CREATE TABLE market (
   id BIGSERIAL PRIMARY KEY,
   admin BOOLEAN NOT NULL,
   name VARCHAR(255),
   location VARCHAR(255),
   password VARCHAR(255),
   ratingURL VARCHAR(255),
   image BYTEA,
   description TEXT
);
