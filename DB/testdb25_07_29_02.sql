--실습 13-10
create index idx_emp_sal
on emp(sal);

--실습 13-12
drop index idx_emp_sal;

--실습 13-14 system 계정으로 함
--grant create view to scott;

--실습 13-15
create view vw_emp20
as(select empno, ename, job, deptno from emp where deptno = 20 );

--실습 13-17
select * from vw_emp20;

--실습 13-18
drop view vw_emp20;

--실습 13-20
select rownum, e.*
from emp e
order by sal desc;

--실습 13-22~25
select rownum, e.*
from(select * from emp order by sal desc) e;

with e as (select * from emp order by sal desc)
select rownum, e.* from e;

select rownum, e.*
from(select * from emp order by sal desc) e
where rownum <= 3;

with e as (select * from emp order by sal desc)
select rownum, e.* from e
where rownum <= 3;

select rownum, e.*
from(select * from emp order by sal desc) e
fetch next 3 rows only;

