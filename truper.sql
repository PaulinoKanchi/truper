/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100113
 Source Host           : localhost:3306
 Source Schema         : truper

 Target Server Type    : MySQL
 Target Server Version : 100113
 File Encoding         : 65001

 Date: 03/07/2023 10:59:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ordenes
-- ----------------------------
DROP TABLE IF EXISTS `ordenes`;
CREATE TABLE `ordenes`  (
  `ordenid` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` datetime(0) NOT NULL,
  `total` double NOT NULL,
  `sucursal_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ordenid`) USING BTREE,
  INDEX `FKcagb71w4p19vrtribcf3lt3mg`(`sucursal_id`) USING BTREE,
  CONSTRAINT `FKcagb71w4p19vrtribcf3lt3mg` FOREIGN KEY (`sucursal_id`) REFERENCES `sucursales` (`sucursal_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ordenes
-- ----------------------------
INSERT INTO `ordenes` VALUES (1, '0000-00-00 00:00:00', 725.5, 50);
INSERT INTO `ordenes` VALUES (2, '0000-00-00 00:00:00', 150, 1);

-- ----------------------------
-- Table structure for productos
-- ----------------------------
DROP TABLE IF EXISTS `productos`;
CREATE TABLE `productos`  (
  `productos_id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `descripcion` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `precio` double NOT NULL,
  `orden_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`productos_id`) USING BTREE,
  INDEX `FKsqd8oh6dkrkvr6ngia1vwcw54`(`orden_id`) USING BTREE,
  CONSTRAINT `FKsqd8oh6dkrkvr6ngia1vwcw54` FOREIGN KEY (`orden_id`) REFERENCES `ordenes` (`ordenid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of productos
-- ----------------------------
INSERT INTO `productos` VALUES (1, '18156', 'Esmeriadora angular', 625, 1);
INSERT INTO `productos` VALUES (2, '17193', 'Pala Redonda', 100.5, 1);
INSERT INTO `productos` VALUES (3, '12345', 'Martillo', 150, 2);

-- ----------------------------
-- Table structure for sucursales
-- ----------------------------
DROP TABLE IF EXISTS `sucursales`;
CREATE TABLE `sucursales`  (
  `sucursal_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`sucursal_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 51 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sucursales
-- ----------------------------
INSERT INTO `sucursales` VALUES (1, 'CDMX');
INSERT INTO `sucursales` VALUES (50, 'Sonora');

SET FOREIGN_KEY_CHECKS = 1;
