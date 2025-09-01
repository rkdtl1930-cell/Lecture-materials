select * from emp;

select
     empno
    ,ename  
    ,deptno 
from emp;

select
    distinct job, deptno
from emp;

select
      ename
     ,sal
     ,sal*12+comm as abc
     ,sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+comm as def
     ,comm
from emp;

select
    * 
from emp
order by deptno asc, sal desc
;

select
    distinct job
from emp;

select
      empno as employee_no
     ,ename as employee_name
     ,mgr as manager
     ,sal as salary
     ,comm as commission
     ,deptno as department_no
from emp
order by deptno desc, ename asc
;

-- 2025.07.15