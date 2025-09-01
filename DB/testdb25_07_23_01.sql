--9장
--실습 9-1
select
    sal
from emp
where ename = 'JONES';

--실습 9-2
select *
from emp
where sal > 2975;

--실습 9-3
select *
from emp
where sal > (select
                    sal
             from emp
             where ename = 'JONES');
             
--p232. 1분복습
select * 
from emp
where comm > (select
                    comm
              from emp
              where ename = 'ALLEN');
              
--실습 9-4
select *
from emp
where hiredate < (select
                        hiredate
                  from emp
                  where ename = 'SCOTT');

--실습 9-5
select
     e.empno
    ,e.ename
    ,e.job
    ,e.sal
    ,d.deptno
    ,d.dname
    ,d.loc
from emp e, dept d
where e.deptno = d.deptno
    and e.deptno = 20
    and e.sal > (select
                        avg(sal)
                 from emp);

--실습 9-7
select *
from emp
where sal in (select
                    max(sal)
              from emp
              group by deptno);

--실습 9-16
select *
from emp
where exists (select dname
                from dept
              where deptno = 10);

--실습 9-18
select *
from emp
where (deptno, sal) in (select
                                deptno
                                ,max(sal)
                        from emp
                        group by deptno);

--실습9-19
select
    e10.empno
    ,e10.ename
    ,e10.deptno
    ,d.dname
    ,d.loc
from (select *
      from emp
      where deptno = 10) e10
     ,(select *
      from dept) d
where e10.deptno = d.deptno;

--실습 9-21
select
    empno
    ,ename
    ,job
    ,sal
    ,(select
            grade
      from salgrade
      where e.sal between losal and hisal) as salgrade
    ,deptno
    ,(select
            dname
      from dept
      where e.deptno = dept.deptno) as dname
from emp e;

--p249. 되새김 문제
--1번
select
    e.job
    ,e.empno
    ,e.ename
    ,e.sal
    ,e.deptno
    ,d.dname
from emp e, dept d
where e.deptno = d.deptno
    and job = ( select job
                from emp
                where ename = 'ALLEN');
    
--2번
select
     e.empno
    ,e.ename
    ,d.dname
    ,e.hiredate
    ,d.loc
    ,e.sal
    ,s.grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
    and e.sal between s.losal and s.hisal
    and sal > (select avg(sal)
               from emp)
order by sal desc, empno;

--3번
select
    e.empno
    ,e.ename
    ,e.job
    ,d.deptno
    ,d.dname
    ,d.loc
from (select * from emp where deptno = 10) e, dept d
where e.deptno = d.deptno
    and job not in (select job 
                    from emp 
                    where deptno = 30);
    
--4번
select
    e.empno
    ,e.ename
    ,e.sal
    ,s.grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal
    and sal > all (select sal
                   from emp
                   where job = 'SALESMAN')
order by empno;

select
    e.empno
    ,e.ename
    ,e.sal
    ,s.grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal
    and sal > (select max(sal)
               from emp
               where job = 'SALESMAN')
order by empno;