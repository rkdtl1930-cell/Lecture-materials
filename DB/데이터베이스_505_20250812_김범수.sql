--데이터베이스_505_20250812_김범수
--문제 0번 테이블 데이터 인서트 하기
create table dept(
     DEPTNO varchar2(6) constraint dept_deptno_pk primary key
    ,DNAME  varchar2(10) not null
    ,AREA   varchar2(10)
);
create table emp(
     empno number primary key
    ,name varchar2(10) not null unique
    ,deptno varchar2(6) constraint emp_deptno_fk references dept (deptno)
    ,position varchar2(10)
    ,pay number not null
    ,pempno number
);
insert into dept(deptno, dname, area)
          values(101, '영업부', null);
insert into dept(deptno, dname, area)
          values(102, '총무부', null);          
insert into dept(deptno, dname, area)
          values(103, '기획부', null);          
insert into dept(deptno, dname, area)
          values(104, '홍보부', null);          
insert into emp(empno, name, deptno, position, pay, pempno)
         values(1001, '홍길동', 101, '부장', 450, null);
insert into emp(empno, name, deptno, position, pay, pempno)
         values(1002, '김연아', 102, '부장', 400, null);
insert into emp(empno, name, deptno, position, pay, pempno)
         values(1003, '박지성', 101, '과장', 350, 1001);   
insert into emp(empno, name, deptno, position, pay, pempno)
         values(1004, '김태근', 103, '과장', 410, null);
insert into emp(empno, name, deptno, position, pay, pempno)
         values(1005, '서찬수', 101, '대리', 300, 1003);
insert into emp(empno, name, deptno, position, pay, pempno)
         values(1006, '김수현', 103, '대리', 400, 1004);
insert into emp(empno, name, deptno, position, pay, pempno)
         values(1007, '정동민', 102, '대리', 320, 1002);
insert into emp(empno, name, deptno, position, pay, pempno)
         values(1008, '이성규', 102, '사원', 380, 1007);
insert into emp(empno, name, deptno, position, pay, pempno)
         values(1009, '임진영', 103, '사원', 250, 1006);
insert into emp(empno, name, deptno, position, pay, pempno)
         values(1010, '서진수', 101, '사원', 200, 1005);
select * from dept;
select * from emp;

--문제 1번
insert into emp(empno, name, deptno, position, pay, pempno)
         values(1011, '이순신', 104, '부장', 500, null);
--문제 2번
update dept
    set area = '서울'
where deptno = 101;
update dept
    set area = '부산'
where deptno != 101;
select * from dept;

--문제 3번
delete from emp
where deptno = 104;
select * from emp;

--문제 4번
select
    name
    ,pay
    ,case
        when pay > 0 and pay <= 200 then pay*0.05
        when pay > 200 and pay <= 300 then pay*0.1
        when pay > 300 and pay <= 400 then pay*0.15
        else pay*0.2
     end as tex     
from emp;

--문제 5번
select
     e.name
    ,d.dname
    ,e.position
from emp e join dept d on (e.deptno = d.deptno)
where d.deptno in (101, 102)
order by e.name asc;

--문제 6번
select
    e1.name
    ,e2.name
from emp e1 left outer join emp e2 on (e1.pempno = e2.empno);

--문제 7번
select
     d.dname
    ,avg(e.pay)
from emp e join dept d on (e.deptno = d.deptno)
group by d.dname
having avg(e.pay) >= 350;

--문제 8번
select
     e.name
    ,d.dname
    ,e.pay
from emp e join dept d on (e.deptno = d.deptno)
where e.pay in (select max(pay)
                from emp
                where deptno = 101
                group by deptno)
union
select
     e.name
    ,d.dname
    ,e.pay
from emp e join dept d on (e.deptno = d.deptno)
where e.deptno = 102 
  and e.pay in (select max(pay)
                from emp
                where deptno = 102
                group by deptno)
union
select
     e.name
    ,d.dname
    ,e.pay
from emp e join dept d on (e.deptno = d.deptno)
where e.pay in (select max(pay)
                from emp
                where deptno = 103
                group by deptno);
                
--문제 9번
select
     e.name
    ,d.dname
from emp e join dept d on (e.deptno = d.deptno)
where d.dname = (select dname
                 from dept
                 where deptno = 102);
                 
--문제 10번
select
     e.name
    ,e.position
    ,e.pay
from emp e join dept d on (e.deptno = d.deptno)
where e.pay > (select min(pay)
               from emp
               where position = '과장');
               
--문제 11번

--문제 12번
--use.test
--db.pots.insertMany([
--  {title:"Post Title 2", body: "Body of post", category:"Event", like:2, tags:["news","events"], date:Date()}
--  ,{title:"Post Title 3", body: "Body of post", category:"Technology", like:3, tags:["news","events"], date:Date()}
--])