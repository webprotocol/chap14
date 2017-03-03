
select * from dept;

insert into dept
values
(60, 'xxx', 'yyy');

update dept
   set dname = '개발부',
       loc = '광주'
 where deptno = 60;	
 
 delete from dept
  where deptno = 50;

select table_name from user_tables;

drop table xxx;

select * from emp;

create sequence xxx start with 10 INCREMENT BY 10;

select xxx.nextval FROM dual;
select xxx.currval from dual;


select d.deptno as deptno,
		   d.dname as dname,
		   d.loc as loc
      from dept d INNER join emp e
        on d.DEPTNO = e.DEPTNO;


create table guestbook_message (
	message_id number primary key,
	guest_name varchar2(50 char) not null,
	password varchar(10 char) not null,
	message long not null
);


insert into guestbook_message values (xxx.nextval, 'xxx', '1234', 'Hello');

select * from guestbook_message;


drop table GUESTBOOK_MESSAGE;

