--set serveroutput on;
/*
declare
    v_empno number(4) := 7788;
    v_ename constant varchar2(10) := 'shin';
    v_tax numeric(1) default 1;
    v_tax2 numeric(1) not null default 0;
begin
--    v_ename := 'scott';
    v_tax := 7;
    dbms_output.put_line(v_empno);
    dbms_output.put_line('v_tax : '||v_tax);
--    dbms_output.put_line('v_tax2 : '||v_tax2);    
--    dbms_output.put_line(v_ename);
--    dbms_output.put_line('Hello!!');
end;
/
*/
/*
declare
    v_deptno dept.deptno%type := 50;
    v_deptrow dept%rowtype;
begin
    select * into v_deptrow
    from dept
    where deptno = 10;
    dbms_output.put_line(v_deptrow.loc);
    dbms_output.put_line(v_deptrow.dname);
    dbms_output.put_line(v_deptrow.deptno);
end;
/
*/
/*
declare
    v_num number := 14;
begin
    if mod(v_num, 2) = 1 then
    dbms_output.put_line('홀수');
    elsif mod(v_num, 2) = 0 then
    dbms_output.put_line('짝수');
    end if;
end;
/
*/
/*
declare
    v_num number := 8;
begin
    if v_num >= 0 and v_num <= 1000 then
    dbms_output.put_line('A');
    elsif v_num > 1000 and v_num <= 2000 then
    dbms_output.put_line('B');
    elsif v_num > 2000 and v_num <= 3000 then
    dbms_output.put_line('C');
    else
    dbms_output.put_line('D');
    end if;
end;
/
*/
/*
declare
    v_num emp.sal%type;
begin
    select sal into v_num
    from emp
    where ename = 'SCOTT';
    if v_num >= 0 and v_num <= 1000 then
        dbms_output.put_line('A');
    elsif v_num > 1000 and v_num <= 2000 then
        dbms_output.put_line('B');
    elsif v_num > 2000 and v_num <= 3000 then
        dbms_output.put_line('C');
    else
        dbms_output.put_line('D');
    end if;
end;
/
*/
/*
declare
    v_num emp.sal%type;
begin
    select sal into v_num
    from emp
    where ename = 'SCOTT';
    case
        when v_num >= 0 and v_num <= 1000 then
            dbms_output.put_line('A');
        when v_num > 1000 and v_num <= 2000 then
            dbms_output.put_line('B');
        when v_num > 2000 and v_num <= 3000 then
            dbms_output.put_line('C');
        else
            dbms_output.put_line('D');
    end case;
end;
/
*/
/*
declare
    v_num number := 0;
begin
    loop
        dbms_output.put_line(v_num);
        v_num := v_num + 1;
        exit when v_num > 4;
    end loop;
end;
/
*/
/*
declare
    v_num number := 0;
begin
    while v_num <= 4 loop
        dbms_output.put_line(v_num);
        v_num := v_num + 1;
    end loop;
end;
/
*/
/*
declare
    v_num number := 0;
begin
    for i in reverse 0..4 loop
        dbms_output.put_line(i);
    end loop;
end;
/
*/
/*
declare
    type r_dept is record(
        deptno number not null := 99,
        dname dept.dname%type,
        loc dept.loc%type
    );
    dept_r r_dept;
begin
    dept_r.deptno := 85;
    dept_r.dname := 'shin';
    dept_r.loc := 'busan';
--    insert into dept
--    values dept_r;
    update dept
    set row = dept_r
    where deptno = 99;
end;
/
select * from dept;
*/
/*
declare
    type r_dept is record(
        deptno number not null := 99,
        dname dept.dname%type,
        loc dept.loc%type
    );
    type r_emp is record(
        empno emp.empno%type,
        ename emp.ename%type,
        rdept r_dept
    );
    emp_r r_emp;
begin
    select e.empno, e.ename, d.deptno, d.dname, d.loc
    into emp_r.empno, emp_r.ename, emp_r.rdept.deptno, emp_r.rdept.dname, emp_r.rdept.loc
    from emp e, dept d
    where e.deptno = d.deptno
    and e.empno = 7788;
    dbms_output.put_line(emp_r.ename);
    dbms_output.put_line(emp_r.empno);
    dbms_output.put_line(emp_r.rdept.loc);
    dbms_output.put_line(emp_rdept.dname);
    dbms_output.put_line(emp_rdept.deptno);
end;
/
*/
/*
declare
    type itab_dept is table of dept%rowtype
        index by pls_integer;
    dept_arr itab_dept;
    idx pls_integer := 0;
begin
    for i in (select * from dept) loop
        idx := idx + 1;
        dept_arr(idx).dname := i.dname;
        dept_arr(idx).loc := i.loc;
        dept_arr(idx).deptno := i.deptno;
        dbms_output.put_line(
            dept_arr(idx).dname || ' : ' ||
            dept_arr(idx).loc || ' : ' ||
            dept_arr(idx).deptno
        );
    end loop;    
end;
/
*/
/*
declare
    v_dept_row dept%rowtype;
    
    cursor c1 is
        select deptno, dname, loc
        from dept;
begin
    open c1;
    loop
        fetch c1 into v_dept_row;
        exit when c1%notfound;
            dbms_output.put_line('deptno : ' || v_dept_row.deptno);
            dbms_output.put_line('dname : ' || v_dept_row.dname);
            dbms_output.put_line('loc : ' || v_dept_row.loc);
    end loop;
    close c1;
end;
/
*/
/*
declare
    v_dept_row dept%rowtype;
    
    cursor c1 is
        select deptno, dname, loc
        from dept;
begin
    for i in c1 loop
            dbms_output.put_line('deptno : ' || i.deptno);
            dbms_output.put_line('dname : ' || i.dname);
            dbms_output.put_line('loc : ' || i.loc);
    end loop;
end;
/
*/
/*
declare
    v_dept_row dept%rowtype;
    v_n dept.deptno%type;
    cursor c1(n dept.deptno%type) is
        select deptno, dname, loc
        from dept
        where deptno = n;
begin
    v_n := 20;
    for i in c1(v_n) loop
            dbms_output.put_line('deptno : ' || i.deptno);
            dbms_output.put_line('dname : ' || i.dname);
            dbms_output.put_line('loc : ' || i.loc);
    end loop;
end;
/
*/