CREATE DATABASE  IF NOT EXISTS demo default charset utf8 COLLATE utf8_general_ci;
use demo;
/*
Navicat MySQL Data Transfer

Source Server         : 192.168.99.78VM
Source Server Version : 50717
Source Host           : 192.168.99.78:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-04-12 16:56:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员');
INSERT INTO `role` VALUES ('2', '普通用户');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `r_id` int(11) DEFAULT NULL,
  `info_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zs', '18', '1', '1');
INSERT INTO `user` VALUES ('2', 'ls', '19', '1', '2');
INSERT INTO `user` VALUES ('3', 'wu', '20', '1', '3');
INSERT INTO `user` VALUES ('4', 'zl', '19', '1', '4');
INSERT INTO `user` VALUES ('5', 'test111', '11', '1', '5');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_num` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', '111', 'man');
INSERT INTO `user_info` VALUES ('2', '222', 'man');
INSERT INTO `user_info` VALUES ('3', '333', 'woman');
INSERT INTO `user_info` VALUES ('4', '444', 'woman');
INSERT INTO `user_info` VALUES ('5', '555', 'man');
