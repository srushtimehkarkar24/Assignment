-- Q10. Company Audit – Database Verification Task
-- Scenario
-- An auditor wants to verify database structure.

Create database audit_db;

use audit_db;
CREATE TABLE SystemUser (
    user_id INT PRIMARY KEY,
    username VARCHAR(50),
    email VARCHAR(100)
);

INSERT INTO SystemUser 
VALUES (1, 'admin', 'admin@company.com');

INSERT INTO SystemUser 
VALUES (2, 'auditor', 'auditor@company.com');

SHOW DATABASES;

SHOW TABLES;

DESC SystemUser;




