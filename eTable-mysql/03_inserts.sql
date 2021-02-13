USE DB_ETABLE;
-- Configuración inicial
INSERT INTO TBCONFIGURACIONSISTEMA (CEMPRESA, EMPNOMBRE, EMPDESCRIPCION, EMPDIRECCION, EMPEMAIL, EMPCELULAR, EMPLOGO, SIST_RESERVACION_CLIENTE, SIST_ATENCION_CLIENTE, MESAS_COMPUESTAS, AGREGAR_CLIENTE_MANUAL,  PAGOS_TARJETA_CREDITO, RESERVACION_PEDIDOS, RESERVAS_ESPECIALES, RESERVAS_NO_SESIONADAS, DATE_CONFIGURADO,CANT_MAX_MESAS, CANT_MAX_US_REGISTRADOS, HORARIO_INI_ATENCION, HORARIO_FIN_ATENCION, DIAS_ATENCION, MAX_US_TRAB_CONECTADOS)  VALUES 
(1,'', '', '', '', 993420344, '', 1, 1, 1, 1, 1, 1, 1, 1, '', 30, 1000, '9:00', '9:00', '', 10);

-- ITEMS DEL MENÚ DEL SISTEMA ADMINISTRATIVO
INSERT INTO TBMENUITEMS (ITEM) VALUES ('Administración del Sistema');
INSERT INTO TBMENUITEMS (ITEM) VALUES ('Administración de Usuarios');
INSERT INTO TBMENUITEMS (ITEM) VALUES ('Administración de Mesas');
INSERT INTO TBMENUITEMS (ITEM) VALUES ('Administración de Clientes');
INSERT INTO TBMENUITEMS (ITEM) VALUES ('Dashboard');
INSERT INTO TBMENUITEMS (ITEM) VALUES ('Reportes');

-- SUBITEMS DE ITEMS DEL MENÚ DEL SISTEMA ADMINISTRATIVO
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (1, 'Sistema General');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (1, 'Configuración');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (2, 'Permisos');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (2, 'Tipos de Usuario');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (2, 'Usuarios');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (3, 'Mesas');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (3, 'Perfil de Mesa');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (3, 'Programación de Mesas');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (4, 'Clientes');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (4, 'Tipos de Cliente');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (4, 'Historial de Cliente');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (5, 'Reservaciones');
INSERT INTO TBMENUSUBITEMS (CITEM, SUBITEM) VALUES (6, 'Importar/Exportar');

-- PERMISOS PARA LOS USUARIOS
INSERT INTO TBPERMISOS (CSUBITEM, PERMISO, DESCRIPCION, ESTADO) VALUES 
(1, 'Modificar la Configuración del Sistema General', 'Este permiso permite hacer modificaciones sobre la información del Restaurante, habilitar o desahilitar el sistema, entre otros temas sobre el Sistema en general.', 1),
(1, 'Visualización de la Configuración del Sistema General', 'Este permiso permite solo visualizar la configuración que tiene el Sistema, información del Restaurante y otros.', 1),
(2, 'Modificar la Configuración de Parámetros Generales', 'Este permiso permite hacer modificaciones de los parámetros generales en base al Restaurante, como la cantidad de mesas que tendrá, máximo de usuarios, horario de atención, etc.', 1),
(2, 'Visualización de la Configuración de Parámetros Generales', 'Este permiso permite solo visualizar la configuración de parámetros generales del Restaurante', 1),
(3, 'Visualización de Permisos', 'Este permiso solo permite la visualziación de permisos existentes.', 1),
(3, 'Creación de Permisos', 'Este permiso permite la creación de permisos.', 1),
(3, 'Modificación de Permisos', 'Este permiso permite editar permisos.', 1),
(3, 'Eliminación de Permisos', 'Este permiso permite la eliminación de permisos.', 1),
(4, 'Visualización de Tipos de usuario', 'Este permiso solo permite la visualización de Tipos de usuario.', 1),
(4, 'Creación de Tipos de usuario', 'Este permiso permite la creación de Tipos de usuario.', 1),
(4, 'MOdificación de Tipos de usuario', 'Este permiso permite editar Tipos de usuario.', 1),
(4, 'Eliminación de Tipos de usuario', 'Este permiso permite la eliminación de Tipos de usuario.', 1),
(5, 'Habilitación de Usuarios', 'Este permiso permite habilitar o deshabilitar Usuarios.', 1),
(5, 'Visualización de Usuarios', 'Este permiso solo permite la visualización de Usuarios.', 1),
(5, 'Creación de Usuarios', 'Este permiso permite la creación de Usuarios.', 1),
(5, 'Modificación de Usuarios', 'Este permiso permite editar Usuarios.', 1),
(5, 'Eliminación de Usuarios', 'Este permiso permite la eliminación de Usuarios.', 1),
(6, 'Habilitación de Mesas', 'Este permiso permite habilitar o deshabilitar mesas.', 1),
(6, 'Visualización de Mesas', 'Este permiso solo permite la visualización de mesas.', 1),
(6, 'Creación de Mesas', 'Este permiso permite la creación de mesas.', 1),
(6, 'Modificación de Mesas', 'Este permiso permite editar mesas.', 1),
(6, 'Eliminación de Mesas', 'Este permiso permite la eliminación de mesas.', 1),
(7, 'Habilitación de Perfil Mesa', 'Este permiso permite habilitar o deshabilitar perfil de mesas.', 1),
(7, 'Visualización de Perfil de Mesa', 'Este permiso solo permite la visualización de perfil de mesas.', 1),
(7, 'Creación de Perfil de Mesa', 'Este permiso permite la creación de perfil de mesas.', 1),
(7, 'Modificación de Perfil de Mesa', 'Este permiso permite la modificación de perfil de mesas.', 1),
(7, 'Eliminación de Perfil de Mesa', 'Este permiso permite la eliminación de perfil de mesas.', 1),
(8, 'Visualización de Programación de Mesas', 'Este permiso solo permite la visualización de programación de mesas.', 1),
(8, 'Creación de Programación de Mesas', 'Este permiso permite la creación de programación de mesas.', 1),
(8, 'Modificación de Programación de Mesas', 'Este permiso permite la modificación de programación de mesas.', 1),
(8, 'Eliminación de Programación de Mesas', 'Este permiso permite la eliminación de programación de mesas.', 1),
(8, 'Habilitación de Clientes', 'Este permiso permite habilitar o deshabilitar clientes.', 1),
(9, 'Visualización de Clientes', 'Este permiso solo permite la visualización de clientes.', 1),
(9, 'Creación de Clientes', 'Este permiso permite la creación de clientes.', 1),
(9, 'Modificación de Clientes', 'Este permiso permite la modificación de clientes.', 1),
(9, 'Eliminación de Clientes', 'Este permiso permite la eliminación de clientes.', 1),
(10, 'Visualización de Tipo de Cliente', 'Este permiso solo permite la visualización de tipo de clientes.', 1),
(10, 'Creación de Tipo de Cliente', 'Este permiso permite la creación de tipo de clientes.', 1),
(10, 'Modificación de Tipo de Cliente', 'Este permiso permite la modificación de tipo de clientes.', 1),
(10, 'Eliminación de Tipo de Cliente', 'Este permiso permite la eliminación de tipo de clientes.', 1),
(11, 'Visualización de Historial de Cliente', 'Este permiso solo permite la visualización de historial de clientes.', 1),
(12, 'Acceso al Sistema de Reservación de Mesas', 'Este permiso permite el ingreso al Sistema de Reservación de Mesas para clientes y Atención de Cliente para los trabajadores del Restaurante.', 1),
(13, 'Importar reportes', 'Este permiso permite importar datos al sistema.', 1),
(13, 'Exportar reportes', 'Este permiso permite exportar datos al sistema.', 1);

-- Tipos de usuario: Administrador key: 1. Cliente key: 2
INSERT INTO TBTIPOUSUARIO (`CTIPOUSUARIO`,`TIPONOMBRE`,`TIPODESCRIPCION`) VALUES (1,'Administrador','El Administrador tiene todos los permisos del Sistema');
INSERT INTO TBTIPOUSUARIO (`CTIPOUSUARIO`,`TIPONOMBRE`,`TIPODESCRIPCION`) VALUES (2,'Cliente','El Cliente puede realizar reservaciones de mesas');
INSERT INTO TBTIPOUSUARIO (`CTIPOUSUARIO`,`TIPONOMBRE`,`TIPODESCRIPCION`) VALUES (3,'Mesero','Tipo de Usuario con permisos para atender al cliente y administrar mesas');
INSERT INTO TBTIPOUSUARIO (`CTIPOUSUARIO`,`TIPONOMBRE`,`TIPODESCRIPCION`) VALUES (4,'Misceláneo','Tipo de usuario prueba');

INSERT INTO tbtipousuariopermiso (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (1,1,1);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (2,1,2);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (3,1,3);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (4,1,4);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (5,1,5);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (6,1,6);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (7,1,7);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (8,1,8);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (9,1,9);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (10,1,10);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (11,1,11);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (12,1,12);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (13,1,13);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (14,1,15);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (15,1,14);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (16,1,16);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (17,1,17);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (18,1,18);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (19,1,19);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (20,1,20);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (21,1,21);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (22,1,22);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (23,1,23);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (24,1,24);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (25,1,25);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (26,1,26);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (27,1,27);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (28,1,28);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (29,1,29);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (30,1,30);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (31,1,31);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (32,1,32);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (33,1,33);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (34,1,34);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (35,1,35);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (36,1,36);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (37,1,37);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (38,1,38);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (39,1,39);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (40,1,40);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (41,1,41);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (42,1,42);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (43,1,43);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (44,1,44);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (45,2,42);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (46,3,18);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (47,3,19);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (48,3,20);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (49,3,21);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (50,3,22);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (51,3,23);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (52,3,24);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (53,3,25);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (54,3,26);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (55,3,27);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (56,3,28);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (57,3,29);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (58,3,30);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (59,3,31);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (60,3,32);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (61,4,1);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (62,4,5);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (63,4,2);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (64,4,18);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (65,4,19);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (66,4,23);
INSERT INTO `tbtipousuariopermiso` (`CTIPOUSPERMISO`,`CTIPOUSUARIO`,`CPERMISO`) VALUES (67,4,24);

-- Usuario 
INSERT INTO TBUSUARIOS (NICKNAME, PASSWORD, USNOMBRE, USAPELLIDOS, ESTADO, CTIPOUSUARIO)
VALUES ('administrador', '$2a$10$ov5FpWF2fd6TmezlBz7PEuijaixY6EpQI4./6X.d6NyE.rwyCnXJO', 'Kevin Rodrigo', 'Cueva Heras', 1, 1);


INSERT INTO `tbestadomesa` (`CESTADOMESA`, `EMDESCRIPCION`) VALUES
(1, 'Habilitada'), (2, 'En Reparación'), (3, 'Desuso');

INSERT INTO `tbperfilmesa` (`PMNOMBRE`, `PMDESCRIPCION`, `PMCAPACIDAD`, `PMCOMPUESTA`) VALUES
('Individual', 'Es una mesa individual', 1, 0),
('Grupo Pequeño', 'Mesa Grupo Pequeño', 4, 1),
('Pareja de 2', 'Mesa para 2 personas', 2, 0);

INSERT INTO `tbestadoreservacion` (`CESTADO`, `NOMESTADO`, `DESCESTADO`) VALUES
(1, 'En Espera', 'Los clientes aun no hacen uso de su reservacion'),
(2, 'Finalizado', 'Los clientes ya asistieron a la reservacion'),
(3, 'En Despacho', 'Los clientes estan en la mesa reservada'),
(4, 'Anulado', 'Los clientes anulan la reservacion');
-- INSERT INTO `tbclientes`(`CCLIENTE`, `DNI`, `CUSUARIO`, `EMAIL`, `PHONE`, `DATE`) VALUES (2,4455667,2,'miguel@gmail.com',9999999,2019-12-11);
-- INSERT INTO `tbclientes`(`CCLIENTE`, `DNI`, `CUSUARIO`, `EMAIL`, `PHONE`, `DATE`) VALUES (3,4455668,3,'duvan@gmail.com',99999998,2019-12-15)

-- INSERT INTO `tbestadoreservacion`(`CESTADO`, `NOMESTADO`, `DESCESTADO`) VALUES (1,"Espera","Los clientes aun no hacen uso de su reservacion");
-- INSERT INTO `tbestadoreservacion`(`CESTADO`, `NOMESTADO`, `DESCESTADO`) VALUES (2,"Finalizado","Los clientes ya asistieron a la reservacion");
-- INSERT INTO `tbestadoreservacion`(`CESTADO`, `NOMESTADO`, `DESCESTADO`) VALUES (3,"En despacho","Los clientes estan en la mesa reservada");
-- INSERT INTO `tbestadoreservacion`(`CESTADO`, `NOMESTADO`, `DESCESTADO`) VALUES (4,"Anulado","Los clientes anulan la reservacion");



-- INSERT INTO TBPERFILMESA (PMNOMBRE, PMDESCRIPCION, PMCAPACIDAD, PMCOMPUESTA) VALUES ('Personal', 'Tipo de Mesa para 1 persona', 1, 1);
-- INSERT INTO TBPERFILMESA (PMNOMBRE, PMDESCRIPCION, PMCAPACIDAD, PMCOMPUESTA) VALUES ('Pajera Dúo', 'Tipo de Mesa para 2 personas', 2, 1);
-- INSERT INTO TBPERFILMESA (PMNOMBRE, PMDESCRIPCION, PMCAPACIDAD, PMCOMPUESTA) VALUES ('3 Amigos', 'Tipo de Mesa para 3 personas', 3, 1);
-- INSERT INTO TBPERFILMESA (PMNOMBRE, PMDESCRIPCION, PMCAPACIDAD, PMCOMPUESTA) VALUES ('Pareja Familiar', 'Tipo de Mesa para una Familia', 4, 1);