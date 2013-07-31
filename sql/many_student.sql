/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2013-07-31 18:54:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `many_student`
-- ----------------------------
DROP TABLE IF EXISTS `many_student`;
CREATE TABLE `many_student` (
  `sid` varchar(32) NOT NULL,
  `sname` varchar(16) default NULL,
  `sage` varchar(16) default NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of many_student
-- ----------------------------
INSERT INTO `many_student` VALUES ('40287481403452b701403452b8e60000', '王二', '23');
