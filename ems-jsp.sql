/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost:3306
 Source Schema         : ems-jsp

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 16/06/2021 17:09:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(40) DEFAULT NULL COMMENT '姓名',
  `salary` double(10,2) DEFAULT NULL COMMENT '工资',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `gender` tinyint(3) unsigned DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------
BEGIN;
INSERT INTO `emp` VALUES (2, 'admins', 20000.00, '2012-12-12 00:00:00', 1);
INSERT INTO `emp` VALUES (3, 'xiaowang', 68020.00, '2012-12-14 00:00:00', 0);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(40) DEFAULT NULL COMMENT '用户名',
  `realname` varchar(60) DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(60) DEFAULT NULL COMMENT '密码',
  `gender` tinyint(3) unsigned DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'xiaochen', '小陈', '202cb962ac59075b964b07152d234b70', 1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
