use paotuitui;
create table user(
                     id bigint primary key auto_increment,
                     student_id bigint not null comment '学号',
                     phone_number varchar(20) comment '手机号',
                     auth_state tinyint default 1 comment '0 未认证 1 已认证'
);
create table audit(
                      id int primary key auto_increment,
                      student_id bigint not null comment '学号',
                      status tinyint not null comment '审核状态 0 待审核 1 通过，2 未通过',
                      img_str varchar(10000) not null comment '图片base64编码后的值'
);

