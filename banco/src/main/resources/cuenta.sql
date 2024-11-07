-- proyecto.cuenta definition

CREATE TABLE `cuenta` (
  `numero_cuenta` int NOT NULL AUTO_INCREMENT,
  `tipo_cuenta` int NOT NULL,
  `id_cliente` int NOT NULL,
  `saldo` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`numero_cuenta`),
  KEY `cuenta_tipo_cuenta_FK` (`tipo_cuenta`),
  KEY `cuenta_cliente_FK` (`id_cliente`),
  CONSTRAINT `cuenta_cliente_FK` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`Id_cliente`),
  CONSTRAINT `cuenta_tipo_cuenta_FK` FOREIGN KEY (`tipo_cuenta`) REFERENCES `tipo_cuenta` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;