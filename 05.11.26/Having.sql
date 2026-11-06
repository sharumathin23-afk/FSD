use org123;
select * from Worker;
select count(*) from Worker;
select Department, count(*) as total_workers, max(salary) as max_salary, min(salary) as min_salary from Worker group by Department having count(*) > 0;
select Department, sum(salary) as total_salary, avg(salary) from Worker group by department having sum(salary) > 0;
select department, count(*) as total_workers, avg(salary) as avg_salary from Worker group by department having avg(salary) > 0 order by avg_salary desc;
select department, max(salary) as highest_salary, min(salary) as lowest_salary from Worker group by department having max(salary) > 0 order by highest_salary desc;

