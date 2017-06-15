Alter table project_development_db.projects add cost int;

UPDATE project_development_db.projects 
SET 
    cost = 5000
WHERE
    id_project = 1;

UPDATE project_development_db.projects 
SET 
    cost = 100000
WHERE
    id_project = 2;

UPDATE project_development_db.projects 
SET 
    cost = 1000000
WHERE
    id_project = 3;

UPDATE project_development_db.projects 
SET 
    cost = 200000
WHERE
    id_project = 4;

UPDATE project_development_db.projects 
SET 
    cost = 4000
WHERE
    id_project = 5;

SELECT 
    *
FROM
    project_development_db.projects;