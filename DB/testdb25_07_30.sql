--실습 13-27
create table dept_sequence
as select * from dept where 1 <> 1;
select * from dept_sequence;

--실습 13-28~29
create sequence seq_dept_sequence
increment by 10
start with 10
maxvalue 90
minvalue 0
nocycle
cache 2;

select * from user_sequences;

--실습 13-30, 32
insert into dept_sequence (deptno, dname, loc)
values (seq_dept_sequence.nextval, 'DATABASE', 'SEOUL');

select * from dept_sequence order by deptno;

--실습 13-33
alter sequence seq_dept_sequence
increment by 3
maxvalue 99
cycle;

--실습 13-37
drop sequence seq_dept_sequence;

--실습 13-39~41
create synonym E for emp;

select * from e;

drop synonym E;

--p347. 되새김문제
--Q1
create table EMPIDX
as select * from emp;

create index IDX_EMPIDX_EMPNO
on empidx(empno);

--Q2
create view EMPIDX_OVER15K
as (select empno, ename, job, deptno, sal, nvl2(comm, 'O', 'X') as comm from empidx where sal > 1500);
select * from empidx_over15k;

--Q3
create table DEPTSEQ
as select * from dept;

create sequence seq_deptseq
increment  by 1
start with 1
maxvalue 99
minvalue 1
nocycle
nocache;

select * from deptseq;

insert into deptseq (deptno, dname, loc)
values (seq_deptseq.nextval, 'DATABASE', 'SEOUL');
insert into deptseq (deptno, dname, loc)
values (seq_deptseq.nextval, 'WEB', 'BUSAN');
insert into deptseq (deptno, dname, loc)
values (seq_deptseq.nextval, 'MOBILE', 'ILSAN');

--update deptseq
--set deptno = 3
--where deptno = 9;

--14장
--실습 14-1~2
create table table_notnull(
    login_id varchar2(20) not null,
    login_pwd varchar2(20) not null,
    tel varchar2(20)
    );
    
desc table_notnull;

insert into table_notnull (login_id, login_pwd, tel)
values ('test_id_01', null, '010-1234-5678');

--실습 14-14
create table table_unique(
    login_id varchar2(20) unique,
    login_pwd varchar2(20) not null,
    tel varchar2(20)
    );

desc table_unique;

--실습 14-19
insert into table_unique(login_id, login_pwd, tel)
values(null, 'pwd01', '010-1234-5678');

select * from table_unique;

--실습 14-29 tool로 만듦
desc table_pk;

--실습 14-33~36
insert into table_pk (login_id, login_pwd, tel)
values ('test_id_01', 'pwd01', '010-1234-5678');

select * from table_pk;

insert into table_pk (login_id, login_pwd, tel)
values ('test_id_01', 'pwd02', '010-2234-5678');

insert into table_pk (login_id, login_pwd, tel)
values (null, 'pwd02', '010-2234-5678');

insert into table_pk (login_pwd, tel)
values ('pwd02', '010-2234-5678');

--실습 14-41~43
insert into emp_fk
values(9999, 'test_name', 'test_job', null, to_date('2001/01/01', 'yyyy/mm/dd'),
       3000, null, 10);
select * from emp_fk;
       
insert into dept_fk
values(10, 'test_dname', 'test_loc');
select * from dept_fk;

--실습 14-44
delete from dept_fk where deptno = 10;

--실습 14-45
create table table_check(
    login_id varchar2(20) constraint tblck_loginid_pk primary key,
    login_pwd varchar2(20) constraint tblck_loginpw_ck check (length(login_pwd)>3),
    tel varchar2(20)
    );
    
desc table_check;    

--실습 14-50
insert into table_default values ('test_id', null, '010-1234-5678');

--p.386 되새김 문제
--Q1
create table DEPT_CONST(
    deptno number(2) constraint DEPTCONST_DEPTNO_PK primary key,
    dname varchar2(14) constraint DEPTCONST_DNAME_UNQ unique,
    loc varchar2(13) constraint DEPTCONST_LOC_NN not null
    );
    
create table EMP_CONST(
    empno number(4) constraint EMPCONST_EMPNO_PK primary key,
    ename varchar2(10) constraint EMPCONST_ENAME_NN not null,
    job varchar2(9),
    tel varchar2(20) constraint EMPCONST_TEL_UNQ unique,
    hiredate date,
    sal number(7,2) constraint EMPCONST_SAL_CHK check (sal >= 1000 and sal <= 9999),
    comm number(7,2),
    deptno number(2) constraint EMPCONST_DEPTNO_FK references dept_const (deptno)
    );

select table_name, constraint_name, constraint_type
from user_constraints
where table_name = 'DEPT_CONST'
   or table_name = 'EMP_CONST'
order by constraint_name;