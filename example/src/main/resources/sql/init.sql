create schema if not exists `mybatis`;
use `mybatis`;
CREATE TABLE IF NOT EXISTS  `user` (
   `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
   `name` varchar(255) NOT NULL DEFAULT '名字',
   `amount` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '金额',
   `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into user(name, amount) value ('chunqiu79', 2.33);