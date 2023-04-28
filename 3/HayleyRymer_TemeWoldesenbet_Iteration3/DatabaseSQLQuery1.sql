CREATE TABLE employees (
    id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    department VARCHAR(50),
    salary INT,
    hire_date DATE
);

INSERT INTO employees (id, first_name, last_name, email, department, salary, hire_date)
VALUES
(1, 'John', 'Doe', 'johndoe@example.com', 'Sales', 50000, '2020-01-01'),
(2, 'Jane', 'Doe', 'janedoe@example.com', 'Marketing', 60000, '2019-05-01'),
(3, 'Bob', 'Smith', 'bobsmith@example.com', 'Sales', 55000, '2021-03-01'),
(4, 'Alice', 'Johnson', 'alicejohnson@example.com', 'HR', 70000, '2018-09-01'),
(5, 'Charlie', 'Brown', 'charliebrown@example.com', 'Marketing', 65000, '2017-12-01');

CREATE TABLE projects (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    start_date DATE,
    end_date DATE,
    budget INT
);

INSERT INTO projects (id, name, start_date, end_date, budget)
VALUES
(1, 'Project A', '2020-02-01', '2020-05-01', 10000),
(2, 'Project B', '2021-01-01', '2021-12-31', 50000),
(3, 'Project C', '2019-06-01', '2020-01-01', 25000),
(4, 'Project D', '2022-03-01', '2022-06-01', 15000),
(5, 'Project E', '2021-09-01', '2022-02-28', 20000);

CREATE TABLE employee_projects (
    id INT PRIMARY KEY,
    employee_id INT,
    project_id INT,
    hours_worked INT,
    FOREIGN KEY (employee_id) REFERENCES employees(id),
    FOREIGN KEY (project_id) REFERENCES projects(id)
);

INSERT INTO employee_projects (id, employee_id, project_id, hours_worked)
VALUES
(1, 1, 1, 40),
(2, 1, 2, 80),
(3, 2, 2, 60),
(4, 2, 3, 20),
(5, 3, 1, 60),
(6, 4, 4, 100),
(7, 4, 5, 80),
(8, 5, 2, 40),
(9, 5, 3, 40);
