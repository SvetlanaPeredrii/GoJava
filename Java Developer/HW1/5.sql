SELECT 
    name_customer, name_companie, MIN(sum_cost) AS min_sum
FROM
    (SELECT 
        name_customer, name_companie, SUM(cost) AS sum_cost
    FROM
        project_development_db.customers_have_projects_in_companies
    JOIN project_development_db.projects ON project_development_db.customers_have_projects_in_companies.id_project = project_development_db.projects.id_project
    JOIN project_development_db.companies ON project_development_db.companies.id_companie = project_development_db.customers_have_projects_in_companies.id_companie
    JOIN project_development_db.customers ON project_development_db.customers.id_customer = project_development_db.customers_have_projects_in_companies.id_customer
    GROUP BY name_companie , name_customer) AS t1
GROUP BY name_companie