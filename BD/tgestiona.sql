CREATE DATABASE `tgestiona` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

use `tgestiona`;
CREATE TABLE `sucursal` (
  `cod_sucursal` char(2) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `cod_usuario` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`cod_sucursal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `producto` (
  `cod_producto` char(2) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  PRIMARY KEY (`cod_producto`),
  CONSTRAINT `chk_producto_precio` CHECK ((`precio` > 0))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `usuario` (
  `cod_usuario` char(2) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `user` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `cod_sucursal` char(2) NOT NULL,
  PRIMARY KEY (`cod_usuario`),
  UNIQUE KEY `UK_p503mefpfteg66ijrykbo4mad` (`cod_sucursal`),
  CONSTRAINT `fk_sucursal` FOREIGN KEY (`cod_usuario`) REFERENCES `sucursal` (`cod_sucursal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
