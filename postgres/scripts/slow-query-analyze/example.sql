CREATE TABLE employees (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(50),
    salary INTEGER
);

INSERT INTO employees (name, department, salary)
SELECT
    'Employee ' || generate_series,
    (ARRAY['Sales', 'Engineering', 'HR', 'Marketing'])[ceil(random() * 4)],
    (round(random() * 1000000) + 50000)::INTEGER
FROM generate_series(1, 100000);

SELECT department, AVG(salary) AS average_salary
FROM employees
GROUP BY department;