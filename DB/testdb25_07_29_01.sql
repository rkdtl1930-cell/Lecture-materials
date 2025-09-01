-- create 문은 dml이 아니므로 트랜잭션이 없다.
create table dept_tcl
as select * from dept;


select * from dept_tcl;
--where deptno = 40;
delete from dept_tcl where deptno = 40;

commit;

update dept_tcl
set loc = 'busan'
where deptno = 30;

select * from dept;
--p296. 되새김 문제
--Q1-1. DATABASE, SEOUL, SALES, CHICAGO / Q1-4 SALES, CHICAGO, DATABASE, SEOUL / Q1-5 DATABASE, SEOUL, DATABASE, SEOUL

--실습 12-1
create table EMP_DDL(
    EMPNO   NUMBER(4)
    ,ENAME  VARCHAR2(10)
    ,JOB    VARCHAR2(9)
    ,MGR    NUMBER(4)
    ,HIREDATE   DATE
    ,SAL    NUMBER(7,2)
    ,COMM   NUMBER(7,2)
    ,DEPTNO NUMBER(2)
);

desc emp_ddl;

--실습 12-4
create table emp_ddl_30
as select * from emp where deptno = 30;
select * from emp_ddl_30;

--실습 12-5
create table empdept_ddl
as select e.empno, e.ename, e.job, e.mgr, e.hiredate,
          e.sal, e.comm, d.deptno, d.dname, d.loc
from emp e, dept d
where 1 <> 1;
select * from empdept_ddl;

--실습 12-6
create table emp_alter
as select * from emp;
select * from emp_alter;

--실습 12-7
alter table emp_alter
add hp varchar2(20);
select * from emp_alter;

--실습 12-8
alter table emp_alter
rename column hp to tel;
select * from emp_alter;

--실습 12-9
alter table emp_alter
modify empno number(5);

--실습 12-10
alter table emp_alter
drop column tel;

--실습 12-11
rename emp_alter to emp_rename;

--실습 12-14
truncate table emp_rename;
select * from emp_rename;

--실습 12-15
drop table emp_rename;

--p311. 되새김 문제
--Q1
create table emp_hw(
    empno number(4)
    ,ename varchar2(10)
    ,job varchar2(9)
    ,mgr number(4)
    ,hiredate date
    ,sal number(7,2)
    ,comm number(7,2)
    ,deptno number(2)
    );
select * from emp_hw;

--Q2
alter table emp_hw
add bigo varchar2(20);

--Q3
alter table emp_hw
modify bigo varchar2(30);

--Q4
alter table emp_hw
rename column bigo to remark;

--실습 13-8
select * from user_indexes;