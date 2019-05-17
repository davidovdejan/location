USE projectdb;
CREATE TABLE IF NOT EXISTS location(
id INT PRIMARY KEY,
code VARCHAR(20),
name VARCHAR(20),
type VARCHAR(10));
SELECT * FROM location;
DROP TABLE location;