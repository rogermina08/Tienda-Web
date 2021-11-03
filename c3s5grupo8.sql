-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-10-2021 a las 16:38:32
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `c3s5grupo8`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria_producto`
--

CREATE TABLE `categoria_producto` (
  `catpro_id` int(10) NOT NULL,
  `catpro_fecha` date DEFAULT current_timestamp(),
  `catpro_nombre` varchar(50) NOT NULL,
  `catpro_estado` varchar(15) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria_producto`
--

INSERT INTO `categoria_producto` (`catpro_id`, `catpro_fecha`, `catpro_nombre`, `catpro_estado`) VALUES
(1, '2021-10-05', 'viveres', 'Activo'),
(2, '2021-10-05', 'abarrotes', 'Activo'),
(3, '2021-10-05', 'aseo', 'Activo'),
(4, '2021-10-05', 'papelería', 'Activo'),
(5, '2021-10-05', 'cacharrería', 'Activo'),
(6, '2021-10-05', 'hogar', 'Activo'),
(7, '2021-10-05', 'carnes', 'Activo'),
(8, '2021-10-05', 'snacks', 'Activo'),
(9, '2021-10-05', 'galletería', 'Activo'),
(10, '2021-10-05', 'ferretería', 'Activo'),
(11, '2021-10-05', 'ropa', 'Activo'),
(12, '2021-10-05', 'dulcería', 'Activo'),
(13, '2021-10-05', 'catpro13', 'Activo'),
(14, '2021-10-05', 'catpro14', 'Activo'),
(15, '2021-10-05', 'catpro15', 'Activo'),
(16, '2021-10-05', 'catpro16', 'Activo'),
(17, '2021-10-05', 'catpro17', 'Activo'),
(18, '2021-10-05', 'catpro18', 'Activo'),
(19, '2021-10-05', 'catpro19', 'Activo'),
(20, '2021-10-05', 'catpro20', 'Activo'),
(21, '2021-10-05', 'catpro21', 'Activo'),
(22, '2021-10-05', 'catpro22', 'Activo'),
(24, '2021-10-05', 'catpro31', 'Activo'),
(25, '2021-10-05', 'catpro32', 'Activo'),
(26, '2021-10-05', 'catpro33', 'Activo'),
(27, '2021-10-06', 'catprp43', 'Activo'),
(28, '2021-10-08', 'catpro44', 'Inactivo'),
(29, '2021-10-08', 'catpro60', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `cpr_id` int(10) NOT NULL,
  `cpr_fecha` date NOT NULL DEFAULT current_timestamp(),
  `id_ped` int(10) NOT NULL,
  `cpr_estado` varchar(15) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`cpr_id`, `cpr_fecha`, `id_ped`, `cpr_estado`) VALUES
(54, '2021-09-30', 1, 'Activo'),
(55, '2021-09-30', 2, 'Activo'),
(56, '2021-09-30', 3, 'Activo'),
(57, '2021-09-30', 4, 'Activo'),
(58, '2021-09-30', 5, 'Activo'),
(59, '2021-09-30', 6, 'Activo'),
(60, '2021-09-30', 7, 'Activo'),
(61, '2021-09-30', 8, 'Activo'),
(62, '2021-09-30', 9, 'Activo'),
(63, '2021-09-30', 10, 'Activo'),
(64, '2021-09-30', 11, 'Activo'),
(65, '2021-09-30', 12, 'Activo'),
(66, '2021-10-05', 13, 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devolucion_compra`
--

CREATE TABLE `devolucion_compra` (
  `devcpr_id` int(10) NOT NULL,
  `devcpr_fecha` date NOT NULL DEFAULT current_timestamp(),
  `id_ped` int(10) NOT NULL,
  `devcpr_estado` varchar(10) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `devolucion_compra`
--

INSERT INTO `devolucion_compra` (`devcpr_id`, `devcpr_fecha`, `id_ped`, `devcpr_estado`) VALUES
(1, '2021-10-08', 2, 'Activo'),
(2, '2021-10-08', 3, 'Activo'),
(3, '2021-10-08', 10, 'Activo'),
(4, '2021-10-08', 12, 'Activo'),
(5, '2021-10-08', 13, 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devolucion_venta`
--

CREATE TABLE `devolucion_venta` (
  `devvta_id` int(10) NOT NULL,
  `devvta_fecha` date NOT NULL DEFAULT current_timestamp(),
  `id_vta` int(10) NOT NULL,
  `devvta_estado` varchar(10) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `devolucion_venta`
--

INSERT INTO `devolucion_venta` (`devvta_id`, `devvta_fecha`, `id_vta`, `devvta_estado`) VALUES
(1, '2021-10-04', 10, 'Activo'),
(2, '2021-10-04', 13, 'Activo'),
(3, '2021-10-04', 15, 'Activo'),
(4, '2021-10-04', 19, 'Activo'),
(5, '2021-10-08', 22, 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `kardex`
--

CREATE TABLE `kardex` (
  `kar_id` int(10) NOT NULL,
  `kar_fecha` date NOT NULL DEFAULT current_timestamp(),
  `id_cpr` int(10) NOT NULL,
  `id_vta` int(10) NOT NULL,
  `kar_estado` varchar(10) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `ped_id` int(10) NOT NULL,
  `ped_numero_pedido` int(10) NOT NULL,
  `ped_fecha` date NOT NULL DEFAULT current_timestamp(),
  `id_pro` int(10) NOT NULL,
  `id_prv` int(10) NOT NULL,
  `ped_cantidad` int(10) NOT NULL,
  `ped_valor_unitario_compra` double NOT NULL,
  `ped_confirma_recibo` varchar(2) NOT NULL DEFAULT 'No',
  `ped_confirma_devolucion` varchar(2) NOT NULL DEFAULT 'No',
  `ped_cantidad_devolucion` int(10) NOT NULL DEFAULT 0,
  `ped_estado` varchar(8) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`ped_id`, `ped_numero_pedido`, `ped_fecha`, `id_pro`, `id_prv`, `ped_cantidad`, `ped_valor_unitario_compra`, `ped_confirma_recibo`, `ped_confirma_devolucion`, `ped_cantidad_devolucion`, `ped_estado`) VALUES
(1, 1, '2021-09-25', 20, 7, 15, 3000, 'Si', 'No', 0, 'Activo'),
(2, 2, '2021-09-25', 30, 5, 1, 7000, 'Si', 'Si', 19, 'Activo'),
(3, 3, '2021-09-25', 28, 6, 15, 2800, 'Si', 'Si', 5, 'Activo'),
(4, 5, '2021-09-25', 17, 5, 3, 5000, 'Si', 'No', 0, 'Activo'),
(5, 6, '2021-09-25', 27, 7, 20, 2500, 'Si', 'No', 0, 'Activo'),
(6, 6, '2021-09-25', 41, 7, 100, 500, 'Si', 'No', 0, 'Activo'),
(7, 7, '2021-09-25', 26, 7, 12, 600, 'Si', 'No', 0, 'Activo'),
(8, 7, '2021-09-25', 18, 7, 54, 2000, 'Si', 'No', 0, 'Activo'),
(9, 7, '2021-09-25', 39, 7, 30, 1300, 'Si', 'No', 0, 'Activo'),
(10, 5, '2021-09-25', 36, 7, 30, 600, 'Si', 'Si', 3, 'Activo'),
(11, 8, '2021-09-26', 40, 5, 39, 3000, 'Si', 'No', 0, 'Activo'),
(12, 9, '2021-09-26', 30, 5, 70, 5500, 'Si', 'Si', 30, 'Activo'),
(13, 10, '2021-10-05', 47, 7, 5, 1600, 'No', 'Si', 5, 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `pro_id` int(10) NOT NULL,
  `pro_fecha` date NOT NULL DEFAULT current_timestamp(),
  `pro_nombre` varchar(50) NOT NULL,
  `pro_marca` varchar(20) NOT NULL,
  `pro_unidad` varchar(2) NOT NULL,
  `pro_referencia` varchar(30) NOT NULL,
  `pro_valor_unitario_venta` double NOT NULL,
  `id_catpro` int(8) NOT NULL,
  `pro_estado` varchar(15) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`pro_id`, `pro_fecha`, `pro_nombre`, `pro_marca`, `pro_unidad`, `pro_referencia`, `pro_valor_unitario_venta`, `id_catpro`, `pro_estado`) VALUES
(16, '2021-09-10', 'galleta', 'dux', 'pq', 'integral', 700, 7, 'Activo'),
(17, '2021-09-10', 'café', 'colcafe', 'fr', 'gramuladox500gr', 7000, 1, 'Activo'),
(18, '2021-09-10', 'azúcar', 'manuelita', 'bs', 'blancax2kg', 3000, 1, 'Activo'),
(19, '2021-09-10', 'acetaminofén', 'laproff', 'sb', 'socrex10tab', 1200, 8, 'Activo'),
(20, '2021-09-10', 'cuaderno', 'el cid', 'un', 'argolladox100h-Image', 4500, 5, 'Activo'),
(21, '2021-09-10', 'maizitos', 'ramo', 'pq', 'limónx150gr', 1000, 7, 'Activo'),
(24, '2021-09-13', 'papaya', 'granjera', 'kg', 'pintona', 3000, 11, 'Activo'),
(25, '2021-09-13', 'pera', 'granjera', 'kg', 'injerto', 2000, 11, 'Activo'),
(26, '2021-09-13', 'lapicero', 'bic', 'un', 'negro', 800, 5, 'Activo'),
(27, '2021-09-13', 'durazno', 'fincas', 'kg', 'maduro', 3500, 11, 'Activo'),
(28, '2021-09-10', 'arroz', 'roa', 'kg', 'blanco', 4000, 1, 'Activo'),
(29, '2021-09-13', 'pan', 'bimbo', 'bs', 'croisan', 4500, 1, 'Activo'),
(30, '2021-09-12', 'aceite', 'purisimo', 'bt', '1000cc', 8400, 1, 'Activo'),
(31, '2021-09-10', 'frijol', 'castilla', 'kg', 'rojo', 2800, 1, 'Activo'),
(32, '2021-09-15', 'panela', 'dulceria', 'kg', 'cuadro', 1900, 1, 'Activo'),
(33, '2021-09-18', 'cuaderno', 'norma', 'un', 'x100H argolla', 4000, 5, 'Activo'),
(34, '2021-09-18', 'harina', 'la espiga', 'kg', 'extrafina', 2600, 1, 'Activo'),
(35, '2021-09-19', 'lenteja', 'gurmet', 'kg', 'nativa', 1800, 1, 'Activo'),
(36, '2021-09-20', 'd', 'd', 'd', 'd', 1000, 1, 'Activo'),
(37, '2021-09-20', 's', 's', 's', 's2', 1300, 2, 'Activo'),
(38, '2021-09-20', 's', 's', 's', 's1', 1500, 3, 'Activo'),
(39, '2021-09-20', 'aaaaaaaa', 'aaaaaaaa', 'aa', 'aaaaaaaaa', 2000, 1, 'Activo'),
(40, '2021-09-25', 'cuaderno', 'el cid', 'un', 'argolladox100h-Imagenes', 4500, 5, 'Activo'),
(41, '2021-09-25', 'galleta', 'dux', 'un', 'limónx50gr', 700, 7, 'Activo'),
(42, '2021-09-25', 'yyyyy', 'ttttt', 'rr', 'rrrrr', 3000, 2, 'Activo'),
(43, '2021-09-25', 'www', 'www', 'ww', 'www', 4000, 5, 'Activo'),
(44, '2021-09-25', 'fff', 'fff', 'ff', 'fff', 5000, 12, 'Activo'),
(45, '2021-09-27', 'xxxx', 'xxxx', 'xx', 'xxxx', 11111, 22, 'Activo'),
(46, '2021-10-01', 'escoba', 'fuller', 'un', 'suave', 5000, 3, 'Activo'),
(47, '2021-10-04', 'papel_higienico', 'familia', 'rl', 'triple_hoja', 2300, 3, 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `prv_id` int(10) NOT NULL,
  `prv_fecha` date NOT NULL DEFAULT current_timestamp(),
  `prv_nombres_rep_legal` varchar(50) NOT NULL,
  `prv_apellidos_rep_legal` varchar(50) NOT NULL,
  `prv_identificacion_rep_legal` int(15) NOT NULL,
  `prv_fecha_nacim_rep_legal` date NOT NULL,
  `prv_direccion_rep_legal` varchar(30) NOT NULL,
  `prv_telefono_fijo_rep_legal` varchar(15) DEFAULT NULL,
  `prv_telefono_celular_rep_legal` varchar(15) NOT NULL,
  `prv_ciudad_rep_legal` varchar(20) NOT NULL,
  `prv_departamento_rep_legal` varchar(30) NOT NULL,
  `prv_email_rep_legal` varchar(30) NOT NULL,
  `prv_razon_social_empresa` varchar(50) NOT NULL,
  `prv_nit_empresa` int(15) NOT NULL,
  `prv_fecha_aniversario_empresa` date NOT NULL,
  `prv_direccion_empresa` varchar(30) NOT NULL,
  `prv_telefono_fijo_empresa` varchar(15) DEFAULT NULL,
  `prv_telefono_celular_empresa` varchar(15) NOT NULL,
  `prv_ciudad_empresa` varchar(30) NOT NULL,
  `prv_departamento_empresa` varchar(30) NOT NULL,
  `prv_email_empresa` varchar(30) NOT NULL,
  `prv_web_empresa` varchar(50) NOT NULL,
  `prv_facebook_empresa` varchar(30) NOT NULL,
  `prv_estado` varchar(15) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`prv_id`, `prv_fecha`, `prv_nombres_rep_legal`, `prv_apellidos_rep_legal`, `prv_identificacion_rep_legal`, `prv_fecha_nacim_rep_legal`, `prv_direccion_rep_legal`, `prv_telefono_fijo_rep_legal`, `prv_telefono_celular_rep_legal`, `prv_ciudad_rep_legal`, `prv_departamento_rep_legal`, `prv_email_rep_legal`, `prv_razon_social_empresa`, `prv_nit_empresa`, `prv_fecha_aniversario_empresa`, `prv_direccion_empresa`, `prv_telefono_fijo_empresa`, `prv_telefono_celular_empresa`, `prv_ciudad_empresa`, `prv_departamento_empresa`, `prv_email_empresa`, `prv_web_empresa`, `prv_facebook_empresa`, `prv_estado`) VALUES
(5, '2021-09-10', 'Germán', 'Montenegro Revelo', 12345678, '1990-06-03', 'condominio sta mónica', '7332211', '3105240000', 'pasto', 'nariño', 'gmoterevelo@gmail.com', 'global project', 1111111111, '2000-12-12', 'condominio sta mónica', '5349000', '310000000', 'pasto', 'nariño', 'globalproject.uis@gmail.com', 'www.globsalproject.uis.edu.co', '', 'Activo'),
(6, '2021-09-10', 'María Cristina', 'Barahona Montero', 343222222, '1995-01-01', 'los nogales', '7332211', '3150009992', 'Bucaramanga', 'Santander', 'mariacris@hotmail.com', 'supertienda del hogar', 888888888, '1990-01-01', 'el bosque', '5349000', '3111003333', 'pasto', 'nariño', 'supertiendaelhogar@gmail.com', 'www.supertiendaelhogar.com.so', '', 'Activo'),
(7, '2021-09-10', 'Sylvia', 'Cárdenas Martínez', 12345675, '2000-03-21', 'Madrigal', '7222333', '315000999', 'bogotá d.c.', 'bogota d.c.', 'sylviabm@gmail.com', 'distribuidora andina', 222222222, '2014-03-01', 'Villa Alejandría', '5349000', '310564324', 'medellin', 'antioquia', 'disandina@gmail.com', 'www.disandina.com.co', '@disandina', 'Activo'),
(8, '2021-09-20', 'www', 'www', 333, '2000-12-12', 'www', 'www', 'www', 'www', 'www', 'www', 'www', 333, '2000-12-15', 'www', 'www', 'www', 'www', 'www', 'www', 'www', 'www', 'Activo'),
(9, '2021-09-25', 'xxx', 'xxx', 999, '1990-12-12', 'xxx', 'xxx', 'xxx', 'xxx', 'xxx', 'xxx', 'xxx', 555, '2000-01-01', 'xxx', 'xxx', 'xxx', 'xxx', 'xxx', 'xxx', 'xxx', 'xxx', 'Activo'),
(10, '2021-10-05', 'ana_maria', 'cardenas_rengifo', 12333444, '2000-01-01', 'calle_20_#32-14_centro', '7238877', '3108887776', 'Pasto', 'Nariño', 'anitam@gmail.com', 'distribuciones_camila', 901888777, '1990-01-23', 'carrera_4_#_25-44', '7365544', '3156782355', 'Pasto', 'Nariño', 'districamila@yahoo.com', 'www.districamila.com', '@districamila', 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `vta_id` int(10) NOT NULL,
  `vta_fecha` date NOT NULL DEFAULT current_timestamp(),
  `id_pro` int(10) NOT NULL,
  `vta_cantidad` int(10) NOT NULL,
  `vta_confirma_devolucion` varchar(2) NOT NULL DEFAULT 'No',
  `vta_cantidad_devolucion` int(10) NOT NULL DEFAULT 0,
  `vta_estado` varchar(15) NOT NULL DEFAULT 'Activo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`vta_id`, `vta_fecha`, `id_pro`, `vta_cantidad`, `vta_confirma_devolucion`, `vta_cantidad_devolucion`, `vta_estado`) VALUES
(7, '2021-09-10', 17, 15, 'No', 0, 'Activo'),
(8, '2021-09-15', 34, 7, 'No', 0, 'Activo'),
(9, '2021-09-22', 35, 30, 'No', 0, 'Activo'),
(10, '2021-09-30', 39, 9, 'Si', 4, 'Activo'),
(11, '2021-10-02', 20, 15, 'No', 0, 'Activo'),
(12, '2021-10-02', 39, 5, 'No', 0, 'Activo'),
(13, '2021-10-02', 31, 9, 'Si', 1, 'Activo'),
(14, '2021-10-02', 28, 30, 'No', 0, 'Activo'),
(15, '2021-10-02', 30, 15, 'Si', 5, 'Activo'),
(16, '2021-10-02', 19, 8, 'No', 0, 'Activo'),
(17, '2021-10-02', 17, 33, 'No', 0, 'Activo'),
(18, '2021-10-02', 17, 22, 'No', 0, 'Activo'),
(19, '2021-10-02', 34, 11, 'Si', 11, 'Activo'),
(20, '2021-10-02', 17, 20, 'No', 0, 'Activo'),
(21, '2021-10-05', 46, 6, 'No', 0, 'Activo'),
(22, '2021-10-05', 31, 40, 'No', 5, 'Activo'),
(23, '2021-10-08', 16, 555, 'No', 0, 'Activo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria_producto`
--
ALTER TABLE `categoria_producto`
  ADD PRIMARY KEY (`catpro_id`),
  ADD UNIQUE KEY `catpro_nombre` (`catpro_nombre`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`cpr_id`),
  ADD UNIQUE KEY `id_ped` (`id_ped`);

--
-- Indices de la tabla `devolucion_compra`
--
ALTER TABLE `devolucion_compra`
  ADD PRIMARY KEY (`devcpr_id`),
  ADD UNIQUE KEY `id_ped` (`id_ped`);

--
-- Indices de la tabla `devolucion_venta`
--
ALTER TABLE `devolucion_venta`
  ADD PRIMARY KEY (`devvta_id`);

--
-- Indices de la tabla `kardex`
--
ALTER TABLE `kardex`
  ADD PRIMARY KEY (`kar_id`),
  ADD UNIQUE KEY `id_cpr` (`id_cpr`,`id_vta`),
  ADD UNIQUE KEY `id_vta` (`id_vta`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`ped_id`),
  ADD KEY `FK_pedido_id_pro` (`id_pro`),
  ADD KEY `FK_pedido_id_prv` (`id_prv`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`pro_id`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`prv_id`),
  ADD UNIQUE KEY `prv_telefono_celular_rep_legal` (`prv_telefono_celular_rep_legal`),
  ADD UNIQUE KEY `prv_identificacion_rep_legal` (`prv_identificacion_rep_legal`),
  ADD UNIQUE KEY `prv_email_rep_legal` (`prv_email_rep_legal`),
  ADD UNIQUE KEY `prv_razon_social_empresa` (`prv_razon_social_empresa`),
  ADD UNIQUE KEY `prv_nit_empresa` (`prv_nit_empresa`),
  ADD UNIQUE KEY `prv_telefono_celular_empresa` (`prv_telefono_celular_empresa`),
  ADD UNIQUE KEY `prv_email_empresa` (`prv_email_empresa`,`prv_web_empresa`,`prv_facebook_empresa`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`vta_id`),
  ADD KEY `FK_venta_id_pro` (`id_pro`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria_producto`
--
ALTER TABLE `categoria_producto`
  MODIFY `catpro_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `cpr_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;

--
-- AUTO_INCREMENT de la tabla `devolucion_compra`
--
ALTER TABLE `devolucion_compra`
  MODIFY `devcpr_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `devolucion_venta`
--
ALTER TABLE `devolucion_venta`
  MODIFY `devvta_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `kardex`
--
ALTER TABLE `kardex`
  MODIFY `kar_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `ped_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `pro_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `prv_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `vta_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `FK_compra_id_ped` FOREIGN KEY (`id_ped`) REFERENCES `pedido` (`ped_id`);

--
-- Filtros para la tabla `kardex`
--
ALTER TABLE `kardex`
  ADD CONSTRAINT `FK_kardex_id_cpr` FOREIGN KEY (`id_cpr`) REFERENCES `compra` (`cpr_id`),
  ADD CONSTRAINT `FK_kardex_id_vta` FOREIGN KEY (`id_vta`) REFERENCES `venta` (`vta_id`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `FK_pedido_id_pro` FOREIGN KEY (`id_pro`) REFERENCES `producto` (`pro_id`),
  ADD CONSTRAINT `FK_pedido_id_prv` FOREIGN KEY (`id_prv`) REFERENCES `proveedor` (`prv_id`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `FK_producto_id_catpro` FOREIGN KEY (`id_catpro`) REFERENCES `categoria_producto` (`catpro_id`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `FK_venta_id_pro` FOREIGN KEY (`id_pro`) REFERENCES `producto` (`pro_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
