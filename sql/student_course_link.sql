/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2013-07-31 18:54:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student_course_link`
-- ----------------------------
DROP TABLE IF EXISTS `student_course_link`;
CREATE TABLE `student_course_link` (
  `sid` varchar(32) NOT NULL,
  `cid` varchar(32) NOT NULL,
  PRIMARY KEY  (`sid`,`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_course_link
-- ----------------------------
INSERT INTO `student_course_link` VALUES ('40287481403452b701403452b8e60000', '40287481403452b701403452b8f50001');
INSERT INTO `student_course_link` VALUES ('40287481403452b701403452b8e60000', '40287481403452b701403452b8f50002');
