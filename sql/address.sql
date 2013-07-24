/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2013-07-24 17:13:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `address`
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `addressId` int(50) NOT NULL auto_increment,
  `detail` varchar(50) NOT NULL,
  PRIMARY KEY  (`addressId`),
  CONSTRAINT `id` FOREIGN KEY (`addressId`) REFERENCES `person` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------
