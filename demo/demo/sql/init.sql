-- auto-generated definition
create table demo_user
(
    id          bigint auto_increment comment '用户ID'
        primary key,
    username    varchar(30)                            not null comment '用户账号',
    password    varchar(100) default ''                not null comment '密码',
    nickname    varchar(30)                            not null comment '用户昵称',
    remark      varchar(500)                           null comment '备注',
    dept_id     bigint                                 null comment '部门ID',
    email       varchar(50)  default ''                null comment '用户邮箱',
    mobile      varchar(11)  default ''                null comment '手机号码',
    sex         tinyint      default 0                 null comment '用户性别',
    avatar      varchar(1000) default ''                null comment '头像地址',
    status      tinyint      default 0                 not null comment '帐号状态（0正常 1停用）',
    login_ip    varchar(50)  default ''                null comment '最后登录IP',
    login_date  datetime                               null comment '最后登录时间',
    creator     varchar(64)  default ''                null comment '创建者',
    create_time datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    updater     varchar(64)  default ''                null comment '更新者',
    update_time datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    deleted     bit          default b'0'              not null comment '是否删除'
)
    comment '用户信息表' collate = utf8mb4_unicode_ci;

