create table t_account
(
    id      int auto_increment
        primary key,
    name    varchar(40) null,
    age     int         null,
    balance int         null
);

INSERT INTO account.t_account (name, age, balance) VALUES ('张三', 18, 1000);
INSERT INTO account.t_account (name, age, balance) VALUES ('李四', 19, 2000);
