-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-05-2019 a las 23:09:49
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `coches1`
--
CREATE DATABASE IF NOT EXISTS `coches1` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;
USE `coches1`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especificaciones`
--

DROP TABLE IF EXISTS `especificaciones`;
CREATE TABLE IF NOT EXISTS `especificaciones` (
  `CodEspe` int(11) NOT NULL AUTO_INCREMENT,
  `Caballos` int(11) NOT NULL,
  `Año` int(11) NOT NULL,
  `CodigoMod` int(11) NOT NULL,
  `Combustible` varchar(20) COLLATE utf8mb4_spanish_ci NOT NULL,
  PRIMARY KEY (`CodEspe`),
  KEY `CodigoMod` (`CodigoMod`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `especificaciones`
--

INSERT INTO `especificaciones` (`CodEspe`, `Caballos`, `Año`, `CodigoMod`, `Combustible`) VALUES
(1, 150, 2014, 1, 'Gasolina'),
(2, 570, 2018, 6, 'Gasolina'),
(3, 95, 2014, 1, 'Diesel'),
(4, 350, 2015, 9, 'Gasolina'),
(5, 150, 2018, 7, 'Gasolina'),
(6, 105, 2010, 8, 'Gasolina'),
(7, 600, 2017, 3, 'Gasolina'),
(9, 90, 2011, 5, 'Diesel'),
(11, 184, 2011, 4, 'Diesel'),
(32, 310, 2017, 10, 'Gasolina'),
(36, 3500, 2004, 2, 'Gasolina'),
(37, 400, 2018, 2, 'Gasolina');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marcas`
--

DROP TABLE IF EXISTS `marcas`;
CREATE TABLE IF NOT EXISTS `marcas` (
  `NombreMarca` varchar(20) COLLATE utf8mb4_spanish_ci NOT NULL,
  `CodigoMarca` int(11) NOT NULL,
  `AñoFundacion` int(11) NOT NULL DEFAULT '1900',
  PRIMARY KEY (`CodigoMarca`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `marcas`
--

INSERT INTO `marcas` (`NombreMarca`, `CodigoMarca`, `AñoFundacion`) VALUES
('Audi', 1, 1909),
('Volkswagen', 2, 1937),
('BMW', 3, 1916),
('Nissan', 4, 1933),
('Seat', 5, 1950),
('Ford', 6, 1903),
('Fiat', 7, 1808),
('Toyota', 8, 1234);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modelo`
--

DROP TABLE IF EXISTS `modelo`;
CREATE TABLE IF NOT EXISTS `modelo` (
  `NombreMod` varchar(20) COLLATE utf8mb4_spanish_ci NOT NULL,
  `CodigoMod` int(11) NOT NULL,
  `CodigoMarca` int(11) NOT NULL,
  PRIMARY KEY (`CodigoMod`),
  KEY `CodigoMarca` (`CodigoMarca`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish_ci;

--
-- Volcado de datos para la tabla `modelo`
--

INSERT INTO `modelo` (`NombreMod`, `CodigoMod`, `CodigoMarca`) VALUES
('A1    ', 1, 1),
('RS3', 2, 1),
('M5', 3, 3),
('Serie 1', 4, 3),
('Polo', 5, 2),
('GTR', 6, 4),
('Ibiza', 7, 5),
('Leon', 8, 5),
('Focus', 9, 6),
('Mustang', 10, 6);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `especificaciones`
--
ALTER TABLE `especificaciones`
  ADD CONSTRAINT `especificaciones_ibfk_1` FOREIGN KEY (`CodigoMod`) REFERENCES `modelo` (`CodigoMod`);

--
-- Filtros para la tabla `modelo`
--
ALTER TABLE `modelo`
  ADD CONSTRAINT `modelo_ibfk_1` FOREIGN KEY (`CodigoMarca`) REFERENCES `marcas` (`CodigoMarca`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
