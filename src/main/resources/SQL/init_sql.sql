create table sys_permission
(
    id     int auto_increment comment '自增长主键'
        primary key,
    name   varchar(50)  null comment '权限名称',
    url    varchar(200) null,
    method varchar(200) null,
    `desc` varchar(200) null comment '备注'
);

create table sys_role
(
    id        int auto_increment comment '自增主键'
        primary key,
    role_name varchar(255) null
);

create table sys_role_permission
(
    id            int auto_increment
        primary key,
    role_id       int null comment '角色ID',
    permission_id int null comment '权限ID'
)
    comment '角色-权限表';

create table sys_user
(
    id          int auto_increment
        primary key,
    login_name  varchar(30)       not null comment '登陆账号',
    password    varchar(64)       not null,
    salt        varchar(100)      null comment '加密盐值',
    nick_name   varchar(20)       not null comment '真实姓名',
    user_status tinyint default 1 null comment '状态：0禁用，1启用',
    create_time datetime          null comment '创建时间',
    constraint login_name
        unique (login_name)
);

create table sys_user_role
(
    id      int auto_increment
        primary key,
    user_id int null comment '用户ID',
    role_id int null comment '角色ID'
);

