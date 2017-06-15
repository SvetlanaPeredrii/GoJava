SELECT 
    AVG(salary)
FROM
    project_development_db.developers
        JOIN
    project_development_db.developers_have_projects ON project_development_db.developers.id_developer = project_development_db.developers_have_projects.id_developer
        JOIN
    project_development_db.projects ON project_development_db.projects.id_project = project_development_db.developers_have_projects.id_project
WHERE
    project_development_db.projects.cost = (SELECT 
            MIN(cost)
        FROM
            project_development_db.projects)