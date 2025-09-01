--7장 되새김 문제부터~
select
     deptno
    ,trunc(avg(sal),0) as avg_sal
    ,max(sal) as max_sal
    ,min(sal) as min_sal
    ,count(*) as cnt
from emp
group by deptno;

select
     job
    ,count(*)
from emp
group by job
having count(*)>=3;

select
     to_char(hiredate, 'yyyy') as hire_uear
    ,deptno
    ,count(*) as cnt
from emp
group by to_char(hiredate, 'yyyy'), deptno;

select
    nvl2(comm, 'O', 'X') as exist_comm
    ,count(*) as cnt
from emp
group by nvl2(comm, 'O', 'X');

select
    decode(comm,
            null, 'X',
            0, 'X',
            'O') as exist_comm3
    ,count(*)    
from emp
group by decode(comm,
            null, 'X',
            0, 'X',
            'O');

select
    case
        when comm is null then 'X'
        when comm=0 then 'X'
        when comm>0 then 'O'
        end as exist_comm2
        ,count(*) as cnt
from emp
group by case
        when comm is null then 'X'
        when comm=0 then 'X'
        when comm>0 then 'O'
        end;

--8장
select *
from emp, dept
order by empno;

-- 테이블에 엘리어스를 줄땐 as 를 안쓰고 뛰어쓰고 적으면 된다.
select *
from emp e, dept d
where e.deptno = d.deptno
order by empno;

select
    e.empno
    ,d.dname
from emp e, dept d
where e.deptno = d.deptno
order by empno;

select
    e.empno
    ,e.ename
    ,d.deptno
    ,d.dname
    ,d.loc
from emp e, dept d
where e.deptno = d.deptno
order by d.deptno, e.empno;

select
    e.empno
    ,e.ename
    ,e.sal
    ,d.deptno
    ,d.dname
    ,d.loc
from emp e, dept d
where e.deptno = d.deptno
    and e.sal >= 3000;

select
    e.empno
    ,e.ename
    ,e.sal
    ,d.deptno
    ,d.dname
    ,d.loc
from emp e, dept d
where e.deptno = d.deptno
    and e.sal <= 2500
    and e.empno <=9999
order by e.empno;

select *
from emp e, salgrade s
where e.sal between s.losal and s.hisal;

select *
from emp e1, emp e2
where e1.mgr = e2.empno;

select
    e1.empno
    ,e1.ename
    ,e1.mgr
    ,e2.empno as mgr_empno
    ,e2.ename as mgr_ename
from emp e1, emp e2
where e1.mgr = e2.empno;

select *
from emp e, dept d
where e.deptno(+) = d.deptno;

--p226~227 되새김 문제
--1번
select
    d.deptno
    ,d.dname
    ,e.empno
    ,e.ename
    ,e.sal
from emp e, dept d
where e.deptno = d.deptno
    and e.sal>2000;
    
select
    d.deptno
    ,d.dname
    ,e.empno
    ,e.ename
    ,e.sal
from emp e
    join dept d on (e.deptno = d.deptno)
where e.sal>2000;

--2번

select
    d.deptno
    ,d.dname
    ,trunc(avg(e.sal), 0)
    ,max(e.sal)
    ,min(e.sal)
    ,count(e.sal)
from emp e, dept d
where e.deptno = d.deptno
group by d.deptno, d.dname;

select
    d.deptno
    ,d.dname
    ,trunc(avg(e.sal), 0)
    ,max(e.sal)
    ,min(e.sal)
    ,count(e.sal)
from emp e
    join dept d on (e.deptno = d.deptno)
group by d.deptno, d.dname;

--3번

select
    d.deptno
    ,d.dname
    ,e.empno
    ,e.ename
    ,e.job
    ,e.sal
from emp e, dept d
where e.deptno(+) = d.deptno
order by d.deptno, e.ename;

select
    d.deptno
    ,d.dname
    ,e.empno
    ,e.ename
    ,e.job
    ,e.sal
from emp e
    right outer join dept d on (e.deptno = d.deptno)
order by d.deptno, e.ename;

--4번 between 에서 아우터 조인(+)을 할 때는 둘다에 적어야함!

select
     d.deptno
    ,d.dname
    ,e1.empno
    ,e1.ename
    ,e1.mgr
    ,e1.sal
    ,e1.deptno
    ,s.losal
    ,s.hisal
    ,s.grade
    ,e2.empno as mgr_empno
    ,e2.ename as mgr_ename
from emp e1, emp e2, dept d, salgrade s
where e1.deptno(+) = d.deptno
    and e1.sal between s.losal(+) and s.hisal(+)
    and e1.mgr = e2.empno(+)
order by d.deptno, e1.empno;

select
    d.deptno
    ,d.dname
    ,e1.empno
    ,e1.ename
    ,e1.mgr
    ,e1.sal
    ,e1.deptno
    ,s.losal
    ,s.hisal
    ,s.grade
    ,e2.empno as mgr_empno
    ,e2.ename as mgr_ename
from emp e1
        right outer join dept d on (e1.deptno = d.deptno)
        left outer join salgrade s on (e1.sal between s.losal and s.hisal)
        left outer join emp e2 on (e1.mgr = e2.empno)
order by d.deptno, e1.empno;