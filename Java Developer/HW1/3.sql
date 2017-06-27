SELECT 
    SUM(salary)
FROM
    project_development_db.developers
        JOIN
    project_development_db.developers_have_skills ON project_development_db.developers.id_developer = project_development_db.developers_have_skills.id_developer
        JOIN
    project_development_db.skills ON project_development_db.skills.id_skill = project_development_db.developers_have_skills.id_skill
WHERE
    project_development_db.skills.programming_languages = 'Java'