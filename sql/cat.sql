/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2013-07-31 17:10:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cat`
-- ----------------------------
DROP TABLE IF EXISTS `cat`;
CREATE TABLE `cat` (
  `id` int(50) NOT NULL auto_increment,
  `name` varchar(50) default NULL,
  `color` varchar(50) default NULL,
  `size` varchar(50) default NULL,
  `age` int(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cat
-- ----------------------------
INSERT INTO `cat` VALUES ('1', 'Kitty', 'red', 'big', null);
INSERT INTO `cat` VALUES ('2', 'Lufy', 'black', 'small', null);
INSERT INTO `cat` VALUES ('3', 'Koo', 'yellow', 'big', null);
INSERT INTO `cat` VALUES ('4', 'Wendy', 'black', 'small', null);
INSERT INTO `cat` VALUES ('5', 'Wen', 'white', 'small', null);
INSERT INTO `cat` VALUES ('6', 'Kooky', 'purple', 'big', null);
INSERT INTO `cat` VALUES ('7', 'Ken', 'fuchsia', 'small', null);
INSERT INTO `cat` VALUES ('8', 'Kin', 'maroon', 'small', null);
INSERT INTO `cat` VALUES ('9', 'Aaron', 'forestgreen', 'big', null);
INSERT INTO `cat` VALUES ('10', 'Abbott', 'lightblue', 'small', null);
INSERT INTO `cat` VALUES ('11', 'Abel', 'lightgreen', 'big', null);
INSERT INTO `cat` VALUES ('12', 'Abner', 'Pink', 'small', null);
INSERT INTO `cat` VALUES ('13', 'Abraham', 'powderblue', 'big', null);
INSERT INTO `cat` VALUES ('14', 'Adair', 'tan', 'small', null);
INSERT INTO `cat` VALUES ('15', 'Adam', 'tomato', 'big', null);
INSERT INTO `cat` VALUES ('16', 'Addison', 'turquoise', 'small', '1');
INSERT INTO `cat` VALUES ('17', 'Adolph', 'violet', 'big', '2');
INSERT INTO `cat` VALUES ('18', 'Adonis', 'skyblue', 'small', '1');
INSERT INTO `cat` VALUES ('19', 'Adrian', 'peachpuff', 'big', '2');
INSERT INTO `cat` VALUES ('20', 'Ahern', 'mediumorchid', 'small', '3');
INSERT INTO `cat` VALUES ('21', 'Alan', 'limegreen', 'big', '1');
INSERT INTO `cat` VALUES ('22', 'Albert', 'darkviolet', 'small', '3');
INSERT INTO `cat` VALUES ('23', 'King', 'darkturquoise', 'big', '4');
INSERT INTO `cat` VALUES ('24', 'Kirk', 'darkorange', 'small', '5');
INSERT INTO `cat` VALUES ('25', 'Lawrence', 'darkkhaki', 'big', '7');
INSERT INTO `cat` VALUES ('26', 'Leif', 'black', 'small', '2');
INSERT INTO `cat` VALUES ('27', 'Keith', 'black', 'big', '1');
INSERT INTO `cat` VALUES ('28', 'Julius', 'black', 'small', '1');
INSERT INTO `cat` VALUES ('29', 'Len', 'black', 'big', '2');
INSERT INTO `cat` VALUES ('30', 'Lennon', 'black', 'small', '1');
INSERT INTO `cat` VALUES ('31', 'Leo', 'black', 'big', '2');
INSERT INTO `cat` VALUES ('32', 'Leonard', 'black', 'small', '3');
INSERT INTO `cat` VALUES ('33', 'Leopold', 'black', 'big', '4');
INSERT INTO `cat` VALUES ('34', 'Les', 'black', 'small', '5');
INSERT INTO `cat` VALUES ('35', 'Lester', 'black', 'big', '2');
INSERT INTO `cat` VALUES ('36', 'Levi', 'black', 'small', '2');
INSERT INTO `cat` VALUES ('37', 'Lewis', 'black', 'big', '2');
INSERT INTO `cat` VALUES ('38', 'Lionel', 'black', 'small', '2');
INSERT INTO `cat` VALUES ('39', 'Lou', 'black', 'big', '1');
INSERT INTO `cat` VALUES ('40', 'Louis', 'black', 'small', '1');
INSERT INTO `cat` VALUES ('41', 'Lucien', 'black', 'big', '1');
INSERT INTO `cat` VALUES ('42', 'Luther', 'black', 'small', '3');
INSERT INTO `cat` VALUES ('43', 'Lyle', 'black', 'big', '3');
INSERT INTO `cat` VALUES ('44', 'Ges', 'black', 'small', '3');
INSERT INTO `cat` VALUES ('45', 'Gester', 'black', 'big', '2');
INSERT INTO `cat` VALUES ('46', 'Gevi', 'black', 'small', '2');
INSERT INTO `cat` VALUES ('47', 'Gewis', 'black', 'big', '2');
INSERT INTO `cat` VALUES ('48', 'Gionel', 'black', 'small', '1');
INSERT INTO `cat` VALUES ('49', 'Gou', 'black', 'big', '2');
INSERT INTO `cat` VALUES ('50', 'Gouis', 'black', 'small', '1');
INSERT INTO `cat` VALUES ('51', 'Hucien', 'black', 'big', '2');
INSERT INTO `cat` VALUES ('52', 'Huther', 'black', 'small', '3');
INSERT INTO `cat` VALUES ('53', 'Hyle', 'black', 'big', '1');
