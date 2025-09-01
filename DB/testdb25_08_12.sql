select
    job
    ,sum(sal)
from emp
group by job
union
select
    '총계'
    ,sum(sal)
from emp;
select
    job
    ,sum(sal)
from emp
group by rollup(job);
select
    job
    ,deptno
    ,sum(sal)
from emp
group by job, deptno
order by deptno;
select
    case
        when grouping_id(job, deptno) = 1 then '소계'
        when grouping_id(job, deptno) = 3 then '합계'
        else job
        end as gruoping
--    ,job
--    ,deptno
    ,decode(deptno,
            null, '-',
            deptno) as deptno
    ,sum(sal)
    ,grouping_id(job, deptno)
from emp
group by rollup(job, deptno)
order by job;