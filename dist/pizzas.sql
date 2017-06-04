-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pizzas
-- ------------------------------------------------------
-- Server version	5.6.26-log

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
-- Table structure for table `pizzas`
--

DROP TABLE IF EXISTS `pizzas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pizzas` (
  `idpizzas` int(11) NOT NULL,
  `especialidad` varchar(45) NOT NULL,
  `Precio` double NOT NULL,
  `Disponibles` int(11) NOT NULL,
  PRIMARY KEY (`idpizzas`,`especialidad`,`Precio`,`Disponibles`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pizzas`
--

LOCK TABLES `pizzas` WRITE;
/*!40000 ALTER TABLE `pizzas` DISABLE KEYS */;
INSERT INTO `pizzas` VALUES (1,'Hawaiana',59.5,4),(2,'Peperoni',89,7),(3,'mariscos',89,2),(4,'Especial',75,2),(5,'kokoro',14,2);
/*!40000 ALTER TABLE `pizzas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ventas` (
  `idventa` int(11) NOT NULL AUTO_INCREMENT,
  `cantidades` int(11) DEFAULT NULL,
  `especialidad` varchar(45) DEFAULT NULL,
  `Precio_Unitario` double DEFAULT NULL,
  `Total_Venta` double DEFAULT NULL,
  PRIMARY KEY (`idventa`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,3,'Hawaiana',0.2,5.6),(2,2,'Peperoni',19,38),(3,2,'Peperoni',19,38),(4,2,'Peperoni',19,38),(5,5,'Esp',30.5,152.5),(6,5,'Esp',30.5,152.5),(7,5,'Esp',30.5,152.5),(8,5,'Esp',30.5,152.5),(9,5,'Esp',30.5,152.5),(10,5,'Esp',30.5,152.5),(11,5,'Esp',30.5,152.5),(12,5,'Esp',30.5,152.5),(13,5,'Esp',30.5,152.5),(14,5,'Esp',30.5,152.5),(15,5,'Esp',30.5,152.5),(16,5,'Esp',30.5,152.5),(17,5,'Esp',30.5,152.5),(18,5,'Esp',30.5,152.5),(19,5,'Esp',30.5,152.5),(20,1,'mariscos',3.5,3.5),(21,1,'Especial',3.5,3.5),(22,1,'Especial',3.5,3.5),(23,1,'Hawaiana',3.5,3.5),(24,1,'Hawaiana',3.5,3.5),(25,1,'Hawaiana',3.5,3.5),(26,1,'mariscos',3.5,3.5),(27,0,'Hawaiana',3.5,0),(28,0,'mariscos',3.5,0),(29,4,'Especial',3.5,14),(30,3,'Hawaiana',59.5,178.5),(31,3,'Hawaiana',59.5,178.5),(32,3,'mariscos',89,267),(33,2,'Especial',75,150),(34,3,'mariscos',89,267),(35,3,'Peperoni',89,267),(36,3,'Peperoni',89,267),(37,3,'Hawaiana',59.5,178.5);
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-03 23:19:50
