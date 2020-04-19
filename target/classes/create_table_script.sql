use test;

drop table if exists test.wan_logs;

create table test.wan_logs (
 id         int          not null primary key,
 log_time   datetime     not null,
 log_level  varchar(100) not null,
 log_class  varchar(100) not null,
 log_method varchar(100) not null,
 log_msg    varchar(200) not null
) engine=Innodb default charset=utf8;