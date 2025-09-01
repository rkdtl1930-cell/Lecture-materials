-- chap05.where절 중요!!
-- 부서 번호가 30인 데이터만 출력하기
select
    *
from emp
where deptno = 30
;

-- AND 연산자로 여러 개 조건식 사용하기
select
    *
from emp
where deptno = 30
and job = 'SALESMAN'
;

-- OR 연산자로 여러 개의 출력 조건 사용하기(일반적으로 안쓰려고 함)
select
    *
from emp
where deptno = 30
or job = 'CLERK'
;

-- 곱셈 산술 연산자를 사용한 예(조건식만 맞으면 나옴 // sal*12=36000 = 36000=sal*12)
select
    *
from emp
where sal*12 = 36000
;

-- 대소 비교 연산자를 사용하여 출력하기(조건식만 맞으면 나옴 // sal>=3000 = 3000<=sal)
select
    *
from emp
where sal>=3000
;

-- 107p 1분 복습
select
    *
from emp
where sal>=2500
and job = 'ANALYST'
;

-- 문자를 대소 비교 연산자로 비교하기 // 비교 문자열이 문자 하나일 때
select
    *
from emp
where ename>='F'
;

-- 문자열을 대소 비교 연산자로 비교하기 // 비교 문자열이 문자 여러 개일 때
select
    *
from emp
where ename<='FORZ'
;

-- 등가 비교 연산자(!=, <>)를 사용하여 출력하기
select
    *
from emp
where sal!=3000
;

select
    *
from emp
where sal<>3000
;

-- NOT 연산자를 사용하여 출력하기(★NOT의 위치 헷갈리지 않기★)
select
    *
from emp
where not sal=3000
;

-- OR 연산자를 사용하여 여러 조건을 만족하는 데이터 출력하기
select
    *
from emp
where job='MANAGER'
   or job='SALESMAN'
   or job='CLERK'
;

-- IN 연산자를 사용하여 출력하기
select
    *
from emp
where job in ('MANAGER', 'SALESMAN', 'CLERK')
;

-- 등가 비교 연산자와 AND 연산자를 사용하여 출력하기
select
    *
from emp
where job != 'MANAGER'
  and job <> 'SALESMAN'
  and job ^= 'CLERK'
;
  
-- IN 연산자와 논리 부정 연산자(NOT)를 사용하여 출력하기
select
    *
from emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK')
;

-- p113 1분 복습 // 오라클은 숫자에도 ''가 인식되지만 안하는게 맞음
select
    *
from emp
where deptno in (10, 20)
;

-- 대소 비교 연산자와 AND 연산자를 사용하여 출력하기
select
    *
from emp
where sal>=2000
  and sal<=3000
;
  
-- BETWEEN A AND B 연산자를 사용하여 출력하기
select
    *
from emp
where sal between 2000 and 3000
;

-- BETWEEN A AND B 연산자와 NOT 연산자를 사용하여 출력하기
select
    *
from emp
where sal not between 2000 and 3000
;

-- LIKE 연산자 사용하여 출력하기
select
    *
from emp
where ename like 'S%'
;

-- 사원 이름의 두 번째 글자가 L인 데이터만 출력하기
select
    *
from emp
where ename like '_L%'
;

-- 사원 이름에 AM이 포함된 사원 데이터만 출력하기
select
    *
from emp
where ename like '%AM%'
;

-- 사원 이름에 AM을 포함하지 않은 사원 데이터 출력하기
select
    *
from emp
where ename not like '%AM%'
;

-- IS NULL 연산자 사용하여 출력하기
select
    *
from emp
where comm is null
;

-- OR 연산자와 IS NULL 연산자 사용하기
select
    *
from emp
where sal > null
   or comm is null
;

-- 집합 연산자(UNION)를 사용하여 출력하기(열 개수와 출력할 열의 자료형이 같아야함)
select
     empno
    ,ename
    ,sal
    ,deptno
from emp
where deptno =10
union
select
     empno
    ,ename
    ,sal
    ,deptno
from emp
where deptno = 20
;

-- 집합 연산자(MINUS)를 사용하여 출력하기
select
     empno
    ,ename
    ,sal
    ,deptno
from emp
minus
select
     empno
    ,ename
    ,sal
    ,deptno
from emp
where deptno = 10
;

-- 유니온에서 alias를 할거면 맨 위에 꺼에 하기

-- p131~132 되새김 문제
select
    *
from emp
where ename like '%S'
;

select
     empno
    ,ename
    ,job
    ,sal
    ,deptno
from emp
where deptno = 30
   and job = 'SALESMAN'
;

select
     empno
    ,ename
    ,job
    ,sal
    ,deptno
from emp
where deptno in (20, 30)
  and sal > 2000
;
select
     empno
    ,ename
    ,job
    ,sal
    ,deptno
from emp
where deptno in(20, 30)
intersect
select
     empno
    ,ename
    ,job
    ,sal
    ,deptno
from emp
where sal>2000
;

select
    *
from emp
where sal<2000
   or sal>3000
;
select
    *
from emp
minus
select
    *
from emp
where sal >=2000
  and sal <=3000
;

select
     ename
    ,empno
    ,sal
    ,deptno
from emp
where ename like '%E%'
  and deptno = 30
  and sal not between 1000 and 2000
;

select
    *
from emp
where job in ('MANAGER', 'CLERK')
  and ename not like '_L%'
  and comm is null
  and mgr is not null
;

-- chap6 오라클 함수
-- UPPER, LOWER, INITCAP 함수 사용하기
select
     ename
    ,upper(ename)
    ,lower(ename)
    ,initcap(ename)
from emp
where lower(ename) = 'smith'
;

-- UPPPER 함수로 문자열 비교하기(사원 이름이 SCOTT인 데이터 찾기)
select
    *
from emp
where upper(ename) = upper('scott')
;

-- UPPER 함수로 문자열 비교하기(사원 이름에 SCOTT 단어를 포함한 데이터 찾기)
select
    *
from emp
where upper(ename) like upper('%scott%')
;

-- 선택한 열의 문자열 길이 구하기
select
     ename
    ,length(ename)
from emp
;

-- 사원의 이름의 길이가 5 이상인 행 출력하기
select
     ename
    ,length(ename)
from emp
where length(ename) >= 5
;

-- 오라클에서 dual 이라는 더미 테이블이 있음
-- 한글은 한글자당 3byte 알파벳은 한글자당 1byte

-- SUBSTR 함수를 사용하는 예
select
     substr(job, 1, 2)
    ,substr(job, 3, 2)
    ,substr(job, 5)
from emp
;

-- SUBSTR 함수 안에 다른(LENGTH) 함께 사용하기
select
     job
    ,substr(job, -length(job))
    ,substr(job, -length(job), 2)
    ,substr(job, -3)
from emp
;

-- INSTR 함수로 문자열 데이터에서 특정 문자열 찾기
select
    instr('hello, oracle!','l') as instr_1
    ,instr('hello, oracle!','l', 5) as instr_2
    ,instr('hello, oracle!','l', 2, 2) as instr_3
from dual
;

-- INSTR 함수와 LIKE 연산자로 사원 이름에 문자 S가 있는 행 구하기
select
    *
from emp
where instr(ename, 'S')>0
;

select
    *
from emp
where ename like '%S%'
;

-- REPLACE 함수로 문자열 안에 있는 특정 문자 바꾸기
select
    '010-1234-5678' as replace_befoe
    ,replace('010-1234-5678', '-', ' ') as replace_1
    ,replace('010-1234-5678', '-') as replace_2
from dual
;

-- LPAD, RPAD 함수 사용하여 출력하기
select
     'oracle'
    ,lpad('oracle', 10, '#') as L_1
    ,rpad('oracle', 10, '*') as R_1
    ,lpad('oracle', 10) as L_2
    ,rpad('oracle', 10) as R_2
from dual 
;

-- CONCAT 함수
select
     ename
    ,job
    ,concat(ename, concat('-', job))
    ,ename||'-'||job
from emp
;

-- SYSDATE 함수를 사용하여 날짜 출력하기
select
      sysdate as now
     ,sysdate-1 as yesterday
     ,sysdate+1 as tomorrow
from dual
;

-- SYSDATE와 ADD_MONTHS 함수
select
    sysdate
    ,add_months(sysdate, -3)
from dual
;

-- 입사 10주년이 되는 날짜 출력하기
select
     empno
    ,ename
    ,hiredate
    ,add_months(hiredate, 120) as work10years
from emp
;

--입사 40년을 초과한 사원 데이터 출력하기
select
     empno
    ,ename
    ,hiredate
    ,sysdate
from emp
where add_months(hiredate, 400) < sysdate
;

-- HIREDAYE와 SYSDATE 사이의 개월 수를 MONTHS_BETWEEN 함수로 출력하기
select
     empno
    ,ename
    ,hiredate
    ,sysdate
    ,months_between(hiredate, sysdate) as months1
    ,months_between(sysdate, hiredate) as months2
    ,trunc(months_between(sysdate, hiredate)) as months3
from emp
;

-- NEXT_DAY, LAST_DAY
select
    sysdate
    ,next_day(sysdate, '월요일')
    ,last_day(sysdate)
from dual
;

-- 숫자와 문자열(숫자)을 더하여 출력하기
select
    empno
    ,ename
    ,empno + '500'
from emp
where ename = 'SCOTT'
;

-- 날짜 형식 지정하여 SYSDATE 출력하기
select
    to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss') as 현재날짜시간
from dual
;



/*
주석
*/
-- ctrl + / = (주석 단축키) 
select
    *
from emp
where length(job)>=6
;
select
    ename
    ,substr(ename, 3)
from emp
;
select
    ename
    ,replace(ename, 'S', '스')
from emp
;
select
     round(1345.9)
    ,trunc(1345.9)
    ,mod(1985839050, 9)
from dual
;
select
    sysdate
    ,add_months(sysdate, 6)
from dual
;

select
    to_char(empno) + to_char('500')
from emp
;

select
    to_char(sysdate, 'yyyy/mm/dd/ hh:mi:ss am')
from dual
;

select
    to_char(sysdate, 'day', 'nls_date_language = japanese') as jp_day
from dual
;

select
    to_number('1,300', '9,999')-to_number('1,200', '9,999')
from dual
;

select
    *
from emp
where hiredate>to_date('1980-10-15', 'yyyy-mm-dd')
;