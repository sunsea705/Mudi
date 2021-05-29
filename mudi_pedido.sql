-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: mudi
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_entrega` date DEFAULT NULL,
  `descricao` varchar(10000) DEFAULT NULL,
  `nome_produto` varchar(255) DEFAULT NULL,
  `url_imagem` varchar(1000) DEFAULT NULL,
  `url_produto` varchar(1000) DEFAULT NULL,
  `valor_negociado` decimal(19,2) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `user_username` varchar(255) DEFAULT NULL,
  `comentario` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKq1fm0hfhyy4yei5fhjgk653ka` (`user_username`),
  CONSTRAINT `FKq1fm0hfhyy4yei5fhjgk653ka` FOREIGN KEY (`user_username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (6,NULL,'Direto do túnel do tempo, uma reedição do Master System no formato plug and play.','MASTER SYSTEM EVOLUTION COM 132 JOGOS NA MEMÓRIA','https://dtzhc0rw447zs.cloudfront.net/Custom/Content/Products/01/86/0186_master-system-evolution-com-132-jogos-na-memoria-995020351822_z5_637396510844112706.png','https://www.tectoy.com.br/master-system-evolution-com-132-jogos-na-memoria-995020351822-p186',NULL,'APROVADO',NULL,NULL),(7,NULL,'O clássico está de volta em uma edição limitada. Um vídeo game é relançado atendendo a pedidos e fazendo a felicidade dos milhares de fãs. O vídeo game está completo, com seu design clássico, joystick original de três botões, compatível com cartuchos originais*, entrada para SD Card e 22 jogos inesquecíveis.** Para quem gosta e é fã de vídeo game, não pode deixar de participar deste momento histórico e adquirir o seu.','Console Mega Drive Tec Toy + 2 Controles + 22 Jogos na Memória','https://www.extra-imagens.com.br/Control/ArquivoExibir.aspx?IdArquivo=1421320253','https://www.extra.com.br/console-mega-drive-tec-toy-2-controles-22-jogos-na-memoria-55012055/p/55012055?utm_medium=cpc&utm_source=GP_PLA&IdSku=55012055&idLojista=15&utm_campaign=game_smart-shopping&gclid=Cj0KCQjw7pKFBhDUARIsAFUoMDZjLL-EamWJVpuowNvylE8aRnvaUE6x5Xz_TZ5K8P9sPB8n8R8JDYcaAv6WEALw_wcB',NULL,'ENTREGUE',NULL,NULL),(8,NULL,'Nintendo 3DS  com Cias (como se fosse uma freeshop), Cartão de 32GB com Caixa serial batendo (segunda mão)Cor Vermelho com Preto.Pode escolher quais jogos a serem instalados (informar após a compra)...','Nintendo 3DS XL 32GB com CIAS FBI Jogos Instalados','https://images-submarino.b2w.io/produtos/01/00/img/3103034/2/3103034289P1.jpg','https://www.submarino.com.br/produto/3103034271/nintendo-3ds-xl-32gb-com-cias-fbi-jogos-instalados?WT.srch=1&acc=d47a04c6f99456bc289220d5d0ff208d&epar=bp_pl_00_go_g35169&gclid=Cj0KCQjw7pKFBhDUARIsAFUoMDYJs9MizldmwA9_x0Wm_K6BEMY2Ki42jZumPBUN3eWnuk9fR6sIIPYaAudOEALw_wcB&i=6041d01449f937f625bf8b59&o=6065ba39f8e95eac3df83b7d&opn=XMLGOOGLE&sellerId=30892374000120',NULL,'AGUARDANDO','inglyd',NULL),(9,NULL,'não','teste','url teste','url teste',NULL,'APROVADO','inglyd',NULL),(10,NULL,'Embarque em uma nova jornada repleta de confrontos e desafios, e na qual as escolhas que você fizer terão um impacto ainda maior na forma como os eventos do jogo acontecem.','Fire Emblem Fates: Conquest','https://images-na.ssl-images-amazon.com/images/I/81uckzOmyhL._AC_SL1500_.jpg','https://www.amazon.com.br/Fire-Emblem-Fates-Conquest-3Ds/dp/B00ZS1SRO2',NULL,'ENTREGUE','inglyd',NULL);
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-29 18:48:53
