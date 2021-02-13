-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-12-2019 a las 08:20:01
-- Versión del servidor: 10.1.33-MariaDB
-- Versión de PHP: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_etable`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbconfiguracionsistema`
--

CREATE TABLE `tbconfiguracionsistema` (
  `CCONFIGURACION` int(11) NOT NULL,
  `CEMPRESA` int(11) NOT NULL,
  `EMPNOMBRE` varchar(128) DEFAULT NULL,
  `EMPDESCRIPCION` varchar(256) DEFAULT NULL,
  `EMPDIRECCION` varchar(256) DEFAULT NULL,
  `EMPEMAIL` varchar(128) DEFAULT NULL,
  `EMPCELULAR` int(9) DEFAULT NULL,
  `EMPLOGO` varchar(128) DEFAULT NULL,
  `SIST_RESERVACION_CLIENTE` int(1) DEFAULT NULL,
  `SIST_ATENCION_CLIENTE` int(1) DEFAULT NULL,
  `MESAS_COMPUESTAS` int(1) DEFAULT NULL,
  `AGREGAR_CLIENTE_MANUAL` int(1) DEFAULT NULL,
  `PAGOS_TARJETA_CREDITO` int(1) DEFAULT NULL,
  `RESERVACION_PEDIDOS` int(1) DEFAULT NULL,
  `RESERVAS_ESPECIALES` int(1) DEFAULT NULL,
  `RESERVAS_NO_SESIONADAS` int(1) DEFAULT NULL,
  `CANT_MAX_MESAS` int(3) DEFAULT NULL,
  `CANT_MAX_US_REGISTRADOS` int(11) DEFAULT NULL,
  `HORARIO_INI_ATENCION` varchar(32) DEFAULT NULL,
  `HORARIO_FIN_ATENCION` varchar(32) DEFAULT NULL,
  `DIAS_ATENCION` varchar(128) DEFAULT NULL,
  `MAX_US_TRAB_CONECTADOS` int(2) DEFAULT NULL,
  `DATE_CONFIGURADO` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbconfiguracionsistema`
--

INSERT INTO `tbconfiguracionsistema` (`CCONFIGURACION`, `CEMPRESA`, `EMPNOMBRE`, `EMPDESCRIPCION`, `EMPDIRECCION`, `EMPEMAIL`, `EMPCELULAR`, `EMPLOGO`, `SIST_RESERVACION_CLIENTE`, `SIST_ATENCION_CLIENTE`, `MESAS_COMPUESTAS`, `AGREGAR_CLIENTE_MANUAL`, `PAGOS_TARJETA_CREDITO`, `RESERVACION_PEDIDOS`, `RESERVAS_ESPECIALES`, `RESERVAS_NO_SESIONADAS`, `CANT_MAX_MESAS`, `CANT_MAX_US_REGISTRADOS`, `HORARIO_INI_ATENCION`, `HORARIO_FIN_ATENCION`, `DIAS_ATENCION`, `MAX_US_TRAB_CONECTADOS`, `DATE_CONFIGURADO`) VALUES
(1, 1, 'Empresa', 'Descripcion', '', '', 934409615, '', 1, 1, 1, 1, 1, 1, 1, 1, 10, 1000, '1:00', '1:00', 'Martes', 10, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbestadomesa`
--

CREATE TABLE `tbestadomesa` (
  `CESTADOMESA` int(11) NOT NULL,
  `EMDESCRIPCION` varchar(64) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbestadomesa`
--

INSERT INTO `tbestadomesa` (`CESTADOMESA`, `EMDESCRIPCION`) VALUES
(1, 'Habilitada'),
(2, 'En Reparación'),
(3, 'Desuso');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbmenuitems`
--

CREATE TABLE `tbmenuitems` (
  `CITEM` int(11) NOT NULL,
  `ITEM` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbmenuitems`
--

INSERT INTO `tbmenuitems` (`CITEM`, `ITEM`) VALUES
(1, 'Administración del Sistema'),
(2, 'Administración  de Usuarios'),
(3, 'Administración de Mesas'),
(4, 'Administración  de Clientes'),
(5, 'Dashboard'),
(6, 'Reportes');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbmenusubitems`
--

CREATE TABLE `tbmenusubitems` (
  `CSUBITEM` int(11) NOT NULL,
  `CITEM` int(11) NOT NULL,
  `SUBITEM` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbmenusubitems`
--

INSERT INTO `tbmenusubitems` (`CSUBITEM`, `CITEM`, `SUBITEM`) VALUES
(1, 1, 'Sistema General'),
(2, 1, 'ConfiguraciÃ³n'),
(3, 2, 'Permisos'),
(4, 2, 'Tipos de Usuario'),
(5, 2, 'Usuarios'),
(6, 3, 'Mesas'),
(7, 3, 'Perfil de Mesa'),
(8, 3, 'ProgramaciÃ³n de Mesas'),
(9, 4, 'Clientes'),
(10, 4, 'Tipos de Cliente'),
(11, 4, 'Historial de Cliente'),
(12, 5, 'Reservaciones'),
(13, 6, 'Importar/Exportar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbmesa`
--

CREATE TABLE `tbmesa` (
  `CMESA` int(11) NOT NULL,
  `NOMBREMESA` varchar(255) NOT NULL,
  `CPERFILMESA` int(11) DEFAULT NULL,
  `CESTADOMESA` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbmesa`
--

INSERT INTO `tbmesa` (`CMESA`, `NOMBREMESA`, `CPERFILMESA`, `CESTADOMESA`) VALUES
(2, '2bbbb', 1, 1),
(3, '1B', 1, 3),
(4, '1Anuevo', 1, 1),
(5, '1Anuevo', 1, 1),
(6, '1Anuevo', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbperfilmesa`
--

CREATE TABLE `tbperfilmesa` (
  `CPERFILMESA` int(11) NOT NULL,
  `PMNOMBRE` varchar(64) DEFAULT NULL,
  `PMDESCRIPCION` varchar(128) DEFAULT NULL,
  `PMCAPACIDAD` int(2) DEFAULT NULL,
  `PMCOMPUESTA` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbperfilmesa`
--

INSERT INTO `tbperfilmesa` (`CPERFILMESA`, `PMNOMBRE`, `PMDESCRIPCION`, `PMCAPACIDAD`, `PMCOMPUESTA`) VALUES
(1, 'Familiares', 'Es una mesa familiares', 9, 1),
(2, 'Pareja', 'Es una mesa para pareja', 2, 0),
(3, 'Grupo Regular', 'Es una mesa regular', 4, 0),
(4, 'Grupo Grande', 'Es una mesa grande', 10, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbpermisos`
--

CREATE TABLE `tbpermisos` (
  `CPERMISO` int(11) NOT NULL,
  `CSUBITEM` int(11) NOT NULL,
  `PERMISO` varchar(128) DEFAULT NULL,
  `DESCRIPCION` varchar(256) DEFAULT NULL,
  `ESTADO` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbpermisos`
--

INSERT INTO `tbpermisos` (`CPERMISO`, `CSUBITEM`, `PERMISO`, `DESCRIPCION`, `ESTADO`) VALUES
(1, 1, 'ConfiguraciÃ³n del Sistema General', 'Este permiso permite hacer modificaciones sobre la informaciÃ³n del Restaurante, habilitar o desahilitar el sistema, entre otros temas sobre el Sistema en general.', 0),
(2, 2, 'ConfiguraciÃ³n de ParÃ¡metros Generales', 'Este permiso permite hacer modificaciones de los parÃ¡metros generales en base al Restaurante, como la cantidad de mesas que tendrÃ¡, mÃ¡ximo de usuarios, horario de atenciÃ³n, etc.', 1),
(3, 3, 'VisualizaciÃ³n de Permisosss', 'Este permiso solo permite la visualziaciÃ³n de permisos existentes.sss', 0),
(4, 3, 'CreaciÃ³n de Permisos', 'Este permiso permite la creaciÃ³n de permisos.', 1),
(5, 3, 'EliminaciÃ³n de Permisos', 'Este permiso permite la eliminaciÃ³n de permisos.', 1),
(6, 4, 'VisualizaciÃ³n de Tipos de usuario', 'Este permiso solo permite la visualizaciÃ³n de Tipos de usuario.', 1),
(7, 4, 'CreaciÃ³n de Tipos de usuario', 'Este permiso permite la creaciÃ³n de Tipos de usuario.', 1),
(8, 4, 'EliminaciÃ³n de Tipos de usuario', 'Este permiso permite la eliminaciÃ³n de Tipos de usuario.', 1),
(9, 5, 'HabilitaciÃ³n de Usuarios', 'Este permiso permite habilitar o deshabilitar Usuarios.', 1),
(10, 5, 'VisualizaciÃ³n de Usuarios', 'Este permiso solo permite la visualizaciÃ³n de Usuarios.', 1),
(11, 5, 'CreaciÃ³n de Usuarios', 'Este permiso permite la creaciÃ³n de Usuarios.', 1),
(12, 5, 'EliminaciÃ³n de Usuarios', 'Este permiso permite la eliminaciÃ³n de Usuarios.', 1),
(13, 6, 'HabilitaciÃ³n de Mesas', 'Este permiso permite habilitar o deshabilitar mesas.', 1),
(14, 6, 'VisualizaciÃ³n de Mesas', 'Este permiso solo permite la visualizaciÃ³n de mesas.', 1),
(15, 6, 'CreaciÃ³n de Mesas', 'Este permiso permite la creaciÃ³n de mesas.', 1),
(16, 6, 'EliminaciÃ³n de Mesas', 'Este permiso permite la eliminaciÃ³n de mesas.', 1),
(17, 7, 'HabilitaciÃ³n de Perfil Mesa', 'Este permiso permite habilitar o deshabilitar perfil de mesas.', 1),
(18, 7, 'VisualizaciÃ³n de Perfil de Mesa', 'Este permiso solo permite la visualizaciÃ³n de perfil de mesas.', 1),
(19, 7, 'CreaciÃ³n de Perfil de Mesa', 'Este permiso permite la creaciÃ³n de perfil de mesas.', 1),
(20, 7, 'EliminaciÃ³n de Perfil de Mesa', 'Este permiso permite la eliminaciÃ³n de perfil de mesas.', 1),
(21, 8, 'VisualizaciÃ³n de ProgramaciÃ³n de Mesas', 'Este permiso solo permite la visualizaciÃ³n de programaciÃ³n de mesas.', 1),
(22, 8, 'CreaciÃ³n de ProgramaciÃ³n de Mesas', 'Este permiso permite la creaciÃ³n de programaciÃ³n de mesas.', 1),
(23, 8, 'EliminaciÃ³n de ProgramaciÃ³n de Mesas', 'Este permiso permite la eliminaciÃ³n de programaciÃ³n de mesas.', 1),
(24, 8, 'HabilitaciÃ³n de Clientes', 'Este permiso permite habilitar o deshabilitar clientes.', 1),
(25, 9, 'VisualizaciÃ³n de Clientes', 'Este permiso solo permite la visualizaciÃ³n de clientes.', 1),
(26, 9, 'CreaciÃ³n de Clientes', 'Este permiso permite la creaciÃ³n de clientes.', 1),
(27, 9, 'EliminaciÃ³n de Clientes', 'Este permiso permite la eliminaciÃ³n de clientes.', 1),
(28, 10, 'VisualizaciÃ³n de Tipo de Cliente', 'Este permiso solo permite la visualizaciÃ³n de tipo de clientes.', 1),
(29, 10, 'CreaciÃ³n de Tipo de Cliente', 'Este permiso permite la creaciÃ³n de tipo de clientes.', 1),
(30, 10, 'EliminaciÃ³n de Tipo de Cliente', 'Este permiso permite la eliminaciÃ³n de tipo de clientes.', 1),
(31, 11, 'VisualizaciÃ³n de Historial de Cliente', 'Este permiso solo permite la visualizaciÃ³n de historial de clientes.', 1),
(32, 12, 'Acceso al Sistema de ReservaciÃ³n de Mesas', 'Este permiso permite el ingreso al Sistema de ReservaciÃ³n de Mesas para clientes y AtenciÃ³n de Cliente para los trabajadores del Restaurante.', 1),
(33, 13, 'Importar reportes', 'Este permiso permite importar datos al sistema.', 1),
(34, 13, 'Exportar reportes', 'Este permiso permite exportar datos al sistema.', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbtipousuario`
--

CREATE TABLE `tbtipousuario` (
  `CTIPOUSUARIO` int(11) NOT NULL,
  `TIPONOMBRE` varchar(128) DEFAULT NULL,
  `TIPODESCRIPCION` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbtipousuariopermiso`
--

CREATE TABLE `tbtipousuariopermiso` (
  `CTIPOUSPERMISO` int(11) NOT NULL,
  `CTIPOUSUARIO` int(11) NOT NULL,
  `CPERMISO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbusuarios`
--

CREATE TABLE `tbusuarios` (
  `CUSUARIO` int(11) NOT NULL,
  `NICKNAME` varchar(128) DEFAULT NULL,
  `PASSWORD` varchar(128) DEFAULT NULL,
  `CTIPOUSUARIO` int(11) DEFAULT NULL,
  `USNOMBRE` varchar(128) DEFAULT NULL,
  `USAPELLIDOS` varchar(128) DEFAULT NULL,
  `ESTADO` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tbusuarios`
--

INSERT INTO `tbusuarios` (`CUSUARIO`, `NICKNAME`, `PASSWORD`, `CTIPOUSUARIO`, `USNOMBRE`, `USAPELLIDOS`, `ESTADO`) VALUES
(1, 'administrador', '$2a$10$ov5FpWF2fd6TmezlBz7PEuijaixY6EpQI4./6X.d6NyE.rwyCnXJO', 1, 'Nataly Grace', 'Vasquez Saenz', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbconfiguracionsistema`
--
ALTER TABLE `tbconfiguracionsistema`
  ADD PRIMARY KEY (`CCONFIGURACION`);

--
-- Indices de la tabla `tbestadomesa`
--
ALTER TABLE `tbestadomesa`
  ADD PRIMARY KEY (`CESTADOMESA`);

--
-- Indices de la tabla `tbmenuitems`
--
ALTER TABLE `tbmenuitems`
  ADD PRIMARY KEY (`CITEM`);

--
-- Indices de la tabla `tbmenusubitems`
--
ALTER TABLE `tbmenusubitems`
  ADD PRIMARY KEY (`CSUBITEM`),
  ADD KEY `FK_CITEM` (`CITEM`);

--
-- Indices de la tabla `tbmesa`
--
ALTER TABLE `tbmesa`
  ADD PRIMARY KEY (`CMESA`),
  ADD KEY `CPERFILMESA` (`CPERFILMESA`),
  ADD KEY `CESTADOMESA` (`CESTADOMESA`);

--
-- Indices de la tabla `tbperfilmesa`
--
ALTER TABLE `tbperfilmesa`
  ADD PRIMARY KEY (`CPERFILMESA`);

--
-- Indices de la tabla `tbpermisos`
--
ALTER TABLE `tbpermisos`
  ADD PRIMARY KEY (`CPERMISO`),
  ADD KEY `CSUBITEM` (`CSUBITEM`);

--
-- Indices de la tabla `tbtipousuario`
--
ALTER TABLE `tbtipousuario`
  ADD PRIMARY KEY (`CTIPOUSUARIO`);

--
-- Indices de la tabla `tbtipousuariopermiso`
--
ALTER TABLE `tbtipousuariopermiso`
  ADD PRIMARY KEY (`CTIPOUSPERMISO`) USING BTREE,
  ADD KEY `CTIPOUSUARIO` (`CTIPOUSUARIO`),
  ADD KEY `CPERMISO` (`CPERMISO`);

--
-- Indices de la tabla `tbusuarios`
--
ALTER TABLE `tbusuarios`
  ADD PRIMARY KEY (`CUSUARIO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbconfiguracionsistema`
--
ALTER TABLE `tbconfiguracionsistema`
  MODIFY `CCONFIGURACION` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `tbmenuitems`
--
ALTER TABLE `tbmenuitems`
  MODIFY `CITEM` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `tbmenusubitems`
--
ALTER TABLE `tbmenusubitems`
  MODIFY `CSUBITEM` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `tbmesa`
--
ALTER TABLE `tbmesa`
  MODIFY `CMESA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `tbperfilmesa`
--
ALTER TABLE `tbperfilmesa`
  MODIFY `CPERFILMESA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tbpermisos`
--
ALTER TABLE `tbpermisos`
  MODIFY `CPERMISO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT de la tabla `tbtipousuario`
--
ALTER TABLE `tbtipousuario`
  MODIFY `CTIPOUSUARIO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbtipousuariopermiso`
--
ALTER TABLE `tbtipousuariopermiso`
  MODIFY `CTIPOUSPERMISO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbusuarios`
--
ALTER TABLE `tbusuarios`
  MODIFY `CUSUARIO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tbmenusubitems`
--
ALTER TABLE `tbmenusubitems`
  ADD CONSTRAINT `FK_CITEM` FOREIGN KEY (`CITEM`) REFERENCES `tbmenuitems` (`CITEM`);

--
-- Filtros para la tabla `tbmesa`
--
ALTER TABLE `tbmesa`
  ADD CONSTRAINT `tbmesa_ibfk_1` FOREIGN KEY (`CPERFILMESA`) REFERENCES `tbperfilmesa` (`CPERFILMESA`),
  ADD CONSTRAINT `tbmesa_ibfk_2` FOREIGN KEY (`CESTADOMESA`) REFERENCES `tbestadomesa` (`CESTADOMESA`);

--
-- Filtros para la tabla `tbpermisos`
--
ALTER TABLE `tbpermisos`
  ADD CONSTRAINT `tbpermisos_ibfk_1` FOREIGN KEY (`CSUBITEM`) REFERENCES `tbmenusubitems` (`CSUBITEM`);

--
-- Filtros para la tabla `tbtipousuariopermiso`
--
ALTER TABLE `tbtipousuariopermiso`
  ADD CONSTRAINT `tbtipousuariopermiso_ibfk_1` FOREIGN KEY (`CTIPOUSUARIO`) REFERENCES `tbtipousuario` (`CTIPOUSUARIO`),
  ADD CONSTRAINT `tbtipousuariopermiso_ibfk_2` FOREIGN KEY (`CPERMISO`) REFERENCES `tbpermisos` (`CPERMISO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
