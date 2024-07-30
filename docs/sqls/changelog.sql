use paotuitui;
create table student(
                     id bigint primary key auto_increment,
                     student_id bigint not null comment '学号',
                     phone_number varchar(20) comment '手机号',
                     auth_state tinyint default 1 comment '0 未认证 1 已认证'
);
create table audit(
                      id bigint primary key auto_increment,
                      student_id bigint not null comment '学号',
                      status tinyint not null comment '审核状态 0 待审核 1 通过，2 未通过',
);

