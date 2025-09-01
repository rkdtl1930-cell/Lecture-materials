--10장
--실습 10-1
create table dept_temp
as select * from dept;

--제대로 생성되었는지 확인
select * from dept_temp;

--실습 10-3, 10-4
insert into dept_temp (deptno, dname, loc)
                values (50, 'database', 'seoul');
insert into dept_temp
                values (60, 'network', 'busan');
                
--p255. 인서트 오류
insert into dept_temp (deptno, dname, loc)
                values (50, 'database');
insert into dept_temp (deptno, dname, loc)
                values (50, 'database', 'seoul', 'wrong');
insert into dept_temp (deptno, dname, loc)
                values ('wrong', 'database', 'seoul');
insert into dept_temp (deptno, dname, loc)
                values (500, 'database', 'seoul');

--1<>1 : 무조건 false
--1=1 : 무조건 true

--실습 10-8
create table emp_temp
as select * from emp where 1<>1;

select * from emp_temp;

--실습 10-9~13
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
              values (9999, '홍길동', 'PRESIDENT', NULL, '2001/01/01',
                      5000, 1000, 10);
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
              values (1111, '성춘향', 'MANAGER', 9999, '2001-01-05',
                      4000, null, 20);
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
              values (2111, '이순신', 'MANAGER', 9999, '07/01/2001',
                      4000, null, 20);
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
              values (2111, '이순신', 'MANAGER', 9999,
                      to_date('07/01/2001', 'dd/mm/yyyy'),
                      4000, null, 20);
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
              values (3111, '심청이', 'MANAGER', 9999, sysdate,
                      4000, null, 30);
                      
--실습 10-14
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
            select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm,
                   e.deptno
            from emp e, salgrade s
            where e.sal between s.losal and s.hisal
              and s.grade = 1;
              
--실습 10-15
create table dept_temp2
as select * from dept;

select * from dept_temp2;

--실습 10-16~17
update dept_temp2
set loc = 'seoul';
rollback;

--실습 10-18
update dept_temp2
set dname = 'database',
    loc = 'seoul'
where deptno = 40;

--p266. 1분 복습
update emp_temp
set comm = 50
where sal <= 2500;

--실습 10-19
update dept_temp2
set (dname, loc) = (select dname, loc from dept where deptno = 40)
where deptno = 40;

--실습 10-22
create table emp_temp2
as select * from emp;

select * from emp_temp2;

--실습 10-23
select * from emp_temp2 where job = 'MANAGER';

delete from emp_temp2
where job = 'MANAGER';

--실습 10-24
delete from emp_temp2
where empno in (select e.empno
                from emp_temp2 e, salgrade s
                where e.sal between s.losal and s.hisal
                and s.grade = 3
                and deptno = 30);
                
--실습 10-25
delete from emp_temp2;

--p273~275 되새김 문제
create table chap10hw_emp
as select * from emp;
create table chap10hw_dept
as select * from dept;
create table chap10hw_salgrade
as select * from salgrade;

select * from chap10hw_emp;
select * from chap10hw_dept;
select * from chap10hw_salgrade;

--1번
insert into chap10hw_dept (deptno, dname, loc)
                   values (50, 'ORACLE', 'BUSAN');
insert into chap10hw_dept (deptno, dname, loc)
                   values (60, 'SQL', 'ILSAN');
insert into chap10hw_dept (deptno, dname, loc)
                   values (70, 'SELECT', 'INCHEON');
insert into chap10hw_dept (deptno, dname, loc)
                   values (80, 'DML', 'BUNDANG');                
                   
--2번
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
                  values (7201, 'TEST_USER1', 'MANAGER', 7788, '16-01-02', 4500,
                          '', 50);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
                  values (7202, 'TEST_USER2', 'CLERK', 7201, '16-02-21', 1800,
                          '', 50);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
                  values (7203, 'TEST_USER3', 'ANALYST', 7201, '16-04-11', 3400,
                          '', 60);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
                  values (7204, 'TEST_USER4', 'SALESMAN', 7201, '16-05-31', 2700,
                          300, 60);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
                  values (7205, 'TEST_USER5', 'CLERK', 7201, '16-07-20', 2600,
                          '', 70);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
                  values (7206, 'TEST_USER6', 'CLERK', 7201, '16-09-08', 2600,
                          '', 70);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
                  values (7207, 'TEST_USER7', 'LECTURER', 7201, '16-10-28', 2300,
                          '', 80);
insert into chap10hw_emp (empno, ename, job, mgr, hiredate, sal, comm, deptno)
                  values (7208, 'TEST_USER8', 'STUDENT', 7201, '18-03-09', 1200,
                          '', 80);
                
--3번
update chap10hw_emp
set deptno = 70
where sal > (select avg(sal) from chap10hw_emp where deptno = 50);
select * from chap10hw_emp order by deptno;

--4번
select * from chap10hw_emp order by deptno;

update chap10hw_emp
set sal = sal*1.1
where hiredate > (select min(hiredate) from chap10hw_emp where deptno = 60);
update chap10hw_emp
set deptno = 80
where hiredate > (select min(hiredate) from chap10hw_emp where deptno = 60);

--5번
select * from chap10hw_emp;

delete chap10hw_emp
where sal in (select e.sal
                  from chap10hw_emp e, chap10hw_salgrade s
                  where e.sal between s.losal and s.hisal
                  and s.grade = 5);