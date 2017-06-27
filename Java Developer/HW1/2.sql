SELECT 
    name_project, MAX(TotalSalary)
FROM
    (SELECT 
        name_project, SUM(salary) TotalSalary
    FROM
        project_development_db.projects
    JOIN project_development_db.developers_have_projects ON project_development_db.projects.id_project = project_development_db.developers_have_projects.id_project
    JOIN project_development_db.developers ON project_development_db.developers.id_developer = project_development_db.developers_have_projects.id_developer
    GROUP BY name_project) t1

