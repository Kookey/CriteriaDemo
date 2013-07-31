/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2013-07-31 17:20:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `b_id` varchar(50) NOT NULL,
  `b_name` varchar(100) default NULL,
  `b_price` varchar(50) default NULL,
  `s_id` varchar(50) default NULL,
  PRIMARY KEY  (`b_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('402874814019dae6014019dae7d50001', 'Java宝典0', '50', '402874814019dae6014019dae7970000');
INSERT INTO `book` VALUES ('402874814019dae6014019dae7d50002', 'Java宝典3', '50', '402874814019dae6014019dae7970000');
INSERT INTO `book` VALUES ('402874814019dae6014019dae7d50003', 'Java宝典2', '50', '402874814019dae6014019dae7970000');
INSERT INTO `book` VALUES ('402874814019dae6014019dae7d50004', 'Java宝典1', '50', '402874814019dae6014019dae7970000');
INSERT INTO `book` VALUES ('402874814019dc72014019dc73740001', 'Java宝典2', '50', '402874814019dc72014019dc73640000');
INSERT INTO `book` VALUES ('402874814019dc72014019dc73740002', 'Java宝典1', '50', '402874814019dc72014019dc73640000');
INSERT INTO `book` VALUES ('402874814019dc72014019dc73740003', 'Java宝典0', '50', '402874814019dc72014019dc73640000');
INSERT INTO `book` VALUES ('402874814019dc72014019dc73740004', 'Java宝典3', '50', '402874814019dc72014019dc73640000');
