Alter table project_development_db.developers add salary int;

UPDATE project_development_db.developers 
SET 
    salary = 500
WHERE
    id_developer = 1;

UPDATE project_development_db.developers 
SET 
    salary = 1000
WHERE
    id_developer = 2;

UPDATE project_development_db.developers 
SET 
    salary = 300
WHERE
    id_developer = 3;

UPDATE project_development_db.developers 
SET 
    salary = 2000
WHERE
    id_developer = 4;

UPDATE project_development_db.developers 
SET 
    salary = 900
WHERE
    id_developer = 5;


SELECT 
    *
FROM
    project_development_db.developers;