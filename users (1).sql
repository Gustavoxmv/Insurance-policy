-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-02-2023 a las 02:29:43
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `users`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actas`
--

CREATE TABLE `actas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `cedula` int(11) DEFAULT NULL,
  `fecha_fallecimiento` varchar(20) DEFAULT NULL,
  `foto` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `familiares`
--

CREATE TABLE `familiares` (
  `id` int(11) UNSIGNED NOT NULL,
  `poliza_id` int(11) UNSIGNED NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `fecha_nacimiento` varchar(50) NOT NULL,
  `sexo` varchar(20) NOT NULL,
  `parentezco` varchar(50) NOT NULL,
  `cedula` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `familiares`
--

INSERT INTO `familiares` (`id`, `poliza_id`, `nombre`, `apellido`, `fecha_nacimiento`, `sexo`, `parentezco`, `cedula`) VALUES
(2, 0, '?', '?', '?', '?', '?', '?'),
(3, 0, 'fsdaaf', 'sadfas', 'sadfasd', 'fsadf', 'sadfasdfa', 'dfasdf'),
(23, 10, 'jose', 'medina', '1465', 'hombre', 'hijo', '1234568'),
(24, 10, 'gustavo', 'medina', '6546546', 'masculino', 'nieto', '4656'),
(27, 10, 'aa', 'aaa', 'aaa', 'aaa', 'aa', 'aa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `polizas`
--

CREATE TABLE `polizas` (
  `id` int(11) UNSIGNED NOT NULL,
  `numerocontrato` varchar(30) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `cedula` varchar(30) DEFAULT NULL,
  `fecha_nacimiento` varchar(30) DEFAULT NULL,
  `telefono` varchar(30) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL,
  `profesion` varchar(30) DEFAULT NULL,
  `convenio` varchar(30) DEFAULT NULL,
  `plan` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `polizas`
--

INSERT INTO `polizas` (`id`, `numerocontrato`, `nombre`, `apellido`, `cedula`, `fecha_nacimiento`, `telefono`, `direccion`, `correo`, `profesion`, `convenio`, `plan`) VALUES
(10, '123456789', 'Jose', 'Suarez', '123456789', '12/10/1334', '123456789', 'sadfsadf', 'fdsfad@gmail.com', 'fdsf', 'sdfas', 'jdfsl');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id` int(11) NOT NULL,
  `poliza_id` int(11) UNSIGNED NOT NULL,
  `promotor` varchar(30) NOT NULL,
  `cedula` varchar(30) NOT NULL,
  `Fecharevision` varchar(30) NOT NULL,
  `tipo_pago` varchar(30) NOT NULL,
  `fecha_pago` varchar(30) NOT NULL,
  `referencia` varchar(30) NOT NULL,
  `mes` varchar(30) NOT NULL,
  `monto` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id`, `poliza_id`, `promotor`, `cedula`, `Fecharevision`, `tipo_pago`, `fecha_pago`, `referencia`, `mes`, `monto`) VALUES
(3, 10, 'g', 'dgdfg', 'dsg', 'gsgfsdf', 'gsdfgsdfg', 'gfdsg', 'dsfgfdsg', 'gdsfgdsf');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actas`
--
ALTER TABLE `actas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `familiares`
--
ALTER TABLE `familiares`
  ADD PRIMARY KEY (`id`),
  ADD KEY `poliza_id` (`poliza_id`);

--
-- Indices de la tabla `polizas`
--
ALTER TABLE `polizas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_polizas` (`poliza_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actas`
--
ALTER TABLE `actas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT de la tabla `familiares`
--
ALTER TABLE `familiares`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `polizas`
--
ALTER TABLE `polizas`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `familiares`
--
ALTER TABLE `familiares`
  ADD CONSTRAINT `familiares_ibfk_1` FOREIGN KEY (`poliza_id`) REFERENCES `polizas` (`id`);

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`poliza_id`) REFERENCES `polizas` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
