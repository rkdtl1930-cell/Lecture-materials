-- 6장 NVL부터~
select
     EMPNO
    ,ENAME
    ,SAL
    ,COMM
    ,sal+comm
    ,nvl(comm, 0)
    ,sal+nvl(comm, 0)
from emp;

select
     EMPNO
    ,ENAME
    ,COMM
    ,nvl2(comm, 'O', 'X')
    ,nvl2(comm, sal*12+comm, sal*12)
from emp;

select
     empno
    ,ename
    ,job
    ,sal
    ,decode(job,
            'MANAGER', sal*1.1,
            'SALESMAN', sal*1.05,
            'ANALYST', sal,
            sal*1.03) as upsal
from emp;

select
     empno
    ,ename
    ,job
    ,sal
    ,case job
         when 'MANAGER' then sal*1.1
         when 'SALESMAN' then sal*1.05
         when 'ANALYST' then sal
         else sal*1.03
    end as upsal
from emp;

select
     empno
    ,ename
    ,comm
    ,case
        when comm is null then '해당 사항 없음'
        when comm = 0 then '수당없음'
        when comm > 0 then '수당 : '||comm
    end as comm_text    
from emp;

-- p179~180 되새김 문제
select
     empno
    ,RPAD(substr(empno, 1, 2), 4, '*') as masking_empno
    ,ename
    ,rpad(substr(ename, 1, 1), 5, '*') as masking_ename
from emp
where length(ename)=5;

select
     empno
    ,ename
    ,sal
    ,trunc(sal/21.5, 2) as day_pay
    ,round(sal/21.5/8, 1) as time_pay
from emp;

select
     empno
    ,ename
    ,hiredate
    ,to_char(next_day(add_months(hiredate, 3), '월요일'), 'yyyy-mm-dd') as R_JOB
    ,nvl2(comm, to_char(comm), 'N/A') as comm
from emp;

select
     empno
    ,ename
    ,mgr
    ,case
        when mgr is null then '0000'
        when substr(mgr, 1, 2)=75 then '5555'
        when substr(mgr, 1, 2)=76 then '6666'
        when substr(mgr, 1, 2)=77 then '7777'
        when substr(mgr, 1, 2)=78 then '8888'
        ELSE to_char(mgr)
    end as chg_mgr1
    ,decode(substr(mgr, 1, 2),
            null, '0000',
            75, '5555',
            76, '6666',
            77, '7777',
            78, '8888',
            to_char(mgr)) as chg_mgr2
from emp;

--7장
select
    sum(sal)
    ,count(sal)
    ,max(sal)
    ,min(sal)
    ,round(avg(sal),2)
from emp;

select
    ename
    ,sum(sal)
from emp;

select
    sum(distinct sal)
    ,sum(all sal)
    ,sum(sal)
from emp;

select
    sum(sal)
    ,sum(comm)
from emp;

select
    count(*)
from emp
where deptno = 30;

select
    count(distinct sal)
    ,count(all sal)
    ,count(sal)
from emp;

select
    count(comm)
from emp
where comm is not null;

select
    max(sal)
from emp
where deptno=10;

select
    min(sal)
from emp
where deptno=10;

select
    max(hiredate)
from emp
where deptno=20;

select
    min(hiredate)
from emp
where deptno=20;

select
    avg(sal)
from emp
where deptno = 30;

select
    avg(distinct sal)
from emp
where deptno = 30;

select
    avg(comm)
from emp
where deptno = 30;

select
    avg(sal)
    ,10 as deptno
from emp
where deptno=10
union all
select
    avg(sal)
    ,20 as deptno
from emp
where deptno=20
union all
select
    avg(sal)
    ,30 as deptno
from emp
where deptno=30;

select
    avg(sal)
    ,deptno
from emp
group by deptno
order by deptno;

select
    avg(sal)
    ,deptno
    ,job
from emp
group by deptno, job
order by deptno, job;

select
    avg(comm)
    ,deptno
from emp
group by deptno
order by deptno;

select
    deptno
    ,job
    ,avg(sal)
from emp
group by deptno, job
having avg(sal)>=2000
order by deptno, job;

select
    deptno
    ,job
    ,avg(sal)
from emp
group by deptno, job
having avg(sal)>=500
order by deptno, job