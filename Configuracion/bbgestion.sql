-- MySQL dump 10.13  Distrib 5.1.73, for Win32 (ia32)
--
-- Host: localhost    Database: bbgestion
-- ------------------------------------------------------
-- Server version	5.1.73-community

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
-- Table structure for table `articulos`
--

DROP TABLE IF EXISTS `articulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `articulos` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BARRAS` varchar(30) DEFAULT NULL,
  `NOMBRE` varchar(49) DEFAULT NULL,
  `SERVICIO` double DEFAULT NULL,
  `COSTO` double DEFAULT NULL,
  `PRECIO` double DEFAULT NULL,
  `MINIMO` int(11) DEFAULT NULL,
  `STOCK` int(11) DEFAULT NULL,
  `PROVEEDOR` int(11) DEFAULT NULL,
  `RUBRON` varchar(12) DEFAULT NULL,
  `ALTA` varchar(19) DEFAULT NULL,
  `INHABILITADO` int(11) NOT NULL DEFAULT '0',
  `idRubro` int(11) NOT NULL DEFAULT '1',
  `equivalencia` double NOT NULL DEFAULT '1',
  `modificaPrecio` int(11) NOT NULL DEFAULT '0',
  `modificaServicio` int(11) NOT NULL DEFAULT '0',
  `recargo` double NOT NULL DEFAULT '0',
  `servicio1` double DEFAULT '0',
  `idcombo` int(11) DEFAULT '0',
  `actualizacion` int(11) NOT NULL DEFAULT '0',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `dolar` double NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articulos`
--

LOCK TABLES `articulos` WRITE;
/*!40000 ALTER TABLE `articulos` DISABLE KEYS */;
INSERT INTO `articulos` VALUES (1,'1','PRUEBA1',0.1,0,1,NULL,NULL,NULL,NULL,NULL,0,1,1,0,0,1,0.1,0,3,'2017-06-09 23:37:08',1);
/*!40000 ALTER TABLE `articulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `billetes`
--

DROP TABLE IF EXISTS `billetes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `billetes` (
  `id` int(11) NOT NULL DEFAULT '0',
  `descripcion` varchar(30) NOT NULL DEFAULT '',
  `valor` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billetes`
--

LOCK TABLES `billetes` WRITE;
/*!40000 ALTER TABLE `billetes` DISABLE KEYS */;
/*!40000 ALTER TABLE `billetes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `caja`
--

DROP TABLE IF EXISTS `caja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `caja` (
  `numero` bigint(11) NOT NULL DEFAULT '0',
  `numeroSucursal` int(11) NOT NULL DEFAULT '0',
  `numeroUsuario` int(11) NOT NULL DEFAULT '0',
  `tipoMovimiento` int(11) NOT NULL DEFAULT '0',
  `saldoinicial` double NOT NULL DEFAULT '0',
  `estado` int(11) NOT NULL DEFAULT '0',
  `tipo` int(11) NOT NULL DEFAULT '0',
  `saldofinal` double DEFAULT NULL,
  `fechacierre` varchar(30) DEFAULT NULL,
  `diferencia` double DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caja`
--

LOCK TABLES `caja` WRITE;
/*!40000 ALTER TABLE `caja` DISABLE KEYS */;
INSERT INTO `caja` VALUES (1,1,1,9,0,0,1,NULL,NULL,NULL,'2017-06-03 20:48:46');
/*!40000 ALTER TABLE `caja` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coeficienteslistas`
--

DROP TABLE IF EXISTS `coeficienteslistas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coeficienteslistas` (
  `id` int(11) NOT NULL DEFAULT '0',
  `coeficiente` double NOT NULL DEFAULT '0',
  `descripcion` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coeficienteslistas`
--

LOCK TABLES `coeficienteslistas` WRITE;
/*!40000 ALTER TABLE `coeficienteslistas` DISABLE KEYS */;
INSERT INTO `coeficienteslistas` VALUES (1,1,'base');
/*!40000 ALTER TABLE `coeficienteslistas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `combo`
--

DROP TABLE IF EXISTS `combo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `combo` (
  `id` int(11) NOT NULL DEFAULT '0',
  `fecha` date DEFAULT NULL,
  `idarticulo` int(11) NOT NULL DEFAULT '0',
  `cantidad` double DEFAULT NULL,
  `articulopadre` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `combo`
--

LOCK TABLES `combo` WRITE;
/*!40000 ALTER TABLE `combo` DISABLE KEYS */;
/*!40000 ALTER TABLE `combo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comprobantes`
--

DROP TABLE IF EXISTS `comprobantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comprobantes` (
  `numero` int(11) NOT NULL DEFAULT '0',
  `descripcion` varchar(4) NOT NULL DEFAULT '',
  `destinatarioCondicion` int(11) NOT NULL DEFAULT '0',
  `descargaStock` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comprobantes`
--

LOCK TABLES `comprobantes` WRITE;
/*!40000 ALTER TABLE `comprobantes` DISABLE KEYS */;
/*!40000 ALTER TABLE `comprobantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `depositos`
--

DROP TABLE IF EXISTS `depositos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `depositos` (
  `numero` int(11) NOT NULL DEFAULT '0',
  `descripcion` varchar(100) NOT NULL DEFAULT '',
  `direccion` varchar(200) NOT NULL DEFAULT '',
  `telefono` varchar(200) NOT NULL DEFAULT '',
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `depositos`
--

LOCK TABLES `depositos` WRITE;
/*!40000 ALTER TABLE `depositos` DISABLE KEYS */;
INSERT INTO `depositos` VALUES (1,'casa central','lamadradid 2552','4555555');
/*!40000 ALTER TABLE `depositos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallefacturas`
--

DROP TABLE IF EXISTS `detallefacturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detallefacturas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idfactura` int(11) NOT NULL,
  `idarticulo` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `descripcionarticulo` varchar(150) DEFAULT NULL,
  `preciounitario` double NOT NULL,
  `descuento` int(11) NOT NULL,
  `cantidadremitida` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallefacturas`
--

LOCK TABLES `detallefacturas` WRITE;
/*!40000 ALTER TABLE `detallefacturas` DISABLE KEYS */;
INSERT INTO `detallefacturas` VALUES (1,10,1,1,NULL,0.1,0,0),(2,11,1,1,NULL,0.1,0,0),(3,12,1,1,NULL,0.1,0,0),(4,13,1,1,NULL,0.1,0,0),(5,14,1,1,NULL,0.1,0,0),(6,15,1,1,NULL,0.1,0,0),(7,16,1,1,NULL,0.1,0,0),(8,17,1,1,NULL,0.1,0,0),(9,18,1,1,NULL,1,0,0),(10,19,1,1,NULL,1,0,0),(11,20,1,1,NULL,1,0,0),(12,21,1,0,NULL,1,0,0),(13,22,1,0,NULL,1,0,0),(14,23,1,0,NULL,1,0,0),(15,23,1,1,NULL,1,0,0),(16,24,1,1,NULL,1,0,0),(17,25,1,0,NULL,1,0,0),(18,26,1,0,NULL,1,0,0);
/*!40000 ALTER TABLE `detallefacturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturaelectronica`
--

DROP TABLE IF EXISTS `facturaelectronica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facturaelectronica` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cae` varchar(20) DEFAULT NULL,
  `cae_vto` varchar(8) DEFAULT NULL,
  `fecha_cae` varchar(20) DEFAULT NULL,
  `afipqty` varchar(4) DEFAULT NULL,
  `afipplastid` varchar(20) DEFAULT NULL,
  `afipplastcbte` varchar(10) DEFAULT NULL,
  `idfactura` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '0',
  `customerid` varchar(11) DEFAULT NULL,
  `customertypedoc` varchar(2) DEFAULT NULL,
  `tipo_comprobante` varchar(1) DEFAULT NULL,
  `importe_total` varchar(30) DEFAULT NULL,
  `importe_neto` varchar(25) DEFAULT NULL,
  `impto_liq` varchar(25) DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturaelectronica`
--

LOCK TABLES `facturaelectronica` WRITE;
/*!40000 ALTER TABLE `facturaelectronica` DISABLE KEYS */;
INSERT INTO `facturaelectronica` VALUES (1,'67236244649189','20170619','2017-06-09 19:31:47','0','1','1',14,1,1,'22905383','96','6','0.1','0.08264462809917356','0.01735537190082645','2017-06-09 22:31:49'),(2,'67236244743517','20170619','2017-06-09 19:41:53','0','2','2',15,1,1,'22905383','96','6','0.1','0.08264462809917356','0.01735537190082645','2017-06-09 22:41:55'),(3,'67236244780969','20170619','2017-06-09 19:45:22','0','3','3',16,1,1,'22905383','96','6','0.1','0.08264462809917356','0.01735537190082645','2017-06-09 22:45:24'),(4,'67236244794610','20170619','2017-06-09 19:46:53','0','4','4',17,1,1,'22905383','96','6','0.1','0.08264462809917356','0.01735537190082645','2017-06-09 22:46:54'),(5,'67236245175779','20170619','2017-06-09 20:37:45','0','5','5',18,1,1,'22905383','96','6','1.0','0.8264462809917356','0.17355371900826444','2017-06-09 23:37:47'),(6,'67236245453507','20170619','2017-06-09 22:00:24','0','6','6',19,1,1,'22905383','96','6','1.0','0.8264462809917356','0.17355371900826444','2017-06-10 01:00:27'),(7,'67246298044812','20170623','2017-06-13 21:06:08','0','7','7',20,1,1,'22905383','96','6','1.0','0.8264462809917356','0.17355371900826444','2017-06-14 00:06:11'),(8,'67246298054687','20170623','2017-06-13 21:08:36','0','8','8',21,1,1,'22905383','96','6','0.1','0.08264462809917356','0.01735537190082645','2017-06-14 00:08:39'),(9,'67246298065982','20170623','2017-06-13 21:11:41','0','9','9',22,1,1,'22905383','96','6','0.1','0.08264462809917356','0.01735537190082645','2017-06-14 00:11:45'),(10,'67246298067528','20170623','2017-06-13 21:12:05','0','10','10',23,1,1,'22905383','96','6','1.1','0.9090909090909092','0.19090909090909092','2017-06-14 00:12:08'),(11,'67246298076114','20170623','2017-06-13 21:14:43','0','11','11',24,1,1,'22905383','96','6','1.1','0.9090909090909092','0.19090909090909092','2017-06-14 00:14:50'),(12,'67246298083135','20170623','2017-06-13 21:16:36','0','12','12',25,1,1,'22905383','96','6','0.1','0.08264462809917356','0.01735537190082645','2017-06-14 00:16:39'),(13,'67246298112062','20170623','2017-06-13 21:27:48','0','13','13',26,1,1,'22905383','96','6','0.1','0.08264462809917356','0.01735537190082645','2017-06-14 00:27:51');
/*!40000 ALTER TABLE `facturaelectronica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facturas`
--

DROP TABLE IF EXISTS `facturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facturas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idcliente` int(11) NOT NULL DEFAULT '0',
  `total` double NOT NULL DEFAULT '0',
  `tipo` int(11) NOT NULL DEFAULT '0',
  `idusuario` int(11) NOT NULL DEFAULT '0',
  `idpedido` int(11) DEFAULT NULL,
  `idremito` int(11) DEFAULT NULL,
  `numerofactura` varchar(30) NOT NULL DEFAULT ' ',
  `estado` int(11) NOT NULL DEFAULT '0',
  `saldo` double NOT NULL DEFAULT '0',
  `subtotal` double NOT NULL DEFAULT '0',
  `descuento` double NOT NULL DEFAULT '0',
  `porcentajed` double NOT NULL DEFAULT '0',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facturas`
--

LOCK TABLES `facturas` WRITE;
/*!40000 ALTER TABLE `facturas` DISABLE KEYS */;
INSERT INTO `facturas` VALUES (1,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(2,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(3,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(4,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(5,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(6,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(7,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(8,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(9,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(10,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(11,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(12,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(13,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(14,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(15,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(16,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'0000-00-00 00:00:00'),(17,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'2017-06-09 22:46:48'),(18,1,1,1,1,0,0,'0',1,1,1,0,0,'2017-06-09 23:37:37'),(19,1,1,1,1,0,0,'0',1,1,1,0,0,'2017-06-10 01:00:18'),(20,1,1,1,1,0,0,'0',1,1,1,0,0,'2017-06-14 00:05:54'),(21,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'2017-06-14 00:08:26'),(22,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'2017-06-14 00:11:36'),(23,1,1.1,1,1,0,0,'0',1,1.1,1.1,0,0,'2017-06-14 00:12:02'),(24,1,1.1,1,1,0,0,'0',1,1.1,1.1,0,0,'2017-06-14 00:14:20'),(25,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'2017-06-14 00:16:31'),(26,1,0.1,1,1,0,0,'0',1,0.1,0.1,0,0,'2017-06-14 00:27:41');
/*!40000 ALTER TABLE `facturas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fallas`
--

DROP TABLE IF EXISTS `fallas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fallas` (
  `st` text NOT NULL,
  `estado` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fallas`
--

LOCK TABLES `fallas` WRITE;
/*!40000 ALTER TABLE `fallas` DISABLE KEYS */;
/*!40000 ALTER TABLE `fallas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fiscal`
--

DROP TABLE IF EXISTS `fiscal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fiscal` (
  `fecha` varchar(8) NOT NULL DEFAULT '',
  `tipo` varchar(3) NOT NULL DEFAULT '011',
  `pto` varchar(5) NOT NULL DEFAULT '00002',
  `numero` varchar(20) NOT NULL DEFAULT '',
  `gravado` double NOT NULL DEFAULT '0',
  `alicuota` varchar(4) NOT NULL DEFAULT '0005',
  `impuesto` double NOT NULL DEFAULT '0',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `total` double NOT NULL DEFAULT '0',
  `fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `estado` int(11) NOT NULL DEFAULT '0',
  `idcliente` int(11) NOT NULL DEFAULT '1',
  `tipoClienteId` int(11) NOT NULL DEFAULT '99',
  `razon` varchar(30) NOT NULL DEFAULT '',
  `cuit` varchar(20) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `numero_2` (`numero`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fiscal`
--

LOCK TABLES `fiscal` WRITE;
/*!40000 ALTER TABLE `fiscal` DISABLE KEYS */;
INSERT INTO `fiscal` VALUES ('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,1,0.1,'2017-06-09 20:30:21',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,2,0.1,'2017-06-09 20:33:44',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,3,0.1,'2017-06-09 20:37:45',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,4,0.1,'2017-06-09 20:41:29',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,5,0.1,'2017-06-09 20:43:47',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,6,0.1,'2017-06-09 20:50:02',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,7,0.1,'2017-06-09 20:54:09',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,8,0.1,'2017-06-09 21:02:58',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,9,0.1,'2017-06-09 21:17:19',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,10,0.1,'2017-06-09 21:19:47',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,11,0.1,'2017-06-09 22:04:28',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,12,0.1,'2017-06-09 22:21:07',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,13,0.1,'2017-06-09 22:29:51',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,14,0.1,'2017-06-09 22:31:42',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,15,0.1,'2017-06-09 22:41:48',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,16,0.1,'2017-06-09 22:45:16',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,17,0.1,'2017-06-09 22:46:48',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.826446280991736,'0005',0.173553719008264,18,1,'2017-06-09 23:37:37',0,1,80,'CONSUMIDOR FINAL','0'),('20170609','0','00002','1',0.826446280991736,'0005',0.173553719008264,19,1,'2017-06-10 01:00:18',0,1,80,'CONSUMIDOR FINAL','0'),('20170613','0','00002','1',0.826446280991736,'0005',0.173553719008264,20,1,'2017-06-14 00:05:54',0,1,80,'CONSUMIDOR FINAL','0'),('20170613','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,21,0.1,'2017-06-14 00:08:27',0,1,80,'CONSUMIDOR FINAL','0'),('20170613','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,22,0.1,'2017-06-14 00:11:36',0,1,80,'CONSUMIDOR FINAL','0'),('20170613','0','00002','1',0.909090909090909,'0005',0.190909090909091,23,1.1,'2017-06-14 00:12:02',0,1,80,'CONSUMIDOR FINAL','0'),('20170613','0','00002','1',0.909090909090909,'0005',0.190909090909091,24,1.1,'2017-06-14 00:14:21',0,1,80,'CONSUMIDOR FINAL','0'),('20170613','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,25,0.1,'2017-06-14 00:16:31',0,1,80,'CONSUMIDOR FINAL','0'),('20170613','0','00002','1',0.0826446280991736,'0005',0.0173553719008265,26,0.1,'2017-06-14 00:27:41',0,1,80,'CONSUMIDOR FINAL','0');
/*!40000 ALTER TABLE `fiscal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ivaventas`
--

DROP TABLE IF EXISTS `ivaventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ivaventas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comprobante` varchar(4) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `numero` varchar(14) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `cliente` varchar(35) NOT NULL,
  `condicion` varchar(4) NOT NULL,
  `cuit` varchar(11) NOT NULL,
  `neto` varchar(15) NOT NULL,
  `iva` varchar(15) NOT NULL,
  `total` varchar(15) NOT NULL,
  `periodo` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ivaventas`
--

LOCK TABLES `ivaventas` WRITE;
/*!40000 ALTER TABLE `ivaventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `ivaventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listcli`
--

DROP TABLE IF EXISTS `listcli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `listcli` (
  `COD_CLIENT` varchar(6) DEFAULT NULL,
  `RAZON_SOCI` varchar(60) DEFAULT NULL,
  `DOMICILIO` varchar(30) DEFAULT NULL,
  `COND_VTA` int(11) NOT NULL DEFAULT '0',
  `TELEFONO_1` varchar(30) DEFAULT NULL,
  `LISTADEPRECIO` int(11) NOT NULL DEFAULT '0',
  `NUMERODECUIT` varchar(30) DEFAULT NULL,
  `CUPODECREDITO` double DEFAULT NULL,
  `empresa` varchar(3) DEFAULT NULL,
  `codmmd` int(11) NOT NULL DEFAULT '0',
  `saldo` double DEFAULT '0',
  `saldoactual` double DEFAULT '0',
  `TIPO_IVA` int(11) NOT NULL DEFAULT '0',
  `COEFICIENTE` int(11) NOT NULL DEFAULT '1',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `id` (`id`),
  KEY `codmmd` (`codmmd`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listcli`
--

LOCK TABLES `listcli` WRITE;
/*!40000 ALTER TABLE `listcli` DISABLE KEYS */;
INSERT INTO `listcli` VALUES ('999999','CONSUMIDOR FINAL','NN',1,'11',1,'1',0,'sd',1,0,0,1,1,1);
/*!40000 ALTER TABLE `listcli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientosarticulos`
--

DROP TABLE IF EXISTS `movimientosarticulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movimientosarticulos` (
  `tipoMovimiento` int(11) NOT NULL DEFAULT '0',
  `idArticulo` int(11) NOT NULL DEFAULT '0',
  `cantidad` double NOT NULL DEFAULT '0',
  `numeroDeposito` int(11) NOT NULL DEFAULT '0',
  `tipoComprobante` int(11) NOT NULL DEFAULT '0',
  `numeroComprobante` int(11) NOT NULL DEFAULT '0',
  `numeroCliente` int(11) NOT NULL DEFAULT '0',
  `fechaComprobante` varchar(30) NOT NULL DEFAULT '',
  `numeroUsuario` int(11) NOT NULL DEFAULT '0',
  `precioDeCosto` double NOT NULL DEFAULT '0',
  `precioDeVenta` double NOT NULL DEFAULT '0',
  `precioServicio` double NOT NULL DEFAULT '0',
  `estado` int(11) DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `idcaja` bigint(11) DEFAULT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `idcomprobante` int(11) DEFAULT '0',
  `observaciones` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientosarticulos`
--

LOCK TABLES `movimientosarticulos` WRITE;
/*!40000 ALTER TABLE `movimientosarticulos` DISABLE KEYS */;
INSERT INTO `movimientosarticulos` VALUES (1,1,-1,1,1,6,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:27:37',1,1,2,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:30:21',1,2,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:30:21',1,3,4,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:33:43',1,4,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:33:44',1,5,6,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:37:45',1,6,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:37:45',1,7,8,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:41:29',1,8,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:41:29',1,9,10,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:43:46',1,10,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:43:47',1,11,12,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:50:01',1,12,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:50:02',1,13,14,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:54:09',1,14,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 20:54:09',1,15,16,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 21:02:58',1,16,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 21:02:58',1,17,18,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 21:17:18',1,18,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 21:17:19',1,19,20,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 21:19:46',1,20,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 21:19:47',1,21,22,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:04:27',1,22,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:04:28',1,23,24,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:21:07',1,24,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:21:07',1,25,26,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:29:51',1,26,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:29:51',1,27,28,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:31:42',1,28,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:31:42',1,29,30,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:41:47',1,30,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:41:48',1,31,32,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:45:16',1,32,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:45:16',1,33,34,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:46:48',1,34,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,0.1,0,NULL,'2017-06-09 22:46:49',1,35,36,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,1,0,NULL,'2017-06-09 23:37:37',1,36,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,1,0,NULL,'2017-06-09 23:37:37',1,37,38,NULL),(1,1,-1,1,1,0,1,'2017-06-09',1,0,1,0,NULL,'2017-06-10 01:00:18',1,38,0,NULL),(1,1,-1,1,1,1,1,'2017-06-09',1,0,1,0,NULL,'2017-06-10 01:00:18',1,39,40,NULL),(1,1,-1,1,1,0,1,'2017-06-13',1,0,1,0,NULL,'2017-06-14 00:05:54',1,40,0,NULL),(1,1,-1,1,1,1,1,'2017-06-13',1,0,1,0,NULL,'2017-06-14 00:05:54',1,41,42,NULL),(1,1,-0.1,1,1,0,1,'2017-06-13',1,0,0.1,0,NULL,'2017-06-14 00:08:26',1,42,0,NULL),(1,1,-0.1,1,1,1,1,'2017-06-13',1,0,0.1,0,NULL,'2017-06-14 00:08:27',1,43,44,NULL),(1,1,-0.1,1,1,0,1,'2017-06-13',1,0,0.1,0,NULL,'2017-06-14 00:11:36',1,44,0,NULL),(1,1,-0.1,1,1,1,1,'2017-06-13',1,0,0.1,0,NULL,'2017-06-14 00:11:36',1,45,46,NULL),(1,1,-0.1,1,1,0,1,'2017-06-13',1,0,0.1,0,NULL,'2017-06-14 00:12:02',1,46,0,NULL),(1,1,-1,1,1,0,1,'2017-06-13',1,0,1,0,NULL,'2017-06-14 00:12:02',1,47,0,NULL),(1,1,-0.1,1,1,1,1,'2017-06-13',1,0,0.1,0,NULL,'2017-06-14 00:12:02',1,48,48,NULL),(1,1,-1,1,1,1,1,'2017-06-13',1,0,1,0,NULL,'2017-06-14 00:12:02',1,49,48,NULL),(1,1,-1.1,1,1,0,1,'2017-06-13',1,0,1.1,0,NULL,'2017-06-14 00:14:20',1,50,0,NULL),(1,1,-1.1,1,1,1,1,'2017-06-13',1,0,1.1,0,NULL,'2017-06-14 00:14:21',1,51,50,NULL),(1,1,-0.1,1,1,0,1,'2017-06-13',1,0,0.1,0,NULL,'2017-06-14 00:16:31',1,52,0,NULL),(1,1,-0.1,1,1,1,1,'2017-06-13',1,0,0.1,0,NULL,'2017-06-14 00:16:31',1,53,52,NULL),(1,1,-0.1,1,1,0,1,'2017-06-13',1,0,0.1,0,NULL,'2017-06-14 00:27:41',1,54,0,NULL),(1,1,-0.1,1,1,1,1,'2017-06-13',1,0,0.1,0,NULL,'2017-06-14 00:27:41',1,55,54,NULL);
/*!40000 ALTER TABLE `movimientosarticulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientoscaja`
--

DROP TABLE IF EXISTS `movimientoscaja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movimientoscaja` (
  `numeroUsuario` int(11) NOT NULL DEFAULT '0',
  `idCliente` int(11) DEFAULT NULL,
  `numeroSucursal` int(11) NOT NULL DEFAULT '0',
  `numeroComprobante` int(11) NOT NULL DEFAULT '0',
  `tipoComprobante` int(11) NOT NULL DEFAULT '0',
  `monto` double DEFAULT NULL,
  `tipoMovimiento` int(11) NOT NULL DEFAULT '0',
  `idCaja` int(11) NOT NULL DEFAULT '0',
  `cantidad` double DEFAULT NULL,
  `pagado` int(11) NOT NULL DEFAULT '0',
  `observaciones` varchar(100) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `tipoCliente` int(11) DEFAULT NULL,
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `fiscal` int(11) NOT NULL DEFAULT '0',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fecha` (`fecha`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientoscaja`
--

LOCK TABLES `movimientoscaja` WRITE;
/*!40000 ALTER TABLE `movimientoscaja` DISABLE KEYS */;
INSERT INTO `movimientoscaja` VALUES (1,NULL,1,37,0,0,9,1,NULL,0,NULL,NULL,NULL,1,0,'2017-06-03 20:48:46'),(1,1,1,6,1,0.1,1,1,NULL,1,NULL,NULL,1,2,0,'2017-06-09 20:27:36'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,3,0,'2017-06-09 20:30:21'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,4,1,'2017-06-09 20:30:21'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,5,0,'2017-06-09 20:33:43'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,6,1,'2017-06-09 20:33:43'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,7,0,'2017-06-09 20:37:45'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,8,1,'2017-06-09 20:37:45'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,9,0,'2017-06-09 20:41:29'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,10,1,'2017-06-09 20:41:29'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,11,0,'2017-06-09 20:43:47'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,12,1,'2017-06-09 20:43:47'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,13,0,'2017-06-09 20:50:02'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,14,1,'2017-06-09 20:50:02'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,15,0,'2017-06-09 20:54:09'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,16,1,'2017-06-09 20:54:09'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,17,0,'2017-06-09 21:02:58'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,18,1,'2017-06-09 21:02:58'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,19,0,'2017-06-09 21:17:18'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,20,1,'2017-06-09 21:17:19'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,21,0,'2017-06-09 21:19:46'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,22,1,'2017-06-09 21:19:47'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,23,0,'2017-06-09 22:04:27'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,24,1,'2017-06-09 22:04:28'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,25,0,'2017-06-09 22:21:07'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,26,1,'2017-06-09 22:21:07'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,27,0,'2017-06-09 22:29:51'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,28,1,'2017-06-09 22:29:51'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,29,0,'2017-06-09 22:31:42'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,30,1,'2017-06-09 22:31:42'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,31,0,'2017-06-09 22:41:47'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,32,1,'2017-06-09 22:41:48'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,33,0,'2017-06-09 22:45:16'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,34,1,'2017-06-09 22:45:16'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,35,0,'2017-06-09 22:46:48'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,36,1,'2017-06-09 22:46:48'),(1,1,1,0,1,1,1,1,NULL,1,NULL,NULL,1,37,0,'2017-06-09 23:37:37'),(1,1,1,1,0,1,1,1,NULL,1,NULL,NULL,1,38,1,'2017-06-09 23:37:37'),(1,1,1,0,1,1,1,1,NULL,1,NULL,NULL,1,39,0,'2017-06-10 01:00:18'),(1,1,1,1,0,1,1,1,NULL,1,NULL,NULL,1,40,1,'2017-06-10 01:00:18'),(1,1,1,0,1,1,1,1,NULL,1,NULL,NULL,1,41,0,'2017-06-14 00:05:54'),(1,1,1,1,0,1,1,1,NULL,1,NULL,NULL,1,42,1,'2017-06-14 00:05:54'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,43,0,'2017-06-14 00:08:26'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,44,1,'2017-06-14 00:08:27'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,45,0,'2017-06-14 00:11:36'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,46,1,'2017-06-14 00:11:36'),(1,1,1,0,1,1.1,1,1,NULL,1,NULL,NULL,1,47,0,'2017-06-14 00:12:02'),(1,1,1,1,0,1.1,1,1,NULL,1,NULL,NULL,1,48,1,'2017-06-14 00:12:02'),(1,1,1,0,1,1.1,1,1,NULL,1,NULL,NULL,1,49,0,'2017-06-14 00:14:20'),(1,1,1,1,0,1.1,1,1,NULL,1,NULL,NULL,1,50,1,'2017-06-14 00:14:21'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,51,0,'2017-06-14 00:16:31'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,52,1,'2017-06-14 00:16:31'),(1,1,1,0,1,0.1,1,1,NULL,1,NULL,NULL,1,53,0,'2017-06-14 00:27:41'),(1,1,1,1,0,0.1,1,1,NULL,1,NULL,NULL,1,54,1,'2017-06-14 00:27:41');
/*!40000 ALTER TABLE `movimientoscaja` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientosclientes`
--

DROP TABLE IF EXISTS `movimientosclientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movimientosclientes` (
  `numeroProveedor` int(11) NOT NULL DEFAULT '0',
  `monto` double NOT NULL DEFAULT '0',
  `pagado` int(11) DEFAULT NULL,
  `numeroComprobante` int(11) DEFAULT NULL,
  `idRemito` int(11) DEFAULT NULL,
  `idUsuario` int(11) NOT NULL DEFAULT '0',
  `idCaja` int(11) NOT NULL DEFAULT '0',
  `fechaPago` varchar(20) DEFAULT NULL,
  `tipoComprobante` int(11) DEFAULT NULL,
  `idSucursal` int(11) NOT NULL DEFAULT '0',
  `estado` int(11) DEFAULT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `idcomprobante` int(11) DEFAULT '0',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientosclientes`
--

LOCK TABLES `movimientosclientes` WRITE;
/*!40000 ALTER TABLE `movimientosclientes` DISABLE KEYS */;
INSERT INTO `movimientosclientes` VALUES (1,0.1,1,6,NULL,1,1,NULL,1,1,NULL,1,2,'2017-06-09 20:27:37'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,2,0,'2017-06-09 20:30:21'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,3,4,'2017-06-09 20:30:21'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,4,0,'2017-06-09 20:33:43'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,5,6,'2017-06-09 20:33:44'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,6,0,'2017-06-09 20:37:45'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,7,8,'2017-06-09 20:37:46'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,8,0,'2017-06-09 20:41:29'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,9,10,'2017-06-09 20:41:29'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,10,0,'2017-06-09 20:43:47'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,11,12,'2017-06-09 20:43:47'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,12,0,'2017-06-09 20:50:02'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,13,14,'2017-06-09 20:50:02'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,14,0,'2017-06-09 20:54:09'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,15,16,'2017-06-09 20:54:09'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,16,0,'2017-06-09 21:02:58'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,17,18,'2017-06-09 21:02:58'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,18,0,'2017-06-09 21:17:18'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,19,20,'2017-06-09 21:17:19'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,20,0,'2017-06-09 21:19:47'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,21,22,'2017-06-09 21:19:47'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,22,0,'2017-06-09 22:04:28'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,23,24,'2017-06-09 22:04:28'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,24,0,'2017-06-09 22:21:07'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,25,26,'2017-06-09 22:21:07'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,26,0,'2017-06-09 22:29:51'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,27,28,'2017-06-09 22:29:51'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,28,0,'2017-06-09 22:31:42'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,29,30,'2017-06-09 22:31:42'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,30,0,'2017-06-09 22:41:47'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,31,32,'2017-06-09 22:41:48'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,32,0,'2017-06-09 22:45:16'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,33,34,'2017-06-09 22:45:16'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,34,0,'2017-06-09 22:46:48'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,35,36,'2017-06-09 22:46:49'),(1,1,1,0,NULL,1,1,NULL,1,1,NULL,36,0,'2017-06-09 23:37:37'),(1,1,1,1,NULL,1,1,NULL,1,1,NULL,37,38,'2017-06-09 23:37:37'),(1,1,1,0,NULL,1,1,NULL,1,1,NULL,38,0,'2017-06-10 01:00:18'),(1,1,1,1,NULL,1,1,NULL,1,1,NULL,39,40,'2017-06-10 01:00:18'),(1,1,1,0,NULL,1,1,NULL,1,1,NULL,40,0,'2017-06-14 00:05:54'),(1,1,1,1,NULL,1,1,NULL,1,1,NULL,41,42,'2017-06-14 00:05:54'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,42,0,'2017-06-14 00:08:26'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,43,44,'2017-06-14 00:08:27'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,44,0,'2017-06-14 00:11:36'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,45,46,'2017-06-14 00:11:36'),(1,1.1,1,0,NULL,1,1,NULL,1,1,NULL,46,0,'2017-06-14 00:12:02'),(1,1.1,1,1,NULL,1,1,NULL,1,1,NULL,47,48,'2017-06-14 00:12:02'),(1,1.1,1,0,NULL,1,1,NULL,1,1,NULL,48,0,'2017-06-14 00:14:20'),(1,1.1,1,1,NULL,1,1,NULL,1,1,NULL,49,50,'2017-06-14 00:14:21'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,50,0,'2017-06-14 00:16:31'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,51,52,'2017-06-14 00:16:31'),(1,0.1,1,0,NULL,1,1,NULL,1,1,NULL,52,0,'2017-06-14 00:27:41'),(1,0.1,1,1,NULL,1,1,NULL,1,1,NULL,53,54,'2017-06-14 00:27:42');
/*!40000 ALTER TABLE `movimientosclientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientosdesucursales`
--

DROP TABLE IF EXISTS `movimientosdesucursales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movimientosdesucursales` (
  `depOrigen` int(11) DEFAULT NULL,
  `depDestino` int(11) DEFAULT NULL,
  `idArticulo` int(11) NOT NULL DEFAULT '0',
  `cantidad` double NOT NULL DEFAULT '0',
  `confirmado` int(11) DEFAULT NULL,
  `numeroRemito` int(11) DEFAULT NULL,
  `idUsuario` int(11) DEFAULT NULL,
  `diferencia` double DEFAULT NULL,
  `idUsuarioRecep` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientosdesucursales`
--

LOCK TABLES `movimientosdesucursales` WRITE;
/*!40000 ALTER TABLE `movimientosdesucursales` DISABLE KEYS */;
/*!40000 ALTER TABLE `movimientosdesucursales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientosproveedores`
--

DROP TABLE IF EXISTS `movimientosproveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movimientosproveedores` (
  `numeroProveedor` int(11) NOT NULL DEFAULT '0',
  `monto` double NOT NULL DEFAULT '0',
  `pagado` int(11) DEFAULT NULL,
  `numeroComprobante` varchar(30) DEFAULT NULL,
  `idRemito` int(11) DEFAULT NULL,
  `idUsuario` int(11) NOT NULL DEFAULT '0',
  `idCaja` int(11) NOT NULL DEFAULT '0',
  `fechaPago` varchar(20) DEFAULT NULL,
  `tipoComprobante` int(11) DEFAULT NULL,
  `idSucursal` int(11) NOT NULL DEFAULT '0',
  `estado` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fecha` (`fecha`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientosproveedores`
--

LOCK TABLES `movimientosproveedores` WRITE;
/*!40000 ALTER TABLE `movimientosproveedores` DISABLE KEYS */;
/*!40000 ALTER TABLE `movimientosproveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientosusuarios`
--

DROP TABLE IF EXISTS `movimientosusuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movimientosusuarios` (
  `numeroUsuario` int(11) NOT NULL DEFAULT '0',
  `tipoAcceso` int(11) DEFAULT NULL,
  `entrada` varchar(30) NOT NULL DEFAULT '',
  `estado` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientosusuarios`
--

LOCK TABLES `movimientosusuarios` WRITE;
/*!40000 ALTER TABLE `movimientosusuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `movimientosusuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedores` (
  `ID` int(11) DEFAULT NULL,
  `nombre` varchar(19) DEFAULT NULL,
  `DOMICILIO` varchar(100) DEFAULT NULL,
  `LOCALIDAD` varchar(8) DEFAULT NULL,
  `TELEFONO` varchar(10) DEFAULT NULL,
  `INHABILITADO` int(11) DEFAULT NULL,
  `numero` int(11) NOT NULL AUTO_INCREMENT,
  `mail` varchar(200) NOT NULL DEFAULT '',
  `saldo` double DEFAULT NULL,
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES (NULL,'hola','','','',NULL,1,'',NULL);
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rubros`
--

DROP TABLE IF EXISTS `rubros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rubros` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(70) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rubros`
--

LOCK TABLES `rubros` WRITE;
/*!40000 ALTER TABLE `rubros` DISABLE KEYS */;
INSERT INTO `rubros` VALUES (1,'ARTICULOS GENERALES');
/*!40000 ALTER TABLE `rubros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursal`
--

DROP TABLE IF EXISTS `sucursal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sucursal` (
  `numero` int(11) NOT NULL DEFAULT '0',
  `descripcion` varchar(100) NOT NULL DEFAULT '',
  `direccion` varchar(100) NOT NULL DEFAULT '',
  `telefono` varchar(100) NOT NULL DEFAULT '',
  `deposito` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursal`
--

LOCK TABLES `sucursal` WRITE;
/*!40000 ALTER TABLE `sucursal` DISABLE KEYS */;
INSERT INTO `sucursal` VALUES (1,'POCO PRECIO 1','1','',1);
/*!40000 ALTER TABLE `sucursal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoacceso`
--

DROP TABLE IF EXISTS `tipoacceso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoacceso` (
  `numero` int(11) NOT NULL DEFAULT '0',
  `descripcion` varchar(20) NOT NULL DEFAULT '',
  `nivel` int(11) NOT NULL DEFAULT '0',
  `menu1` int(11) NOT NULL DEFAULT '0',
  `menu2` int(11) NOT NULL DEFAULT '0',
  `menu3` int(11) NOT NULL DEFAULT '0',
  `menu4` int(11) NOT NULL DEFAULT '0',
  `menu5` int(11) NOT NULL DEFAULT '0',
  `menu6` int(11) NOT NULL DEFAULT '0',
  `menu7` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoacceso`
--

LOCK TABLES `tipoacceso` WRITE;
/*!40000 ALTER TABLE `tipoacceso` DISABLE KEYS */;
INSERT INTO `tipoacceso` VALUES (1,'administrador',1,1,1,1,1,1,1,1),(2,'cajero',2,0,0,1,1,0,1,0),(3,'prueba',3,0,0,1,1,0,0,0);
/*!40000 ALTER TABLE `tipoacceso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipocomprobantes`
--

DROP TABLE IF EXISTS `tipocomprobantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipocomprobantes` (
  `numero` int(11) NOT NULL DEFAULT '0',
  `descripcion` varchar(50) NOT NULL DEFAULT '',
  `numeroActivo` int(11) NOT NULL DEFAULT '0',
  `numeroSucursal` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipocomprobantes`
--

LOCK TABLES `tipocomprobantes` WRITE;
/*!40000 ALTER TABLE `tipocomprobantes` DISABLE KEYS */;
INSERT INTO `tipocomprobantes` VALUES (1,'ticket',1,1),(2,'FCA A',0,1),(3,'remito proveedor',0,1),(4,'remito interno',0,1),(5,'factura proveedor A',0,1),(6,'factura proveedor',0,1),(7,'ticket',0,2),(8,'FCA A',0,2),(9,'ticket',0,3),(10,'FCA A',0,3),(11,'recibo de pago',0,1),(12,'mov caja',37,0),(13,'gasto fijo',0,1),(14,'ticket',0,4),(15,'FCA A',0,4),(16,'ticket',0,5),(17,'FCA A',0,5),(18,'remito de ajuste de stock',0,1),(19,'TICKET',0,7),(20,'FACTURA PROVEEDOR',0,7),(21,'FCA A',0,7),(22,'ticket',0,6),(23,'FCA A',0,6),(81,'TFA',0,1),(82,'TFB',0,1),(112,'NCA',0,1),(113,'NCB',0,1);
/*!40000 ALTER TABLE `tipocomprobantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipomovimientos`
--

DROP TABLE IF EXISTS `tipomovimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipomovimientos` (
  `ID` int(11) NOT NULL DEFAULT '0',
  `DESCRIPCION` varchar(30) NOT NULL DEFAULT '',
  `DESTINOOPERACION` int(11) NOT NULL DEFAULT '0',
  `MULTIPLOOP` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipomovimientos`
--

LOCK TABLES `tipomovimientos` WRITE;
/*!40000 ALTER TABLE `tipomovimientos` DISABLE KEYS */;
INSERT INTO `tipomovimientos` VALUES (1,'Ventas',1,1),(2,'Compras',1,1),(3,'Devolucion de Ventas',1,1),(4,'Retiro Efectivo',2,-1),(5,'Recepcion de mercaderias',1,1),(6,'Traslado de mercaderias',1,1),(7,'Ingreso de Caja',2,1),(8,'Devolucion de compras',1,1),(9,'saldo inicial',2,1),(10,'Cerrar Caja',2,-1),(11,'Pago a Proveedores',2,-1),(12,'Gastos de Caja',2,-1),(13,'Cobro de Cuenta Corriente Clie',2,1),(14,'ajuste de stock',1,1),(15,'ajuste de saldo',1,1);
/*!40000 ALTER TABLE `tipomovimientos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `numero` int(11) NOT NULL DEFAULT '0',
  `nombre` varchar(70) NOT NULL DEFAULT '',
  `direccion` varchar(200) NOT NULL DEFAULT '',
  `localidad` varchar(70) NOT NULL DEFAULT '',
  `telefono` varchar(100) NOT NULL DEFAULT '',
  `mail` varchar(100) NOT NULL DEFAULT '',
  `nombreUsuario` varchar(100) NOT NULL DEFAULT '',
  `clave` varchar(100) NOT NULL DEFAULT '',
  `autorizacion` int(11) NOT NULL DEFAULT '0',
  `numeroTipoAcceso` int(11) NOT NULL DEFAULT '0',
  `sucursal` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'administrador','','','','','mauro','mauro',1,1,1),(2,'ELIEL','','','','','ELIEL','ELIEL',2,2,7);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-06-13 21:28:18
