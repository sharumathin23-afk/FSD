use org123;
select department, sum(salary) as total_salary from Worker group by department order by total_salary desc;
select department, avg(salary) as avg_salary from worker group by department order by avg_salary asc;
select department, count(*) as total_workers from worker group by department order by total_workers desc;
select department, min(salary) as min_salary from worker group by department order by min_salary asc;