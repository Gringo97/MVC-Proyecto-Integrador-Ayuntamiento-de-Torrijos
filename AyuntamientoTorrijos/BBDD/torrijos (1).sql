-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-06-2017 a las 05:28:38
-- Versión del servidor: 10.1.22-MariaDB
-- Versión de PHP: 7.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
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
CREATE TABLE `actividad` (
  `id` int(11) NOT NULL,
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
  `referenciaCatastral` varchar(50) NOT NULL,
  `local` varchar(50) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `emplazamiento` varchar(50) NOT NULL,
  `fechaInicio` varchar(45) DEFAULT NULL,
  `fechaSolicitud` varchar(45) NOT NULL,
  `cuota` float NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `certColegioOficial` tinyint(11) DEFAULT NULL,
  `certModelo1` tinyint(11) DEFAULT NULL,
  `certModelo2` tinyint(11) DEFAULT NULL,
  `FotocopiaDNI` tinyint(1) DEFAULT NULL,
  `Estado` enum('Procesando','Aceptada','Archivada','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `actividad`
--

INSERT INTO `actividad` (`id`, `fotoLicenciaObra`, `fotoOtrasAutorizaciones`, `fotoJustificantePago`, `fotoEscritura`, `fotoModelo036`, `fotoPlanos`, `fotoCD`, `fotoMemoria`, `fotoFotografia`, `tipoSuelo`, `referenciaCatastral`, `local`, `tipo`, `emplazamiento`, `fechaInicio`, `fechaSolicitud`, `cuota`, `descripcion`, `certColegioOficial`, `certModelo1`, `certModelo2`, `FotocopiaDNI`, `Estado`) VALUES
(14, 1, 1, 1, 1, 1, 1, 0, 1, 1, 'rustico', 'afsd', 'BangBang', 'DEPORTE', 'asdf', '02/06/2017', '10/06/2017', 1300, 'adsf', 1, 1, 1, 1, 'Procesando'),
(15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 'urbano', 'asdf', 'Shotual Gym', 'DEPORTE', 'asdf', '01/06/2017', '09/06/2017', 1300, 'asdf', 1, 1, 1, 1, 'Procesando'),
(21, 1, 1, 0, 1, 0, 1, 0, 1, 1, 'urbano', 'SI', 'ESPACIO PUBLICO', 'OCIO', 'NO', '09/06/2017', '01/06/2017', 100, 'ASDF', 1, 0, 1, 1, 'Procesando'),
(22, 1, 0, 0, 1, 0, 1, 0, 1, 1, 'urbano', 'SI', 'EDIFICIO JUVENIL', 'OCIO', 'NO', '04/06/2017', '03/06/2017', 100, 'ASDF', 1, 1, 0, 0, 'Archivada'),
(23, 1, 0, 0, 1, 0, 1, 0, 0, 0, 'urbano', 'SI', 'LENCERIAS JUDITH', 'COMERCIO', 'NO', '14/06/2017', '03/06/2017', 100, 'ASDF', 0, 1, 0, 0, 'Procesando'),
(24, 1, 1, 0, 1, 0, 1, 0, 1, 0, 'urbano', 'SI', 'FRUTERIAS FERNANDEZ', 'COMERCIO', 'NO', '17/06/2017', '06/06/2017', 100, 'ASDF', 0, 0, 1, 1, 'Aceptada'),
(25, 1, 0, 0, 0, 0, 0, 0, 0, 1, 'urbano', 'SI', 'RECINTO FERIAL', 'OCIO', 'NO', '16/06/2017', '08/06/2017', 100, 'ASDF', 0, 0, 0, 0, 'Aceptada'),
(26, 1, 0, 1, 1, 1, 1, 1, 1, 1, 'urbano', 'NO', 'CATERING RAM', 'COMERCIO', 'NO', '22/06/2017', '06/06/2017', 1000, 'ASDF', 0, 1, 1, 1, 'Aceptada'),
(27, 1, 0, 0, 0, 0, 1, 0, 0, 1, 'rustico', 'SI¡¡nno', 'Ciber', 'BAR CIBER', 'SI', '03/06/2017', '01/06/2017', 5000, 'PRUEBA REALIZADA', 0, 1, 1, 0, 'Aceptada'),
(28, 1, 0, 1, 0, 0, 0, 1, 0, 0, 'rustico', 'SI', 'BAR', 'CIBER', 'SI', '16/06/2017', '01/06/2017', 50, 'PRUEBA REALIZADA', 0, 0, 0, 1, 'Archivada'),
(29, 1, 1, 1, 0, 0, 1, 0, 0, 0, 'urbano', 'SI', 'BAR', 'COMICO', 'NO', '17/06/2017', '14/06/2017', 500, 'PRUEBA SOLICITUD', 0, 1, 0, 0, 'Procesando');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cambiotitularidad`
--

DROP TABLE IF EXISTS `cambiotitularidad`;
CREATE TABLE `cambiotitularidad` (
  `id` int(11) NOT NULL,
  `idLicenciaAnterior` int(11) NOT NULL,
  `numExpediente` tinyint(4) DEFAULT NULL,
  `escrituraPropiedad` tinyint(4) DEFAULT NULL,
  `contratoArrendamiento` tinyint(4) DEFAULT NULL,
  `documentacionJust` tinyint(4) DEFAULT NULL,
  `planosYPlanta` tinyint(4) DEFAULT NULL,
  `fotoLicenciaAnterior` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `interesado`
--

DROP TABLE IF EXISTS `interesado`;
CREATE TABLE `interesado` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `cif` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `municipio` varchar(50) NOT NULL,
  `codigoPostal` int(5) NOT NULL,
  `telefonoFijo` int(12) DEFAULT NULL,
  `telefonoMovil` int(12) NOT NULL,
  `fax` int(12) DEFAULT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `interesado`
--

INSERT INTO `interesado` (`id`, `nombre`, `apellidos`, `cif`, `direccion`, `municipio`, `codigoPostal`, `telefonoFijo`, `telefonoMovil`, `fax`, `email`) VALUES
(24, 'JUAN', 'LUIS', '12345678O', 'C/ lOS OLIVOS 2', 'SEGOVIA', 24567, 918437362, 918437362, 918437362, 'juanluis@gmail.com'),
(25, 'GUILLERO', 'TUVILLA Dios', '12345674K', 'C/ ENFERMO 2', 'MORALZARZAL', 28411, 918571827, 918571827, 918571827, 'shotual@gmail.com'),
(31, 'JUAN', 'RAMON JIMENEZ', '91827483J', 'CALLE BAJA 5', 'SEGOVIA', 23543, 912849374, 912849374, 912849374, 'JUANMA@GMAIL.COM'),
(32, 'PEDRO', 'CALVO RAMOS', '574829482J', 'CALLE ALTA 3', 'TORDESILLAS', 23543, 912849374, 912849374, 912849374, 'PEDRO@GMAIL.COM'),
(33, 'JUDITH', 'ARRANZ SOBRINO', '43423554J', 'CALLE POSTUREO 1', 'MORALZARZAL', 28411, 912849374, 912849374, 912849374, 'JUDITH@GMAIL.COM'),
(34, 'JAVIER', 'FERNANDEZ TRISTE', '56438202J', 'CALLE LARGA 2', 'LAS ROZAS ', 23400, 912849374, 912849374, 912849374, 'JAVIER@TRISTE.COM'),
(35, 'SERGIO', 'REDONDO MONTES', '47568382J', 'CALLE ESTRECHA 3', 'MADRID', 23400, 912849374, 912849374, 912849374, 'SERGIO@REDONDO.COM'),
(36, 'RAMSES', 'DIEZ CAYETANO', '7534648K', 'CALLE CUESTA ARRIBA 4', 'HOYO DE MANZANARES', 25432, 912849374, 912849374, 912849374, 'RAM@GMAIL.COM'),
(37, 'David', 'Perez', '54089658P', 'C/ LAS ROZAS', 'LAS ROZAS', 28411, 9158647, 61999587, 9184597, 'PEDRO@GMAIL.COM'),
(38, 'Jaime', 'de la torre', '5879655P', 'LAS ROZAS', 'LAS ROZAS', 28411, 61991415, 61991416, 91589696, 'PEDRO@GMAIL.COM'),
(39, 'Lafoz', 'GOMEZ', '548548Y', 'LAS ROZAS', 'LAS ROZAS', 28411, 6188787, 61999999, 9185588, 'ESTHER@GMAIL.COM');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relactper`
--

DROP TABLE IF EXISTS `relactper`;
CREATE TABLE `relactper` (
  `id` int(11) NOT NULL,
  `idInt` int(11) NOT NULL,
  `idAct` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `relactper`
--

INSERT INTO `relactper` (`id`, `idInt`, `idAct`) VALUES
(12, 24, 14),
(13, 25, 15),
(21, 31, 21),
(22, 32, 22),
(23, 33, 23),
(24, 34, 24),
(25, 35, 25),
(26, 36, 26),
(27, 37, 27),
(28, 38, 28),
(29, 39, 29);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relintrep`
--

DROP TABLE IF EXISTS `relintrep`;
CREATE TABLE `relintrep` (
  `id` int(11) NOT NULL,
  `idInteresado` int(11) NOT NULL,
  `idRepresentante` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `relintrep`
--

INSERT INTO `relintrep` (`id`, `idInteresado`, `idRepresentante`) VALUES
(14, 24, 8),
(15, 25, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `representante`
--

DROP TABLE IF EXISTS `representante`;
CREATE TABLE `representante` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `documentoIdentidad` varchar(9) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `municipio` varchar(50) NOT NULL,
  `codigoPostal` int(5) NOT NULL,
  `telefonoFijo` int(12) DEFAULT NULL,
  `telefonoMovil` int(12) NOT NULL,
  `fax` int(12) DEFAULT NULL,
  `Email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `representante`
--

INSERT INTO `representante` (`id`, `nombre`, `apellidos`, `documentoIdentidad`, `direccion`, `municipio`, `codigoPostal`, `telefonoFijo`, `telefonoMovil`, `fax`, `Email`) VALUES
(8, 'JUAN', 'LUIS', '12345678O', 'C/ lOS OLIVOS 2', 'SEGOVIA', 24567, 918437362, 918437362, 918437362, 'juanluis@gmail.com'),
(9, 'GUILLERO', 'TUVILLA CALVO', '12345674K', 'C/ ENFERMO 2', 'MORALZARZAL', 28411, 918571827, 918571827, 918571827, 'shotual@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividad`
--
ALTER TABLE `actividad`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `cambiotitularidad`
--
ALTER TABLE `cambiotitularidad`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idLicenciaAnterior` (`idLicenciaAnterior`);

--
-- Indices de la tabla `interesado`
--
ALTER TABLE `interesado`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `relactper`
--
ALTER TABLE `relactper`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idInt` (`idInt`),
  ADD KEY `idAct` (`idAct`);

--
-- Indices de la tabla `relintrep`
--
ALTER TABLE `relintrep`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idInteresado` (`idInteresado`,`idRepresentante`),
  ADD KEY `idRepresentante` (`idRepresentante`);

--
-- Indices de la tabla `representante`
--
ALTER TABLE `representante`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actividad`
--
ALTER TABLE `actividad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT de la tabla `cambiotitularidad`
--
ALTER TABLE `cambiotitularidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `interesado`
--
ALTER TABLE `interesado`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
--
-- AUTO_INCREMENT de la tabla `relactper`
--
ALTER TABLE `relactper`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT de la tabla `relintrep`
--
ALTER TABLE `relintrep`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT de la tabla `representante`
--
ALTER TABLE `representante`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
