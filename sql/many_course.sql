/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2013-07-31 18:54:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `many_course`
-- ----------------------------
DROP TABLE IF EXISTS `many_course`;
CREATE TABLE `many_course` (
  `cid` varchar(32) NOT NULL,
  `cname` varchar(16) default NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of many_course
-- ----------------------------
INSERT INTO `many_course` VALUES ('40287481403452b701403452b8f50001', '语文');
INSERT INTO `many_course` VALUES ('40287481403452b701403452b8f50002', '数学');
