-- MySQL dump 10.13  Distrib 5.7.16, for osx10.11 (x86_64)
--
-- Host: localhost    Database: yedata
-- ------------------------------------------------------
-- Server version	5.7.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Attr`
--

DROP TABLE IF EXISTS `Attr`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Attr` (
  `id` bigint(20) NOT NULL,
  `attr_name` varchar(255) DEFAULT NULL,
  `attr_of_total` varchar(255) DEFAULT NULL,
  `attr_value` varchar(255) DEFAULT NULL,
  `page_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_7cnttjqpb0ekf8h684f2ch4l3` (`page_id`),
  CONSTRAINT `FK_7cnttjqpb0ekf8h684f2ch4l3` FOREIGN KEY (`page_id`) REFERENCES `Page` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Country`
--

DROP TABLE IF EXISTS `Country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Country` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `state_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_7rxh47ilhiyvy38g09uqniovq` (`state_id`),
  CONSTRAINT `FK_7rxh47ilhiyvy38g09uqniovq` FOREIGN KEY (`state_id`) REFERENCES `State` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `DataPiece`
--

DROP TABLE IF EXISTS `DataPiece`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DataPiece` (
  `id` bigint(20) NOT NULL,
  `businessall_id` bigint(20) DEFAULT NULL,
  `businessnoncommercial_id` bigint(20) DEFAULT NULL,
  `businessnonresident_id` bigint(20) DEFAULT NULL,
  `businessresident_id` bigint(20) DEFAULT NULL,
  `country_id` bigint(20) DEFAULT NULL,
  `gained_id` bigint(20) DEFAULT NULL,
  `jobs_id` bigint(20) DEFAULT NULL,
  `lost_id` bigint(20) DEFAULT NULL,
  `msa_id` bigint(20) DEFAULT NULL,
  `netchange_id` bigint(20) DEFAULT NULL,
  `saleall_id` bigint(20) DEFAULT NULL,
  `salesperbusiness_id` bigint(20) DEFAULT NULL,
  `salesperemployee_id` bigint(20) DEFAULT NULL,
  `state_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_bhkx90x8qtpwh5okoy320ckhp` (`businessall_id`),
  KEY `FK_lrw3xm69ffl2748b2jgcj50j3` (`businessnoncommercial_id`),
  KEY `FK_5pfbfc5sxfvv72jm2qyxkchky` (`businessnonresident_id`),
  KEY `FK_ab7byk1xt1m065l3eeoyq2lhk` (`businessresident_id`),
  KEY `FK_qbswmfs792jau1g6j9tqgafg3` (`country_id`),
  KEY `FK_8gqd6ug2b1teyu034f25b0b1o` (`gained_id`),
  KEY `FK_71hnya4psedgwtqh0e66v7ujr` (`jobs_id`),
  KEY `FK_psavqp1ns68nn9c677a8u37oi` (`lost_id`),
  KEY `FK_6skwas3e3d9kne5r8umpofmm2` (`msa_id`),
  KEY `FK_t67vwxru0nkse40g9jckxw7e1` (`netchange_id`),
  KEY `FK_ooqrfk1epg94c1ftqaq6kj4fl` (`saleall_id`),
  KEY `FK_f6axw9o5xhoveufwinsk7gm1j` (`salesperbusiness_id`),
  KEY `FK_n91j4q2abpyo6w3u59qna4gml` (`salesperemployee_id`),
  KEY `FK_iyyn4x40y861ca51u59s2q7ms` (`state_id`),
  CONSTRAINT `FK_5pfbfc5sxfvv72jm2qyxkchky` FOREIGN KEY (`businessnonresident_id`) REFERENCES `Page` (`id`),
  CONSTRAINT `FK_6skwas3e3d9kne5r8umpofmm2` FOREIGN KEY (`msa_id`) REFERENCES `MSA` (`id`),
  CONSTRAINT `FK_71hnya4psedgwtqh0e66v7ujr` FOREIGN KEY (`jobs_id`) REFERENCES `Page` (`id`),
  CONSTRAINT `FK_8gqd6ug2b1teyu034f25b0b1o` FOREIGN KEY (`gained_id`) REFERENCES `Page` (`id`),
  CONSTRAINT `FK_ab7byk1xt1m065l3eeoyq2lhk` FOREIGN KEY (`businessresident_id`) REFERENCES `Page` (`id`),
  CONSTRAINT `FK_bhkx90x8qtpwh5okoy320ckhp` FOREIGN KEY (`businessall_id`) REFERENCES `Page` (`id`),
  CONSTRAINT `FK_f6axw9o5xhoveufwinsk7gm1j` FOREIGN KEY (`salesperbusiness_id`) REFERENCES `Page` (`id`),
  CONSTRAINT `FK_iyyn4x40y861ca51u59s2q7ms` FOREIGN KEY (`state_id`) REFERENCES `State` (`id`),
  CONSTRAINT `FK_lrw3xm69ffl2748b2jgcj50j3` FOREIGN KEY (`businessnoncommercial_id`) REFERENCES `Page` (`id`),
  CONSTRAINT `FK_n91j4q2abpyo6w3u59qna4gml` FOREIGN KEY (`salesperemployee_id`) REFERENCES `Page` (`id`),
  CONSTRAINT `FK_ooqrfk1epg94c1ftqaq6kj4fl` FOREIGN KEY (`saleall_id`) REFERENCES `Page` (`id`),
  CONSTRAINT `FK_psavqp1ns68nn9c677a8u37oi` FOREIGN KEY (`lost_id`) REFERENCES `Page` (`id`),
  CONSTRAINT `FK_qbswmfs792jau1g6j9tqgafg3` FOREIGN KEY (`country_id`) REFERENCES `Country` (`id`),
  CONSTRAINT `FK_t67vwxru0nkse40g9jckxw7e1` FOREIGN KEY (`netchange_id`) REFERENCES `Page` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `MSA`
--

DROP TABLE IF EXISTS `MSA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MSA` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `state_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_57n4jwy1sckh6h001bojai9jy` (`state_id`),
  CONSTRAINT `FK_57n4jwy1sckh6h001bojai9jy` FOREIGN KEY (`state_id`) REFERENCES `State` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Page`
--

DROP TABLE IF EXISTS `Page`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Page` (
  `id` bigint(20) NOT NULL,
  `keywords` varchar(255) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `year` int(11) NOT NULL,
  `data_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_77g9krnwt5vpbe3dbhwjh3ybg` (`data_id`),
  CONSTRAINT `FK_77g9krnwt5vpbe3dbhwjh3ybg` FOREIGN KEY (`data_id`) REFERENCES `DataPiece` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `State`
--

DROP TABLE IF EXISTS `State`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `State` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-08 23:51:09
