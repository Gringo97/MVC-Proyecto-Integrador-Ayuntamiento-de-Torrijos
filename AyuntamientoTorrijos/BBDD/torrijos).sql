-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-05-2017 a las 13:51:50
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `torrijos`
--
CREATE DATABASE IF NOT EXISTS `torrijos` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `torrijos`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividad`
--

DROP TABLE IF EXISTS `actividad`;
CREATE TABLE IF NOT EXISTS `actividad` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fotoLicenciaObra` tinyint(11) DEFAULT NULL,
  `fotoOtrasAutorizaciones` tinyint(11) DEFAULT NULL,
  `fotoJustificantePago` tinyint(11) DEFAULT NULL,
  `fotoEscritura` tinyint(11) DEFAULT NULL,
  `fotoModelo036` tinyint(11) DEFAULT NULL,
  `fotoPlanos` tinyint(11) DEFAULT NULL,
  `fotoCD` tinyint(11) DEFAULT NULL,
  `fotoMemoria` tinyint(11) DEFAULT NULL,
  `fotoFotografia` tinyint(11) DEFAULT NULL,
  `tipoSuelo` enum('urbano','rustico') NOT NULL,
  `referenciaCatastral` varchar(11) NOT NULL,
  `local` varchar(11) NOT NULL,
  `tipo` varchar(11) NOT NULL,
  `emplazamiento` varchar(11) NOT NULL,
  `fechaInicio` varchar(45) NOT NULL,
  `fechaSolicitud` varchar(45) NOT NULL,
  `cuota` float NOT NULL,
  `descripcion` varchar(11) NOT NULL,
  `certColegioOficial` tinyint(11) DEFAULT NULL,
  `certModelo1` tinyint(11) DEFAULT NULL,
  `certModelo2` tinyint(11) DEFAULT NULL,
  `FotocopiaDNI` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `actividad`
--

INSERT INTO `actividad` (`id`, `fotoLicenciaObra`, `fotoOtrasAutorizaciones`, `fotoJustificantePago`, `fotoEscritura`, `fotoModelo036`, `fotoPlanos`, `fotoCD`, `fotoMemoria`, `fotoFotografia`, `tipoSuelo`, `referenciaCatastral`, `local`, `tipo`, `emplazamiento`, `fechaInicio`, `fechaSolicitud`, `cuota`, `descripcion`, `certColegioOficial`, `certModelo1`, `certModelo2`, `FotocopiaDNI`) VALUES
(1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'urbano', 'fdbnfgh', 'sfgbfdb', 'PACO', 'gfdsdfhb', '3-5-2017', '19-5-2017', 213, 'put', NULL, NULL, NULL, NULL),
(2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'urbano', 'asdf', 'asdf', 'EDUARDO', 'ASDF', '25-5-2017', '30-5-2017', 123465, 'ASDFG', NULL, NULL, NULL, NULL),
(3, 1, 0, 0, 1, 0, 1, 0, 1, 1, 'rustico', 'gerg', 'wf', 'wef', 'wf', 'wef', 'wf', 12854, 'tjhtj', 1, 0, 1, 0),
(4, 0, 0, 0, 1, 0, 0, 0, 1, 0, 'rustico', 'wef', 'ewf', 'wef', 'wef', '5-5-2017', '3-5-2017', 20, 'wef', 0, 0, 0, 1),
(5, 0, 1, 1, 0, 1, 0, 0, 0, 0, 'rustico', 'ergger', 'ag', 'ergerg', 'erg', '4-5-2017', '5-5-2017', 50, 'erg', 0, 0, 0, 0),
(6, 0, 0, 0, 1, 0, 0, 0, 1, 0, 'rustico', 'wef', 'ewf', 'wef', 'wef', '5-5-2017', '3-5-2017', 20, 'wef', 0, 0, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cambiotitularidad`
--

DROP TABLE IF EXISTS `cambiotitularidad`;
CREATE TABLE IF NOT EXISTS `cambiotitularidad` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idLicenciaAnterior` int(11) NOT NULL,
  `numExpediente` tinyint(4) DEFAULT NULL,
  `escrituraPropiedad` tinyint(4) DEFAULT NULL,
  `contratoArrendamiento` tinyint(4) DEFAULT NULL,
  `documentacionJust` tinyint(4) DEFAULT NULL,
  `planosYPlanta` tinyint(4) DEFAULT NULL,
  `fotoLicenciaAnterior` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idLicenciaAnterior` (`idLicenciaAnterior`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `interesado`
--

DROP TABLE IF EXISTS `interesado`;
CREATE TABLE IF NOT EXISTS `interesado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `cif` varchar(9) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `municipio` varchar(50) NOT NULL,
  `codigoPostal` int(5) NOT NULL,
  `telefonoFijo` int(12) DEFAULT NULL,
  `telefonoMovil` int(12) NOT NULL,
  `fax` int(12) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `interesado`
--

INSERT INTO `interesado` (`id`, `nombre`, `apellidos`, `cif`, `direccion`, `municipio`, `codigoPostal`, `telefonoFijo`, `telefonoMovil`, `fax`, `email`) VALUES
(1, 'Eminem', 'Tuvilla', '123456789', '8 millas', 'detroit', 28546, NULL, 658888888, 4365346, '8@millas.com'),
(2, 'Jordi', 'Lafoz', '258254567', 'Calle de la piruleta', 'Mundo de golosinas', 23333, 43676547, 35434656, NULL, 'lafoz@jordi.com'),
(3, 'Tay', 'bragas largas', '12345', 'calle huerta', 'madrid', 28400, 98173244, 91827454, 91827364, 'tay@lovegatos.com'),
(4, 'asfd', 'asdf', '1234', 'asdf', 'asdf', 1234, 1234, 1234, 2134, 'asdf'),
(5, 'Pruebainsert', 'pruebaInsert', '54848748y', 'pruebainsert', 'insert', 28411, 4874857, 69878797, 125487, 'luisalberto@gmail.com'),
(9, 'eger', 'ergerg', '548754', 'gegerg', 'erger', 28411, 1234, 1234, 125487, 'lone@lone.com'),
(10, 'asdf', 'asdf', '1234', 'asdf', 'asdf', 1234, 1234, 1234, 1234, 'adsf'),
(11, 'WQER', 'ERW', '33', 'EWR', 'ERW', 333, 324, 324, 3, 'ESA'),
(12, 'somos los amos', 'putos amos', '54564', 'los putos jefes', 'los dioses', 8787, 787878, 877878, 87454, 'joderquebuenossomos@dioses.putosamos'),
(13, 'dsgfd', 'dfgdf', '555', 'duil', 'gdgfdg', 20, 2020, 202, 220, 'tkytk'),
(14, 'wegfew', 'ewfewew', 'ewf', 'ewffe', 'wef', 544, 44, 454, 51454, 'wffe'),
(15, 'wfew', 'ewfe', 'ewfe', 'ewfe', 'ewffe', 20, 1010, 1010, 100, 'wefe'),
(16, 'wegfew', 'ewfewew', 'ewf', 'ewffe', 'wef', 544, 44, 454, 51454, 'wffe');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relactper`
--

DROP TABLE IF EXISTS `relactper`;
CREATE TABLE IF NOT EXISTS `relactper` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idInt` int(11) NOT NULL,
  `idAct` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idInt` (`idInt`),
  KEY `idAct` (`idAct`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `relactper`
--

INSERT INTO `relactper` (`id`, `idInt`, `idAct`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relintrep`
--

DROP TABLE IF EXISTS `relintrep`;
CREATE TABLE IF NOT EXISTS `relintrep` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idInteresado` int(11) NOT NULL,
  `idRepresentante` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idInteresado` (`idInteresado`,`idRepresentante`),
  KEY `idRepresentante` (`idRepresentante`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `relintrep`
--

INSERT INTO `relintrep` (`id`, `idInteresado`, `idRepresentante`) VALUES
(3, 1, 1),
(4, 2, NULL),
(6, 3, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `representante`
--

DROP TABLE IF EXISTS `representante`;
CREATE TABLE IF NOT EXISTS `representante` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `documentoIdentidad` varchar(9) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `municipio` varchar(50) NOT NULL,
  `codigoPostal` int(5) NOT NULL,
  `telefonoFijo` int(12) DEFAULT NULL,
  `telefonoMovil` int(12) NOT NULL,
  `fax` int(12) DEFAULT NULL,
  `Email` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `representante`
--

INSERT INTO `representante` (`id`, `nombre`, `apellidos`, `documentoIdentidad`, `direccion`, `municipio`, `codigoPostal`, `telefonoFijo`, `telefonoMovil`, `fax`, `Email`) VALUES
(1, 'torbe', 'metano filo', '1231', 'eqgdqfgfeg', 'ebgadbead', 21433, NULL, 342536, NULL, ''),
(2, 'Emi', 'nem', '1324f', 'calle s', 'madrid', 28400, 9182373, 9182374, 987765, 'oscaremi@gmail.com');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cambiotitularidad`
--
ALTER TABLE `cambiotitularidad`
  ADD CONSTRAINT `cambiotitularidad_ibfk_1` FOREIGN KEY (`idLicenciaAnterior`) REFERENCES `actividad` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `relactper`
--
ALTER TABLE `relactper`
  ADD CONSTRAINT `relactper_ibfk_1` FOREIGN KEY (`idInt`) REFERENCES `interesado` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `relactper_ibfk_2` FOREIGN KEY (`idAct`) REFERENCES `actividad` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `relintrep`
--
ALTER TABLE `relintrep`
  ADD CONSTRAINT `relintrep_ibfk_2` FOREIGN KEY (`idInteresado`) REFERENCES `interesado` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `relintrep_ibfk_3` FOREIGN KEY (`idRepresentante`) REFERENCES `representante` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
