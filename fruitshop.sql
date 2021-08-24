/*
SQLyog Professional v12.08 (64 bit)
MySQL - 5.7.34-log : Database - fruitshop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fruitshop` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fruitshop`;

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `sex` varchar(50) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telephone` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

insert  into `customer`(`id`,`name`,`sex`,`age`,`email`,`telephone`) values (2,'白莎玲','女',22,'234@qq.com','16479084567'),(3,'杨爱玲','女',21,'213@qq.com','15784590456'),(4,'曹诗怡','女',21,'245@qq.com','16903567906'),(5,'华成玉','男',34,'246@qq.com','14356278901'),(6,'刘海燕','女',34,'678@qq.com','13569034567'),(7,'张涛','男',28,'360@qq.com','14672356900'),(8,'刘飞燕','男',34,'470@qq.com','13246579087'),(9,'张飞飞','男',36,'350@qq.com','14765377600'),(10,'刘端端','男',38,'540@qq.com','13528079655');

/*Table structure for table `customerhistory` */

DROP TABLE IF EXISTS `customerhistory`;

CREATE TABLE `customerhistory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createTime` datetime NOT NULL,
  `goodsName` varchar(50) NOT NULL,
  `goodsPrice` float NOT NULL,
  `withCustomer` varchar(50) NOT NULL,
  `isPay` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `customerhistory` */

insert  into `customerhistory`(`id`,`createTime`,`goodsName`,`goodsPrice`,`withCustomer`,`isPay`) values (1,'2021-08-20 15:46:15','葡萄',4.58,'杨爱玲',1),(2,'2021-08-20 15:53:58','苹果',3.45,'刘端端',0),(3,'2021-08-20 15:54:15','青提',4.67,'张飞飞',1),(4,'2021-08-20 15:54:32','水蜜桃',2.12,'刘飞燕',1),(5,'2021-08-20 15:54:58','香蕉',3.14,'张涛',0),(6,'2021-08-20 15:57:56','西瓜',0.98,'刘海燕',1),(7,'2021-08-20 15:58:15','梨',2.13,'华成玉',0),(8,'2021-08-20 15:58:38','草莓',5.61,'曹诗怡',1),(9,'2021-08-20 15:58:59','菠萝',2.12,'白莎玲',0),(10,'2021-08-20 16:00:06','橘子',2.31,'刘端端',1),(11,'2021-08-20 16:00:54','猕猴桃',3.54,'杨爱玲',1),(12,'2021-08-20 16:01:43','柿子',2.34,'张飞飞',0),(13,'2021-08-20 16:02:09','火龙果',3.21,'刘海燕',1),(14,'2021-08-20 16:03:00','石榴',1.32,'华成玉',0),(15,'2021-08-20 16:04:02','鲜枣',3.45,'杨爱玲',1);

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `remaining` int(11) NOT NULL,
  `price` float NOT NULL,
  `cost` float NOT NULL,
  `repository` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `goods` */

insert  into `goods`(`id`,`name`,`remaining`,`price`,`cost`,`repository`) values (1,'苹果',20000,3.45,2.31,'仓库1'),(2,'葡萄',3000,4.58,2.89,'仓库1'),(3,'青提',3000,4.67,2.99,'仓库1'),(4,'水蜜桃',5000,2.12,1.32,'仓库1'),(5,'香蕉',6000,3.14,1.98,'仓库2'),(6,'西瓜',8000,0.98,0.54,'仓库2'),(7,'梨',8000,2.13,1.23,'仓库2'),(8,'草莓',2000,5.61,3.67,'仓库2'),(9,'菠萝',10000,2.12,1.12,'仓库3'),(10,'橘子',11000,2.31,1.27,'仓库3'),(11,'猕猴桃',2000,4.52,3.53,'仓库3'),(12,'柿子',3000,3.54,2.65,'仓库3'),(13,'火龙果',4000,2.34,1.56,'仓库4'),(14,'石榴',6000,3.21,2,'仓库4'),(15,'鲜枣',5000,1.32,1.01,'仓库4');

/*Table structure for table `intorecord` */

DROP TABLE IF EXISTS `intorecord`;

CREATE TABLE `intorecord` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` datetime NOT NULL,
  `name` varchar(50) NOT NULL,
  `weight` float NOT NULL,
  `handler` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `intorecord` */

insert  into `intorecord`(`id`,`time`,`name`,`weight`,`handler`) values (1,'2021-08-12 18:59:51','苹果',20000,'刘三丰'),(2,'2021-08-17 19:08:14','葡萄',3000,'华天宇'),(3,'2021-08-03 19:09:20','青提',3000,'金庆军'),(4,'2021-08-11 19:09:50','水蜜桃',5000,'白杰'),(5,'2021-09-01 19:10:08','香蕉',6000,'于磊'),(6,'2021-08-13 19:11:10','西瓜',8000,'黄柳红'),(7,'2021-08-15 19:11:27','梨',8000,'刘志华'),(8,'2021-08-15 19:11:52','草莓',2000,'张天福'),(9,'2021-08-02 19:12:53','菠萝',10000,'白杰'),(10,'2021-08-17 19:13:11','橘子',11000,'于磊'),(11,'2021-08-13 19:13:32','猕猴桃',2000,'张天福'),(12,'2021-08-02 19:14:14','柿子',3000,'黄柳红'),(13,'2021-08-03 19:14:40','火龙果',4000,'刘志华'),(14,'2021-08-04 19:15:12','石榴',6000,'张天福'),(15,'2021-08-07 19:15:35','鲜枣',5000,'金庆军');

/*Table structure for table `mainmenu` */

DROP TABLE IF EXISTS `mainmenu`;

CREATE TABLE `mainmenu` (
  `id` int(11) NOT NULL,
  `menuName` varchar(50) NOT NULL,
  `path` varchar(50) NOT NULL,
  `photo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `mainmenu` */

insert  into `mainmenu`(`id`,`menuName`,`path`,`photo`) values (100,'客户管理','/customer','iconfont icon-lujingbeifen2'),(200,'财务管理','/finance','iconfont icon-caiwu'),(300,'货物管理','/storehouse','iconfont icon-huowu'),(400,'销售管理','/sale','iconfont icon-xiaoshou'),(500,'用户管理','/user','iconfont icon-user'),(600,'商品管理','/goods','iconfont icon-shangpin1');

/*Table structure for table `mainmenu_role` */

DROP TABLE IF EXISTS `mainmenu_role`;

CREATE TABLE `mainmenu_role` (
  `mainmenuId` int(11) NOT NULL,
  `roleId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `mainmenu_role` */

insert  into `mainmenu_role`(`mainmenuId`,`roleId`) values (100,1),(200,1),(300,1),(400,1),(500,1),(600,1),(300,2),(400,2),(600,2);

/*Table structure for table `repositoryadmin` */

DROP TABLE IF EXISTS `repositoryadmin`;

CREATE TABLE `repositoryadmin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `repository` varchar(50) NOT NULL,
  `telephone` varchar(50) NOT NULL,
  `isWork` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `repositoryadmin` */

insert  into `repositoryadmin`(`id`,`name`,`repository`,`telephone`,`isWork`) values (1,'刘三丰','仓库1','15687367901',1),(2,'华天宇','仓库2','14358756431',1),(3,'金庆军','仓库3','12464328011',1),(4,'白杰','仓库2','13526700988',1),(5,'于磊','仓库4','17654378901',0),(6,'黄柳红','仓库1','16578907654',1),(7,'刘志华','仓库4','17545670983',1),(9,'张天福','仓库3','16532453212',0);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(50) NOT NULL,
  `roleMemo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`roleName`,`roleMemo`) values (1,'ROLE_ADMIN','管理员'),(2,'ROLE_NORMAL','普通用户'),(3,'ROLE_READ','游客');

/*Table structure for table `salerecord` */

DROP TABLE IF EXISTS `salerecord`;

CREATE TABLE `salerecord` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `saleTime` datetime NOT NULL,
  `saleGoods` varchar(50) NOT NULL,
  `saleWeight` float NOT NULL,
  `salePrice` float NOT NULL,
  `salesPerson` varchar(50) NOT NULL,
  `money` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `salerecord` */

insert  into `salerecord`(`id`,`saleTime`,`saleGoods`,`saleWeight`,`salePrice`,`salesPerson`,`money`) values (1,'2021-08-20 15:46:15','葡萄',58,4.58,'张飒',265.64),(2,'2021-08-20 15:53:58','苹果',200,3.45,'李壮',690),(3,'2021-08-20 15:54:15','青提',246,4.67,'张飒',1148.82),(4,'2021-08-20 15:54:32','水蜜桃',467,2.12,'刘宁',990.04),(5,'2021-08-20 15:54:58','香蕉',357,3.14,'白轩',1120.98),(6,'2021-08-20 15:57:56','西瓜',980,0.98,'白轩',960.4),(7,'2021-08-20 15:58:15','梨',321,2.13,'刘宁',683.73),(8,'2021-08-20 15:58:38','草莓',467,5.61,'李壮',2619.87),(9,'2021-08-20 15:58:59','菠萝',590,2.12,'李壮',1250.8),(10,'2021-08-20 16:00:06','橘子',238,2.31,'张飒',549.78),(11,'2021-08-20 16:00:54','猕猴桃',547,3.54,'李壮',1936.38),(12,'2021-08-20 16:01:43','柿子',470,2.34,'刘宁',1099.8),(13,'2021-08-20 16:02:09','火龙果',120,3.21,'白轩',385.2),(14,'2021-08-20 16:03:00','石榴',400,1.32,'张飒',528),(15,'2021-08-20 16:04:02','鲜枣',670,3.45,'刘宁',2311.5),(17,'2021-08-22 13:31:14','梨',179,2.31,'张飒',413.49),(18,'2021-08-21 13:37:32','葡萄',88,4.58,'白轩',400.4);

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

CREATE TABLE `stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `lng` float DEFAULT NULL,
  `lat` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `stock` */

insert  into `stock`(`id`,`name`,`address`,`lng`,`lat`) values (1,'仓库1','七星湖公园',114.895,32.0117),(2,'仓库2','新西亚商场',114.923,32.003),(3,'仓库3','司马光东路',114.934,32.0123),(4,'仓库4','百泰公馆',114.928,32.0247);

/*Table structure for table `submenu` */

DROP TABLE IF EXISTS `submenu`;

CREATE TABLE `submenu` (
  `id` int(11) NOT NULL,
  `menuName` varchar(50) NOT NULL,
  `path` varchar(50) NOT NULL,
  `mid` int(11) NOT NULL,
  `photo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `submenu` */

insert  into `submenu`(`id`,`menuName`,`path`,`mid`,`photo`) values (101,'客户信息管理','/customermessage',100,'iconfont icon-kehuxinxi'),(102,'客户交易记录','/customerhistory',100,'iconfont icon-jiaoyijilu'),(201,'今日收支','/daliycost',200,'iconfont icon-shouzhimingxi'),(202,'外欠情况','/debt',200,'iconfont icon-shouzhicun'),(203,'数据可视化','/costdata',200,'iconfont icon-yunliankeji-'),(301,'仓库存货','/stock',300,'iconfont icon-cangku'),(302,'货物分布','/distributed',300,'iconfont icon-fenbu'),(303,'进出库记录','/intorecord',300,'iconfont icon-jilu1'),(304,'仓库管理员','/stockmanager',300,'iconfont icon-guanliyuan'),(401,'商品销售记录','/salerecord',400,'iconfont icon-jilu'),(501,'用户信息管理','/usermessage',500,'iconfont icon-4-06'),(502,'用户权限管理','/authoritymanage',500,'iconfont icon-Group-'),(601,'商品信息管理','/goodsmessage',600,'iconfont icon-xinxi'),(602,'商品售卖情况','/salemessage',600,'iconfont icon-ziyuan85'),(603,'分析商品数据','/goodsdata',600,'iconfont icon-shuju');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL,
  `passWord` varchar(255) NOT NULL,
  `isEnable` int(11) NOT NULL DEFAULT '1',
  `isLock` int(11) NOT NULL DEFAULT '1',
  `isCredentials` int(11) NOT NULL DEFAULT '1',
  `isExpired` int(11) NOT NULL DEFAULT '1',
  `createTime` datetime DEFAULT NULL,
  `loginTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`userName`,`passWord`,`isEnable`,`isLock`,`isCredentials`,`isExpired`,`createTime`,`loginTime`) values (2,'Rose','$2a$10$V.D05CWOv.zpjGPBzTc0U.7jZIhrZr5VX8Vs6w1QilAo4XgvIaihq',1,1,1,1,'2021-08-17 12:41:22','2021-08-17 12:41:22'),(3,'Jack','$2a$10$tpKdf5OG/D8zLtD.RFu6S.cgTe4hPtX/cMb0Mft8BvVeuMJO7l8Re',1,1,1,1,'2021-08-17 12:42:36','2021-08-17 12:42:36'),(4,'Tom','$2a$10$rNnOvUWxhiC9NJ1BZOLnWeKMdzAq230aEYvVdCURwvdTfHihCba3.',1,1,1,1,'2021-08-17 12:43:44','2021-08-17 12:43:44');

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `userId` int(11) NOT NULL,
  `roleId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

insert  into `user_role`(`userId`,`roleId`) values (2,1),(3,2),(4,3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
