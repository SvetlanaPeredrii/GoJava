SELECT 
    name_project
FROM
    project_development_db.projects
WHERE
    id_project IN (SELECT 
            id_project
        FROM
            project_development_db.developers_have_projects
        WHERE
            id_developer = (SELECT 
                    id_developer
                FROM
                    (SELECT 
                        id_developer, MAX(salary)
                    FROM
                        project_development_db.developers) AS t1))

